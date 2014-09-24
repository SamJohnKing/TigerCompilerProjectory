import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.io.*;

public class run
{
	public static void main(String[] args)
	{try{
		CompilerWizard wizard=new CompilerWizard();
        PrintStream ps=new PrintStream(wizard.CMDStream);  
        System.setOut(ps);  
        System.setErr(ps);
	}catch(Exception e){}
	}
}
