import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
//import org.antlr.v4.runtime.ANTLRInputStream;
public class run
{
	public static void main(String[] args) throws Exception
	{
		File file = new File("result.txt");
		BufferedWriter out = new BufferedWriter(new FileWriter(file,true));

		for(int i = 1; i <= 50; i++){
			String filename = "test"+i+".tig";
			ANTLRFileStream input = new ANTLRFileStream(filename);
			TigerLexer lexer = new TigerLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			TigerParser parser = new TigerParser(tokens);
			TigerParser.prog_return r = parser.prog();
			System.out.println(((CommonTree)r.getTree()).toStringTree());

			try{
				out.write(filename+":\n");
				out.write(((CommonTree)r.getTree()).toStringTree());
				out.newLine();
				out.newLine();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

		out.close();
		file = null;
	}
}
