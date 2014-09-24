import java.awt.*;
import java.io.*;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Element;
import javax.swing.tree.DefaultMutableTreeNode;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

import antlr.Token;

import java.awt.event.*;
public class CompilerWizard extends JFrame implements ActionListener,MouseListener,MouseMotionListener{
	  public class MyOutputStream extends OutputStream{
		    public void write(int arg0) throws IOException {
		      // 写入指定的字节，忽略
		    }    
		    
		    public void write(byte data[]) throws IOException{
		      // 追加一行字符串
		      CMDTextArea.append(new String(data));
		    }
		    
		    public void write(byte data[], int off, int len) throws IOException {
		      // 追加一行字符串中指定的部分，这个最重要
		      CMDTextArea.append(new String(data, off, len));
		      // 移动TextArea的光标到最后，实现自动滚动
		      CMDTextArea.setCaretPosition(CMDTextArea.getText().length());
		    }
		  }
	public MyOutputStream CMDStream=new MyOutputStream();
	SematicParser CheckSematicRules;
	JMenuBar Menubar;
	File DIR=null;
	JPanel ControlPane,CodePane,CMDPane,LayoutPane;
	JButton OpenFile=new JButton("Open File");
	JButton Exit=new JButton("To Exit");
	JTextArea CMDTextArea=new JTextArea(30,4);
	JTextArea CMDTextArea2=new JTextArea(30,4);
	JTextArea CodeTextArea=new JTextArea(50,16);
	JScrollPane ScrollCMDTextArea=new JScrollPane(CMDTextArea);
	MyTextPane ColorCodeTextArea=new MyTextPane();//Color
	JScrollPane ScrollCodeTextArea=new JScrollPane(ColorCodeTextArea);//Color
	JButton Expand=new JButton("WinExpand");
	JButton Shrink=new JButton("WinShrink");
	JButton DoCompile=new JButton("To Compile");
	JButton SaveFile=new JButton("Save File");
	JButton FreeConsole=new JButton("Ex Console");
	JButton MoreUtility=new JButton("More Utility");
	JButton CompilerInfo=new JButton("Infomation");
	CardLayout ToolCard=new CardLayout();
	JPanel NULLPane=new JPanel();
	JPanel UtilityPane=new JPanel();
	JPanel InfoPane=new JPanel();
	JPanel ASTPane=new JPanel();
	Color CurrentLineColor=Color.white;
	Color ErrorBackGroundColor=Color.red;
	Boolean ShowErrorHighlight=false;
	Color HintColor=Color.gray;
	JFileChooser FileDialog=new JFileChooser();
	int HighLightBackListNum=0;
	String[] HighLightBackList=new String[1000];
	Color[] HighLightBackColorList=new Color[1000];
	JFrame Console2;
	class NewJPanel extends JPanel implements ActionListener,MouseListener{
		public NewJPanel(){
			init();
		}
		public void init(){
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
		}
	}
	void WriteBack(File src){
		StringBuffer buf=new StringBuffer(ColorCodeTextArea.getText());
        try{
        	BufferedWriter out=new BufferedWriter(new FileWriter(src));
        	out.write(buf.toString());
        	out.flush();
        	out.close();
        }catch(Exception e){}
        boolean innerstring=false;
        int innerhint=0;
        int hintst=0,hinten=0;
        int stringst=0,stringen=0;
        for(int i=0;i<buf.length();i++){
        	if((buf.charAt(i)=='/')&&(buf.charAt(i+1)=='*')){
        		innerhint++;
        		if(innerhint==1) hintst=i;
        	}
        	if((buf.charAt(i)=='*')&&(buf.charAt(i+1)=='/')){
        		innerhint--;
    			hinten=i+1;
    			if(innerhint<0){
    				JOptionPane.showMessageDialog(null,"*/ is too more");
    			}
        	}
        	if((innerhint==0)&&(buf.charAt(i)=='\"')&&(buf.charAt(i-1)!='\\')){
        		innerstring=innerstring?false:true;
        	}
        	if(innerstring&&(buf.charAt(i)==' ')) buf.setCharAt(i,'_');
        }
		if(innerhint>0){
			JOptionPane.showMessageDialog(null,"/* is too more");
		}
        try{
        	BufferedWriter out=new BufferedWriter(new FileWriter("code.txt"));
        	out.write(buf.toString());
        	out.flush();
        	out.close();
        }catch(Exception e){}
	}
	JTree ASTTree=null;
	public DefaultMutableTreeNode GetNode(String str){
		if(str.charAt(0)=='(') str=str.substring(1);
		else str=str+")";
		int deep=0;
		int[] st=new int[1000];
		int[] en=new int[1000];
		st[0]=0;
		int now=0;
		for(int i=1;i<str.length()-1;){
			if(str.charAt(i)==' '){
				if(deep==0){
					en[now]=i-1;
					while(str.charAt(i)==' ') i++;
					if(str.charAt(i)=='(') continue;
					if(str.charAt(i)==')') continue;
					now++;
					st[now]=i;
				}
			}else if(str.charAt(i)=='('){
				deep++;
				if(deep==1){
					now++;
					st[now]=i;
				}
			}else if(str.charAt(i)==')'){
				deep--;
				if(deep==0){
					en[now]=i;
					i++;
					while(str.charAt(i)==' ') i++;
					if(str.charAt(i)=='(') continue;
					if(str.charAt(i)==')') continue;
					now++;
					st[now]=i;
				}
			}
			i++;
		}
		en[now]=str.length()-2;
		//---------------------------------------------------------
		DefaultMutableTreeNode Node=new DefaultMutableTreeNode(str.substring(st[0],en[0]+1));
		for(int i=1;i<=now;i++)
			Node.add(GetNode(str.substring(st[i],en[i]+1)));
		return Node;
	}
	public void CreateAST(String ASTstr,SematicParser ref){
		//System.out.println(ASTstr);
		DefaultMutableTreeNode root=GetNode(ASTstr);
		ASTTree=new JTree(root);
		ASTPane.removeAll();
		ASTPane.add(new JScrollPane(ASTTree),BorderLayout.CENTER);
		ASTPane.validate();
		ref.ASTRoot=root;
		ref.ASTTree=ASTTree;
		ASTTree.addTreeSelectionListener(ref);
		//System.gc();
	}
	public void FillConsole2(){
		CMDTextArea2.setFont(CMDTextArea.getFont());
		CMDTextArea2.setBackground(CMDTextArea.getBackground());
		CMDTextArea2.setForeground(CMDTextArea.getForeground());
		CMDTextArea2.setText(CMDTextArea.getText());
	}
	public CompilerWizard(){
		try{
		setSize(1000,720);
		setLayout(null);
		setUndecorated(true);
		setLocation(100,30);
		//--------------------------------------------------
		Console2=new JFrame();
		Console2.add(new JScrollPane(CMDTextArea2));
		Console2.setBounds(200,200,600,400);
		Console2.setVisible(false);
		Console2.setTitle("FreeConsole");
		Console2.setDefaultCloseOperation(HIDE_ON_CLOSE);
		Exit.addActionListener(this);
		CMDTextArea.addCaretListener(new CaretListener(){
			@Override
			public void caretUpdate(CaretEvent arg0) {
				// TODO Auto-generated method stub
				FillConsole2();
			}
		});
		ControlPane=new JPanel() {  
            @Override  
            protected void paintComponent(Graphics g){  
                ImageIcon icon = new ImageIcon("1.jpg");  
                Image img = icon.getImage();  
                g.drawImage(img,0,0,1000,100, 0, 0, icon.getIconWidth(), icon.getIconHeight(),icon.getImageObserver());  
            }
		};
		ControlPane.setBounds(0,0,1000,100);
		ControlPane.setOpaque(false);
		ControlPane.addMouseListener(this);
		ControlPane.addMouseMotionListener(this);
		ControlPane.setLayout(null);
		CodePane=new JPanel();
		CodePane.setBounds(0,100,750,500);
		CodePane.setLayout(null);
		CMDPane=new JPanel();
		CMDPane.setBounds(0,600,750,120);
		NULLPane=new JPanel() {  
            @Override  
            protected void paintComponent(Graphics g){  
                ImageIcon icon = new ImageIcon("2.jpg");  
                Image img = icon.getImage();  
                g.drawImage(img,0,0,250,620, 0, 0, icon.getIconWidth(), icon.getIconHeight(),icon.getImageObserver());  
            }
		};
		ASTPane=new JPanel(new BorderLayout());
		UtilityPane=new NewJPanel(){
			JComboBox fontList;
			JCheckBox CheckBold;
			JCheckBox CheckItalic;
			JTextField SizeTextField;
			JButton ApplyFont,SearchReplace,SelectEditorForeGround,SelectEditorBackGround,RestoreFontSetting;
			JButton SelectTerminalForeGround,SelectTerminalBackGround,SelectCurrentHighlighter;
			JButton SelectSearchBackGround,SelectErrorBackGround,SelectSyntaxForeGround,SelectHintColor;
			JTextField SearchContent;
			JTextField ReplaceContent;
			JLabel SearchLabel;
			JLabel ReplaceLabel;
			JButton ContSearch;
			JButton OnlySearch;
			JButton ReplaceAll;
			public void init(){
				fontList = new JComboBox();
				CheckBold=new JCheckBox("Bold");
				CheckBold.setOpaque(false);
				CheckItalic=new JCheckBox("Italic");
				CheckItalic.setOpaque(false);
				SizeTextField=new JTextField(3);
				ApplyFont=new JButton("Apply Font Configuration");
				JLabel l1=new JLabel("More Untilities");
				l1.setFont(new Font("Comic Sans MS",Font.BOLD,24));
				add(l1);
		   		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
				String[] fonts = ge.getAvailableFontFamilyNames();
				DefaultComboBoxModel fontModel = new DefaultComboBoxModel(fonts);
				fontList.setModel(fontModel);
				
				add(fontList);
				add(new JLabel("Font Size"));
				add(SizeTextField);
				add(CheckBold);
				add(CheckItalic);
				ApplyFont.addActionListener(this);
				add(ApplyFont);
				SearchReplace=new JButton("Show/Hide Search&Replace");
				SearchReplace.addActionListener(this);
				SelectEditorForeGround=new JButton("Select Editor Foreground Color");
				SelectEditorForeGround.addActionListener(this);
				add(SelectEditorForeGround);
				SelectEditorBackGround=new JButton("Select Editor Background Color");
				SelectEditorBackGround.addActionListener(this);
				add(SelectEditorBackGround);
				SelectTerminalForeGround=new JButton("Select Terminal Foreground Color");
				SelectTerminalForeGround.addActionListener(this);
				add(SelectTerminalForeGround);
				SelectTerminalBackGround=new JButton("Select Terminal BackGround Color");
				SelectTerminalBackGround.addActionListener(this);
				add(SelectTerminalBackGround);
				SelectCurrentHighlighter=new JButton("Select Current Highlighter Color");
				SelectCurrentHighlighter.addActionListener(this);
				add(SelectCurrentHighlighter);
				SelectSearchBackGround=new JButton("Search Target Background Color");
				SelectErrorBackGround=new JButton("Select Error Background Color");
				add(SelectSearchBackGround);
				SelectSearchBackGround.addActionListener(this);;
				add(SelectErrorBackGround);
				SelectErrorBackGround.addActionListener(this);
				SelectSyntaxForeGround=new JButton("Select The Syntax Highlight Color");
				add(SelectSyntaxForeGround);
				SelectSyntaxForeGround.addActionListener(this);
				SelectHintColor=new JButton("Select Hint Background Color");
				add(SelectHintColor);
				SelectHintColor.addActionListener(this);
				RestoreFontSetting=new JButton("Restore Default Font");
				RestoreFontSetting.addActionListener(this);
				add(RestoreFontSetting);
				//-------------------------------------------------------
				ApplyFont.setPreferredSize(new Dimension(240,30));
				SearchReplace.setPreferredSize(new Dimension(240,30));
				SelectEditorForeGround.setPreferredSize(new Dimension(240,30));
				SelectEditorBackGround.setPreferredSize(new Dimension(240,30));
				SelectTerminalForeGround.setPreferredSize(new Dimension(240,30));
				SelectTerminalBackGround.setPreferredSize(new Dimension(240,30));
				SelectCurrentHighlighter.setPreferredSize(new Dimension(240,30));
				SelectSearchBackGround.setPreferredSize(new Dimension(240,30));
				SelectErrorBackGround.setPreferredSize(new Dimension(240,30));
				SelectSyntaxForeGround.setPreferredSize(new Dimension(240,30));
				SelectHintColor.setPreferredSize(new Dimension(240,30));
				RestoreFontSetting.setPreferredSize(new Dimension(240,30));
				//---------------------Search & Replace
				add(SearchReplace);
				SearchContent=new JTextField(10);
				SearchContent.setVisible(false);
				ReplaceContent=new JTextField(10);
				ReplaceContent.setVisible(false);
				SearchLabel=new JLabel("Search The Contents:");
				SearchLabel.setVisible(false);
				ReplaceLabel=new JLabel("With");
				ReplaceLabel.setVisible(false);
				OnlySearch=new JButton("Only");
				OnlySearch.addActionListener(this);
				OnlySearch.setVisible(false);
				ContSearch=new JButton("Cont");
				ContSearch.addActionListener(this);
				ContSearch.setVisible(false);
				ReplaceAll=new JButton("Replace");
				ReplaceAll.addActionListener(this);
				ReplaceAll.setVisible(false);
				add(OnlySearch);
				add(ContSearch);
				add(SearchLabel);
				add(SearchContent);
				add(ReplaceAll);
				add(ReplaceLabel);
				add(ReplaceContent);
				//---------------------
				setVisible(true);
			}
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try{
				// TODO Auto-generated method stub
				if(arg0.getSource()==ApplyFont){
				ColorCodeTextArea.setFont(new Font((String)fontList.getSelectedItem(),
						(CheckBold.isSelected()?Font.BOLD:0)+(CheckItalic.isSelected()?Font.ITALIC:0),
						Integer.parseInt(SizeTextField.getText())));
				ColorCodeTextArea.SetMyFont(new Font((String)fontList.getSelectedItem(),
						(CheckBold.isSelected()?Font.BOLD:0)+(CheckItalic.isSelected()?Font.ITALIC:0),
						Integer.parseInt(SizeTextField.getText())));				
				}else if(arg0.getSource()==SearchReplace){
					if(ContSearch.isVisible()){
						SearchContent.setVisible(false);
						ReplaceContent.setVisible(false);
						SearchLabel.setVisible(false);
						ReplaceLabel.setVisible(false);
						OnlySearch.setVisible(false);
						ContSearch.setVisible(false);
						ReplaceAll.setVisible(false);
					}else{
						SearchContent.setVisible(true);
						ReplaceContent.setVisible(true);
						SearchLabel.setVisible(true);
						ReplaceLabel.setVisible(true);
						OnlySearch.setVisible(true);
						ContSearch.setVisible(true);
						ReplaceAll.setVisible(true);	
					}
					validate();
				}else if(arg0.getSource()==SelectEditorForeGround){
					Color NewColor=JColorChooser.showDialog(null,"Choose the Foreground Color For Editor",CodeTextArea.getForeground());
					ColorCodeTextArea.SetMyForeColor(NewColor);
				}else if(arg0.getSource()==SelectEditorBackGround){
					Color NewColor=JColorChooser.showDialog(null,"Choose the Background Color For Editor",CodeTextArea.getBackground());
					ColorCodeTextArea.setBackground(NewColor);
				}else if(arg0.getSource()==SelectTerminalForeGround){
					Color NewColor=JColorChooser.showDialog(null,"Choose the Foreground Color For Terminal",CMDTextArea.getForeground());
					CMDTextArea.setForeground(NewColor);
				}else if(arg0.getSource()==SelectTerminalBackGround){
					Color NewColor=JColorChooser.showDialog(null,"Choose the Background Color For Terminal",CMDTextArea.getBackground());
					CMDTextArea.setBackground(NewColor);
				}else if(arg0.getSource()==SelectCurrentHighlighter){
					CurrentLineColor=JColorChooser.showDialog(null,"Choose the Current Line's Highlighter Background Color",CurrentLineColor);
				}else if(arg0.getSource()==SelectSearchBackGround){
					Color t=JColorChooser.showDialog(null,"Choose the Search Targer BackGround Color",Color.white);
					for(int i=0;i<1000;i++) HighLightBackColorList[i]=t;
				}else if(arg0.getSource()==SelectErrorBackGround){
					ErrorBackGroundColor=JColorChooser.showDialog(null,"Choose the Error Background Color",ErrorBackGroundColor);
				}else if(arg0.getSource()==ContSearch){
					if((SearchContent.getText()==null)||(SearchContent.getText().equals(""))){
						JOptionPane.showMessageDialog(null,"Please Enter The Search Content");
						return;
					}
					HighLightBackList[HighLightBackListNum]=SearchContent.getText();
					HighLightBackListNum+=1;
				}else if(arg0.getSource()==ReplaceAll){
					if((SearchContent.getText()==null)||(SearchContent.getText().equals(""))){
						JOptionPane.showMessageDialog(null,"Please Enter The Search Content");
						return;
					}
					StringBuffer buf=new StringBuffer(ColorCodeTextArea.getText());
					String s1=SearchContent.getText();
					String s2=ReplaceContent.getText();
					int k=-1;
					while(k<buf.length()){
						k=buf.indexOf(s1,k+1);
						if(k==-1) break;
						buf.replace(k,k+s1.length(),s2);
						k=k+s2.length()-1;
					}
					ColorCodeTextArea.setText(new String(buf));
				}else if(arg0.getSource()==OnlySearch){
					if((SearchContent.getText()==null)||(SearchContent.getText().equals(""))){
						JOptionPane.showMessageDialog(null,"Please Enter The Search Content");
						return;
					}
					HighLightBackListNum=1;
					HighLightBackList[0]=SearchContent.getText();
				}else if(arg0.getSource()==SelectSyntaxForeGround){
					ColorCodeTextArea.SetMySyntaxColor(JColorChooser.showDialog(null,"Choose the Syntax Foreground Color",Color.blue));
				}else if(arg0.getSource()==SelectHintColor){
					HintColor=JColorChooser.showDialog(null,"Choose the Hint Background Color",HintColor);
				}else if(arg0.getSource()==RestoreFontSetting){
					ColorCodeTextArea.DefaultFont();
				}
				}catch(Exception ee){
					JOptionPane.showMessageDialog(null,"Configuration Fomat Error!");
				}finally{
					ScrollCodeTextArea.setRowHeaderView(new LineNumber(ColorCodeTextArea));
					FillConsole2();
				}
			}
            @Override  
            protected void paintComponent(Graphics g){  
                ImageIcon icon = new ImageIcon("3.jpg");  
                Image img = icon.getImage();  
                g.drawImage(img,0,0,250,620, 0, 0, icon.getIconWidth(), icon.getIconHeight(),icon.getImageObserver());  
            }
		};
		InfoPane=new NewJPanel(){
			public void init(){
				setVisible(true);
			}
            @Override  
            protected void paintComponent(Graphics g){  
                ImageIcon icon = new ImageIcon("Info.jpg");  
                Image img = icon.getImage();  
                g.drawImage(img,0,0,250,620, 0, 0, icon.getIconWidth(), icon.getIconHeight(),icon.getImageObserver());  
            }
		};
		ColorCodeTextArea.addCaretListener(new CaretListener() {  
			@Override
			public void caretUpdate(CaretEvent arg0) {
				// TODO Auto-generated method stub
			}  
        }); 
		javax.swing.Timer AutoText=new javax.swing.Timer(1000,new ActionListener(){
		    class MyHighlightPainter extends DefaultHighlighter.DefaultHighlightPainter {  
		        public MyHighlightPainter(Color color) {  
		            super(color);  
		        }  
		    }
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {  
	                // 计算光标所在行列  
	                DefaultHighlighter h = (DefaultHighlighter) ColorCodeTextArea.getHighlighter();
	                String buf=ColorCodeTextArea.getText();
	                h.removeAllHighlights();  
	                	//-------------------------------------------Error
	                	if(ShowErrorHighlight){
	                	String ErrorBuf=CMDTextArea.getText();
	                	int k1=-1,k2,k3;
	                	int LineNum,ColNum;
	                	while((k1=ErrorBuf.indexOf("line ",k1+1))!=-1){
	                		k2=ErrorBuf.indexOf(":",k1);
	                		if(k2==-1) break;
	                		LineNum=Integer.parseInt(ErrorBuf.substring(k1+5,k2));
	                		
	                		Element root = ColorCodeTextArea.m_doc.getDefaultRootElement();
	                		Element para = root.getElement(LineNum-1);
	                		int start = para.getStartOffset();
	                		int end = para.getEndOffset();// 除\r字符
	                		h.addHighlight(start,end,new MyHighlightPainter(ErrorBackGroundColor));
	                	}
	                	}
	                    //-------------------------------------------Hint
	                    int l=0,r=0;
	                    while(true){
	                    	l=buf.indexOf("/*",l);
	                    	if(l==-1) break;
	                    	r=buf.indexOf("*/",l+2);
	                    	if(r==-1) break;
	                    	h.addHighlight(l,r+2,new MyHighlightPainter(HintColor));
	                    	l=r+2;
	                    }
	                    //-------------------------------------------The Cursor
	                    h.addHighlight(ColorCodeTextArea.getCaretPosition(),ColorCodeTextArea.getCaretPosition()+1,
	                    		new MyHighlightPainter(CurrentLineColor));
	                    //--------------------------------------------The Selection
	                    if(ColorCodeTextArea.getSelectedText()!=null)
	                    	if(!ColorCodeTextArea.getSelectedText().equals(""))
	                    		h.addHighlight(ColorCodeTextArea.getSelectionStart(),ColorCodeTextArea.getSelectionEnd(),new MyHighlightPainter(HighLightBackColorList[0]));
	                    //----------------------------------------------The Search Thing
	                for(int i=0;i<HighLightBackListNum;i++){
	                	int j=-1;
	                	while((j=buf.indexOf(HighLightBackList[i],j+1))!=-1){
	                		h.addHighlight(j,j+HighLightBackList[i].length(),new MyHighlightPainter(HighLightBackColorList[i]));
	                	}
	                	//-----------------------------------------------
	                }
	                } catch (Exception ex) {
	                	//ex.printStackTrace();
	                }
			}
		});
		AutoText.start();
		LayoutPane=new JPanel();
		LayoutPane.setBounds(750,100,250,620);
		add(ControlPane,BorderLayout.NORTH);
		add(CodePane,BorderLayout.CENTER);
		add(CMDPane,BorderLayout.SOUTH);
		add(LayoutPane,BorderLayout.EAST);
		ControlPane.add(OpenFile);
		ControlPane.add(Exit);
		ControlPane.add(Expand);
		ControlPane.add(Shrink);
		ControlPane.add(DoCompile);
		ControlPane.add(FreeConsole);
		ControlPane.add(SaveFile);
		ControlPane.add(MoreUtility);
		ControlPane.add(CompilerInfo);
		OpenFile.setBounds(10,60,100,30);
		OpenFile.addActionListener(this);
		SaveFile.setBounds(120,60,100,30);
		SaveFile.addActionListener(this);
		Exit.setBounds(230,60,100,30);
		Exit.addActionListener(this);
		Expand.setBounds(340,60,100,30);
		Expand.addActionListener(this);
		Shrink.setBounds(450,60,100,30);
		Shrink.addActionListener(this);
		DoCompile.setBounds(560,60,100,30);
		DoCompile.addActionListener(this);
		FreeConsole.setBounds(670,60,100,30);
		FreeConsole.addActionListener(this);
		MoreUtility.setBounds(780,60,100,30);
		MoreUtility.addActionListener(this);
		CompilerInfo.setBounds(890,60,100,30);
		CompilerInfo.addActionListener(this);
		CMDTextArea.setEditable(false);
		CMDTextArea2.setEditable(false);
		CMDPane.setLayout(null);
		ScrollCMDTextArea.setBounds(0,0,750,120);
		CMDPane.add(ScrollCMDTextArea);
		ScrollCodeTextArea.setBounds(0,0,750,500);
		CodePane.add(ScrollCodeTextArea);
		LayoutPane.setLayout(ToolCard);
		LayoutPane.add("NULLPane",NULLPane);
		LayoutPane.add("InfoPane",InfoPane);
		LayoutPane.add("ASTPane",ASTPane);
		LayoutPane.add("UtilityPane",UtilityPane);
		ToolCard.show(LayoutPane,"NULLPane");
		//-----------------------------------------------
		CMDTextArea.setText("Welcome To Tiger Compiler !!!\n");
		CMDTextArea.setForeground(Color.white);
		CMDTextArea.setBackground(Color.black);
		CMDTextArea.setFont(new Font("Consolar",Font.BOLD,16));
		FillConsole2();
		ScrollCodeTextArea.setRowHeaderView(new LineNumber(ColorCodeTextArea));
		//Specify The Color------------------------------------------------
		for(int i=0;i<1000;i++) HighLightBackColorList[i]=Color.cyan;
		//PaneState------------------------------------------------
		CodePane.setSize(750,620);
		ScrollCodeTextArea.setSize(750,620);
		CMDPane.setVisible(false);
		LayoutPane.setSize(250,620);
		LayoutPane.setVisible(true);
		validate();
		//------------------------------------------------
		setVisible(true);
		}catch(Exception e){System.out.println(e.toString());}
	}
	void ExpandCode(){
		if(LayoutPane.isVisible()){
		CodePane.setSize(1000,500);
		ScrollCodeTextArea.setSize(1000,500);
		CMDPane.setSize(1000,120);
		CMDPane.setVisible(true);
		ScrollCMDTextArea.setSize(1000,120);
		LayoutPane.setVisible(false);
		}else {
			CodePane.setSize(1000,620);
			ScrollCodeTextArea.setSize(1000,620);
			CMDPane.setVisible(false);
		}
		validate();
	}
	void ShrinkCode(){
		if(LayoutPane.isVisible()){
			CodePane.setSize(750,500);
			ScrollCodeTextArea.setSize(750,500);
			CMDPane.setBounds(0,600,750,120);
			ScrollCMDTextArea.setSize(750,120);
			CMDPane.setVisible(true);
			LayoutPane.setSize(250,620);
			LayoutPane.setVisible(true);
		}else{
		CodePane.setSize(750,620);
		ScrollCodeTextArea.setSize(750,620);
		CMDPane.setVisible(false);
		LayoutPane.setSize(250,620);
		LayoutPane.setVisible(true);
		}
		validate();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==Exit){
			System.exit(0);
		}else if(e.getSource()==Expand){
			ExpandCode();
		}else if(e.getSource()==Shrink){
			ShrinkCode();
		}else if(e.getSource()==FreeConsole){
			Console2.setVisible(Console2.isVisible()?false:true);
		}else if(e.getSource()==MoreUtility){
			ToolCard.show(LayoutPane,"UtilityPane");
		}else if(e.getSource()==CompilerInfo){
			ToolCard.show(LayoutPane,"InfoPane");
		}else if(e.getSource()==OpenFile){
			ToolCard.show(LayoutPane,"NULLPane");
			HighLightBackListNum=0;
			ShowErrorHighlight=ShowErrorHighlight?false:true;
			FileDialog.setCurrentDirectory(new File("./"));
			CMDTextArea.setText("");
			int state=FileDialog.showOpenDialog(this);
			if(state==JFileChooser.APPROVE_OPTION){
				DIR=FileDialog.getSelectedFile();
				ColorCodeTextArea.PermitProcess=false;
				try{
					BufferedReader InputFile=new BufferedReader(new FileReader(DIR));
					String buf;
					ColorCodeTextArea.setText("");//Color
					while((buf=InputFile.readLine())!=null){
						ColorCodeTextArea.setText(ColorCodeTextArea.getText()+buf+"\n");//Color
						//ColorCodeTextArea.append(buf+"\n");
					}
					InputFile.close();
				}catch(Exception ee){System.out.println(ee.toString());}
				finally{
					ColorCodeTextArea.dealText(0,ColorCodeTextArea.getText().length());
					ColorCodeTextArea.PermitProcess=true;
				}
			}
		}else if(e.getSource()==SaveFile){
			FileDialog.setCurrentDirectory(new File("./"));
			int state=FileDialog.showOpenDialog(this);
			if(state==JFileChooser.APPROVE_OPTION){
				File DIR=FileDialog.getSelectedFile();
				try{
					BufferedWriter OutputFile=new BufferedWriter(new FileWriter(DIR));
					OutputFile.write(ColorCodeTextArea.getText());
					OutputFile.flush();
					OutputFile.close();
				}catch(Exception ee){System.out.println(ee.toString());}
			}
		}else if(e.getSource()==DoCompile){
			try{
			WriteBack(DIR);
			if((ColorCodeTextArea.getText()==null) || (ColorCodeTextArea.getText().equals(""))){
				JOptionPane.showMessageDialog(null,"The Code is NULL!!!");
			}
			CMDTextArea.setText("");
			System.out.println("Start The Compiling Processor......");
			System.out.println("【List Error and Exception】--------------------");
			ANTLRFileStream input = new ANTLRFileStream("code.txt");
			TigerLexer lexer = new TigerLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			if(CheckSematicRules!=null){
				CheckSematicRules.wizard.dispose();
				CheckSematicRules=null;
				System.gc();
			}
			CheckSematicRules=new SematicParser(tokens);
			//---------------------------------
			TigerParser parser = new TigerParser(tokens);
			TigerParser.prog_return r = parser.prog();
			CreateAST(((CommonTree)r.getTree()).toStringTree(),CheckSematicRules);
			ToolCard.show(LayoutPane,"ASTPane");
			if(CMDTextArea.getText().indexOf(" line ")==-1){
				CheckSematicRules.check(ColorCodeTextArea);
				System.gc();
			}
			System.out.println("---------------------------------------------------------------");
			System.out.println("Done");
			ShowErrorHighlight=true;
			if(CMDTextArea.getText().indexOf(" line ")!=-1)
			{
				JOptionPane.showMessageDialog(null,"Errors Exist in Your Code!!!");
				return;
			}else JOptionPane.showMessageDialog(null,"No Errors,Congratulations!!!");
			}catch(Exception ex){
				//ex.printStackTrace();
			}
		}
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int dx=arg0.getX()-PressX;
		int dy=arg0.getY()-PressY;
		this.setLocation(this.getLocation().x+dx,this.getLocation().y+dy);
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getClickCount()>=2)
		{
			ToolCard.show(LayoutPane,"NULLPane");
			HighLightBackListNum=0;
			ShowErrorHighlight=ShowErrorHighlight?false:true;
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	int PressX,PressY;
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		PressX=arg0.getX();
		PressY=arg0.getY();
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
