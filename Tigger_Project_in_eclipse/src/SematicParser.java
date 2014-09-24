import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Element;
import javax.swing.tree.DefaultMutableTreeNode;

import org.antlr.runtime.CommonTokenStream;
public class SematicParser implements TreeSelectionListener{
	Set<String> Reserve =new HashSet<String>();
	int all=0;
	String[] Content=new String[1000];
	int[] Row=new int[1000];
	public DefaultMutableTreeNode ASTRoot=null;
	int ASTLeaveNum=0;
	DefaultMutableTreeNode[] ASTLeave=new DefaultMutableTreeNode[10000];
	HashMap<DefaultMutableTreeNode,Integer> ASTNodeIndex=new HashMap<DefaultMutableTreeNode,Integer>();
	public SematicParser(CommonTokenStream tokens){
		Reserve.add("char");
		Reserve.add("string");
		Reserve.add("bool");
		Reserve.add("function");
		Reserve.add("if");
		Reserve.add("then");
		Reserve.add("else");
		Reserve.add("while");
		Reserve.add("for");
		Reserve.add("do");
		Reserve.add("break");
		Reserve.add("let");
		Reserve.add("in");
		Reserve.add("end");
		Reserve.add("of");
		Reserve.add("to");
		Reserve.add("type");
		Reserve.add("var");
		Reserve.add("array");
		Reserve.add("int");
		Reserve.add("string");
		Reserve.add(":");
		Reserve.add("{");
		Reserve.add("}");
		Reserve.add("[");
		Reserve.add("]");
		Reserve.add("(");
		Reserve.add(")");
		Reserve.add("F_(");
		Reserve.add("F_)");
		Reserve.add("=");
		Reserve.add("-");
		Reserve.add("+");
		Reserve.add("*");
		Reserve.add("/");
		Reserve.add(":=");
		Reserve.add(",");
		Reserve.add("'");
		Reserve.add(">");
		Reserve.add("<>");
		Reserve.add("<");
		Reserve.add(">=");
		Reserve.add("<=");
		Reserve.add("&");
		Reserve.add("|");
		Reserve.add(";");
		Reserve.add(".");
		Reserve.add("\\");
		try{
		for(all=0;tokens.LT(all+1).getText().indexOf("<EOF>")==-1;all++){
			Content[all]=tokens.LT(all+1).getText();
			Row[all]=tokens.LT(all+1).getLine();
		}
		}catch(Exception ex){
			//ex.printStackTrace();
		}
	}
	DefaultMutableTreeNode root=new DefaultMutableTreeNode("Global");
	DefaultMutableTreeNode[] stack=new DefaultMutableTreeNode[100];
	HashMap[] varstack=new HashMap[100];
	HashMap<DefaultMutableTreeNode,HashMap<String,String>> Hash=
			new HashMap<DefaultMutableTreeNode,HashMap<String,String>>();
	String[][] vartable=new String[100][2];
	String[] TableTitle={"Variant","Type"};
	JTree SymbolTree;
	JTree ASTTree;
	boolean[] CanDefine=new boolean[100];
	int deep=0;
	JFrame wizard=new JFrame("Symbol Table");
	JPanel WestPane,CenterPane;
	HashMap<String,String>[] env=new HashMap[10000];
	public void check(final MyTextPane CodePane){
		varstack[0]=new HashMap<String,String>();
		Hash.put(root,varstack[0]);
		varstack[0].put("0_start",Integer.toString(0));
		varstack[0].put("0_end",Integer.toString(all-1));
		DefaultMutableTreeNode Node;
		stack[deep]=root;
		CanDefine[0]=true;
		for(int i=0;i<all;i++){
			if(Reserve.contains(Content[i])){
				if(Content[i].equals("let")){
					Node=new DefaultMutableTreeNode("let");
					stack[deep].add(Node);
					deep++;
					stack[deep]=Node;
					varstack[deep]=new HashMap<String,String>();
					varstack[deep].putAll(varstack[deep-1]);
					varstack[deep].put("0_start",Integer.toString(i));
					CanDefine[deep]=true;
					Hash.put(Node,varstack[deep]);
				}else if(Content[i].equals("end")){
					varstack[deep].put("0_end",Integer.toString(i));
					deep--;
				}else if(Content[i].equals("function")){
					String str="";
					String FName=Content[i+1];
					i++;
					int j=i+1;
					i++;
					while(!Content[i].equals("=")){
						str+=Content[i];
						i++;
					}
					varstack[deep].put(FName,"function::"+str);
					//----------------------------------------------------
					Node=new DefaultMutableTreeNode("function::"+FName+str);
					stack[deep].add(Node);
					deep++;
					stack[deep]=Node;
					varstack[deep]=new HashMap<String,String>();
					Hash.put(Node,varstack[deep]);
					for(j++;!Content[j].equals(")");){
						varstack[deep].put(Content[j],Content[j+2]);
						if(Content[j+3].equals(")")) break;
						j+=4;
					}
					varstack[deep].putAll(varstack[deep-1]);
					varstack[deep].put("0_start",Integer.toString(i));
					//----------------------------------------------------
					if(Content[i+1].equals("(")){
						CanDefine[deep]=false;
						int k=1;
						int ii;
						Content[i+1]="F_(";
						for(ii=i+2;;ii++){
							if(Content[ii].equals("(")) k++;
							else if(Content[ii].equals(")")) k--;
							if(k==0) break;
						}
						Content[ii]="F_)";
						i++;
					}else if(Content[i+1].equals("let")){
						CanDefine[deep]=true;
						i++;
					}else{
						i++;
						while(!(Content[i].equals("in")||Content[i].equals("function")||Content[i].equals("var")||Content[i].equals("type"))){
							i++;
						}
						varstack[deep].put("0_end",Integer.toString(i-1));
						deep--;
						i--;
						continue;
					}
				}else if(Content[i].equals("F_)")){
					varstack[deep].put("0_end",Integer.toString(i));
					deep--;
				}else if(Content[i].equals("in")){
					CanDefine[deep]=false;
				}
			}else{
				if(i>0)
				if((CanDefine[deep])&&(Content[i-1].equals("type") || Content[i-1].equals("var")))
				{
					int j=i+1;
					String str="";
					while(!(Content[j].equals("in")||Content[j].equals("function")||Content[j].equals("var")||Content[j].equals("type"))){
						j++;
					}
					for(int k=i+2;k<j;k++) str+=Content[k];
					if(Content[i+1].equals(":=")){
						//To check
						if(varstack[deep].containsKey(Content[i])){
							if(!PrototypeContain((String)varstack[deep].get(Content[i]),GetPrototype(i+2,j-1,varstack[deep]),null))
								System.out.println("Sematic Error on line "+Row[i]+":\""+Content[i]+"\" Initiation is not compatitive!");
						}else{
							varstack[deep].put(Content[i],GetPrototype(i+2,j-1,varstack[deep]));
						}
					}else if(Content[i+1].equals(":")){
						varstack[deep].put(Content[i],GetPrototype(i+2,j-1,varstack[deep]));
					}else if(Content[i+1].equals("=")){
						varstack[deep].put(Content[i],GetPrototype(i+2,j-1,varstack[deep]));
					}
				}
			}
		}
		//Refine SematicTree------------------------------------------------------
		GetSematicEnv(root);
		ASTLeaveNum=0;
		GetASTLeave(ASTRoot);
		HashMap<String,Integer> OrderPrefix=new HashMap<String,Integer>();
		String purestring;
		Content[all]="nil";
		Row[all]=1;
		for(int i=0;i<ASTLeaveNum;i++){
			//System.out.println(ASTLeave[i].toString());
			if(OrderPrefix.containsKey(ASTLeave[i].toString())){
				int j=OrderPrefix.get(ASTLeave[i].toString());
				for(;j<all;j++){
					if(Content[j].charAt(0)=='\"'){
						purestring="";
						for(int k=0;k<Content[j].length();k++)
						{
							if(Content[j].charAt(k)==' ') purestring+='_';
							else purestring+=Content[j].charAt(k);
						}
					}else purestring=Content[j];
					if(purestring.equals(ASTLeave[i].toString())) break;
				}
				if(j>=all){
					//JOptionPane.showMessageDialog(null,"Sematic Matching Failed!");
					ASTNodeIndex.put(ASTLeave[i],all);
					continue;
				}
				ASTNodeIndex.put(ASTLeave[i],j);
				OrderPrefix.put(ASTLeave[i].toString(),j+1);
			}else{
				int j;
				for(j=0;j<all;j++)
				{
					if(Content[j].charAt(0)=='\"'){
						purestring="";
						for(int k=0;k<Content[j].length();k++)
						{
							if(Content[j].charAt(k)==' ') purestring+='_';
							else purestring+=Content[j].charAt(k);
						}
					}else purestring=Content[j];
					if(purestring.equals(ASTLeave[i].toString())) break;
				}
				if(j>=all){
					//JOptionPane.showMessageDialog(null,"Sematic Matching Failed!");
					ASTNodeIndex.put(ASTLeave[i],all);
					continue;
				}
				ASTNodeIndex.put(ASTLeave[i],j);
				OrderPrefix.put(ASTLeave[i].toString(),j+1);
			}
		}
		OperatorSet=new HashSet<String>();
		OperatorSet.add("+");
		OperatorSet.add("-");
		OperatorSet.add("*");
		OperatorSet.add("/");
		OperatorSet.add("<");
		OperatorSet.add(">");
		OperatorSet.add("<=");
		OperatorSet.add(">=");
		SematicDFS(ASTRoot);
		//------------------------------------------------------------------------
		wizard.setBounds(200,200,560,400);
		SymbolTree=new JTree(root);
		WestPane=new JPanel(new BorderLayout());
		CenterPane=new JPanel(new BorderLayout());
		wizard.add(WestPane,BorderLayout.WEST);
		wizard.add(CenterPane,BorderLayout.CENTER);
		WestPane.setBounds(0,0,200,400);
		CenterPane.setBounds(200,0,360,400);		
		WestPane.add(new JScrollPane(SymbolTree),BorderLayout.CENTER);
		SymbolTree.addTreeSelectionListener(new TreeSelectionListener(){
		    class MyHighlightPainter extends DefaultHighlighter.DefaultHighlightPainter {  
		        public MyHighlightPainter(Color color) {  
		            super(color);  
		        }  
		    }
			@Override
			public void valueChanged(TreeSelectionEvent event) {
				try{
				// TODO Auto-generated method stub
				DefaultMutableTreeNode ptr=(DefaultMutableTreeNode)SymbolTree.getLastSelectedPathComponent();
				if(ptr==root) return;
				int index=0;
				int CaretST=0,CaretEN=0;
				for(String iter:Hash.get(ptr).keySet()){
					if(iter.equals("0_start")) CaretST=Row[Integer.parseInt(Hash.get(ptr).get(iter))];
					if(iter.equals("0_end")) CaretEN=Row[Integer.parseInt(Hash.get(ptr).get(iter))];
					vartable[index][0]=iter;
					if(iter.indexOf("0_")==0)
						vartable[index][1]=Integer.toString(Row[Integer.parseInt(Hash.get(ptr).get(iter))]);
					else
					vartable[index][1]=Hash.get(ptr).get(iter);
					index++;
				}
				for(;index<100;index++){
					vartable[index][0]="";
					vartable[index][1]="";
				}
				CenterPane.add(new JScrollPane(new JTable(vartable,TableTitle)),BorderLayout.CENTER);
				wizard.validate();
				
        		Element root = CodePane.m_doc.getDefaultRootElement();
        		Element para = root.getElement(CaretST-1);
        		int start = para.getStartOffset();
        		para = root.getElement(CaretEN-1);
        		int end = para.getEndOffset();// ³ý\r×Ö·û
        		CodePane.setCaretPosition(start);
        		CodePane.setSelectionStart(start);
        		CodePane.setSelectionEnd(end);
				}catch(Exception ex){
					//ex.printStackTrace();
				}
			}
		});
		wizard.setResizable(false);
		wizard.setVisible(true);
	}
	HashSet<String> OperatorSet;
	public String SematicDFS(DefaultMutableTreeNode father){
		try{
			DefaultMutableTreeNode temp=(DefaultMutableTreeNode)father.getFirstChild();
				if(father.toString().equals("RECORDCREATION")){
					return "nil";
				}else if(father.toString().equals(".")){
					DefaultMutableTreeNode tmp=(DefaultMutableTreeNode)father.getChildAfter(temp);
					ASTNodeIndex.put(father,ASTNodeIndex.get(temp));
					int index=ASTNodeIndex.get(temp);
					String type1=env[index].get(temp.toString());
					if(env[index].get(type1)!=null) type1=(String)env[index].get(type1);
					if(type1.indexOf("{")==-1){
						System.out.println("Sematic Error on line "+Row[index]+": "+temp.toString()+" is not a record type");
						return "UnKnow";
					}else if((type1.indexOf(tmp.toString())==-1)
							||(type1.indexOf(tmp.toString()+":")==-1)
							||((type1.indexOf("{"+tmp.toString()+":")==-1) && type1.indexOf(","+tmp.toString()+":")==-1)){
						System.out.println("Sematic Error on line "+Row[index]+": "+temp.toString()+" does not have name space "+tmp.toString()+" !");
						return "UnKnow";
					}else{
						int p=type1.indexOf(tmp.toString())+tmp.toString().length()+1;
						int q=p;
						while((type1.charAt(q)!=',') && (type1.charAt(q)!='}')) q++;
						return type1.substring(p,q);
					}
				}else if(father.toString().equals("ARRAYINDEX")){
					DefaultMutableTreeNode tmp=(DefaultMutableTreeNode)father.getChildAfter(temp);
					String type1=SematicDFS(temp);
					ASTNodeIndex.put(father,ASTNodeIndex.get(temp));
					String type2=SematicDFS(tmp);
					int index=ASTNodeIndex.get(temp);
					if(env[index].get(type1)!=null) type1=(String)env[index].get(type1);
					if(!PrototypeContain("int",type2,env[index])){
						System.out.println("Sematic Error on line "+Row[index]+": The Index of Array must be Integer!");
					}
					if(type1.indexOf("[]")==-1){
						System.out.println("Sematic Error on line "+Row[index]+": "+temp.toString()+" is not an array!");
					}
					return type1.substring(0,type1.indexOf("[]"));
				}else if(father.toString().equals("for")){
					DefaultMutableTreeNode tmp2=(DefaultMutableTreeNode)father.getChildAfter(temp);
					DefaultMutableTreeNode tmp3=(DefaultMutableTreeNode)father.getChildAfter(tmp2);
					String type1=SematicDFS(temp);
					ASTNodeIndex.put(father,ASTNodeIndex.get(temp));
					String type2=SematicDFS(tmp2);
					String type3=SematicDFS(tmp3);
					int index=ASTNodeIndex.get(temp);
					if(!PrototypeContain("int",type1,env[index])||
						!PrototypeContain("int",type2,env[index])||
						!PrototypeContain("int",type3,env[index])){
						System.out.println("Sematic Error on line "+Row[index]+": The elements in for is not Integer");
					}
					return "UnKnow";
				}else if(father.toString().equals(":=")){
					DefaultMutableTreeNode tmp=(DefaultMutableTreeNode)father.getChildAfter(temp);
					String type1=SematicDFS(temp);
					ASTNodeIndex.put(father,ASTNodeIndex.get(temp));
					String type2=SematicDFS(tmp);
					int index=ASTNodeIndex.get(temp);
					if(!PrototypeContain(type1,type2,env[index])){
						System.out.println("Sematic Error on line "+Row[index]+": The two sides of := do not balance!");
					}
					return type1;
				}else if(father.toString().equals("<>")){
					DefaultMutableTreeNode tmp=(DefaultMutableTreeNode)father.getChildAfter(temp);
					String type1=SematicDFS(temp);
					ASTNodeIndex.put(father,ASTNodeIndex.get(temp));
					String type2=SematicDFS(tmp);
					int index=ASTNodeIndex.get(temp);
					if(!PrototypeContain(type1,type2,env[index])&&!PrototypeContain(type2,type1,env[index])){
						System.out.println("Sematic Error on line "+Row[index]+": The two sides of operator do not balance!");
					}
					return "bool";
				}else if(father.toString().equals("-")){
					DefaultMutableTreeNode tmp=(DefaultMutableTreeNode)father.getChildAfter(temp);
					String type1=SematicDFS(temp);
					ASTNodeIndex.put(father,ASTNodeIndex.get(temp));
					int index=ASTNodeIndex.get(temp);
					if(tmp==null){
						if(!PrototypeContain("int",type1,env[index]))
							System.out.println("Sematic Error on line "+Row[index]+": The - operator does not have an Integer!");
							return "int";
					}
					String type2=SematicDFS(tmp);
					if(!PrototypeContain("int",type1,env[index]) || !PrototypeContain("int",type2,env[index])){
						System.out.println("Sematic Error on line "+Row[index]+": The two sides of operator do not balance!");
					}
					return "int";
				}else if(OperatorSet.contains(father.toString())){
					DefaultMutableTreeNode tmp=(DefaultMutableTreeNode)father.getChildAfter(temp);
					String type1=SematicDFS(temp);
					ASTNodeIndex.put(father,ASTNodeIndex.get(temp));
					String type2=SematicDFS(tmp);
					int index=ASTNodeIndex.get(temp);
					if(!PrototypeContain("int",type1,env[index]) || !PrototypeContain("int",type2,env[index])){
						System.out.println("Sematic Error on line "+Row[index]+": The two sides of operator do not balance!");
					}
					return "int";
				}else if(father.toString().equals("FUNCTIONCALL")){
				String FunctionFormat=SematicDFS(temp);
				if(FunctionFormat.equals("UnKnow")) return "UnKnow";
				int index=ASTNodeIndex.get(temp);
				ASTNodeIndex.put(father,ASTNodeIndex.get(temp));
				String ReturnType;
				if(FunctionFormat.indexOf("):")==-1) ReturnType="UnKnow";
				else{
					ReturnType=FunctionFormat.substring(FunctionFormat.indexOf("):")+2);
					FunctionFormat=FunctionFormat.substring(0,FunctionFormat.indexOf("):")+1);
				}
				int k=0,kk;
				String vartype;
				while((k=FunctionFormat.indexOf(":",k))!=-1){
					for(kk=k+1;(FunctionFormat.charAt(kk)!=',')&&(FunctionFormat.charAt(kk)!=')');kk++){}
					vartype=FunctionFormat.substring(k+1,kk);
					temp=(DefaultMutableTreeNode)father.getChildAfter(temp);
					k=kk;
					if(temp==null){
						System.out.println("Sematic Error on line "+Row[index]+": the variants are not enough!");
						break;
					}
					if(!PrototypeContain(vartype,SematicDFS(temp),env[index])){
						System.out.println("Sematic Error on line "+Row[index]+":\""+temp.toString()+"\" is not compatible with \""+vartype+"\" !");
					}
				}
				temp=(DefaultMutableTreeNode)father.getChildAfter(temp);
				if(temp!=null){
					System.out.println("Sematic Error on line "+Row[index]+": the variants are too more");
				}
				return ReturnType;
			}else{
				DefaultMutableTreeNode tmp=temp;
				while(temp!=null){
					SematicDFS(temp);		
					temp=(DefaultMutableTreeNode)father.getChildAfter(temp);
				}
				ASTNodeIndex.put(father,ASTNodeIndex.get(tmp));
				return "nil";
			}
		}catch(Exception ex){
			//ex.printStackTrace();
			if(!father.isLeaf()){
				return "UnKnow";
			}
			String str=father.toString();
			if(Reserve.contains(str)) return "Default";
			if(str.indexOf('\"')==0){
				if(str.length()==3) return "char";
				else return "string";
			}
			if((str.charAt(0)-'0'>=0)&&((str.charAt(0)-'0')<=9)) return "int";
			if((str.equals("nil"))) return "nil";
			int index=ASTNodeIndex.get(father);
			if(index<all){
			if(index<all-1){
				if(Content[index+1].equals(":")) return "nil";
				if(Content[index+1].equals("=")) return "nil";
			}
			//if(index>0) if(Content[index-1].equals('.')) return "nil";
			if(env[index].containsKey(str)){
				str=(String)env[index].get(str);
				if(str.indexOf("::")!=-1)
					return str.substring(str.indexOf("::")+2);
				else return str;
			}else{
				System.out.println("Sematic Error on line "+Row[index]+":\""+str+"\" can not be recognized!");
				return "UnKnow";
			}
			}else{
				System.out.println("Sematic Error :\""+str+"\" can not be located!");
				return "UnKnow";
			}
		}
	}
	public void GetASTLeave(DefaultMutableTreeNode father){
		try{
			DefaultMutableTreeNode temp=(DefaultMutableTreeNode)father.getFirstChild();
			while(temp!=null){
				GetASTLeave(temp);
				temp=(DefaultMutableTreeNode) father.getChildAfter(temp);
			}
		}catch(Exception ex){
			ASTLeave[ASTLeaveNum]=father;
			ASTLeaveNum++;
		}
	}
	public void GetSematicEnv(DefaultMutableTreeNode father){
	try{
		HashMap<String,String> _env=Hash.get(father);
		int st=Integer.parseInt(_env.get("0_start"));
		int en=Integer.parseInt(_env.get("0_end"));
		for(int i=st;i<=en;i++) env[i]=_env;
		DefaultMutableTreeNode temp=(DefaultMutableTreeNode) father.getFirstChild();
		while(temp!=null){
			GetSematicEnv(temp);
			temp=(DefaultMutableTreeNode) father.getChildAfter(temp);
		}
	}catch(Exception ex){
		return;
	}
	}
	public boolean PrototypeContain(String a,String b,HashMap<String,String> env){
		
		if(a.indexOf('\"')==0){
			if(a.length()==3) a="char";
			else a="string";
		}
		if((a.charAt(0)-'0'>=0)&&((a.charAt(0)-'0')<=9)) a="int";
		
		if(b.indexOf('\"')==0){
			if(b.length()==3) b="char";
			else b="string";
		}
		if((b.charAt(0)-'0'>=0)&&((b.charAt(0)-'0')<=9)) b="int";
		
		if(env==null){
		if(a.equals("UnKnow")) return false;
		if(b.equals("UnKnow")) return false;
		if(a.equals(b)) return true;
		if(a.equals("string") && b.equals("char")) return true;
		if(a.equals("bool") && b.equals("int")) return true;
		if(a.equals("int") && b.equals("bool")) return true;
		if(b.equals("nil")) return true;
		if(a.equals("nil")) return true;
		return false;
		} else return PrototypeContain(env.get(a)!=null?(String)env.get(a):a,env.get(b)!=null?(String)env.get(b):b,null);
	}
	public String GetPrototype(int st,int en,HashMap<String,String> env){
		if(Content[st].equals("array")) return Prototype(Content[en],env)+"[]";
		if(!Prototype(Content[st],env).equals("UnKnow")) return Prototype(Content[st],env);
		if(Content[st].indexOf('\"')==0){
			if(Content[st].length()==3) return "char";
			else return "string";
		}
		if((Content[st].charAt(0)-'0'>=0)&&((Content[st].charAt(0)-'0')<=9)) return "int";
		if(Content[st].equals("(")){
			int k=st;
			for(int i=st;i<=en;i++){
				if(Content[i].equals(";")) k=i+1;
			}
			if(env.containsKey(Content[k])) return Prototype(Content[k],env);
		}
		if(Content[st].equals("{")){
			String ss="";
			for(int i=st;i<=en;i++) ss+=Content[i];
			return ss;
		}
		return "UnKnow";
	}
	public String Prototype(String ext,HashMap<String,String> env){
		if(ext.equals("int")) return "int";
		if(ext.equals("char")) return "char";
		if(ext.equals("string")) return "string";
		if(ext.equals("bool")) return "bool";
		else if(env.containsKey(ext)){
			String str=env.get(ext);
			if(str.indexOf("function::")==0){
				int k=str.indexOf("):");
				if(k==-1) return "UnKnow";
				return str.substring(k+2);
			}else return str;
		}
		return "UnKnow";	
	}
	@Override
	public void valueChanged(TreeSelectionEvent arg0) {
		DefaultMutableTreeNode ptr=(DefaultMutableTreeNode)ASTTree.getLastSelectedPathComponent();
		if(ASTNodeIndex.get(ptr)==null) System.out.println("nil");
		else if(ASTNodeIndex.get(ptr)>=all) System.out.println("nil");
		else System.out.println(ptr+" is a "+SematicDFS(ptr));
	}
}
