import java.util.StringTokenizer;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.*;
import javax.swing.text.rtf.RTFEditorKit;
/**
 * 关键字特殊处理面板
 * @author Administrator
 *
 */
public class MyTextPane extends JTextPane{
 /**
  *
  */
public boolean getScrollableTracksViewportWidth() {
    return false;
}

public void setSize(int x,int y) {
    if (x < getParent().getSize().width) {
        x = getParent().getSize().width;
    }
    x += 10000;
    super.setSize(x,y);
}	
public void setSize(Dimension d) {
    if (d.width < getParent().getSize().width) {
        d.width = getParent().getSize().width;
    }
    d.width+=1000;
    super.setSize(d);
}

 private static final long serialVersionUID = -66377652770879651L;
 protected StyleContext m_context;
 protected DefaultStyledDocument m_doc;
 private MutableAttributeSet keyAttr, normalAttr;
 private MutableAttributeSet bracketAttr;
 private MutableAttributeSet inputAttributes = new RTFEditorKit()
   .getInputAttributes();
 /**
  * 所有关键字
  */
	javax.swing.Timer myTimer;
 private final static String[] _keys = new String[] {"function","if",
	"then","else","while","for","do","break","let","in","end","of","to","type","var",
	"array"};
	 /**
	 * 所与排除字符集
	 */
	 private final static char[] _character = new char[] { '(', ')', ',', ';','\r',
	 ':', '\t', '\n', '+', '-', '*', '/' };
	 /**
	 * 初始化，包括关键字颜色，和非关键字颜色
	 */
	 public MyTextPane() {
	 super();
	 m_context = new StyleContext();
	 m_doc = new DefaultStyledDocument(m_context);
	 this.setDocument(m_doc);
	 /*this.addKeyListener(new KeyAdapter() {
	 public void keyReleased(KeyEvent ke) {
	 dealSingleRow();
	 }
	 });
	 */
	 setFont(new Font("Times New Roman",0,20));
	 setBackground(Color.black);
	 // 义关键字显示属性
	 keyAttr = new SimpleAttributeSet();
	 StyleConstants.setForeground(keyAttr, Color.BLUE);
	 StyleConstants.setBold(keyAttr,true);
	 StyleConstants.setItalic(keyAttr,true);
	 StyleConstants.setFontFamily(keyAttr,"Times New Roman");
	 // 义一般文本显示属性
	 normalAttr = new SimpleAttributeSet();
	 StyleConstants.setFontFamily(normalAttr,"Times New Roman");
	 StyleConstants.setBold(normalAttr,false);
	 StyleConstants.setForeground(normalAttr,Color.green);
	 bracketAttr = new SimpleAttributeSet();
	 StyleConstants.setForeground(bracketAttr, Color.magenta);
	 StyleConstants.setFontFamily(bracketAttr,"Times New Roman");
	 StyleConstants.setBold(bracketAttr, true);
	 myTimer=new javax.swing.Timer
	(1000,new java.awt.event.ActionListener()
	 {
		    public void actionPerformed(ActionEvent e)
		    {
		    if(PermitProcess){
		    	  StringBuffer buf=new StringBuffer(getText());
		    	  if(buf.indexOf("\r")==-1){
			    	  dealText(0,buf.length());
			    	  return;
		    	  }
		    	  int pos1=realPos(buf.toString(),getSelectionStart());
		    	  int pos2=realPos(buf.toString(),getSelectionEnd());
		    	  int pos3=realPos(buf.toString(),getCaretPosition());
		    	  int k=0; 
		    	  while((k=buf.indexOf("\r"))!=-1){
		    		  buf.replace(k,k+1,"");
		    	  }
		    	  setText(buf.toString());
		    	  dealText(0,buf.length());
		    	  setSelectionStart(pos1);
		    	  setSelectionEnd(pos2);
		    	  setCaretPosition(pos3);
		    }
		    }
		   }
	  );
	 myTimer.start();
	 }
int realPos(String buf,int cursorPos){
	  int j=0;
	  for(int i=0;i<cursorPos;i++) if(buf.charAt(i)=='\r') j++;
	  cursorPos-=j;
	  return cursorPos;
}
public void SetMyFont(Font f){
	 StyleConstants.setFontFamily(normalAttr,f.getFamily());
	 StyleConstants.setBold(normalAttr,(f.getStyle()==Font.BOLD)||(f.getStyle()==(Font.BOLD+Font.ITALIC)));
	 StyleConstants.setItalic(normalAttr,(f.getStyle()==Font.ITALIC)||(f.getStyle()==(Font.BOLD+Font.ITALIC)));
	 StyleConstants.setFontFamily(keyAttr,f.getFamily());
	 StyleConstants.setBold(keyAttr,(f.getStyle()==Font.BOLD)||(f.getStyle()==(Font.BOLD+Font.ITALIC)));
	 StyleConstants.setItalic(keyAttr,(f.getStyle()==Font.ITALIC)||(f.getStyle()==(Font.BOLD+Font.ITALIC)));
	 StyleConstants.setFontFamily(bracketAttr,f.getFamily());
	 StyleConstants.setBold(bracketAttr,(f.getStyle()==Font.BOLD)||(f.getStyle()==(Font.BOLD+Font.ITALIC)));
	 StyleConstants.setItalic(bracketAttr,(f.getStyle()==Font.ITALIC)||(f.getStyle()==(Font.BOLD+Font.ITALIC)));
}
public void DefaultFont(){
	 setFont(new Font("Times New Roman",0,20));
	 setBackground(Color.black);
	 StyleConstants.setForeground(keyAttr, Color.BLUE);
	 StyleConstants.setBold(keyAttr,true);
	 StyleConstants.setItalic(keyAttr,true);
	 StyleConstants.setFontFamily(keyAttr,"Times New Roman");
	 
	 StyleConstants.setFontFamily(normalAttr,"Times New Roman");
	 StyleConstants.setBold(normalAttr,false);
	 StyleConstants.setItalic(normalAttr,false);
	 StyleConstants.setForeground(normalAttr,Color.green);
	 
	 StyleConstants.setForeground(bracketAttr, Color.magenta);
	 StyleConstants.setFontFamily(bracketAttr,"Times New Roman");
	 StyleConstants.setBold(bracketAttr, true);
	 StyleConstants.setItalic(bracketAttr,false);
}
public void SetMyForeColor(Color Fore){
	 StyleConstants.setForeground(normalAttr,Fore);
}
public void SetMySyntaxColor(Color Fore){
	 StyleConstants.setForeground(keyAttr,Fore);
}
 /**
  * 设置大括号颜色
  * @param _text
  */
 private void setBracketColor(String _text) {
  int len = _text.length();
  for (int i = 0; i < len; i++) {
   char ch = _text.charAt(i);
   if (ch == '{' || ch == '}' || ch == '(' || ch== ')' || ch == '[' || ch== ']' || ch==';' || ch=='.' || ch==','
	|| ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='<' || ch=='>' || ch=='=' || ch=='&' || ch=='|' || ch=='\''
	|| ch=='\"'|| ch=='^' || ch==':') {
    m_doc.setCharacterAttributes(i, 1, bracketAttr, false);
   }
  }
 }
 /**
  * 判断字符是不是在排除字符行列
  * @param _ch
  * @return
  */
 private boolean isCharacter(char _ch) {
  for (int i = 0; i < _character.length; i++) {
   if (_ch == _character[i]) {
    return true;
   }
  }
  return false;
 }
 /**
  * 设置关键字颜色
  * @param _key
  * @param _start
  * @param _length
  * @return
  */
 private int setKeyColor(String _key, int _start, int _length) {
  for (int i = 0; i < _keys.length; i++) {
   int li_index = _key.indexOf(_keys[i]);
   if (li_index < 0) {
    continue;
   }
   int li_legnth = li_index + _keys[i].length();
   if (li_legnth == _key.length()) {
    if (li_index == 0) {//处理单独一个关键字的情况，例如：if else 等
     m_doc.setCharacterAttributes(_start, _keys[i].length(),
       keyAttr, false);
    } else {//处理关键字前面还有字符的情况，例如：)if ;else 等
     char ch_temp = _key.charAt(li_index - 1);
     if (isCharacter(ch_temp)) {
      m_doc.setCharacterAttributes(_start + li_index,
        _keys[i].length(), keyAttr, false);
     }
    }
   } else {
    if (li_index == 0) {//处理关键字后面还有字符的情况，例如：if(  end;等
     char ch_temp = _key.charAt(_keys[i].length());
     if (isCharacter(ch_temp)) {
      m_doc.setCharacterAttributes(_start, _keys[i].length(),
        keyAttr, false);
     }
    } else {//处理关键字前面和后面都有字符的情况，例如：)if( 等
     char ch_temp = _key.charAt(li_index - 1);
     char ch_temp_2 = _key.charAt(li_legnth);
     if (isCharacter(ch_temp) && isCharacter(ch_temp_2)) {
      m_doc.setCharacterAttributes(_start + li_index,
        _keys[i].length(), keyAttr, false);
     }
    }
   }
  }
  return _length + 1;
 }
 /**
  * 处理一行的数据
  * @param _start
  * @param _end
  */
public  void dealText(int _start, int _end) {
  if(_end-_start<=0) return;
  String text = "";
  try {
   text = m_doc.getText(_start, _end - _start);
  } catch (BadLocationException e) {
   e.printStackTrace();
  }
  if (text == null || text.equals("")) {
   return;
  }
  int xStart = 0;
  // 析关键字---
  m_doc.setCharacterAttributes(_start, text.length(), normalAttr, false);
  MyStringTokenizer st = new MyStringTokenizer(text);
  while (st.hasMoreTokens()) {
   String s = st.nextToken();
   if (s == null)
    return;
   xStart = st.getCurrPosition();
   setKeyColor(s, _start + xStart, s.length());
  }
  setBracketColor(text);
  inputAttributes.addAttributes(normalAttr);
 }
 /**
  * 在进行文本修改的时候
  * 获得光标所在行，只对该行进行处理
  */
public void dealSingleRow() {
  Element root = m_doc.getDefaultRootElement();
  // 光标当前行
  int cursorPos = this.getCaretPosition(); // 前光标的位置
  int line = root.getElementIndex(cursorPos);// 当前行
  Element para = root.getElement(line);
  int start = para.getStartOffset();
  int end = para.getEndOffset() - 1;// 除\r字符
  dealText(start, end);
 }
 /**
  * 在初始化面板的时候调用该方法，
  * 查找整个篇幅的关键字
  */
 public void syntaxParse() {
  Element root = m_doc.getDefaultRootElement();
  int li_count = root.getElementCount();
  for (int i = 0; i < li_count; i++) {
   Element para = root.getElement(i);
   int start = para.getStartOffset();
   int end = para.getEndOffset() - 1;// 除\r字符
   dealText(start, end);
  }
 }
public boolean PermitProcess=true;


}
/**
 * 在分析字符串的同时，记录每个token所在的位置
 *
 */
class MyStringTokenizer extends StringTokenizer {
 String sval = " ";
 String oldStr, str;
 int m_currPosition = 0, m_beginPosition = 0;
 MyStringTokenizer(String str) {
  super(str, " ");
  this.oldStr = str;
  this.str = str;
 }
 public String nextToken() {
  try {
   String s = super.nextToken();
   int pos = -1;
   if (oldStr.equals(s)) {
    return s;
   }
   pos = str.indexOf(s + sval);
   if (pos == -1) {
    pos = str.indexOf(sval + s);
    if (pos == -1)
     return null;
    else
     pos += 1;
   }
   int xBegin = pos + s.length();
   str = str.substring(xBegin);
   m_currPosition = m_beginPosition + pos;
   m_beginPosition = m_beginPosition + xBegin;
   return s;
  } catch (java.util.NoSuchElementException ex) {
   ex.printStackTrace();
   return null;
  }
 }
 // 返回token在字符串中的位置
 public int getCurrPosition() {
  return m_currPosition;
 }
}