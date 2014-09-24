// $ANTLR 3.4 C:\\Users\\e49al\\Tiger.g 2013-06-03 14:46:38

import org.antlr.v4.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class TigerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY", "ARRAYCREATION", "ARRAYINDEX", "ARRAYTYPE", "ASSIGN", "BACKSLASH", "BREAK", "COLON", "COMMA", "COMMENT", "DECS", "DIGIT", "DIV", "DO", "DOT", "ELSE", "END", "EQUAL", "ESCAPEDSEQ", "EXPSEQ", "FOR", "FORMATCHAR", "FUN", "FUNCTIONCALL", "GE", "GT", "ID", "IF", "IFTHEN", "IFTHENELSE", "IN", "INT", "LE", "LEFTBRACE", "LEFTBRACKET", "LEFTPARENTHESIS", "LET", "LT", "LVALUE", "MINUS", "NE", "NIL", "NILROOT", "OF", "OR", "PLUS", "PRINTABLECHAR", "QUOTE", "RECORDCREATION", "RIGHTBRACE", "RIGHTBRACKET", "RIGHTPARENTHESIS", "SEMICOLON", "SEQ", "SEQUENCING", "STRING", "THEN", "TIMES", "TO", "TYFIELDS", "TYPE", "VAR", "WHILE"
    };

    public static final int EOF=-1;
    public static final int AND=4;
    public static final int ARRAY=5;
    public static final int ARRAYCREATION=6;
    public static final int ARRAYINDEX=7;
    public static final int ARRAYTYPE=8;
    public static final int ASSIGN=9;
    public static final int BACKSLASH=10;
    public static final int BREAK=11;
    public static final int COLON=12;
    public static final int COMMA=13;
    public static final int COMMENT=14;
    public static final int DECS=15;
    public static final int DIGIT=16;
    public static final int DIV=17;
    public static final int DO=18;
    public static final int DOT=19;
    public static final int ELSE=20;
    public static final int END=21;
    public static final int EQUAL=22;
    public static final int ESCAPEDSEQ=23;
    public static final int EXPSEQ=24;
    public static final int FOR=25;
    public static final int FORMATCHAR=26;
    public static final int FUN=27;
    public static final int FUNCTIONCALL=28;
    public static final int GE=29;
    public static final int GT=30;
    public static final int ID=31;
    public static final int IF=32;
    public static final int IFTHEN=33;
    public static final int IFTHENELSE=34;
    public static final int IN=35;
    public static final int INT=36;
    public static final int LE=37;
    public static final int LEFTBRACE=38;
    public static final int LEFTBRACKET=39;
    public static final int LEFTPARENTHESIS=40;
    public static final int LET=41;
    public static final int LT=42;
    public static final int LVALUE=43;
    public static final int MINUS=44;
    public static final int NE=45;
    public static final int NIL=46;
    public static final int NILROOT=47;
    public static final int OF=48;
    public static final int OR=49;
    public static final int PLUS=50;
    public static final int PRINTABLECHAR=51;
    public static final int QUOTE=52;
    public static final int RECORDCREATION=53;
    public static final int RIGHTBRACE=54;
    public static final int RIGHTBRACKET=55;
    public static final int RIGHTPARENTHESIS=56;
    public static final int SEMICOLON=57;
    public static final int SEQ=58;
    public static final int SEQUENCING=59;
    public static final int STRING=60;
    public static final int THEN=61;
    public static final int TIMES=62;
    public static final int TO=63;
    public static final int TYFIELDS=64;
    public static final int TYPE=65;
    public static final int VAR=66;
    public static final int WHILE=67;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public TigerParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TigerParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return TigerParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\e49al\\Tiger.g"; }


    	Stack paraphrases = new Stack();
    	public String getErrorMessage(RecognitionException e,
    			String[] tokenNames)
    	{
    		String msg = super.getErrorMessage(e, tokenNames);
    		if ( paraphrases.size()>0 ) {
    			String paraphrase = (String)paraphrases.peek();
    			msg = msg+" "+paraphrase;
    		}
    		return msg;
    	}


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Users\\e49al\\Tiger.g:99:1: prog : exp -> exp ;
    public final TigerParser.prog_return prog() throws RecognitionException {
        TigerParser.prog_return retval = new TigerParser.prog_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        TigerParser.exp_return exp1 =null;


        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        paraphrases.push("in prog");
        try {
            // C:\\Users\\e49al\\Tiger.g:102:3: ( exp -> exp )
            // C:\\Users\\e49al\\Tiger.g:102:3: exp
            {
            pushFollow(FOLLOW_exp_in_prog374);
            exp1=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(exp1.getTree());

            // AST REWRITE
            // elements: exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 102:7: -> exp
            {
                adaptor.addChild(root_0, stream_exp.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class decs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decs"
    // C:\\Users\\e49al\\Tiger.g:109:1: decs : ( dec )* -> ^( DECS ( dec )* ) ;
    public final TigerParser.decs_return decs() throws RecognitionException {
        TigerParser.decs_return retval = new TigerParser.decs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        TigerParser.dec_return dec2 =null;


        RewriteRuleSubtreeStream stream_dec=new RewriteRuleSubtreeStream(adaptor,"rule dec");
        paraphrases.push("in decs");
        try {
            // C:\\Users\\e49al\\Tiger.g:112:3: ( ( dec )* -> ^( DECS ( dec )* ) )
            // C:\\Users\\e49al\\Tiger.g:112:3: ( dec )*
            {
            // C:\\Users\\e49al\\Tiger.g:112:3: ( dec )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUN||(LA1_0 >= TYPE && LA1_0 <= VAR)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\e49al\\Tiger.g:112:4: dec
            	    {
            	    pushFollow(FOLLOW_dec_in_decs403);
            	    dec2=dec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_dec.add(dec2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: dec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 112:9: -> ^( DECS ( dec )* )
            {
                // C:\\Users\\e49al\\Tiger.g:112:12: ^( DECS ( dec )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECS, "DECS")
                , root_1);

                // C:\\Users\\e49al\\Tiger.g:112:19: ( dec )*
                while ( stream_dec.hasNext() ) {
                    adaptor.addChild(root_1, stream_dec.nextTree());

                }
                stream_dec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decs"


    public static class dec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dec"
    // C:\\Users\\e49al\\Tiger.g:113:1: dec : ( tydec -> tydec | vardec -> vardec | fundec -> fundec );
    public final TigerParser.dec_return dec() throws RecognitionException {
        TigerParser.dec_return retval = new TigerParser.dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        TigerParser.tydec_return tydec3 =null;

        TigerParser.vardec_return vardec4 =null;

        TigerParser.fundec_return fundec5 =null;


        RewriteRuleSubtreeStream stream_fundec=new RewriteRuleSubtreeStream(adaptor,"rule fundec");
        RewriteRuleSubtreeStream stream_tydec=new RewriteRuleSubtreeStream(adaptor,"rule tydec");
        RewriteRuleSubtreeStream stream_vardec=new RewriteRuleSubtreeStream(adaptor,"rule vardec");
        paraphrases.push("in dec");
        try {
            // C:\\Users\\e49al\\Tiger.g:116:3: ( tydec -> tydec | vardec -> vardec | fundec -> fundec )
            int alt2=3;
            switch ( input.LA(1) ) {
            case TYPE:
                {
                alt2=1;
                }
                break;
            case VAR:
                {
                alt2=2;
                }
                break;
            case FUN:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\e49al\\Tiger.g:116:3: tydec
                    {
                    pushFollow(FOLLOW_tydec_in_dec431);
                    tydec3=tydec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tydec.add(tydec3.getTree());

                    // AST REWRITE
                    // elements: tydec
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:9: -> tydec
                    {
                        adaptor.addChild(root_0, stream_tydec.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\e49al\\Tiger.g:117:3: vardec
                    {
                    pushFollow(FOLLOW_vardec_in_dec439);
                    vardec4=vardec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_vardec.add(vardec4.getTree());

                    // AST REWRITE
                    // elements: vardec
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 117:10: -> vardec
                    {
                        adaptor.addChild(root_0, stream_vardec.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\e49al\\Tiger.g:118:3: fundec
                    {
                    pushFollow(FOLLOW_fundec_in_dec447);
                    fundec5=fundec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fundec.add(fundec5.getTree());

                    // AST REWRITE
                    // elements: fundec
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 118:10: -> fundec
                    {
                        adaptor.addChild(root_0, stream_fundec.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dec"


    public static class tydec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tydec"
    // C:\\Users\\e49al\\Tiger.g:120:1: tydec : TYPE ID EQUAL ty -> ^( TYPE ID ty ) ;
    public final TigerParser.tydec_return tydec() throws RecognitionException {
        TigerParser.tydec_return retval = new TigerParser.tydec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TYPE6=null;
        Token ID7=null;
        Token EQUAL8=null;
        TigerParser.ty_return ty9 =null;


        Object TYPE6_tree=null;
        Object ID7_tree=null;
        Object EQUAL8_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_ty=new RewriteRuleSubtreeStream(adaptor,"rule ty");
        paraphrases.push("in type decarations");
        try {
            // C:\\Users\\e49al\\Tiger.g:123:3: ( TYPE ID EQUAL ty -> ^( TYPE ID ty ) )
            // C:\\Users\\e49al\\Tiger.g:123:3: TYPE ID EQUAL ty
            {
            TYPE6=(Token)match(input,TYPE,FOLLOW_TYPE_in_tydec470); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPE.add(TYPE6);


            ID7=(Token)match(input,ID,FOLLOW_ID_in_tydec472); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID7);


            EQUAL8=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_tydec474); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL8);


            pushFollow(FOLLOW_ty_in_tydec476);
            ty9=ty();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ty.add(ty9.getTree());

            // AST REWRITE
            // elements: ty, ID, TYPE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 123:20: -> ^( TYPE ID ty )
            {
                // C:\\Users\\e49al\\Tiger.g:123:23: ^( TYPE ID ty )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_TYPE.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_ty.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tydec"


    public static class ty_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ty"
    // C:\\Users\\e49al\\Tiger.g:124:1: ty : ( ID -> ID | LEFTBRACE ( tyfields ) RIGHTBRACE -> tyfields | LEFTBRACE RIGHTBRACE -> NILROOT | ARRAY OF ID -> ^( ARRAYTYPE ID ) );
    public final TigerParser.ty_return ty() throws RecognitionException {
        TigerParser.ty_return retval = new TigerParser.ty_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID10=null;
        Token LEFTBRACE11=null;
        Token RIGHTBRACE13=null;
        Token LEFTBRACE14=null;
        Token RIGHTBRACE15=null;
        Token ARRAY16=null;
        Token OF17=null;
        Token ID18=null;
        TigerParser.tyfields_return tyfields12 =null;


        Object ID10_tree=null;
        Object LEFTBRACE11_tree=null;
        Object RIGHTBRACE13_tree=null;
        Object LEFTBRACE14_tree=null;
        Object RIGHTBRACE15_tree=null;
        Object ARRAY16_tree=null;
        Object OF17_tree=null;
        Object ID18_tree=null;
        RewriteRuleTokenStream stream_RIGHTBRACE=new RewriteRuleTokenStream(adaptor,"token RIGHTBRACE");
        RewriteRuleTokenStream stream_LEFTBRACE=new RewriteRuleTokenStream(adaptor,"token LEFTBRACE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_tyfields=new RewriteRuleSubtreeStream(adaptor,"rule tyfields");
        paraphrases.push("in ty");
        try {
            // C:\\Users\\e49al\\Tiger.g:127:3: ( ID -> ID | LEFTBRACE ( tyfields ) RIGHTBRACE -> tyfields | LEFTBRACE RIGHTBRACE -> NILROOT | ARRAY OF ID -> ^( ARRAYTYPE ID ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt3=1;
                }
                break;
            case LEFTBRACE:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RIGHTBRACE) ) {
                    alt3=3;
                }
                else if ( (LA3_2==ID) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;

                }
                }
                break;
            case ARRAY:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\e49al\\Tiger.g:127:3: ID
                    {
                    ID10=(Token)match(input,ID,FOLLOW_ID_in_ty504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID10);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 127:6: -> ID
                    {
                        adaptor.addChild(root_0, 
                        stream_ID.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\e49al\\Tiger.g:128:3: LEFTBRACE ( tyfields ) RIGHTBRACE
                    {
                    LEFTBRACE11=(Token)match(input,LEFTBRACE,FOLLOW_LEFTBRACE_in_ty512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFTBRACE.add(LEFTBRACE11);


                    // C:\\Users\\e49al\\Tiger.g:128:13: ( tyfields )
                    // C:\\Users\\e49al\\Tiger.g:128:14: tyfields
                    {
                    pushFollow(FOLLOW_tyfields_in_ty515);
                    tyfields12=tyfields();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tyfields.add(tyfields12.getTree());

                    }


                    RIGHTBRACE13=(Token)match(input,RIGHTBRACE,FOLLOW_RIGHTBRACE_in_ty518); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHTBRACE.add(RIGHTBRACE13);


                    // AST REWRITE
                    // elements: tyfields
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 128:35: -> tyfields
                    {
                        adaptor.addChild(root_0, stream_tyfields.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\e49al\\Tiger.g:129:4: LEFTBRACE RIGHTBRACE
                    {
                    LEFTBRACE14=(Token)match(input,LEFTBRACE,FOLLOW_LEFTBRACE_in_ty527); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFTBRACE.add(LEFTBRACE14);


                    RIGHTBRACE15=(Token)match(input,RIGHTBRACE,FOLLOW_RIGHTBRACE_in_ty529); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHTBRACE.add(RIGHTBRACE15);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 129:25: -> NILROOT
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(NILROOT, "NILROOT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\e49al\\Tiger.g:130:3: ARRAY OF ID
                    {
                    ARRAY16=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_ty537); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY16);


                    OF17=(Token)match(input,OF,FOLLOW_OF_in_ty539); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OF.add(OF17);


                    ID18=(Token)match(input,ID,FOLLOW_ID_in_ty541); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID18);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 130:15: -> ^( ARRAYTYPE ID )
                    {
                        // C:\\Users\\e49al\\Tiger.g:130:18: ^( ARRAYTYPE ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARRAYTYPE, "ARRAYTYPE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ty"


    public static class tyfields_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tyfields"
    // C:\\Users\\e49al\\Tiger.g:132:1: tyfields : a= ID COLON b= ID ( COMMA ID COLON ID )* -> ^( TYFIELDS ( $b $a)+ ) ;
    public final TigerParser.tyfields_return tyfields() throws RecognitionException {
        TigerParser.tyfields_return retval = new TigerParser.tyfields_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token a=null;
        Token b=null;
        Token COLON19=null;
        Token COMMA20=null;
        Token ID21=null;
        Token COLON22=null;
        Token ID23=null;

        Object a_tree=null;
        Object b_tree=null;
        Object COLON19_tree=null;
        Object COMMA20_tree=null;
        Object ID21_tree=null;
        Object COLON22_tree=null;
        Object ID23_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

        paraphrases.push("in tyfields");
        try {
            // C:\\Users\\e49al\\Tiger.g:135:3: (a= ID COLON b= ID ( COMMA ID COLON ID )* -> ^( TYFIELDS ( $b $a)+ ) )
            // C:\\Users\\e49al\\Tiger.g:135:3: a= ID COLON b= ID ( COMMA ID COLON ID )*
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_tyfields571); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(a);


            COLON19=(Token)match(input,COLON,FOLLOW_COLON_in_tyfields573); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON19);


            b=(Token)match(input,ID,FOLLOW_ID_in_tyfields577); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(b);


            // C:\\Users\\e49al\\Tiger.g:135:19: ( COMMA ID COLON ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\e49al\\Tiger.g:135:20: COMMA ID COLON ID
            	    {
            	    COMMA20=(Token)match(input,COMMA,FOLLOW_COMMA_in_tyfields580); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA20);


            	    ID21=(Token)match(input,ID,FOLLOW_ID_in_tyfields582); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID21);


            	    COLON22=(Token)match(input,COLON,FOLLOW_COLON_in_tyfields584); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COLON.add(COLON22);


            	    ID23=(Token)match(input,ID,FOLLOW_ID_in_tyfields586); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID23);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // AST REWRITE
            // elements: a, b
            // token labels: b, a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 135:41: -> ^( TYFIELDS ( $b $a)+ )
            {
                // C:\\Users\\e49al\\Tiger.g:135:44: ^( TYFIELDS ( $b $a)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYFIELDS, "TYFIELDS")
                , root_1);

                if ( !(stream_a.hasNext()||stream_b.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_a.hasNext()||stream_b.hasNext() ) {
                    adaptor.addChild(root_1, stream_b.nextNode());

                    adaptor.addChild(root_1, stream_a.nextNode());

                }
                stream_a.reset();
                stream_b.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tyfields"


    public static class vardec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vardec"
    // C:\\Users\\e49al\\Tiger.g:142:1: vardec : ( VAR a= ID COLON b= ID ASSIGN exp -> ^( VAR $b $a exp ) | VAR ID ASSIGN exp -> ^( VAR ID exp ) );
    public final TigerParser.vardec_return vardec() throws RecognitionException {
        TigerParser.vardec_return retval = new TigerParser.vardec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token a=null;
        Token b=null;
        Token VAR24=null;
        Token COLON25=null;
        Token ASSIGN26=null;
        Token VAR28=null;
        Token ID29=null;
        Token ASSIGN30=null;
        TigerParser.exp_return exp27 =null;

        TigerParser.exp_return exp31 =null;


        Object a_tree=null;
        Object b_tree=null;
        Object VAR24_tree=null;
        Object COLON25_tree=null;
        Object ASSIGN26_tree=null;
        Object VAR28_tree=null;
        Object ID29_tree=null;
        Object ASSIGN30_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        paraphrases.push("in variables declarations");
        try {
            // C:\\Users\\e49al\\Tiger.g:145:3: ( VAR a= ID COLON b= ID ASSIGN exp -> ^( VAR $b $a exp ) | VAR ID ASSIGN exp -> ^( VAR ID exp ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==VAR) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==COLON) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==ASSIGN) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\e49al\\Tiger.g:145:3: VAR a= ID COLON b= ID ASSIGN exp
                    {
                    VAR24=(Token)match(input,VAR,FOLLOW_VAR_in_vardec628); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(VAR24);


                    a=(Token)match(input,ID,FOLLOW_ID_in_vardec632); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(a);


                    COLON25=(Token)match(input,COLON,FOLLOW_COLON_in_vardec634); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON25);


                    b=(Token)match(input,ID,FOLLOW_ID_in_vardec638); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(b);


                    ASSIGN26=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_vardec640); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN26);


                    pushFollow(FOLLOW_exp_in_vardec642);
                    exp27=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp27.getTree());

                    // AST REWRITE
                    // elements: VAR, exp, a, b
                    // token labels: b, a
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
                    RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 145:34: -> ^( VAR $b $a exp )
                    {
                        // C:\\Users\\e49al\\Tiger.g:145:37: ^( VAR $b $a exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_VAR.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_b.nextNode());

                        adaptor.addChild(root_1, stream_a.nextNode());

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\e49al\\Tiger.g:146:3: VAR ID ASSIGN exp
                    {
                    VAR28=(Token)match(input,VAR,FOLLOW_VAR_in_vardec660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(VAR28);


                    ID29=(Token)match(input,ID,FOLLOW_ID_in_vardec662); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID29);


                    ASSIGN30=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_vardec664); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN30);


                    pushFollow(FOLLOW_exp_in_vardec666);
                    exp31=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp31.getTree());

                    // AST REWRITE
                    // elements: exp, ID, VAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 146:21: -> ^( VAR ID exp )
                    {
                        // C:\\Users\\e49al\\Tiger.g:146:24: ^( VAR ID exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_VAR.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "vardec"


    public static class fundec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fundec"
    // C:\\Users\\e49al\\Tiger.g:153:1: fundec : ( FUN ID LEFTPARENTHESIS tyfields RIGHTPARENTHESIS EQUAL exp -> ^( FUN ID tyfields exp ) | FUN a= ID LEFTPARENTHESIS tyfields RIGHTPARENTHESIS COLON b= ID EQUAL exp -> ^( FUN $b $a tyfields exp ) | FUN ID LEFTPARENTHESIS RIGHTPARENTHESIS EQUAL exp -> ^( FUN ID exp ) | FUN a= ID LEFTPARENTHESIS RIGHTPARENTHESIS COLON b= ID EQUAL exp -> ^( FUN $b $a exp ) );
    public final TigerParser.fundec_return fundec() throws RecognitionException {
        TigerParser.fundec_return retval = new TigerParser.fundec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token a=null;
        Token b=null;
        Token FUN32=null;
        Token ID33=null;
        Token LEFTPARENTHESIS34=null;
        Token RIGHTPARENTHESIS36=null;
        Token EQUAL37=null;
        Token FUN39=null;
        Token LEFTPARENTHESIS40=null;
        Token RIGHTPARENTHESIS42=null;
        Token COLON43=null;
        Token EQUAL44=null;
        Token FUN46=null;
        Token ID47=null;
        Token LEFTPARENTHESIS48=null;
        Token RIGHTPARENTHESIS49=null;
        Token EQUAL50=null;
        Token FUN52=null;
        Token LEFTPARENTHESIS53=null;
        Token RIGHTPARENTHESIS54=null;
        Token COLON55=null;
        Token EQUAL56=null;
        TigerParser.tyfields_return tyfields35 =null;

        TigerParser.exp_return exp38 =null;

        TigerParser.tyfields_return tyfields41 =null;

        TigerParser.exp_return exp45 =null;

        TigerParser.exp_return exp51 =null;

        TigerParser.exp_return exp57 =null;


        Object a_tree=null;
        Object b_tree=null;
        Object FUN32_tree=null;
        Object ID33_tree=null;
        Object LEFTPARENTHESIS34_tree=null;
        Object RIGHTPARENTHESIS36_tree=null;
        Object EQUAL37_tree=null;
        Object FUN39_tree=null;
        Object LEFTPARENTHESIS40_tree=null;
        Object RIGHTPARENTHESIS42_tree=null;
        Object COLON43_tree=null;
        Object EQUAL44_tree=null;
        Object FUN46_tree=null;
        Object ID47_tree=null;
        Object LEFTPARENTHESIS48_tree=null;
        Object RIGHTPARENTHESIS49_tree=null;
        Object EQUAL50_tree=null;
        Object FUN52_tree=null;
        Object LEFTPARENTHESIS53_tree=null;
        Object RIGHTPARENTHESIS54_tree=null;
        Object COLON55_tree=null;
        Object EQUAL56_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_LEFTPARENTHESIS=new RewriteRuleTokenStream(adaptor,"token LEFTPARENTHESIS");
        RewriteRuleTokenStream stream_RIGHTPARENTHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHTPARENTHESIS");
        RewriteRuleTokenStream stream_FUN=new RewriteRuleTokenStream(adaptor,"token FUN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_tyfields=new RewriteRuleSubtreeStream(adaptor,"rule tyfields");
        paraphrases.push("in function declarations");
        try {
            // C:\\Users\\e49al\\Tiger.g:156:3: ( FUN ID LEFTPARENTHESIS tyfields RIGHTPARENTHESIS EQUAL exp -> ^( FUN ID tyfields exp ) | FUN a= ID LEFTPARENTHESIS tyfields RIGHTPARENTHESIS COLON b= ID EQUAL exp -> ^( FUN $b $a tyfields exp ) | FUN ID LEFTPARENTHESIS RIGHTPARENTHESIS EQUAL exp -> ^( FUN ID exp ) | FUN a= ID LEFTPARENTHESIS RIGHTPARENTHESIS COLON b= ID EQUAL exp -> ^( FUN $b $a exp ) )
            int alt6=4;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // C:\\Users\\e49al\\Tiger.g:156:3: FUN ID LEFTPARENTHESIS tyfields RIGHTPARENTHESIS EQUAL exp
                    {
                    FUN32=(Token)match(input,FUN,FOLLOW_FUN_in_fundec703); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUN.add(FUN32);


                    ID33=(Token)match(input,ID,FOLLOW_ID_in_fundec705); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID33);


                    LEFTPARENTHESIS34=(Token)match(input,LEFTPARENTHESIS,FOLLOW_LEFTPARENTHESIS_in_fundec707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFTPARENTHESIS.add(LEFTPARENTHESIS34);


                    pushFollow(FOLLOW_tyfields_in_fundec709);
                    tyfields35=tyfields();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tyfields.add(tyfields35.getTree());

                    RIGHTPARENTHESIS36=(Token)match(input,RIGHTPARENTHESIS,FOLLOW_RIGHTPARENTHESIS_in_fundec711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHTPARENTHESIS.add(RIGHTPARENTHESIS36);


                    EQUAL37=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_fundec713); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL37);


                    pushFollow(FOLLOW_exp_in_fundec715);
                    exp38=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp38.getTree());

                    // AST REWRITE
                    // elements: exp, tyfields, ID, FUN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 156:62: -> ^( FUN ID tyfields exp )
                    {
                        // C:\\Users\\e49al\\Tiger.g:156:65: ^( FUN ID tyfields exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUN.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_tyfields.nextTree());

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\e49al\\Tiger.g:157:3: FUN a= ID LEFTPARENTHESIS tyfields RIGHTPARENTHESIS COLON b= ID EQUAL exp
                    {
                    FUN39=(Token)match(input,FUN,FOLLOW_FUN_in_fundec731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUN.add(FUN39);


                    a=(Token)match(input,ID,FOLLOW_ID_in_fundec735); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(a);


                    LEFTPARENTHESIS40=(Token)match(input,LEFTPARENTHESIS,FOLLOW_LEFTPARENTHESIS_in_fundec737); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFTPARENTHESIS.add(LEFTPARENTHESIS40);


                    pushFollow(FOLLOW_tyfields_in_fundec739);
                    tyfields41=tyfields();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tyfields.add(tyfields41.getTree());

                    RIGHTPARENTHESIS42=(Token)match(input,RIGHTPARENTHESIS,FOLLOW_RIGHTPARENTHESIS_in_fundec741); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHTPARENTHESIS.add(RIGHTPARENTHESIS42);


                    COLON43=(Token)match(input,COLON,FOLLOW_COLON_in_fundec743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON43);


                    b=(Token)match(input,ID,FOLLOW_ID_in_fundec747); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(b);


                    EQUAL44=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_fundec749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL44);


                    pushFollow(FOLLOW_exp_in_fundec751);
                    exp45=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp45.getTree());

                    // AST REWRITE
                    // elements: exp, b, FUN, a, tyfields
                    // token labels: b, a
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
                    RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 157:75: -> ^( FUN $b $a tyfields exp )
                    {
                        // C:\\Users\\e49al\\Tiger.g:157:78: ^( FUN $b $a tyfields exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUN.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_b.nextNode());

                        adaptor.addChild(root_1, stream_a.nextNode());

                        adaptor.addChild(root_1, stream_tyfields.nextTree());

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\e49al\\Tiger.g:158:4: FUN ID LEFTPARENTHESIS RIGHTPARENTHESIS EQUAL exp
                    {
                    FUN46=(Token)match(input,FUN,FOLLOW_FUN_in_fundec772); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUN.add(FUN46);


                    ID47=(Token)match(input,ID,FOLLOW_ID_in_fundec774); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID47);


                    LEFTPARENTHESIS48=(Token)match(input,LEFTPARENTHESIS,FOLLOW_LEFTPARENTHESIS_in_fundec776); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFTPARENTHESIS.add(LEFTPARENTHESIS48);


                    RIGHTPARENTHESIS49=(Token)match(input,RIGHTPARENTHESIS,FOLLOW_RIGHTPARENTHESIS_in_fundec778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHTPARENTHESIS.add(RIGHTPARENTHESIS49);


                    EQUAL50=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_fundec780); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL50);


                    pushFollow(FOLLOW_exp_in_fundec782);
                    exp51=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp51.getTree());

                    // AST REWRITE
                    // elements: ID, exp, FUN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:54: -> ^( FUN ID exp )
                    {
                        // C:\\Users\\e49al\\Tiger.g:158:57: ^( FUN ID exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUN.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\e49al\\Tiger.g:159:4: FUN a= ID LEFTPARENTHESIS RIGHTPARENTHESIS COLON b= ID EQUAL exp
                    {
                    FUN52=(Token)match(input,FUN,FOLLOW_FUN_in_fundec797); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUN.add(FUN52);


                    a=(Token)match(input,ID,FOLLOW_ID_in_fundec801); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(a);


                    LEFTPARENTHESIS53=(Token)match(input,LEFTPARENTHESIS,FOLLOW_LEFTPARENTHESIS_in_fundec803); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFTPARENTHESIS.add(LEFTPARENTHESIS53);


                    RIGHTPARENTHESIS54=(Token)match(input,RIGHTPARENTHESIS,FOLLOW_RIGHTPARENTHESIS_in_fundec805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHTPARENTHESIS.add(RIGHTPARENTHESIS54);


                    COLON55=(Token)match(input,COLON,FOLLOW_COLON_in_fundec808); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON55);


                    b=(Token)match(input,ID,FOLLOW_ID_in_fundec812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(b);


                    EQUAL56=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_fundec814); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL56);


                    pushFollow(FOLLOW_exp_in_fundec816);
                    exp57=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp57.getTree());

                    // AST REWRITE
                    // elements: b, exp, a, FUN
                    // token labels: b, a
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
                    RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:68: -> ^( FUN $b $a exp )
                    {
                        // C:\\Users\\e49al\\Tiger.g:159:71: ^( FUN $b $a exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUN.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_b.nextNode());

                        adaptor.addChild(root_1, stream_a.nextNode());

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fundec"


    public static class exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exp"
    // C:\\Users\\e49al\\Tiger.g:166:1: exp : ( LEFTPARENTHESIS exp ( SEMICOLON exp )+ RIGHTPARENTHESIS -> ^( EXPSEQ exp ( exp )+ ) | MINUS exp -> ^( MINUS exp ) | ifexp -> ifexp | WHILE exp DO ( exp )* -> ^( WHILE ( exp )+ ) | FOR ID ASSIGN exp TO exp DO ( exp )* -> ^( FOR ID exp ( exp )+ ) | LET decs IN ( exp ( SEMICOLON exp )* )? END -> ^( LET decs ( ( exp )+ )? ) | ID LEFTBRACE ID EQUAL exp ( COMMA ID EQUAL exp )* RIGHTBRACE -> ^( RECORDCREATION ID ( ID exp )+ ) | ID LEFTBRACE RIGHTBRACE -> ^( RECORDCREATION NILROOT ) | ID LEFTBRACKET exp RIGHTBRACKET OF exp -> ^( ARRAYCREATION ID exp exp ) | lvalue ASSIGN exp -> ^( ASSIGN lvalue exp ) | biopexp -> biopexp );
    public final TigerParser.exp_return exp() throws RecognitionException {
        TigerParser.exp_return retval = new TigerParser.exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFTPARENTHESIS58=null;
        Token SEMICOLON60=null;
        Token RIGHTPARENTHESIS62=null;
        Token MINUS63=null;
        Token WHILE66=null;
        Token DO68=null;
        Token FOR70=null;
        Token ID71=null;
        Token ASSIGN72=null;
        Token TO74=null;
        Token DO76=null;
        Token LET78=null;
        Token IN80=null;
        Token SEMICOLON82=null;
        Token END84=null;
        Token ID85=null;
        Token LEFTBRACE86=null;
        Token ID87=null;
        Token EQUAL88=null;
        Token COMMA90=null;
        Token ID91=null;
        Token EQUAL92=null;
        Token RIGHTBRACE94=null;
        Token ID95=null;
        Token LEFTBRACE96=null;
        Token RIGHTBRACE97=null;
        Token ID98=null;
        Token LEFTBRACKET99=null;
        Token RIGHTBRACKET101=null;
        Token OF102=null;
        Token ASSIGN105=null;
        TigerParser.exp_return exp59 =null;

        TigerParser.exp_return exp61 =null;

        TigerParser.exp_return exp64 =null;

        TigerParser.ifexp_return ifexp65 =null;

        TigerParser.exp_return exp67 =null;

        TigerParser.exp_return exp69 =null;

        TigerParser.exp_return exp73 =null;

        TigerParser.exp_return exp75 =null;

        TigerParser.exp_return exp77 =null;

        TigerParser.decs_return decs79 =null;

        TigerParser.exp_return exp81 =null;

        TigerParser.exp_return exp83 =null;

        TigerParser.exp_return exp89 =null;

        TigerParser.exp_return exp93 =null;

        TigerParser.exp_return exp100 =null;

        TigerParser.exp_return exp103 =null;

        TigerParser.lvalue_return lvalue104 =null;

        TigerParser.exp_return exp106 =null;

        TigerParser.biopexp_return biopexp107 =null;


        Object LEFTPARENTHESIS58_tree=null;
        Object SEMICOLON60_tree=null;
        Object RIGHTPARENTHESIS62_tree=null;
        Object MINUS63_tree=null;
        Object WHILE66_tree=null;
        Object DO68_tree=null;
        Object FOR70_tree=null;
        Object ID71_tree=null;
        Object ASSIGN72_tree=null;
        Object TO74_tree=null;
        Object DO76_tree=null;
        Object LET78_tree=null;
        Object IN80_tree=null;
        Object SEMICOLON82_tree=null;
        Object END84_tree=null;
        Object ID85_tree=null;
        Object LEFTBRACE86_tree=null;
        Object ID87_tree=null;
        Object EQUAL88_tree=null;
        Object COMMA90_tree=null;
        Object ID91_tree=null;
        Object EQUAL92_tree=null;
        Object RIGHTBRACE94_tree=null;
        Object ID95_tree=null;
        Object LEFTBRACE96_tree=null;
        Object RIGHTBRACE97_tree=null;
        Object ID98_tree=null;
        Object LEFTBRACKET99_tree=null;
        Object RIGHTBRACKET101_tree=null;
        Object OF102_tree=null;
        Object ASSIGN105_tree=null;
        RewriteRuleTokenStream stream_LEFTPARENTHESIS=new RewriteRuleTokenStream(adaptor,"token LEFTPARENTHESIS");
        RewriteRuleTokenStream stream_LEFTBRACE=new RewriteRuleTokenStream(adaptor,"token LEFTBRACE");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleTokenStream stream_RIGHTBRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHTBRACKET");
        RewriteRuleTokenStream stream_RIGHTPARENTHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHTPARENTHESIS");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RIGHTBRACE=new RewriteRuleTokenStream(adaptor,"token RIGHTBRACE");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_LET=new RewriteRuleTokenStream(adaptor,"token LET");
        RewriteRuleTokenStream stream_LEFTBRACKET=new RewriteRuleTokenStream(adaptor,"token LEFTBRACKET");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_ifexp=new RewriteRuleSubtreeStream(adaptor,"rule ifexp");
        RewriteRuleSubtreeStream stream_lvalue=new RewriteRuleSubtreeStream(adaptor,"rule lvalue");
        RewriteRuleSubtreeStream stream_decs=new RewriteRuleSubtreeStream(adaptor,"rule decs");
        RewriteRuleSubtreeStream stream_biopexp=new RewriteRuleSubtreeStream(adaptor,"rule biopexp");
        paraphrases.push("in expressions declarations");
        try {
            // C:\\Users\\e49al\\Tiger.g:169:3: ( LEFTPARENTHESIS exp ( SEMICOLON exp )+ RIGHTPARENTHESIS -> ^( EXPSEQ exp ( exp )+ ) | MINUS exp -> ^( MINUS exp ) | ifexp -> ifexp | WHILE exp DO ( exp )* -> ^( WHILE ( exp )+ ) | FOR ID ASSIGN exp TO exp DO ( exp )* -> ^( FOR ID exp ( exp )+ ) | LET decs IN ( exp ( SEMICOLON exp )* )? END -> ^( LET decs ( ( exp )+ )? ) | ID LEFTBRACE ID EQUAL exp ( COMMA ID EQUAL exp )* RIGHTBRACE -> ^( RECORDCREATION ID ( ID exp )+ ) | ID LEFTBRACE RIGHTBRACE -> ^( RECORDCREATION NILROOT ) | ID LEFTBRACKET exp RIGHTBRACKET OF exp -> ^( ARRAYCREATION ID exp exp ) | lvalue ASSIGN exp -> ^( ASSIGN lvalue exp ) | biopexp -> biopexp )
            int alt13=11;
            switch ( input.LA(1) ) {
            case LEFTPARENTHESIS:
                {
                int LA13_1 = input.LA(2);

                if ( (synpred13_Tiger()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=11;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
                }
                break;
            case MINUS:
                {
                alt13=2;
                }
                break;
            case IF:
                {
                alt13=3;
                }
                break;
            case WHILE:
                {
                alt13=4;
                }
                break;
            case FOR:
                {
                alt13=5;
                }
                break;
            case LET:
                {
                alt13=6;
                }
                break;
            case ID:
                {
                int LA13_7 = input.LA(2);

                if ( (synpred24_Tiger()) ) {
                    alt13=7;
                }
                else if ( (synpred25_Tiger()) ) {
                    alt13=8;
                }
                else if ( (synpred26_Tiger()) ) {
                    alt13=9;
                }
                else if ( (synpred27_Tiger()) ) {
                    alt13=10;
                }
                else if ( (true) ) {
                    alt13=11;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 7, input);

                    throw nvae;

                }
                }
                break;
            case BREAK:
            case INT:
            case STRING:
                {
                alt13=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // C:\\Users\\e49al\\Tiger.g:169:3: LEFTPARENTHESIS exp ( SEMICOLON exp )+ RIGHTPARENTHESIS
                    {
                    LEFTPARENTHESIS58=(Token)match(input,LEFTPARENTHESIS,FOLLOW_LEFTPARENTHESIS_in_exp858); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFTPARENTHESIS.add(LEFTPARENTHESIS58);


                    pushFollow(FOLLOW_exp_in_exp860);
                    exp59=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp59.getTree());

                    // C:\\Users\\e49al\\Tiger.g:169:23: ( SEMICOLON exp )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==SEMICOLON) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\e49al\\Tiger.g:169:24: SEMICOLON exp
                    	    {
                    	    SEMICOLON60=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_exp863); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON60);


                    	    pushFollow(FOLLOW_exp_in_exp865);
                    	    exp61=exp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exp.add(exp61.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    RIGHTPARENTHESIS62=(Token)match(input,RIGHTPARENTHESIS,FOLLOW_RIGHTPARENTHESIS_in_exp869); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHTPARENTHESIS.add(RIGHTPARENTHESIS62);


                    // AST REWRITE
                    // elements: exp, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 169:57: -> ^( EXPSEQ exp ( exp )+ )
                    {
                        // C:\\Users\\e49al\\Tiger.g:169:60: ^( EXPSEQ exp ( exp )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXPSEQ, "EXPSEQ")
                        , root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        if ( !(stream_exp.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_exp.hasNext() ) {
                            adaptor.addChild(root_1, stream_exp.nextTree());

                        }
                        stream_exp.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\e49al\\Tiger.g:170:4: MINUS exp
                    {
                    MINUS63=(Token)match(input,MINUS,FOLLOW_MINUS_in_exp885); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS63);


                    pushFollow(FOLLOW_exp_in_exp887);
                    exp64=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp64.getTree());

                    // AST REWRITE
                    // elements: MINUS, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 170:14: -> ^( MINUS exp )
                    {
                        // C:\\Users\\e49al\\Tiger.g:170:17: ^( MINUS exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_MINUS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\e49al\\Tiger.g:171:4: ifexp
                    {
                    pushFollow(FOLLOW_ifexp_in_exp900);
                    ifexp65=ifexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ifexp.add(ifexp65.getTree());

                    // AST REWRITE
                    // elements: ifexp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 171:10: -> ifexp
                    {
                        adaptor.addChild(root_0, stream_ifexp.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\e49al\\Tiger.g:172:4: WHILE exp DO ( exp )*
                    {
                    WHILE66=(Token)match(input,WHILE,FOLLOW_WHILE_in_exp909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE66);


                    pushFollow(FOLLOW_exp_in_exp911);
                    exp67=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp67.getTree());

                    DO68=(Token)match(input,DO,FOLLOW_DO_in_exp913); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO68);


                    // C:\\Users\\e49al\\Tiger.g:172:17: ( exp )*
                    loop8:
                    do {
                        int alt8=2;
                        switch ( input.LA(1) ) {
                        case LEFTPARENTHESIS:
                            {
                            int LA8_9 = input.LA(2);

                            if ( (synpred16_Tiger()) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case MINUS:
                            {
                            int LA8_10 = input.LA(2);

                            if ( (synpred16_Tiger()) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case IF:
                            {
                            int LA8_11 = input.LA(2);

                            if ( (synpred16_Tiger()) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case WHILE:
                            {
                            int LA8_12 = input.LA(2);

                            if ( (synpred16_Tiger()) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case FOR:
                            {
                            int LA8_13 = input.LA(2);

                            if ( (synpred16_Tiger()) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case LET:
                            {
                            int LA8_14 = input.LA(2);

                            if ( (synpred16_Tiger()) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case ID:
                            {
                            int LA8_15 = input.LA(2);

                            if ( (synpred16_Tiger()) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case STRING:
                            {
                            int LA8_16 = input.LA(2);

                            if ( (synpred16_Tiger()) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case INT:
                            {
                            int LA8_17 = input.LA(2);

                            if ( (synpred16_Tiger()) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case BREAK:
                            {
                            int LA8_18 = input.LA(2);

                            if ( (synpred16_Tiger()) ) {
                                alt8=1;
                            }


                            }
                            break;

                        }

                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\e49al\\Tiger.g:172:17: exp
                    	    {
                    	    pushFollow(FOLLOW_exp_in_exp915);
                    	    exp69=exp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exp.add(exp69.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: WHILE, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 172:22: -> ^( WHILE ( exp )+ )
                    {
                        // C:\\Users\\e49al\\Tiger.g:172:25: ^( WHILE ( exp )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_WHILE.nextNode()
                        , root_1);

                        if ( !(stream_exp.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_exp.hasNext() ) {
                            adaptor.addChild(root_1, stream_exp.nextTree());

                        }
                        stream_exp.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\e49al\\Tiger.g:173:4: FOR ID ASSIGN exp TO exp DO ( exp )*
                    {
                    FOR70=(Token)match(input,FOR,FOLLOW_FOR_in_exp930); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR70);


                    ID71=(Token)match(input,ID,FOLLOW_ID_in_exp932); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID71);


                    ASSIGN72=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_exp934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN72);


                    pushFollow(FOLLOW_exp_in_exp936);
                    exp73=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp73.getTree());

                    TO74=(Token)match(input,TO,FOLLOW_TO_in_exp938); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TO.add(TO74);


                    pushFollow(FOLLOW_exp_in_exp940);
                    exp75=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp75.getTree());

                    DO76=(Token)match(input,DO,FOLLOW_DO_in_exp942); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO76);


                    // C:\\Users\\e49al\\Tiger.g:173:32: ( exp )*
                    loop9:
                    do {
                        int alt9=2;
                        switch ( input.LA(1) ) {
                        case LEFTPARENTHESIS:
                            {
                            int LA9_9 = input.LA(2);

                            if ( (synpred18_Tiger()) ) {
                                alt9=1;
                            }


                            }
                            break;
                        case MINUS:
                            {
                            int LA9_10 = input.LA(2);

                            if ( (synpred18_Tiger()) ) {
                                alt9=1;
                            }


                            }
                            break;
                        case IF:
                            {
                            int LA9_11 = input.LA(2);

                            if ( (synpred18_Tiger()) ) {
                                alt9=1;
                            }


                            }
                            break;
                        case WHILE:
                            {
                            int LA9_12 = input.LA(2);

                            if ( (synpred18_Tiger()) ) {
                                alt9=1;
                            }


                            }
                            break;
                        case FOR:
                            {
                            int LA9_13 = input.LA(2);

                            if ( (synpred18_Tiger()) ) {
                                alt9=1;
                            }


                            }
                            break;
                        case LET:
                            {
                            int LA9_14 = input.LA(2);

                            if ( (synpred18_Tiger()) ) {
                                alt9=1;
                            }


                            }
                            break;
                        case ID:
                            {
                            int LA9_15 = input.LA(2);

                            if ( (synpred18_Tiger()) ) {
                                alt9=1;
                            }


                            }
                            break;
                        case STRING:
                            {
                            int LA9_16 = input.LA(2);

                            if ( (synpred18_Tiger()) ) {
                                alt9=1;
                            }


                            }
                            break;
                        case INT:
                            {
                            int LA9_17 = input.LA(2);

                            if ( (synpred18_Tiger()) ) {
                                alt9=1;
                            }


                            }
                            break;
                        case BREAK:
                            {
                            int LA9_18 = input.LA(2);

                            if ( (synpred18_Tiger()) ) {
                                alt9=1;
                            }


                            }
                            break;

                        }

                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\e49al\\Tiger.g:173:32: exp
                    	    {
                    	    pushFollow(FOLLOW_exp_in_exp944);
                    	    exp77=exp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exp.add(exp77.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: exp, ID, FOR, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 173:37: -> ^( FOR ID exp ( exp )+ )
                    {
                        // C:\\Users\\e49al\\Tiger.g:173:40: ^( FOR ID exp ( exp )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FOR.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        if ( !(stream_exp.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_exp.hasNext() ) {
                            adaptor.addChild(root_1, stream_exp.nextTree());

                        }
                        stream_exp.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\e49al\\Tiger.g:174:4: LET decs IN ( exp ( SEMICOLON exp )* )? END
                    {
                    LET78=(Token)match(input,LET,FOLLOW_LET_in_exp963); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LET.add(LET78);


                    pushFollow(FOLLOW_decs_in_exp965);
                    decs79=decs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_decs.add(decs79.getTree());

                    IN80=(Token)match(input,IN,FOLLOW_IN_in_exp967); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN80);


                    // C:\\Users\\e49al\\Tiger.g:174:16: ( exp ( SEMICOLON exp )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==BREAK||LA11_0==FOR||(LA11_0 >= ID && LA11_0 <= IF)||LA11_0==INT||(LA11_0 >= LEFTPARENTHESIS && LA11_0 <= LET)||LA11_0==MINUS||LA11_0==STRING||LA11_0==WHILE) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\e49al\\Tiger.g:174:17: exp ( SEMICOLON exp )*
                            {
                            pushFollow(FOLLOW_exp_in_exp970);
                            exp81=exp();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exp.add(exp81.getTree());

                            // C:\\Users\\e49al\\Tiger.g:174:21: ( SEMICOLON exp )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==SEMICOLON) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // C:\\Users\\e49al\\Tiger.g:174:22: SEMICOLON exp
                            	    {
                            	    SEMICOLON82=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_exp973); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON82);


                            	    pushFollow(FOLLOW_exp_in_exp975);
                            	    exp83=exp();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_exp.add(exp83.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }


                    END84=(Token)match(input,END,FOLLOW_END_in_exp981); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END84);


                    // AST REWRITE
                    // elements: LET, decs, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 174:44: -> ^( LET decs ( ( exp )+ )? )
                    {
                        // C:\\Users\\e49al\\Tiger.g:174:47: ^( LET decs ( ( exp )+ )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_LET.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_decs.nextTree());

                        // C:\\Users\\e49al\\Tiger.g:174:58: ( ( exp )+ )?
                        if ( stream_exp.hasNext() ) {
                            if ( !(stream_exp.hasNext()) ) {
                                throw new RewriteEarlyExitException();
                            }
                            while ( stream_exp.hasNext() ) {
                                adaptor.addChild(root_1, stream_exp.nextTree());

                            }
                            stream_exp.reset();

                        }
                        stream_exp.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\e49al\\Tiger.g:175:4: ID LEFTBRACE ID EQUAL exp ( COMMA ID EQUAL exp )* RIGHTBRACE
                    {
                    ID85=(Token)match(input,ID,FOLLOW_ID_in_exp1002); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID85);


                    LEFTBRACE86=(Token)match(input,LEFTBRACE,FOLLOW_LEFTBRACE_in_exp1004); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFTBRACE.add(LEFTBRACE86);


                    ID87=(Token)match(input,ID,FOLLOW_ID_in_exp1006); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID87);


                    EQUAL88=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_exp1008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL88);


                    pushFollow(FOLLOW_exp_in_exp1010);
                    exp89=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp89.getTree());

                    // C:\\Users\\e49al\\Tiger.g:175:30: ( COMMA ID EQUAL exp )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\e49al\\Tiger.g:175:31: COMMA ID EQUAL exp
                    	    {
                    	    COMMA90=(Token)match(input,COMMA,FOLLOW_COMMA_in_exp1013); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA90);


                    	    ID91=(Token)match(input,ID,FOLLOW_ID_in_exp1015); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID91);


                    	    EQUAL92=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_exp1017); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL92);


                    	    pushFollow(FOLLOW_exp_in_exp1019);
                    	    exp93=exp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exp.add(exp93.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    RIGHTBRACE94=(Token)match(input,RIGHTBRACE,FOLLOW_RIGHTBRACE_in_exp1023); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHTBRACE.add(RIGHTBRACE94);


                    // AST REWRITE
                    // elements: ID, ID, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 175:63: -> ^( RECORDCREATION ID ( ID exp )+ )
                    {
                        // C:\\Users\\e49al\\Tiger.g:175:66: ^( RECORDCREATION ID ( ID exp )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(RECORDCREATION, "RECORDCREATION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        if ( !(stream_ID.hasNext()||stream_exp.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_ID.hasNext()||stream_exp.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_ID.nextNode()
                            );

                            adaptor.addChild(root_1, stream_exp.nextTree());

                        }
                        stream_ID.reset();
                        stream_exp.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\e49al\\Tiger.g:176:4: ID LEFTBRACE RIGHTBRACE
                    {
                    ID95=(Token)match(input,ID,FOLLOW_ID_in_exp1043); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID95);


                    LEFTBRACE96=(Token)match(input,LEFTBRACE,FOLLOW_LEFTBRACE_in_exp1045); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFTBRACE.add(LEFTBRACE96);


                    RIGHTBRACE97=(Token)match(input,RIGHTBRACE,FOLLOW_RIGHTBRACE_in_exp1048); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHTBRACE.add(RIGHTBRACE97);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 176:29: -> ^( RECORDCREATION NILROOT )
                    {
                        // C:\\Users\\e49al\\Tiger.g:176:32: ^( RECORDCREATION NILROOT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(RECORDCREATION, "RECORDCREATION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(NILROOT, "NILROOT")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    // C:\\Users\\e49al\\Tiger.g:177:3: ID LEFTBRACKET exp RIGHTBRACKET OF exp
                    {
                    ID98=(Token)match(input,ID,FOLLOW_ID_in_exp1060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID98);


                    LEFTBRACKET99=(Token)match(input,LEFTBRACKET,FOLLOW_LEFTBRACKET_in_exp1062); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFTBRACKET.add(LEFTBRACKET99);


                    pushFollow(FOLLOW_exp_in_exp1064);
                    exp100=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp100.getTree());

                    RIGHTBRACKET101=(Token)match(input,RIGHTBRACKET,FOLLOW_RIGHTBRACKET_in_exp1066); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHTBRACKET.add(RIGHTBRACKET101);


                    OF102=(Token)match(input,OF,FOLLOW_OF_in_exp1068); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OF.add(OF102);


                    pushFollow(FOLLOW_exp_in_exp1070);
                    exp103=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp103.getTree());

                    // AST REWRITE
                    // elements: exp, exp, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 177:42: -> ^( ARRAYCREATION ID exp exp )
                    {
                        // C:\\Users\\e49al\\Tiger.g:177:45: ^( ARRAYCREATION ID exp exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARRAYCREATION, "ARRAYCREATION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 10 :
                    // C:\\Users\\e49al\\Tiger.g:178:3: lvalue ASSIGN exp
                    {
                    pushFollow(FOLLOW_lvalue_in_exp1086);
                    lvalue104=lvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lvalue.add(lvalue104.getTree());

                    ASSIGN105=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_exp1088); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN105);


                    pushFollow(FOLLOW_exp_in_exp1090);
                    exp106=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp106.getTree());

                    // AST REWRITE
                    // elements: exp, ASSIGN, lvalue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 178:21: -> ^( ASSIGN lvalue exp )
                    {
                        // C:\\Users\\e49al\\Tiger.g:178:24: ^( ASSIGN lvalue exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ASSIGN.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_lvalue.nextTree());

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 11 :
                    // C:\\Users\\e49al\\Tiger.g:179:4: biopexp
                    {
                    pushFollow(FOLLOW_biopexp_in_exp1105);
                    biopexp107=biopexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_biopexp.add(biopexp107.getTree());

                    // AST REWRITE
                    // elements: biopexp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 179:12: -> biopexp
                    {
                        adaptor.addChild(root_0, stream_biopexp.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exp"


    public static class ifexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifexp"
    // C:\\Users\\e49al\\Tiger.g:182:1: ifexp : ( IF exp THEN exp ELSE exp -> ^( IFTHENELSE exp exp exp ) | IF exp THEN exp -> ^( IFTHEN exp exp ) );
    public final TigerParser.ifexp_return ifexp() throws RecognitionException {
        TigerParser.ifexp_return retval = new TigerParser.ifexp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF108=null;
        Token THEN110=null;
        Token ELSE112=null;
        Token IF114=null;
        Token THEN116=null;
        TigerParser.exp_return exp109 =null;

        TigerParser.exp_return exp111 =null;

        TigerParser.exp_return exp113 =null;

        TigerParser.exp_return exp115 =null;

        TigerParser.exp_return exp117 =null;


        Object IF108_tree=null;
        Object THEN110_tree=null;
        Object ELSE112_tree=null;
        Object IF114_tree=null;
        Object THEN116_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // C:\\Users\\e49al\\Tiger.g:182:7: ( IF exp THEN exp ELSE exp -> ^( IFTHENELSE exp exp exp ) | IF exp THEN exp -> ^( IFTHEN exp exp ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IF) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred28_Tiger()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\e49al\\Tiger.g:182:9: IF exp THEN exp ELSE exp
                    {
                    IF108=(Token)match(input,IF,FOLLOW_IF_in_ifexp1120); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF108);


                    pushFollow(FOLLOW_exp_in_ifexp1122);
                    exp109=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp109.getTree());

                    THEN110=(Token)match(input,THEN,FOLLOW_THEN_in_ifexp1124); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN110);


                    pushFollow(FOLLOW_exp_in_ifexp1126);
                    exp111=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp111.getTree());

                    ELSE112=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifexp1128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE112);


                    pushFollow(FOLLOW_exp_in_ifexp1130);
                    exp113=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp113.getTree());

                    // AST REWRITE
                    // elements: exp, exp, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 182:34: -> ^( IFTHENELSE exp exp exp )
                    {
                        // C:\\Users\\e49al\\Tiger.g:182:37: ^( IFTHENELSE exp exp exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IFTHENELSE, "IFTHENELSE")
                        , root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\e49al\\Tiger.g:183:3: IF exp THEN exp
                    {
                    IF114=(Token)match(input,IF,FOLLOW_IF_in_ifexp1146); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF114);


                    pushFollow(FOLLOW_exp_in_ifexp1148);
                    exp115=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp115.getTree());

                    THEN116=(Token)match(input,THEN,FOLLOW_THEN_in_ifexp1150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN116);


                    pushFollow(FOLLOW_exp_in_ifexp1152);
                    exp117=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp117.getTree());

                    // AST REWRITE
                    // elements: exp, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:19: -> ^( IFTHEN exp exp )
                    {
                        // C:\\Users\\e49al\\Tiger.g:183:22: ^( IFTHEN exp exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IFTHEN, "IFTHEN")
                        , root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifexp"


    public static class biopexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "biopexp"
    // C:\\Users\\e49al\\Tiger.g:187:1: biopexp : ( cmpexp ( ( OR | AND ) ^ cmpexp )+ | cmpexp -> cmpexp );
    public final TigerParser.biopexp_return biopexp() throws RecognitionException {
        TigerParser.biopexp_return retval = new TigerParser.biopexp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set119=null;
        TigerParser.cmpexp_return cmpexp118 =null;

        TigerParser.cmpexp_return cmpexp120 =null;

        TigerParser.cmpexp_return cmpexp121 =null;


        Object set119_tree=null;
        RewriteRuleSubtreeStream stream_cmpexp=new RewriteRuleSubtreeStream(adaptor,"rule cmpexp");
        paraphrases.push("in boolean expressions");
        try {
            // C:\\Users\\e49al\\Tiger.g:190:3: ( cmpexp ( ( OR | AND ) ^ cmpexp )+ | cmpexp -> cmpexp )
            int alt16=2;
            switch ( input.LA(1) ) {
            case STRING:
                {
                int LA16_1 = input.LA(2);

                if ( (synpred31_Tiger()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA16_2 = input.LA(2);

                if ( (synpred31_Tiger()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;

                }
                }
                break;
            case BREAK:
                {
                int LA16_3 = input.LA(2);

                if ( (synpred31_Tiger()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA16_4 = input.LA(2);

                if ( (synpred31_Tiger()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 4, input);

                    throw nvae;

                }
                }
                break;
            case LEFTPARENTHESIS:
                {
                int LA16_5 = input.LA(2);

                if ( (synpred31_Tiger()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // C:\\Users\\e49al\\Tiger.g:190:3: cmpexp ( ( OR | AND ) ^ cmpexp )+
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_cmpexp_in_biopexp1183);
                    cmpexp118=cmpexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpexp118.getTree());

                    // C:\\Users\\e49al\\Tiger.g:190:10: ( ( OR | AND ) ^ cmpexp )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==AND||LA15_0==OR) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\e49al\\Tiger.g:190:11: ( OR | AND ) ^ cmpexp
                    	    {
                    	    set119=(Token)input.LT(1);

                    	    set119=(Token)input.LT(1);

                    	    if ( input.LA(1)==AND||input.LA(1)==OR ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                    	        (Object)adaptor.create(set119)
                    	        , root_0);
                    	        state.errorRecovery=false;
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    pushFollow(FOLLOW_cmpexp_in_biopexp1193);
                    	    cmpexp120=cmpexp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpexp120.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\e49al\\Tiger.g:191:3: cmpexp
                    {
                    pushFollow(FOLLOW_cmpexp_in_biopexp1199);
                    cmpexp121=cmpexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cmpexp.add(cmpexp121.getTree());

                    // AST REWRITE
                    // elements: cmpexp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 191:10: -> cmpexp
                    {
                        adaptor.addChild(root_0, stream_cmpexp.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "biopexp"


    public static class cmpexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cmpexp"
    // C:\\Users\\e49al\\Tiger.g:194:1: cmpexp : ( addexp ( EQUAL | NE | GT | LT | LE | GE ) ^ addexp | addexp -> addexp );
    public final TigerParser.cmpexp_return cmpexp() throws RecognitionException {
        TigerParser.cmpexp_return retval = new TigerParser.cmpexp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set123=null;
        TigerParser.addexp_return addexp122 =null;

        TigerParser.addexp_return addexp124 =null;

        TigerParser.addexp_return addexp125 =null;


        Object set123_tree=null;
        RewriteRuleSubtreeStream stream_addexp=new RewriteRuleSubtreeStream(adaptor,"rule addexp");
        paraphrases.push("in comparison expressions");
        try {
            // C:\\Users\\e49al\\Tiger.g:197:3: ( addexp ( EQUAL | NE | GT | LT | LE | GE ) ^ addexp | addexp -> addexp )
            int alt17=2;
            switch ( input.LA(1) ) {
            case STRING:
                {
                int LA17_1 = input.LA(2);

                if ( (synpred37_Tiger()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA17_2 = input.LA(2);

                if ( (synpred37_Tiger()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;

                }
                }
                break;
            case BREAK:
                {
                int LA17_3 = input.LA(2);

                if ( (synpred37_Tiger()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 3, input);

                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA17_4 = input.LA(2);

                if ( (synpred37_Tiger()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 4, input);

                    throw nvae;

                }
                }
                break;
            case LEFTPARENTHESIS:
                {
                int LA17_5 = input.LA(2);

                if ( (synpred37_Tiger()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // C:\\Users\\e49al\\Tiger.g:197:3: addexp ( EQUAL | NE | GT | LT | LE | GE ) ^ addexp
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_addexp_in_cmpexp1222);
                    addexp122=addexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addexp122.getTree());

                    set123=(Token)input.LT(1);

                    set123=(Token)input.LT(1);

                    if ( input.LA(1)==EQUAL||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(set123)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_addexp_in_cmpexp1239);
                    addexp124=addexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addexp124.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\e49al\\Tiger.g:198:3: addexp
                    {
                    pushFollow(FOLLOW_addexp_in_cmpexp1243);
                    addexp125=addexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_addexp.add(addexp125.getTree());

                    // AST REWRITE
                    // elements: addexp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 198:10: -> addexp
                    {
                        adaptor.addChild(root_0, stream_addexp.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cmpexp"


    public static class addexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addexp"
    // C:\\Users\\e49al\\Tiger.g:201:1: addexp : ( multiexp ( ( PLUS | MINUS ) ^ multiexp )+ | multiexp -> multiexp );
    public final TigerParser.addexp_return addexp() throws RecognitionException {
        TigerParser.addexp_return retval = new TigerParser.addexp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set127=null;
        TigerParser.multiexp_return multiexp126 =null;

        TigerParser.multiexp_return multiexp128 =null;

        TigerParser.multiexp_return multiexp129 =null;


        Object set127_tree=null;
        RewriteRuleSubtreeStream stream_multiexp=new RewriteRuleSubtreeStream(adaptor,"rule multiexp");
        paraphrases.push("in arithmetic expressions");
        try {
            // C:\\Users\\e49al\\Tiger.g:204:3: ( multiexp ( ( PLUS | MINUS ) ^ multiexp )+ | multiexp -> multiexp )
            int alt19=2;
            switch ( input.LA(1) ) {
            case STRING:
                {
                int LA19_1 = input.LA(2);

                if ( (synpred40_Tiger()) ) {
                    alt19=1;
                }
                else if ( (true) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA19_2 = input.LA(2);

                if ( (synpred40_Tiger()) ) {
                    alt19=1;
                }
                else if ( (true) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;

                }
                }
                break;
            case BREAK:
                {
                int LA19_3 = input.LA(2);

                if ( (synpred40_Tiger()) ) {
                    alt19=1;
                }
                else if ( (true) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 3, input);

                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA19_4 = input.LA(2);

                if ( (synpred40_Tiger()) ) {
                    alt19=1;
                }
                else if ( (true) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 4, input);

                    throw nvae;

                }
                }
                break;
            case LEFTPARENTHESIS:
                {
                int LA19_5 = input.LA(2);

                if ( (synpred40_Tiger()) ) {
                    alt19=1;
                }
                else if ( (true) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\e49al\\Tiger.g:204:3: multiexp ( ( PLUS | MINUS ) ^ multiexp )+
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_multiexp_in_addexp1267);
                    multiexp126=multiexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiexp126.getTree());

                    // C:\\Users\\e49al\\Tiger.g:204:12: ( ( PLUS | MINUS ) ^ multiexp )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==MINUS) ) {
                            int LA18_12 = input.LA(2);

                            if ( (synpred39_Tiger()) ) {
                                alt18=1;
                            }


                        }
                        else if ( (LA18_0==PLUS) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Users\\e49al\\Tiger.g:204:13: ( PLUS | MINUS ) ^ multiexp
                    	    {
                    	    set127=(Token)input.LT(1);

                    	    set127=(Token)input.LT(1);

                    	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                    	        (Object)adaptor.create(set127)
                    	        , root_0);
                    	        state.errorRecovery=false;
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    pushFollow(FOLLOW_multiexp_in_addexp1277);
                    	    multiexp128=multiexp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiexp128.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\e49al\\Tiger.g:205:3: multiexp
                    {
                    pushFollow(FOLLOW_multiexp_in_addexp1283);
                    multiexp129=multiexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_multiexp.add(multiexp129.getTree());

                    // AST REWRITE
                    // elements: multiexp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:12: -> multiexp
                    {
                        adaptor.addChild(root_0, stream_multiexp.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "addexp"


    public static class multiexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiexp"
    // C:\\Users\\e49al\\Tiger.g:208:1: multiexp : ( term ( ( TIMES | DIV ) ^ term )+ | term -> term );
    public final TigerParser.multiexp_return multiexp() throws RecognitionException {
        TigerParser.multiexp_return retval = new TigerParser.multiexp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set131=null;
        TigerParser.term_return term130 =null;

        TigerParser.term_return term132 =null;

        TigerParser.term_return term133 =null;


        Object set131_tree=null;
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        paraphrases.push("in arithmetic expressions");
        try {
            // C:\\Users\\e49al\\Tiger.g:211:3: ( term ( ( TIMES | DIV ) ^ term )+ | term -> term )
            int alt21=2;
            switch ( input.LA(1) ) {
            case STRING:
                {
                int LA21_1 = input.LA(2);

                if ( (synpred43_Tiger()) ) {
                    alt21=1;
                }
                else if ( (true) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA21_2 = input.LA(2);

                if ( (synpred43_Tiger()) ) {
                    alt21=1;
                }
                else if ( (true) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;

                }
                }
                break;
            case BREAK:
                {
                int LA21_3 = input.LA(2);

                if ( (synpred43_Tiger()) ) {
                    alt21=1;
                }
                else if ( (true) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 3, input);

                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA21_4 = input.LA(2);

                if ( (synpred43_Tiger()) ) {
                    alt21=1;
                }
                else if ( (true) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 4, input);

                    throw nvae;

                }
                }
                break;
            case LEFTPARENTHESIS:
                {
                int LA21_5 = input.LA(2);

                if ( (synpred43_Tiger()) ) {
                    alt21=1;
                }
                else if ( (true) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\e49al\\Tiger.g:211:3: term ( ( TIMES | DIV ) ^ term )+
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_term_in_multiexp1306);
                    term130=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term130.getTree());

                    // C:\\Users\\e49al\\Tiger.g:211:8: ( ( TIMES | DIV ) ^ term )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==DIV||LA20_0==TIMES) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // C:\\Users\\e49al\\Tiger.g:211:9: ( TIMES | DIV ) ^ term
                    	    {
                    	    set131=(Token)input.LT(1);

                    	    set131=(Token)input.LT(1);

                    	    if ( input.LA(1)==DIV||input.LA(1)==TIMES ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                    	        (Object)adaptor.create(set131)
                    	        , root_0);
                    	        state.errorRecovery=false;
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    pushFollow(FOLLOW_term_in_multiexp1316);
                    	    term132=term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term132.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\e49al\\Tiger.g:212:3: term
                    {
                    pushFollow(FOLLOW_term_in_multiexp1322);
                    term133=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(term133.getTree());

                    // AST REWRITE
                    // elements: term
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 212:8: -> term
                    {
                        adaptor.addChild(root_0, stream_term.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiexp"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // C:\\Users\\e49al\\Tiger.g:215:1: term : ( STRING -> STRING | INT -> INT | BREAK | functioncall -> functioncall | lvalue -> lvalue | LEFTPARENTHESIS RIGHTPARENTHESIS -> NILROOT | LEFTPARENTHESIS exp RIGHTPARENTHESIS -> exp );
    public final TigerParser.term_return term() throws RecognitionException {
        TigerParser.term_return retval = new TigerParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING134=null;
        Token INT135=null;
        Token BREAK136=null;
        Token LEFTPARENTHESIS139=null;
        Token RIGHTPARENTHESIS140=null;
        Token LEFTPARENTHESIS141=null;
        Token RIGHTPARENTHESIS143=null;
        TigerParser.functioncall_return functioncall137 =null;

        TigerParser.lvalue_return lvalue138 =null;

        TigerParser.exp_return exp142 =null;


        Object STRING134_tree=null;
        Object INT135_tree=null;
        Object BREAK136_tree=null;
        Object LEFTPARENTHESIS139_tree=null;
        Object RIGHTPARENTHESIS140_tree=null;
        Object LEFTPARENTHESIS141_tree=null;
        Object RIGHTPARENTHESIS143_tree=null;
        RewriteRuleTokenStream stream_LEFTPARENTHESIS=new RewriteRuleTokenStream(adaptor,"token LEFTPARENTHESIS");
        RewriteRuleTokenStream stream_RIGHTPARENTHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHTPARENTHESIS");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_functioncall=new RewriteRuleSubtreeStream(adaptor,"rule functioncall");
        RewriteRuleSubtreeStream stream_lvalue=new RewriteRuleSubtreeStream(adaptor,"rule lvalue");
        paraphrases.push("in term");
        try {
            // C:\\Users\\e49al\\Tiger.g:218:3: ( STRING -> STRING | INT -> INT | BREAK | functioncall -> functioncall | lvalue -> lvalue | LEFTPARENTHESIS RIGHTPARENTHESIS -> NILROOT | LEFTPARENTHESIS exp RIGHTPARENTHESIS -> exp )
            int alt22=7;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt22=1;
                }
                break;
            case INT:
                {
                alt22=2;
                }
                break;
            case BREAK:
                {
                alt22=3;
                }
                break;
            case ID:
                {
                int LA22_4 = input.LA(2);

                if ( (synpred47_Tiger()) ) {
                    alt22=4;
                }
                else if ( (synpred48_Tiger()) ) {
                    alt22=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 4, input);

                    throw nvae;

                }
                }
                break;
            case LEFTPARENTHESIS:
                {
                int LA22_5 = input.LA(2);

                if ( (synpred49_Tiger()) ) {
                    alt22=6;
                }
                else if ( (true) ) {
                    alt22=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\e49al\\Tiger.g:218:3: STRING
                    {
                    STRING134=(Token)match(input,STRING,FOLLOW_STRING_in_term1346); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING134);


                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 218:10: -> STRING
                    {
                        adaptor.addChild(root_0, 
                        stream_STRING.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\e49al\\Tiger.g:219:4: INT
                    {
                    INT135=(Token)match(input,INT,FOLLOW_INT_in_term1355); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT135);


                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 219:8: -> INT
                    {
                        adaptor.addChild(root_0, 
                        stream_INT.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\e49al\\Tiger.g:220:5: BREAK
                    {
                    root_0 = (Object)adaptor.nil();


                    BREAK136=(Token)match(input,BREAK,FOLLOW_BREAK_in_term1365); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BREAK136_tree = 
                    (Object)adaptor.create(BREAK136)
                    ;
                    adaptor.addChild(root_0, BREAK136_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\e49al\\Tiger.g:221:4: functioncall
                    {
                    pushFollow(FOLLOW_functioncall_in_term1370);
                    functioncall137=functioncall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functioncall.add(functioncall137.getTree());

                    // AST REWRITE
                    // elements: functioncall
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:17: -> functioncall
                    {
                        adaptor.addChild(root_0, stream_functioncall.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\e49al\\Tiger.g:222:4: lvalue
                    {
                    pushFollow(FOLLOW_lvalue_in_term1379);
                    lvalue138=lvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lvalue.add(lvalue138.getTree());

                    // AST REWRITE
                    // elements: lvalue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 222:11: -> lvalue
                    {
                        adaptor.addChild(root_0, stream_lvalue.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\e49al\\Tiger.g:223:4: LEFTPARENTHESIS RIGHTPARENTHESIS
                    {
                    LEFTPARENTHESIS139=(Token)match(input,LEFTPARENTHESIS,FOLLOW_LEFTPARENTHESIS_in_term1388); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFTPARENTHESIS.add(LEFTPARENTHESIS139);


                    RIGHTPARENTHESIS140=(Token)match(input,RIGHTPARENTHESIS,FOLLOW_RIGHTPARENTHESIS_in_term1391); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHTPARENTHESIS.add(RIGHTPARENTHESIS140);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:38: -> NILROOT
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(NILROOT, "NILROOT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\e49al\\Tiger.g:224:4: LEFTPARENTHESIS exp RIGHTPARENTHESIS
                    {
                    LEFTPARENTHESIS141=(Token)match(input,LEFTPARENTHESIS,FOLLOW_LEFTPARENTHESIS_in_term1402); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFTPARENTHESIS.add(LEFTPARENTHESIS141);


                    pushFollow(FOLLOW_exp_in_term1405);
                    exp142=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp142.getTree());

                    RIGHTPARENTHESIS143=(Token)match(input,RIGHTPARENTHESIS,FOLLOW_RIGHTPARENTHESIS_in_term1407); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHTPARENTHESIS.add(RIGHTPARENTHESIS143);


                    // AST REWRITE
                    // elements: exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:42: -> exp
                    {
                        adaptor.addChild(root_0, stream_exp.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class functioncall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functioncall"
    // C:\\Users\\e49al\\Tiger.g:228:1: functioncall : ( ID LEFTPARENTHESIS exp ( COMMA exp )* RIGHTPARENTHESIS -> ^( FUNCTIONCALL ID ( exp )+ ) | ID LEFTPARENTHESIS RIGHTPARENTHESIS -> ^( FUNCTIONCALL ID ) );
    public final TigerParser.functioncall_return functioncall() throws RecognitionException {
        TigerParser.functioncall_return retval = new TigerParser.functioncall_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID144=null;
        Token LEFTPARENTHESIS145=null;
        Token COMMA147=null;
        Token RIGHTPARENTHESIS149=null;
        Token ID150=null;
        Token LEFTPARENTHESIS151=null;
        Token RIGHTPARENTHESIS152=null;
        TigerParser.exp_return exp146 =null;

        TigerParser.exp_return exp148 =null;


        Object ID144_tree=null;
        Object LEFTPARENTHESIS145_tree=null;
        Object COMMA147_tree=null;
        Object RIGHTPARENTHESIS149_tree=null;
        Object ID150_tree=null;
        Object LEFTPARENTHESIS151_tree=null;
        Object RIGHTPARENTHESIS152_tree=null;
        RewriteRuleTokenStream stream_LEFTPARENTHESIS=new RewriteRuleTokenStream(adaptor,"token LEFTPARENTHESIS");
        RewriteRuleTokenStream stream_RIGHTPARENTHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHTPARENTHESIS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        paraphrases.push("in function call");
        try {
            // C:\\Users\\e49al\\Tiger.g:231:3: ( ID LEFTPARENTHESIS exp ( COMMA exp )* RIGHTPARENTHESIS -> ^( FUNCTIONCALL ID ( exp )+ ) | ID LEFTPARENTHESIS RIGHTPARENTHESIS -> ^( FUNCTIONCALL ID ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==LEFTPARENTHESIS) ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2==RIGHTPARENTHESIS) ) {
                        alt24=2;
                    }
                    else if ( (LA24_2==BREAK||LA24_2==FOR||(LA24_2 >= ID && LA24_2 <= IF)||LA24_2==INT||(LA24_2 >= LEFTPARENTHESIS && LA24_2 <= LET)||LA24_2==MINUS||LA24_2==STRING||LA24_2==WHILE) ) {
                        alt24=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\e49al\\Tiger.g:231:3: ID LEFTPARENTHESIS exp ( COMMA exp )* RIGHTPARENTHESIS
                    {
                    ID144=(Token)match(input,ID,FOLLOW_ID_in_functioncall1433); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID144);


                    LEFTPARENTHESIS145=(Token)match(input,LEFTPARENTHESIS,FOLLOW_LEFTPARENTHESIS_in_functioncall1435); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFTPARENTHESIS.add(LEFTPARENTHESIS145);


                    pushFollow(FOLLOW_exp_in_functioncall1437);
                    exp146=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp146.getTree());

                    // C:\\Users\\e49al\\Tiger.g:231:26: ( COMMA exp )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==COMMA) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // C:\\Users\\e49al\\Tiger.g:231:27: COMMA exp
                    	    {
                    	    COMMA147=(Token)match(input,COMMA,FOLLOW_COMMA_in_functioncall1440); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA147);


                    	    pushFollow(FOLLOW_exp_in_functioncall1442);
                    	    exp148=exp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exp.add(exp148.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    RIGHTPARENTHESIS149=(Token)match(input,RIGHTPARENTHESIS,FOLLOW_RIGHTPARENTHESIS_in_functioncall1446); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHTPARENTHESIS.add(RIGHTPARENTHESIS149);


                    // AST REWRITE
                    // elements: ID, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 231:56: -> ^( FUNCTIONCALL ID ( exp )+ )
                    {
                        // C:\\Users\\e49al\\Tiger.g:231:59: ^( FUNCTIONCALL ID ( exp )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTIONCALL, "FUNCTIONCALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        if ( !(stream_exp.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_exp.hasNext() ) {
                            adaptor.addChild(root_1, stream_exp.nextTree());

                        }
                        stream_exp.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\e49al\\Tiger.g:232:3: ID LEFTPARENTHESIS RIGHTPARENTHESIS
                    {
                    ID150=(Token)match(input,ID,FOLLOW_ID_in_functioncall1461); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID150);


                    LEFTPARENTHESIS151=(Token)match(input,LEFTPARENTHESIS,FOLLOW_LEFTPARENTHESIS_in_functioncall1463); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFTPARENTHESIS.add(LEFTPARENTHESIS151);


                    RIGHTPARENTHESIS152=(Token)match(input,RIGHTPARENTHESIS,FOLLOW_RIGHTPARENTHESIS_in_functioncall1465); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHTPARENTHESIS.add(RIGHTPARENTHESIS152);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 232:39: -> ^( FUNCTIONCALL ID )
                    {
                        // C:\\Users\\e49al\\Tiger.g:232:42: ^( FUNCTIONCALL ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTIONCALL, "FUNCTIONCALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functioncall"


    public static class dotlvalue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dotlvalue"
    // C:\\Users\\e49al\\Tiger.g:236:1: dotlvalue : ID ( DOT ^ ID )+ ;
    public final TigerParser.dotlvalue_return dotlvalue() throws RecognitionException {
        TigerParser.dotlvalue_return retval = new TigerParser.dotlvalue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID153=null;
        Token DOT154=null;
        Token ID155=null;

        Object ID153_tree=null;
        Object DOT154_tree=null;
        Object ID155_tree=null;

        paraphrases.push("in dot left value");
        try {
            // C:\\Users\\e49al\\Tiger.g:239:3: ( ID ( DOT ^ ID )+ )
            // C:\\Users\\e49al\\Tiger.g:239:3: ID ( DOT ^ ID )+
            {
            root_0 = (Object)adaptor.nil();


            ID153=(Token)match(input,ID,FOLLOW_ID_in_dotlvalue1496); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID153_tree = 
            (Object)adaptor.create(ID153)
            ;
            adaptor.addChild(root_0, ID153_tree);
            }

            // C:\\Users\\e49al\\Tiger.g:239:6: ( DOT ^ ID )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==DOT) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==ID) ) {
                        int LA25_3 = input.LA(3);

                        if ( (synpred52_Tiger()) ) {
                            alt25=1;
                        }


                    }


                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\e49al\\Tiger.g:239:7: DOT ^ ID
            	    {
            	    DOT154=(Token)match(input,DOT,FOLLOW_DOT_in_dotlvalue1499); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT154_tree = 
            	    (Object)adaptor.create(DOT154)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(DOT154_tree, root_0);
            	    }

            	    ID155=(Token)match(input,ID,FOLLOW_ID_in_dotlvalue1502); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ID155_tree = 
            	    (Object)adaptor.create(ID155)
            	    ;
            	    adaptor.addChild(root_0, ID155_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dotlvalue"


    public static class arrayindexlvalue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayindexlvalue"
    // C:\\Users\\e49al\\Tiger.g:240:1: arrayindexlvalue : ID ( LEFTBRACKET exp RIGHTBRACKET )+ -> ( ^( ARRAYINDEX ID exp ) )+ ;
    public final TigerParser.arrayindexlvalue_return arrayindexlvalue() throws RecognitionException {
        TigerParser.arrayindexlvalue_return retval = new TigerParser.arrayindexlvalue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID156=null;
        Token LEFTBRACKET157=null;
        Token RIGHTBRACKET159=null;
        TigerParser.exp_return exp158 =null;


        Object ID156_tree=null;
        Object LEFTBRACKET157_tree=null;
        Object RIGHTBRACKET159_tree=null;
        RewriteRuleTokenStream stream_RIGHTBRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHTBRACKET");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LEFTBRACKET=new RewriteRuleTokenStream(adaptor,"token LEFTBRACKET");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        paraphrases.push("in array index value");
        try {
            // C:\\Users\\e49al\\Tiger.g:243:3: ( ID ( LEFTBRACKET exp RIGHTBRACKET )+ -> ( ^( ARRAYINDEX ID exp ) )+ )
            // C:\\Users\\e49al\\Tiger.g:243:3: ID ( LEFTBRACKET exp RIGHTBRACKET )+
            {
            ID156=(Token)match(input,ID,FOLLOW_ID_in_arrayindexlvalue1522); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID156);


            // C:\\Users\\e49al\\Tiger.g:243:6: ( LEFTBRACKET exp RIGHTBRACKET )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==LEFTBRACKET) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\e49al\\Tiger.g:243:7: LEFTBRACKET exp RIGHTBRACKET
            	    {
            	    LEFTBRACKET157=(Token)match(input,LEFTBRACKET,FOLLOW_LEFTBRACKET_in_arrayindexlvalue1525); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LEFTBRACKET.add(LEFTBRACKET157);


            	    pushFollow(FOLLOW_exp_in_arrayindexlvalue1527);
            	    exp158=exp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exp.add(exp158.getTree());

            	    RIGHTBRACKET159=(Token)match(input,RIGHTBRACKET,FOLLOW_RIGHTBRACKET_in_arrayindexlvalue1529); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RIGHTBRACKET.add(RIGHTBRACKET159);


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            // AST REWRITE
            // elements: ID, exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 243:38: -> ( ^( ARRAYINDEX ID exp ) )+
            {
                if ( !(stream_ID.hasNext()||stream_exp.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext()||stream_exp.hasNext() ) {
                    // C:\\Users\\e49al\\Tiger.g:243:41: ^( ARRAYINDEX ID exp )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(ARRAYINDEX, "ARRAYINDEX")
                    , root_1);

                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    adaptor.addChild(root_1, stream_exp.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_ID.reset();
                stream_exp.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arrayindexlvalue"


    public static class lvalue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lvalue"
    // C:\\Users\\e49al\\Tiger.g:245:1: lvalue : ( arrayindexlvalue ( DOT ^ lvalue )+ | dotlvalue ( LEFTBRACKET exp RIGHTBRACKET )+ -> ( ^( ARRAYINDEX dotlvalue exp ) )+ | dotlvalue | arrayindexlvalue | ID -> ID );
    public final TigerParser.lvalue_return lvalue() throws RecognitionException {
        TigerParser.lvalue_return retval = new TigerParser.lvalue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT161=null;
        Token LEFTBRACKET164=null;
        Token RIGHTBRACKET166=null;
        Token ID169=null;
        TigerParser.arrayindexlvalue_return arrayindexlvalue160 =null;

        TigerParser.lvalue_return lvalue162 =null;

        TigerParser.dotlvalue_return dotlvalue163 =null;

        TigerParser.exp_return exp165 =null;

        TigerParser.dotlvalue_return dotlvalue167 =null;

        TigerParser.arrayindexlvalue_return arrayindexlvalue168 =null;


        Object DOT161_tree=null;
        Object LEFTBRACKET164_tree=null;
        Object RIGHTBRACKET166_tree=null;
        Object ID169_tree=null;
        RewriteRuleTokenStream stream_RIGHTBRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHTBRACKET");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LEFTBRACKET=new RewriteRuleTokenStream(adaptor,"token LEFTBRACKET");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_dotlvalue=new RewriteRuleSubtreeStream(adaptor,"rule dotlvalue");
        paraphrases.push("in left value");
        try {
            // C:\\Users\\e49al\\Tiger.g:248:3: ( arrayindexlvalue ( DOT ^ lvalue )+ | dotlvalue ( LEFTBRACKET exp RIGHTBRACKET )+ -> ( ^( ARRAYINDEX dotlvalue exp ) )+ | dotlvalue | arrayindexlvalue | ID -> ID )
            int alt29=5;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ID) ) {
                int LA29_1 = input.LA(2);

                if ( (synpred55_Tiger()) ) {
                    alt29=1;
                }
                else if ( (synpred57_Tiger()) ) {
                    alt29=2;
                }
                else if ( (synpred58_Tiger()) ) {
                    alt29=3;
                }
                else if ( (synpred59_Tiger()) ) {
                    alt29=4;
                }
                else if ( (true) ) {
                    alt29=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\e49al\\Tiger.g:248:3: arrayindexlvalue ( DOT ^ lvalue )+
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arrayindexlvalue_in_lvalue1561);
                    arrayindexlvalue160=arrayindexlvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayindexlvalue160.getTree());

                    // C:\\Users\\e49al\\Tiger.g:248:20: ( DOT ^ lvalue )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==DOT) ) {
                            int LA27_2 = input.LA(2);

                            if ( (synpred54_Tiger()) ) {
                                alt27=1;
                            }


                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\Users\\e49al\\Tiger.g:248:21: DOT ^ lvalue
                    	    {
                    	    DOT161=(Token)match(input,DOT,FOLLOW_DOT_in_lvalue1564); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    DOT161_tree = 
                    	    (Object)adaptor.create(DOT161)
                    	    ;
                    	    root_0 = (Object)adaptor.becomeRoot(DOT161_tree, root_0);
                    	    }

                    	    pushFollow(FOLLOW_lvalue_in_lvalue1567);
                    	    lvalue162=lvalue();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, lvalue162.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\e49al\\Tiger.g:249:3: dotlvalue ( LEFTBRACKET exp RIGHTBRACKET )+
                    {
                    pushFollow(FOLLOW_dotlvalue_in_lvalue1573);
                    dotlvalue163=dotlvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dotlvalue.add(dotlvalue163.getTree());

                    // C:\\Users\\e49al\\Tiger.g:249:13: ( LEFTBRACKET exp RIGHTBRACKET )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==LEFTBRACKET) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // C:\\Users\\e49al\\Tiger.g:249:14: LEFTBRACKET exp RIGHTBRACKET
                    	    {
                    	    LEFTBRACKET164=(Token)match(input,LEFTBRACKET,FOLLOW_LEFTBRACKET_in_lvalue1576); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LEFTBRACKET.add(LEFTBRACKET164);


                    	    pushFollow(FOLLOW_exp_in_lvalue1578);
                    	    exp165=exp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exp.add(exp165.getTree());

                    	    RIGHTBRACKET166=(Token)match(input,RIGHTBRACKET,FOLLOW_RIGHTBRACKET_in_lvalue1580); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_RIGHTBRACKET.add(RIGHTBRACKET166);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);


                    // AST REWRITE
                    // elements: exp, dotlvalue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 249:45: -> ( ^( ARRAYINDEX dotlvalue exp ) )+
                    {
                        if ( !(stream_exp.hasNext()||stream_dotlvalue.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_exp.hasNext()||stream_dotlvalue.hasNext() ) {
                            // C:\\Users\\e49al\\Tiger.g:249:48: ^( ARRAYINDEX dotlvalue exp )
                            {
                            Object root_1 = (Object)adaptor.nil();
                            root_1 = (Object)adaptor.becomeRoot(
                            (Object)adaptor.create(ARRAYINDEX, "ARRAYINDEX")
                            , root_1);

                            adaptor.addChild(root_1, stream_dotlvalue.nextTree());

                            adaptor.addChild(root_1, stream_exp.nextTree());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_exp.reset();
                        stream_dotlvalue.reset();

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\e49al\\Tiger.g:250:3: dotlvalue
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_dotlvalue_in_lvalue1597);
                    dotlvalue167=dotlvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotlvalue167.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\e49al\\Tiger.g:251:3: arrayindexlvalue
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arrayindexlvalue_in_lvalue1601);
                    arrayindexlvalue168=arrayindexlvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayindexlvalue168.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\e49al\\Tiger.g:252:3: ID
                    {
                    ID169=(Token)match(input,ID,FOLLOW_ID_in_lvalue1605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID169);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 252:6: -> ID
                    {
                        adaptor.addChild(root_0, 
                        stream_ID.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {paraphrases.pop();}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lvalue"

    // $ANTLR start synpred13_Tiger
    public final void synpred13_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:169:3: ( LEFTPARENTHESIS exp ( SEMICOLON exp )+ RIGHTPARENTHESIS )
        // C:\\Users\\e49al\\Tiger.g:169:3: LEFTPARENTHESIS exp ( SEMICOLON exp )+ RIGHTPARENTHESIS
        {
        match(input,LEFTPARENTHESIS,FOLLOW_LEFTPARENTHESIS_in_synpred13_Tiger858); if (state.failed) return ;

        pushFollow(FOLLOW_exp_in_synpred13_Tiger860);
        exp();

        state._fsp--;
        if (state.failed) return ;

        // C:\\Users\\e49al\\Tiger.g:169:23: ( SEMICOLON exp )+
        int cnt30=0;
        loop30:
        do {
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==SEMICOLON) ) {
                alt30=1;
            }


            switch (alt30) {
        	case 1 :
        	    // C:\\Users\\e49al\\Tiger.g:169:24: SEMICOLON exp
        	    {
        	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred13_Tiger863); if (state.failed) return ;

        	    pushFollow(FOLLOW_exp_in_synpred13_Tiger865);
        	    exp();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt30 >= 1 ) break loop30;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(30, input);
                    throw eee;
            }
            cnt30++;
        } while (true);


        match(input,RIGHTPARENTHESIS,FOLLOW_RIGHTPARENTHESIS_in_synpred13_Tiger869); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_Tiger

    // $ANTLR start synpred16_Tiger
    public final void synpred16_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:172:17: ( exp )
        // C:\\Users\\e49al\\Tiger.g:172:17: exp
        {
        pushFollow(FOLLOW_exp_in_synpred16_Tiger915);
        exp();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_Tiger

    // $ANTLR start synpred18_Tiger
    public final void synpred18_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:173:32: ( exp )
        // C:\\Users\\e49al\\Tiger.g:173:32: exp
        {
        pushFollow(FOLLOW_exp_in_synpred18_Tiger944);
        exp();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred18_Tiger

    // $ANTLR start synpred24_Tiger
    public final void synpred24_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:175:4: ( ID LEFTBRACE ID EQUAL exp ( COMMA ID EQUAL exp )* RIGHTBRACE )
        // C:\\Users\\e49al\\Tiger.g:175:4: ID LEFTBRACE ID EQUAL exp ( COMMA ID EQUAL exp )* RIGHTBRACE
        {
        match(input,ID,FOLLOW_ID_in_synpred24_Tiger1002); if (state.failed) return ;

        match(input,LEFTBRACE,FOLLOW_LEFTBRACE_in_synpred24_Tiger1004); if (state.failed) return ;

        match(input,ID,FOLLOW_ID_in_synpred24_Tiger1006); if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred24_Tiger1008); if (state.failed) return ;

        pushFollow(FOLLOW_exp_in_synpred24_Tiger1010);
        exp();

        state._fsp--;
        if (state.failed) return ;

        // C:\\Users\\e49al\\Tiger.g:175:30: ( COMMA ID EQUAL exp )*
        loop36:
        do {
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==COMMA) ) {
                alt36=1;
            }


            switch (alt36) {
        	case 1 :
        	    // C:\\Users\\e49al\\Tiger.g:175:31: COMMA ID EQUAL exp
        	    {
        	    match(input,COMMA,FOLLOW_COMMA_in_synpred24_Tiger1013); if (state.failed) return ;

        	    match(input,ID,FOLLOW_ID_in_synpred24_Tiger1015); if (state.failed) return ;

        	    match(input,EQUAL,FOLLOW_EQUAL_in_synpred24_Tiger1017); if (state.failed) return ;

        	    pushFollow(FOLLOW_exp_in_synpred24_Tiger1019);
        	    exp();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop36;
            }
        } while (true);


        match(input,RIGHTBRACE,FOLLOW_RIGHTBRACE_in_synpred24_Tiger1023); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred24_Tiger

    // $ANTLR start synpred25_Tiger
    public final void synpred25_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:176:4: ( ID LEFTBRACE RIGHTBRACE )
        // C:\\Users\\e49al\\Tiger.g:176:4: ID LEFTBRACE RIGHTBRACE
        {
        match(input,ID,FOLLOW_ID_in_synpred25_Tiger1043); if (state.failed) return ;

        match(input,LEFTBRACE,FOLLOW_LEFTBRACE_in_synpred25_Tiger1045); if (state.failed) return ;

        match(input,RIGHTBRACE,FOLLOW_RIGHTBRACE_in_synpred25_Tiger1048); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred25_Tiger

    // $ANTLR start synpred26_Tiger
    public final void synpred26_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:177:3: ( ID LEFTBRACKET exp RIGHTBRACKET OF exp )
        // C:\\Users\\e49al\\Tiger.g:177:3: ID LEFTBRACKET exp RIGHTBRACKET OF exp
        {
        match(input,ID,FOLLOW_ID_in_synpred26_Tiger1060); if (state.failed) return ;

        match(input,LEFTBRACKET,FOLLOW_LEFTBRACKET_in_synpred26_Tiger1062); if (state.failed) return ;

        pushFollow(FOLLOW_exp_in_synpred26_Tiger1064);
        exp();

        state._fsp--;
        if (state.failed) return ;

        match(input,RIGHTBRACKET,FOLLOW_RIGHTBRACKET_in_synpred26_Tiger1066); if (state.failed) return ;

        match(input,OF,FOLLOW_OF_in_synpred26_Tiger1068); if (state.failed) return ;

        pushFollow(FOLLOW_exp_in_synpred26_Tiger1070);
        exp();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred26_Tiger

    // $ANTLR start synpred27_Tiger
    public final void synpred27_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:178:3: ( lvalue ASSIGN exp )
        // C:\\Users\\e49al\\Tiger.g:178:3: lvalue ASSIGN exp
        {
        pushFollow(FOLLOW_lvalue_in_synpred27_Tiger1086);
        lvalue();

        state._fsp--;
        if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred27_Tiger1088); if (state.failed) return ;

        pushFollow(FOLLOW_exp_in_synpred27_Tiger1090);
        exp();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred27_Tiger

    // $ANTLR start synpred28_Tiger
    public final void synpred28_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:182:9: ( IF exp THEN exp ELSE exp )
        // C:\\Users\\e49al\\Tiger.g:182:9: IF exp THEN exp ELSE exp
        {
        match(input,IF,FOLLOW_IF_in_synpred28_Tiger1120); if (state.failed) return ;

        pushFollow(FOLLOW_exp_in_synpred28_Tiger1122);
        exp();

        state._fsp--;
        if (state.failed) return ;

        match(input,THEN,FOLLOW_THEN_in_synpred28_Tiger1124); if (state.failed) return ;

        pushFollow(FOLLOW_exp_in_synpred28_Tiger1126);
        exp();

        state._fsp--;
        if (state.failed) return ;

        match(input,ELSE,FOLLOW_ELSE_in_synpred28_Tiger1128); if (state.failed) return ;

        pushFollow(FOLLOW_exp_in_synpred28_Tiger1130);
        exp();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred28_Tiger

    // $ANTLR start synpred31_Tiger
    public final void synpred31_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:190:3: ( cmpexp ( ( OR | AND ) cmpexp )+ )
        // C:\\Users\\e49al\\Tiger.g:190:3: cmpexp ( ( OR | AND ) cmpexp )+
        {
        pushFollow(FOLLOW_cmpexp_in_synpred31_Tiger1183);
        cmpexp();

        state._fsp--;
        if (state.failed) return ;

        // C:\\Users\\e49al\\Tiger.g:190:10: ( ( OR | AND ) cmpexp )+
        int cnt37=0;
        loop37:
        do {
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==AND||LA37_0==OR) ) {
                alt37=1;
            }


            switch (alt37) {
        	case 1 :
        	    // C:\\Users\\e49al\\Tiger.g:190:11: ( OR | AND ) cmpexp
        	    {
        	    if ( input.LA(1)==AND||input.LA(1)==OR ) {
        	        input.consume();
        	        state.errorRecovery=false;
        	        state.failed=false;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        MismatchedSetException mse = new MismatchedSetException(null,input);
        	        throw mse;
        	    }


        	    pushFollow(FOLLOW_cmpexp_in_synpred31_Tiger1193);
        	    cmpexp();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt37 >= 1 ) break loop37;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(37, input);
                    throw eee;
            }
            cnt37++;
        } while (true);


        }

    }
    // $ANTLR end synpred31_Tiger

    // $ANTLR start synpred37_Tiger
    public final void synpred37_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:197:3: ( addexp ( EQUAL | NE | GT | LT | LE | GE ) addexp )
        // C:\\Users\\e49al\\Tiger.g:197:3: addexp ( EQUAL | NE | GT | LT | LE | GE ) addexp
        {
        pushFollow(FOLLOW_addexp_in_synpred37_Tiger1222);
        addexp();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==EQUAL||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_addexp_in_synpred37_Tiger1239);
        addexp();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred37_Tiger

    // $ANTLR start synpred39_Tiger
    public final void synpred39_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:204:13: ( ( PLUS | MINUS ) multiexp )
        // C:\\Users\\e49al\\Tiger.g:204:13: ( PLUS | MINUS ) multiexp
        {
        if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_multiexp_in_synpred39_Tiger1277);
        multiexp();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred39_Tiger

    // $ANTLR start synpred40_Tiger
    public final void synpred40_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:204:3: ( multiexp ( ( PLUS | MINUS ) multiexp )+ )
        // C:\\Users\\e49al\\Tiger.g:204:3: multiexp ( ( PLUS | MINUS ) multiexp )+
        {
        pushFollow(FOLLOW_multiexp_in_synpred40_Tiger1267);
        multiexp();

        state._fsp--;
        if (state.failed) return ;

        // C:\\Users\\e49al\\Tiger.g:204:12: ( ( PLUS | MINUS ) multiexp )+
        int cnt38=0;
        loop38:
        do {
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==MINUS||LA38_0==PLUS) ) {
                alt38=1;
            }


            switch (alt38) {
        	case 1 :
        	    // C:\\Users\\e49al\\Tiger.g:204:13: ( PLUS | MINUS ) multiexp
        	    {
        	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
        	        input.consume();
        	        state.errorRecovery=false;
        	        state.failed=false;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        MismatchedSetException mse = new MismatchedSetException(null,input);
        	        throw mse;
        	    }


        	    pushFollow(FOLLOW_multiexp_in_synpred40_Tiger1277);
        	    multiexp();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt38 >= 1 ) break loop38;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(38, input);
                    throw eee;
            }
            cnt38++;
        } while (true);


        }

    }
    // $ANTLR end synpred40_Tiger

    // $ANTLR start synpred43_Tiger
    public final void synpred43_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:211:3: ( term ( ( TIMES | DIV ) term )+ )
        // C:\\Users\\e49al\\Tiger.g:211:3: term ( ( TIMES | DIV ) term )+
        {
        pushFollow(FOLLOW_term_in_synpred43_Tiger1306);
        term();

        state._fsp--;
        if (state.failed) return ;

        // C:\\Users\\e49al\\Tiger.g:211:8: ( ( TIMES | DIV ) term )+
        int cnt39=0;
        loop39:
        do {
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==DIV||LA39_0==TIMES) ) {
                alt39=1;
            }


            switch (alt39) {
        	case 1 :
        	    // C:\\Users\\e49al\\Tiger.g:211:9: ( TIMES | DIV ) term
        	    {
        	    if ( input.LA(1)==DIV||input.LA(1)==TIMES ) {
        	        input.consume();
        	        state.errorRecovery=false;
        	        state.failed=false;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        MismatchedSetException mse = new MismatchedSetException(null,input);
        	        throw mse;
        	    }


        	    pushFollow(FOLLOW_term_in_synpred43_Tiger1316);
        	    term();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt39 >= 1 ) break loop39;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(39, input);
                    throw eee;
            }
            cnt39++;
        } while (true);


        }

    }
    // $ANTLR end synpred43_Tiger

    // $ANTLR start synpred47_Tiger
    public final void synpred47_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:221:4: ( functioncall )
        // C:\\Users\\e49al\\Tiger.g:221:4: functioncall
        {
        pushFollow(FOLLOW_functioncall_in_synpred47_Tiger1370);
        functioncall();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred47_Tiger

    // $ANTLR start synpred48_Tiger
    public final void synpred48_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:222:4: ( lvalue )
        // C:\\Users\\e49al\\Tiger.g:222:4: lvalue
        {
        pushFollow(FOLLOW_lvalue_in_synpred48_Tiger1379);
        lvalue();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred48_Tiger

    // $ANTLR start synpred49_Tiger
    public final void synpred49_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:223:4: ( LEFTPARENTHESIS RIGHTPARENTHESIS )
        // C:\\Users\\e49al\\Tiger.g:223:4: LEFTPARENTHESIS RIGHTPARENTHESIS
        {
        match(input,LEFTPARENTHESIS,FOLLOW_LEFTPARENTHESIS_in_synpred49_Tiger1388); if (state.failed) return ;

        match(input,RIGHTPARENTHESIS,FOLLOW_RIGHTPARENTHESIS_in_synpred49_Tiger1391); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred49_Tiger

    // $ANTLR start synpred52_Tiger
    public final void synpred52_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:239:7: ( DOT ID )
        // C:\\Users\\e49al\\Tiger.g:239:7: DOT ID
        {
        match(input,DOT,FOLLOW_DOT_in_synpred52_Tiger1499); if (state.failed) return ;

        match(input,ID,FOLLOW_ID_in_synpred52_Tiger1502); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred52_Tiger

    // $ANTLR start synpred54_Tiger
    public final void synpred54_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:248:21: ( DOT lvalue )
        // C:\\Users\\e49al\\Tiger.g:248:21: DOT lvalue
        {
        match(input,DOT,FOLLOW_DOT_in_synpred54_Tiger1564); if (state.failed) return ;

        pushFollow(FOLLOW_lvalue_in_synpred54_Tiger1567);
        lvalue();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred54_Tiger

    // $ANTLR start synpred55_Tiger
    public final void synpred55_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:248:3: ( arrayindexlvalue ( DOT lvalue )+ )
        // C:\\Users\\e49al\\Tiger.g:248:3: arrayindexlvalue ( DOT lvalue )+
        {
        pushFollow(FOLLOW_arrayindexlvalue_in_synpred55_Tiger1561);
        arrayindexlvalue();

        state._fsp--;
        if (state.failed) return ;

        // C:\\Users\\e49al\\Tiger.g:248:20: ( DOT lvalue )+
        int cnt41=0;
        loop41:
        do {
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==DOT) ) {
                alt41=1;
            }


            switch (alt41) {
        	case 1 :
        	    // C:\\Users\\e49al\\Tiger.g:248:21: DOT lvalue
        	    {
        	    match(input,DOT,FOLLOW_DOT_in_synpred55_Tiger1564); if (state.failed) return ;

        	    pushFollow(FOLLOW_lvalue_in_synpred55_Tiger1567);
        	    lvalue();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt41 >= 1 ) break loop41;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(41, input);
                    throw eee;
            }
            cnt41++;
        } while (true);


        }

    }
    // $ANTLR end synpred55_Tiger

    // $ANTLR start synpred57_Tiger
    public final void synpred57_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:249:3: ( dotlvalue ( LEFTBRACKET exp RIGHTBRACKET )+ )
        // C:\\Users\\e49al\\Tiger.g:249:3: dotlvalue ( LEFTBRACKET exp RIGHTBRACKET )+
        {
        pushFollow(FOLLOW_dotlvalue_in_synpred57_Tiger1573);
        dotlvalue();

        state._fsp--;
        if (state.failed) return ;

        // C:\\Users\\e49al\\Tiger.g:249:13: ( LEFTBRACKET exp RIGHTBRACKET )+
        int cnt42=0;
        loop42:
        do {
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==LEFTBRACKET) ) {
                alt42=1;
            }


            switch (alt42) {
        	case 1 :
        	    // C:\\Users\\e49al\\Tiger.g:249:14: LEFTBRACKET exp RIGHTBRACKET
        	    {
        	    match(input,LEFTBRACKET,FOLLOW_LEFTBRACKET_in_synpred57_Tiger1576); if (state.failed) return ;

        	    pushFollow(FOLLOW_exp_in_synpred57_Tiger1578);
        	    exp();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    match(input,RIGHTBRACKET,FOLLOW_RIGHTBRACKET_in_synpred57_Tiger1580); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt42 >= 1 ) break loop42;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(42, input);
                    throw eee;
            }
            cnt42++;
        } while (true);


        }

    }
    // $ANTLR end synpred57_Tiger

    // $ANTLR start synpred58_Tiger
    public final void synpred58_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:250:3: ( dotlvalue )
        // C:\\Users\\e49al\\Tiger.g:250:3: dotlvalue
        {
        pushFollow(FOLLOW_dotlvalue_in_synpred58_Tiger1597);
        dotlvalue();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred58_Tiger

    // $ANTLR start synpred59_Tiger
    public final void synpred59_Tiger_fragment() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:251:3: ( arrayindexlvalue )
        // C:\\Users\\e49al\\Tiger.g:251:3: arrayindexlvalue
        {
        pushFollow(FOLLOW_arrayindexlvalue_in_synpred59_Tiger1601);
        arrayindexlvalue();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred59_Tiger

    // Delegated rules

    public final boolean synpred59_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_Tiger() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_Tiger_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\21\uffff";
    static final String DFA6_eofS =
        "\21\uffff";
    static final String DFA6_minS =
        "\1\33\1\37\1\50\1\37\2\14\2\uffff\1\37\1\15\1\37\2\14\2\uffff\1"+
        "\37\1\15";
    static final String DFA6_maxS =
        "\1\33\1\37\1\50\1\70\1\26\1\14\2\uffff\1\37\1\70\1\37\1\26\1\14"+
        "\2\uffff\1\37\1\70";
    static final String DFA6_acceptS =
        "\6\uffff\1\3\1\4\5\uffff\1\1\1\2\2\uffff";
    static final String DFA6_specialS =
        "\21\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\5\30\uffff\1\4",
            "\1\7\11\uffff\1\6",
            "\1\10",
            "",
            "",
            "\1\11",
            "\1\12\52\uffff\1\13",
            "\1\14",
            "\1\16\11\uffff\1\15",
            "\1\17",
            "",
            "",
            "\1\20",
            "\1\12\52\uffff\1\13"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "153:1: fundec : ( FUN ID LEFTPARENTHESIS tyfields RIGHTPARENTHESIS EQUAL exp -> ^( FUN ID tyfields exp ) | FUN a= ID LEFTPARENTHESIS tyfields RIGHTPARENTHESIS COLON b= ID EQUAL exp -> ^( FUN $b $a tyfields exp ) | FUN ID LEFTPARENTHESIS RIGHTPARENTHESIS EQUAL exp -> ^( FUN ID exp ) | FUN a= ID LEFTPARENTHESIS RIGHTPARENTHESIS COLON b= ID EQUAL exp -> ^( FUN $b $a exp ) );";
        }
    }
 

    public static final BitSet FOLLOW_exp_in_prog374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_in_decs403 = new BitSet(new long[]{0x0000000008000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_tydec_in_dec431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardec_in_dec439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fundec_in_dec447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_tydec470 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_tydec472 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_tydec474 = new BitSet(new long[]{0x0000004080000020L});
    public static final BitSet FOLLOW_ty_in_tydec476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ty504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTBRACE_in_ty512 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_tyfields_in_ty515 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RIGHTBRACE_in_ty518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTBRACE_in_ty527 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RIGHTBRACE_in_ty529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_ty537 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OF_in_ty539 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_ty541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_tyfields571 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_tyfields573 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_tyfields577 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_tyfields580 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_tyfields582 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_tyfields584 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_tyfields586 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_VAR_in_vardec628 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_vardec632 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_vardec634 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_vardec638 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ASSIGN_in_vardec640 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_vardec642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_vardec660 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_vardec662 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ASSIGN_in_vardec664 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_vardec666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUN_in_fundec703 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_fundec705 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESIS_in_fundec707 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_tyfields_in_fundec709 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESIS_in_fundec711 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_fundec713 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_fundec715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUN_in_fundec731 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_fundec735 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESIS_in_fundec737 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_tyfields_in_fundec739 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESIS_in_fundec741 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_fundec743 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_fundec747 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_fundec749 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_fundec751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUN_in_fundec772 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_fundec774 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESIS_in_fundec776 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESIS_in_fundec778 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_fundec780 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_fundec782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUN_in_fundec797 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_fundec801 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESIS_in_fundec803 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESIS_in_fundec805 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_fundec808 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_fundec812 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_fundec814 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_fundec816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPARENTHESIS_in_exp858 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_exp860 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_exp863 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_exp865 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESIS_in_exp869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_exp885 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_exp887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifexp_in_exp900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_exp909 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_exp911 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DO_in_exp913 = new BitSet(new long[]{0x1000131182000802L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_exp915 = new BitSet(new long[]{0x1000131182000802L,0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_exp930 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_exp932 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ASSIGN_in_exp934 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_exp936 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_TO_in_exp938 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_exp940 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DO_in_exp942 = new BitSet(new long[]{0x1000131182000802L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_exp944 = new BitSet(new long[]{0x1000131182000802L,0x0000000000000008L});
    public static final BitSet FOLLOW_LET_in_exp963 = new BitSet(new long[]{0x0000000808000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_decs_in_exp965 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IN_in_exp967 = new BitSet(new long[]{0x1000131182200800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_exp970 = new BitSet(new long[]{0x0200000000200000L});
    public static final BitSet FOLLOW_SEMICOLON_in_exp973 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_exp975 = new BitSet(new long[]{0x0200000000200000L});
    public static final BitSet FOLLOW_END_in_exp981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_exp1002 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LEFTBRACE_in_exp1004 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_exp1006 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_exp1008 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_exp1010 = new BitSet(new long[]{0x0040000000002000L});
    public static final BitSet FOLLOW_COMMA_in_exp1013 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_exp1015 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_exp1017 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_exp1019 = new BitSet(new long[]{0x0040000000002000L});
    public static final BitSet FOLLOW_RIGHTBRACE_in_exp1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_exp1043 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LEFTBRACE_in_exp1045 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RIGHTBRACE_in_exp1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_exp1060 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LEFTBRACKET_in_exp1062 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_exp1064 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RIGHTBRACKET_in_exp1066 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OF_in_exp1068 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_exp1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_exp1086 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ASSIGN_in_exp1088 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_exp1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_biopexp_in_exp1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifexp1120 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_ifexp1122 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_THEN_in_ifexp1124 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_ifexp1126 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ELSE_in_ifexp1128 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_ifexp1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifexp1146 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_ifexp1148 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_THEN_in_ifexp1150 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_ifexp1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cmpexp_in_biopexp1183 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_set_in_biopexp1186 = new BitSet(new long[]{0x1000011080000800L});
    public static final BitSet FOLLOW_cmpexp_in_biopexp1193 = new BitSet(new long[]{0x0002000000000012L});
    public static final BitSet FOLLOW_cmpexp_in_biopexp1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addexp_in_cmpexp1222 = new BitSet(new long[]{0x0000242060400000L});
    public static final BitSet FOLLOW_set_in_cmpexp1224 = new BitSet(new long[]{0x1000011080000800L});
    public static final BitSet FOLLOW_addexp_in_cmpexp1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addexp_in_cmpexp1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiexp_in_addexp1267 = new BitSet(new long[]{0x0004100000000000L});
    public static final BitSet FOLLOW_set_in_addexp1270 = new BitSet(new long[]{0x1000011080000800L});
    public static final BitSet FOLLOW_multiexp_in_addexp1277 = new BitSet(new long[]{0x0004100000000002L});
    public static final BitSet FOLLOW_multiexp_in_addexp1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_multiexp1306 = new BitSet(new long[]{0x4000000000020000L});
    public static final BitSet FOLLOW_set_in_multiexp1309 = new BitSet(new long[]{0x1000011080000800L});
    public static final BitSet FOLLOW_term_in_multiexp1316 = new BitSet(new long[]{0x4000000000020002L});
    public static final BitSet FOLLOW_term_in_multiexp1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_term1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_term1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_term1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functioncall_in_term1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_term1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPARENTHESIS_in_term1388 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESIS_in_term1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPARENTHESIS_in_term1402 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_term1405 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESIS_in_term1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_functioncall1433 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESIS_in_functioncall1435 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_functioncall1437 = new BitSet(new long[]{0x0100000000002000L});
    public static final BitSet FOLLOW_COMMA_in_functioncall1440 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_functioncall1442 = new BitSet(new long[]{0x0100000000002000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESIS_in_functioncall1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_functioncall1461 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESIS_in_functioncall1463 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESIS_in_functioncall1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_dotlvalue1496 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_DOT_in_dotlvalue1499 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_dotlvalue1502 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_arrayindexlvalue1522 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LEFTBRACKET_in_arrayindexlvalue1525 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_arrayindexlvalue1527 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RIGHTBRACKET_in_arrayindexlvalue1529 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_arrayindexlvalue_in_lvalue1561 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_DOT_in_lvalue1564 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_lvalue_in_lvalue1567 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_dotlvalue_in_lvalue1573 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LEFTBRACKET_in_lvalue1576 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_lvalue1578 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RIGHTBRACKET_in_lvalue1580 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_dotlvalue_in_lvalue1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayindexlvalue_in_lvalue1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lvalue1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPARENTHESIS_in_synpred13_Tiger858 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_synpred13_Tiger860 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_synpred13_Tiger863 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_synpred13_Tiger865 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESIS_in_synpred13_Tiger869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_synpred16_Tiger915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_synpred18_Tiger944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred24_Tiger1002 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LEFTBRACE_in_synpred24_Tiger1004 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_synpred24_Tiger1006 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred24_Tiger1008 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_synpred24_Tiger1010 = new BitSet(new long[]{0x0040000000002000L});
    public static final BitSet FOLLOW_COMMA_in_synpred24_Tiger1013 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_synpred24_Tiger1015 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred24_Tiger1017 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_synpred24_Tiger1019 = new BitSet(new long[]{0x0040000000002000L});
    public static final BitSet FOLLOW_RIGHTBRACE_in_synpred24_Tiger1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred25_Tiger1043 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LEFTBRACE_in_synpred25_Tiger1045 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RIGHTBRACE_in_synpred25_Tiger1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred26_Tiger1060 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LEFTBRACKET_in_synpred26_Tiger1062 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_synpred26_Tiger1064 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RIGHTBRACKET_in_synpred26_Tiger1066 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OF_in_synpred26_Tiger1068 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_synpred26_Tiger1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_synpred27_Tiger1086 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred27_Tiger1088 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_synpred27_Tiger1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred28_Tiger1120 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_synpred28_Tiger1122 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_THEN_in_synpred28_Tiger1124 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_synpred28_Tiger1126 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ELSE_in_synpred28_Tiger1128 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_synpred28_Tiger1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cmpexp_in_synpred31_Tiger1183 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_set_in_synpred31_Tiger1186 = new BitSet(new long[]{0x1000011080000800L});
    public static final BitSet FOLLOW_cmpexp_in_synpred31_Tiger1193 = new BitSet(new long[]{0x0002000000000012L});
    public static final BitSet FOLLOW_addexp_in_synpred37_Tiger1222 = new BitSet(new long[]{0x0000242060400000L});
    public static final BitSet FOLLOW_set_in_synpred37_Tiger1224 = new BitSet(new long[]{0x1000011080000800L});
    public static final BitSet FOLLOW_addexp_in_synpred37_Tiger1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred39_Tiger1270 = new BitSet(new long[]{0x1000011080000800L});
    public static final BitSet FOLLOW_multiexp_in_synpred39_Tiger1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiexp_in_synpred40_Tiger1267 = new BitSet(new long[]{0x0004100000000000L});
    public static final BitSet FOLLOW_set_in_synpred40_Tiger1270 = new BitSet(new long[]{0x1000011080000800L});
    public static final BitSet FOLLOW_multiexp_in_synpred40_Tiger1277 = new BitSet(new long[]{0x0004100000000002L});
    public static final BitSet FOLLOW_term_in_synpred43_Tiger1306 = new BitSet(new long[]{0x4000000000020000L});
    public static final BitSet FOLLOW_set_in_synpred43_Tiger1309 = new BitSet(new long[]{0x1000011080000800L});
    public static final BitSet FOLLOW_term_in_synpred43_Tiger1316 = new BitSet(new long[]{0x4000000000020002L});
    public static final BitSet FOLLOW_functioncall_in_synpred47_Tiger1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_synpred48_Tiger1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPARENTHESIS_in_synpred49_Tiger1388 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESIS_in_synpred49_Tiger1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred52_Tiger1499 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_synpred52_Tiger1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred54_Tiger1564 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_lvalue_in_synpred54_Tiger1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayindexlvalue_in_synpred55_Tiger1561 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_DOT_in_synpred55_Tiger1564 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_lvalue_in_synpred55_Tiger1567 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_dotlvalue_in_synpred57_Tiger1573 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LEFTBRACKET_in_synpred57_Tiger1576 = new BitSet(new long[]{0x1000131182000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_exp_in_synpred57_Tiger1578 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RIGHTBRACKET_in_synpred57_Tiger1580 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_dotlvalue_in_synpred58_Tiger1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayindexlvalue_in_synpred59_Tiger1601 = new BitSet(new long[]{0x0000000000000002L});

}