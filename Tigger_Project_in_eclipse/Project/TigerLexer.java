// $ANTLR 3.4 C:\\Users\\e49al\\Tiger.g 2013-06-03 14:46:38

import org.antlr.v4.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TigerLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public TigerLexer() {} 
    public TigerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TigerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\e49al\\Tiger.g"; }

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:2:5: ( '&' )
            // C:\\Users\\e49al\\Tiger.g:2:7: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:3:7: ( 'array' )
            // C:\\Users\\e49al\\Tiger.g:3:9: 'array'
            {
            match("array"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARRAY"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:4:8: ( ':=' )
            // C:\\Users\\e49al\\Tiger.g:4:10: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "BACKSLASH"
    public final void mBACKSLASH() throws RecognitionException {
        try {
            int _type = BACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:5:11: ( '\\\\' )
            // C:\\Users\\e49al\\Tiger.g:5:13: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BACKSLASH"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:6:7: ( 'break' )
            // C:\\Users\\e49al\\Tiger.g:6:9: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:7:7: ( ':' )
            // C:\\Users\\e49al\\Tiger.g:7:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:8:7: ( ',' )
            // C:\\Users\\e49al\\Tiger.g:8:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:9:5: ( '/' )
            // C:\\Users\\e49al\\Tiger.g:9:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:10:4: ( 'do' )
            // C:\\Users\\e49al\\Tiger.g:10:6: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:11:5: ( '.' )
            // C:\\Users\\e49al\\Tiger.g:11:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:12:6: ( 'else' )
            // C:\\Users\\e49al\\Tiger.g:12:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:13:5: ( 'end' )
            // C:\\Users\\e49al\\Tiger.g:13:7: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:14:7: ( '=' )
            // C:\\Users\\e49al\\Tiger.g:14:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:15:5: ( 'for' )
            // C:\\Users\\e49al\\Tiger.g:15:7: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FUN"
    public final void mFUN() throws RecognitionException {
        try {
            int _type = FUN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:16:5: ( 'function' )
            // C:\\Users\\e49al\\Tiger.g:16:7: 'function'
            {
            match("function"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUN"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:17:4: ( '>=' )
            // C:\\Users\\e49al\\Tiger.g:17:6: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:18:4: ( '>' )
            // C:\\Users\\e49al\\Tiger.g:18:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:19:4: ( 'if' )
            // C:\\Users\\e49al\\Tiger.g:19:6: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:20:4: ( 'in' )
            // C:\\Users\\e49al\\Tiger.g:20:6: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:21:4: ( '<=' )
            // C:\\Users\\e49al\\Tiger.g:21:6: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "LEFTBRACE"
    public final void mLEFTBRACE() throws RecognitionException {
        try {
            int _type = LEFTBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:22:11: ( '{' )
            // C:\\Users\\e49al\\Tiger.g:22:13: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFTBRACE"

    // $ANTLR start "LEFTBRACKET"
    public final void mLEFTBRACKET() throws RecognitionException {
        try {
            int _type = LEFTBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:23:13: ( '[' )
            // C:\\Users\\e49al\\Tiger.g:23:15: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFTBRACKET"

    // $ANTLR start "LEFTPARENTHESIS"
    public final void mLEFTPARENTHESIS() throws RecognitionException {
        try {
            int _type = LEFTPARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:24:17: ( '(' )
            // C:\\Users\\e49al\\Tiger.g:24:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFTPARENTHESIS"

    // $ANTLR start "LET"
    public final void mLET() throws RecognitionException {
        try {
            int _type = LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:25:5: ( 'let' )
            // C:\\Users\\e49al\\Tiger.g:25:7: 'let'
            {
            match("let"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LET"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:26:4: ( '<' )
            // C:\\Users\\e49al\\Tiger.g:26:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:27:7: ( '-' )
            // C:\\Users\\e49al\\Tiger.g:27:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "NE"
    public final void mNE() throws RecognitionException {
        try {
            int _type = NE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:28:4: ( '<>' )
            // C:\\Users\\e49al\\Tiger.g:28:6: '<>'
            {
            match("<>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NE"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:29:4: ( 'of' )
            // C:\\Users\\e49al\\Tiger.g:29:6: 'of'
            {
            match("of"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OF"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:30:4: ( '|' )
            // C:\\Users\\e49al\\Tiger.g:30:6: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:31:6: ( '+' )
            // C:\\Users\\e49al\\Tiger.g:31:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:32:7: ( '\"' )
            // C:\\Users\\e49al\\Tiger.g:32:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "RIGHTBRACE"
    public final void mRIGHTBRACE() throws RecognitionException {
        try {
            int _type = RIGHTBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:33:12: ( '}' )
            // C:\\Users\\e49al\\Tiger.g:33:14: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHTBRACE"

    // $ANTLR start "RIGHTBRACKET"
    public final void mRIGHTBRACKET() throws RecognitionException {
        try {
            int _type = RIGHTBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:34:14: ( ']' )
            // C:\\Users\\e49al\\Tiger.g:34:16: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHTBRACKET"

    // $ANTLR start "RIGHTPARENTHESIS"
    public final void mRIGHTPARENTHESIS() throws RecognitionException {
        try {
            int _type = RIGHTPARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:35:18: ( ')' )
            // C:\\Users\\e49al\\Tiger.g:35:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHTPARENTHESIS"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:36:11: ( ';' )
            // C:\\Users\\e49al\\Tiger.g:36:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:37:6: ( 'then' )
            // C:\\Users\\e49al\\Tiger.g:37:8: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "TIMES"
    public final void mTIMES() throws RecognitionException {
        try {
            int _type = TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:38:7: ( '*' )
            // C:\\Users\\e49al\\Tiger.g:38:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIMES"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:39:4: ( 'to' )
            // C:\\Users\\e49al\\Tiger.g:39:6: 'to'
            {
            match("to"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:40:6: ( 'type' )
            // C:\\Users\\e49al\\Tiger.g:40:8: 'type'
            {
            match("type"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:41:5: ( 'var' )
            // C:\\Users\\e49al\\Tiger.g:41:7: 'var'
            {
            match("var"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:42:7: ( 'while' )
            // C:\\Users\\e49al\\Tiger.g:42:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:256:8: ( QUOTE ( (~ ( BACKSLASH | QUOTE ) ) | ESCAPEDSEQ )* QUOTE )
            // C:\\Users\\e49al\\Tiger.g:256:10: QUOTE ( (~ ( BACKSLASH | QUOTE ) ) | ESCAPEDSEQ )* QUOTE
            {
            mQUOTE(); 


            // C:\\Users\\e49al\\Tiger.g:256:16: ( (~ ( BACKSLASH | QUOTE ) ) | ESCAPEDSEQ )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '[')||(LA1_0 >= ']' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }
                else if ( (LA1_0=='\\') ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\e49al\\Tiger.g:256:17: (~ ( BACKSLASH | QUOTE ) )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\e49al\\Tiger.g:256:38: ESCAPEDSEQ
            	    {
            	    mESCAPEDSEQ(); 


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            mQUOTE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESCAPEDSEQ"
    public final void mESCAPEDSEQ() throws RecognitionException {
        try {
            // C:\\Users\\e49al\\Tiger.g:259:12: ( '\\\\n' | '\\\\t' | '\\\\^c' | BACKSLASH DIGIT DIGIT DIGIT | '\\\\\\\"' | '\\\\\\\\' )
            int alt2=6;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'n':
                    {
                    alt2=1;
                    }
                    break;
                case 't':
                    {
                    alt2=2;
                    }
                    break;
                case '^':
                    {
                    alt2=3;
                    }
                    break;
                case '\"':
                    {
                    alt2=5;
                    }
                    break;
                case '\\':
                    {
                    alt2=6;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt2=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\e49al\\Tiger.g:259:14: '\\\\n'
                    {
                    match("\\n"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\e49al\\Tiger.g:260:3: '\\\\t'
                    {
                    match("\\t"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\e49al\\Tiger.g:261:3: '\\\\^c'
                    {
                    match("\\^c"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\e49al\\Tiger.g:262:3: BACKSLASH DIGIT DIGIT DIGIT
                    {
                    mBACKSLASH(); 


                    mDIGIT(); 


                    mDIGIT(); 


                    mDIGIT(); 


                    }
                    break;
                case 5 :
                    // C:\\Users\\e49al\\Tiger.g:263:3: '\\\\\\\"'
                    {
                    match("\\\""); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\e49al\\Tiger.g:264:3: '\\\\\\\\'
                    {
                    match("\\\\"); 



                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESCAPEDSEQ"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:274:5: ( ( DIGIT )+ )
            // C:\\Users\\e49al\\Tiger.g:274:7: ( DIGIT )+
            {
            // C:\\Users\\e49al\\Tiger.g:274:7: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\e49al\\Tiger.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:275:4: ( PRINTABLECHAR ( PRINTABLECHAR | DIGIT )* )
            // C:\\Users\\e49al\\Tiger.g:275:6: PRINTABLECHAR ( PRINTABLECHAR | DIGIT )*
            {
            mPRINTABLECHAR(); 


            // C:\\Users\\e49al\\Tiger.g:275:20: ( PRINTABLECHAR | DIGIT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\e49al\\Tiger.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\e49al\\Tiger.g:280:7: ( '0' .. '9' )
            // C:\\Users\\e49al\\Tiger.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "PRINTABLECHAR"
    public final void mPRINTABLECHAR() throws RecognitionException {
        try {
            // C:\\Users\\e49al\\Tiger.g:282:15: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            // C:\\Users\\e49al\\Tiger.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINTABLECHAR"

    // $ANTLR start "FORMATCHAR"
    public final void mFORMATCHAR() throws RecognitionException {
        try {
            int _type = FORMATCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:283:12: ( ( ' ' | '\\t' | '\\n' | '\\f' | BACKSLASH BACKSLASH ) )
            // C:\\Users\\e49al\\Tiger.g:283:14: ( ' ' | '\\t' | '\\n' | '\\f' | BACKSLASH BACKSLASH )
            {
            // C:\\Users\\e49al\\Tiger.g:283:14: ( ' ' | '\\t' | '\\n' | '\\f' | BACKSLASH BACKSLASH )
            int alt5=5;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt5=1;
                }
                break;
            case '\t':
                {
                alt5=2;
                }
                break;
            case '\n':
                {
                alt5=3;
                }
                break;
            case '\f':
                {
                alt5=4;
                }
                break;
            case '\\':
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\e49al\\Tiger.g:283:15: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\e49al\\Tiger.g:283:19: '\\t'
                    {
                    match('\t'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\e49al\\Tiger.g:283:24: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\e49al\\Tiger.g:283:29: '\\f'
                    {
                    match('\f'); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\e49al\\Tiger.g:283:34: BACKSLASH BACKSLASH
                    {
                    mBACKSLASH(); 


                    mBACKSLASH(); 


                    }
                    break;

            }


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FORMATCHAR"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\e49al\\Tiger.g:284:9: ( '/*' ( options {greedy=false; } :~ ( '/' ) | ( ( '/' ) ~ ( '*' ) ) )* ( COMMENT ( options {greedy=false; } :~ ( '/' ) | ( ( '/' ) ~ ( '*' ) ) )* )* '*/' )
            // C:\\Users\\e49al\\Tiger.g:284:11: '/*' ( options {greedy=false; } :~ ( '/' ) | ( ( '/' ) ~ ( '*' ) ) )* ( COMMENT ( options {greedy=false; } :~ ( '/' ) | ( ( '/' ) ~ ( '*' ) ) )* )* '*/'
            {
            match("/*"); 



            // C:\\Users\\e49al\\Tiger.g:284:16: ( options {greedy=false; } :~ ( '/' ) | ( ( '/' ) ~ ( '*' ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='/') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='*') ) {
                        alt6=3;
                    }
                    else if ( ((LA6_1 >= '\u0000' && LA6_1 <= ')')||(LA6_1 >= '+' && LA6_1 <= '\uFFFF')) ) {
                        alt6=2;
                    }


                }
                else if ( (LA6_0=='*') ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2=='/') ) {
                        alt6=3;
                    }
                    else if ( ((LA6_2 >= '\u0000' && LA6_2 <= '.')||(LA6_2 >= '0' && LA6_2 <= '\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '.')||(LA6_0 >= '0' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\e49al\\Tiger.g:284:40: ~ ( '/' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\e49al\\Tiger.g:284:47: ( ( '/' ) ~ ( '*' ) )
            	    {
            	    // C:\\Users\\e49al\\Tiger.g:284:47: ( ( '/' ) ~ ( '*' ) )
            	    // C:\\Users\\e49al\\Tiger.g:284:48: ( '/' ) ~ ( '*' )
            	    {
            	    // C:\\Users\\e49al\\Tiger.g:284:48: ( '/' )
            	    // C:\\Users\\e49al\\Tiger.g:284:49: '/'
            	    {
            	    match('/'); 

            	    }


            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= ')')||(input.LA(1) >= '+' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // C:\\Users\\e49al\\Tiger.g:284:63: ( COMMENT ( options {greedy=false; } :~ ( '/' ) | ( ( '/' ) ~ ( '*' ) ) )* )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='/') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\e49al\\Tiger.g:284:64: COMMENT ( options {greedy=false; } :~ ( '/' ) | ( ( '/' ) ~ ( '*' ) ) )*
            	    {
            	    mCOMMENT(); 


            	    // C:\\Users\\e49al\\Tiger.g:284:72: ( options {greedy=false; } :~ ( '/' ) | ( ( '/' ) ~ ( '*' ) ) )*
            	    loop7:
            	    do {
            	        int alt7=3;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0=='*') ) {
            	            int LA7_1 = input.LA(2);

            	            if ( (LA7_1=='/') ) {
            	                alt7=3;
            	            }
            	            else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
            	                alt7=1;
            	            }


            	        }
            	        else if ( (LA7_0=='/') ) {
            	            int LA7_2 = input.LA(2);

            	            if ( (LA7_2=='*') ) {
            	                alt7=3;
            	            }
            	            else if ( ((LA7_2 >= '\u0000' && LA7_2 <= ')')||(LA7_2 >= '+' && LA7_2 <= '\uFFFF')) ) {
            	                alt7=2;
            	            }


            	        }
            	        else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '.')||(LA7_0 >= '0' && LA7_0 <= '\uFFFF')) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // C:\\Users\\e49al\\Tiger.g:284:96: ~ ( '/' )
            	    	    {
            	    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '\uFFFF') ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // C:\\Users\\e49al\\Tiger.g:284:103: ( ( '/' ) ~ ( '*' ) )
            	    	    {
            	    	    // C:\\Users\\e49al\\Tiger.g:284:103: ( ( '/' ) ~ ( '*' ) )
            	    	    // C:\\Users\\e49al\\Tiger.g:284:104: ( '/' ) ~ ( '*' )
            	    	    {
            	    	    // C:\\Users\\e49al\\Tiger.g:284:104: ( '/' )
            	    	    // C:\\Users\\e49al\\Tiger.g:284:105: '/'
            	    	    {
            	    	    match('/'); 

            	    	    }


            	    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= ')')||(input.LA(1) >= '+' && input.LA(1) <= '\uFFFF') ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match("*/"); 



            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\e49al\\Tiger.g:1:8: ( AND | ARRAY | ASSIGN | BACKSLASH | BREAK | COLON | COMMA | DIV | DO | DOT | ELSE | END | EQUAL | FOR | FUN | GE | GT | IF | IN | LE | LEFTBRACE | LEFTBRACKET | LEFTPARENTHESIS | LET | LT | MINUS | NE | OF | OR | PLUS | QUOTE | RIGHTBRACE | RIGHTBRACKET | RIGHTPARENTHESIS | SEMICOLON | THEN | TIMES | TO | TYPE | VAR | WHILE | STRING | INT | ID | FORMATCHAR | COMMENT )
        int alt9=46;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // C:\\Users\\e49al\\Tiger.g:1:10: AND
                {
                mAND(); 


                }
                break;
            case 2 :
                // C:\\Users\\e49al\\Tiger.g:1:14: ARRAY
                {
                mARRAY(); 


                }
                break;
            case 3 :
                // C:\\Users\\e49al\\Tiger.g:1:20: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 4 :
                // C:\\Users\\e49al\\Tiger.g:1:27: BACKSLASH
                {
                mBACKSLASH(); 


                }
                break;
            case 5 :
                // C:\\Users\\e49al\\Tiger.g:1:37: BREAK
                {
                mBREAK(); 


                }
                break;
            case 6 :
                // C:\\Users\\e49al\\Tiger.g:1:43: COLON
                {
                mCOLON(); 


                }
                break;
            case 7 :
                // C:\\Users\\e49al\\Tiger.g:1:49: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 8 :
                // C:\\Users\\e49al\\Tiger.g:1:55: DIV
                {
                mDIV(); 


                }
                break;
            case 9 :
                // C:\\Users\\e49al\\Tiger.g:1:59: DO
                {
                mDO(); 


                }
                break;
            case 10 :
                // C:\\Users\\e49al\\Tiger.g:1:62: DOT
                {
                mDOT(); 


                }
                break;
            case 11 :
                // C:\\Users\\e49al\\Tiger.g:1:66: ELSE
                {
                mELSE(); 


                }
                break;
            case 12 :
                // C:\\Users\\e49al\\Tiger.g:1:71: END
                {
                mEND(); 


                }
                break;
            case 13 :
                // C:\\Users\\e49al\\Tiger.g:1:75: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 14 :
                // C:\\Users\\e49al\\Tiger.g:1:81: FOR
                {
                mFOR(); 


                }
                break;
            case 15 :
                // C:\\Users\\e49al\\Tiger.g:1:85: FUN
                {
                mFUN(); 


                }
                break;
            case 16 :
                // C:\\Users\\e49al\\Tiger.g:1:89: GE
                {
                mGE(); 


                }
                break;
            case 17 :
                // C:\\Users\\e49al\\Tiger.g:1:92: GT
                {
                mGT(); 


                }
                break;
            case 18 :
                // C:\\Users\\e49al\\Tiger.g:1:95: IF
                {
                mIF(); 


                }
                break;
            case 19 :
                // C:\\Users\\e49al\\Tiger.g:1:98: IN
                {
                mIN(); 


                }
                break;
            case 20 :
                // C:\\Users\\e49al\\Tiger.g:1:101: LE
                {
                mLE(); 


                }
                break;
            case 21 :
                // C:\\Users\\e49al\\Tiger.g:1:104: LEFTBRACE
                {
                mLEFTBRACE(); 


                }
                break;
            case 22 :
                // C:\\Users\\e49al\\Tiger.g:1:114: LEFTBRACKET
                {
                mLEFTBRACKET(); 


                }
                break;
            case 23 :
                // C:\\Users\\e49al\\Tiger.g:1:126: LEFTPARENTHESIS
                {
                mLEFTPARENTHESIS(); 


                }
                break;
            case 24 :
                // C:\\Users\\e49al\\Tiger.g:1:142: LET
                {
                mLET(); 


                }
                break;
            case 25 :
                // C:\\Users\\e49al\\Tiger.g:1:146: LT
                {
                mLT(); 


                }
                break;
            case 26 :
                // C:\\Users\\e49al\\Tiger.g:1:149: MINUS
                {
                mMINUS(); 


                }
                break;
            case 27 :
                // C:\\Users\\e49al\\Tiger.g:1:155: NE
                {
                mNE(); 


                }
                break;
            case 28 :
                // C:\\Users\\e49al\\Tiger.g:1:158: OF
                {
                mOF(); 


                }
                break;
            case 29 :
                // C:\\Users\\e49al\\Tiger.g:1:161: OR
                {
                mOR(); 


                }
                break;
            case 30 :
                // C:\\Users\\e49al\\Tiger.g:1:164: PLUS
                {
                mPLUS(); 


                }
                break;
            case 31 :
                // C:\\Users\\e49al\\Tiger.g:1:169: QUOTE
                {
                mQUOTE(); 


                }
                break;
            case 32 :
                // C:\\Users\\e49al\\Tiger.g:1:175: RIGHTBRACE
                {
                mRIGHTBRACE(); 


                }
                break;
            case 33 :
                // C:\\Users\\e49al\\Tiger.g:1:186: RIGHTBRACKET
                {
                mRIGHTBRACKET(); 


                }
                break;
            case 34 :
                // C:\\Users\\e49al\\Tiger.g:1:199: RIGHTPARENTHESIS
                {
                mRIGHTPARENTHESIS(); 


                }
                break;
            case 35 :
                // C:\\Users\\e49al\\Tiger.g:1:216: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 36 :
                // C:\\Users\\e49al\\Tiger.g:1:226: THEN
                {
                mTHEN(); 


                }
                break;
            case 37 :
                // C:\\Users\\e49al\\Tiger.g:1:231: TIMES
                {
                mTIMES(); 


                }
                break;
            case 38 :
                // C:\\Users\\e49al\\Tiger.g:1:237: TO
                {
                mTO(); 


                }
                break;
            case 39 :
                // C:\\Users\\e49al\\Tiger.g:1:240: TYPE
                {
                mTYPE(); 


                }
                break;
            case 40 :
                // C:\\Users\\e49al\\Tiger.g:1:245: VAR
                {
                mVAR(); 


                }
                break;
            case 41 :
                // C:\\Users\\e49al\\Tiger.g:1:249: WHILE
                {
                mWHILE(); 


                }
                break;
            case 42 :
                // C:\\Users\\e49al\\Tiger.g:1:255: STRING
                {
                mSTRING(); 


                }
                break;
            case 43 :
                // C:\\Users\\e49al\\Tiger.g:1:262: INT
                {
                mINT(); 


                }
                break;
            case 44 :
                // C:\\Users\\e49al\\Tiger.g:1:266: ID
                {
                mID(); 


                }
                break;
            case 45 :
                // C:\\Users\\e49al\\Tiger.g:1:269: FORMATCHAR
                {
                mFORMATCHAR(); 


                }
                break;
            case 46 :
                // C:\\Users\\e49al\\Tiger.g:1:280: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\2\uffff\1\42\1\46\1\47\1\42\1\uffff\1\52\1\42\1\uffff\1\42\1\uffff"+
        "\1\42\1\61\1\42\1\66\3\uffff\1\42\1\uffff\1\42\2\uffff\1\71\4\uffff"+
        "\1\42\1\uffff\2\42\3\uffff\1\42\3\uffff\1\42\2\uffff\1\102\4\42"+
        "\2\uffff\1\107\1\110\3\uffff\1\42\1\112\2\uffff\1\42\1\114\5\42"+
        "\1\uffff\1\42\1\123\1\124\1\42\2\uffff\1\126\1\uffff\1\42\1\uffff"+
        "\1\42\1\131\3\42\1\135\2\uffff\1\42\1\uffff\1\137\1\140\1\uffff"+
        "\1\42\1\142\1\143\1\uffff\1\42\2\uffff\1\145\2\uffff\1\42\1\uffff"+
        "\1\42\1\150\1\uffff";
    static final String DFA9_eofS =
        "\151\uffff";
    static final String DFA9_minS =
        "\1\11\1\uffff\1\162\1\75\1\134\1\162\1\uffff\1\52\1\157\1\uffff"+
        "\1\154\1\uffff\1\157\1\75\1\146\1\75\3\uffff\1\145\1\uffff\1\146"+
        "\2\uffff\1\0\4\uffff\1\150\1\uffff\1\141\1\150\3\uffff\1\162\3\uffff"+
        "\1\145\2\uffff\1\60\1\163\1\144\1\162\1\156\2\uffff\2\60\3\uffff"+
        "\1\164\1\60\2\uffff\1\145\1\60\1\160\1\162\1\151\2\141\1\uffff\1"+
        "\145\2\60\1\143\2\uffff\1\60\1\uffff\1\156\1\uffff\1\145\1\60\1"+
        "\154\1\171\1\153\1\60\2\uffff\1\164\1\uffff\2\60\1\uffff\1\145\2"+
        "\60\1\uffff\1\151\2\uffff\1\60\2\uffff\1\157\1\uffff\1\156\1\60"+
        "\1\uffff";
    static final String DFA9_maxS =
        "\1\175\1\uffff\1\162\1\75\1\134\1\162\1\uffff\1\52\1\157\1\uffff"+
        "\1\156\1\uffff\1\165\1\75\1\156\1\76\3\uffff\1\145\1\uffff\1\146"+
        "\2\uffff\1\uffff\4\uffff\1\171\1\uffff\1\141\1\150\3\uffff\1\162"+
        "\3\uffff\1\145\2\uffff\1\172\1\163\1\144\1\162\1\156\2\uffff\2\172"+
        "\3\uffff\1\164\1\172\2\uffff\1\145\1\172\1\160\1\162\1\151\2\141"+
        "\1\uffff\1\145\2\172\1\143\2\uffff\1\172\1\uffff\1\156\1\uffff\1"+
        "\145\1\172\1\154\1\171\1\153\1\172\2\uffff\1\164\1\uffff\2\172\1"+
        "\uffff\1\145\2\172\1\uffff\1\151\2\uffff\1\172\2\uffff\1\157\1\uffff"+
        "\1\156\1\172\1\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\4\uffff\1\7\2\uffff\1\12\1\uffff\1\15\4\uffff\1\25"+
        "\1\26\1\27\1\uffff\1\32\1\uffff\1\35\1\36\1\uffff\1\40\1\41\1\42"+
        "\1\43\1\uffff\1\45\2\uffff\1\53\1\54\1\55\1\uffff\1\3\1\6\1\4\1"+
        "\uffff\1\56\1\10\5\uffff\1\20\1\21\2\uffff\1\24\1\33\1\31\2\uffff"+
        "\1\37\1\52\7\uffff\1\11\4\uffff\1\22\1\23\1\uffff\1\34\1\uffff\1"+
        "\46\6\uffff\1\14\1\16\1\uffff\1\30\2\uffff\1\50\3\uffff\1\13\1\uffff"+
        "\1\44\1\47\1\uffff\1\2\1\5\1\uffff\1\51\2\uffff\1\17";
    static final String DFA9_specialS =
        "\30\uffff\1\0\120\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\43\1\uffff\1\43\23\uffff\1\43\1\uffff\1\30\3\uffff\1\1\1"+
            "\uffff\1\22\1\33\1\36\1\27\1\6\1\24\1\11\1\7\12\41\1\3\1\34"+
            "\1\17\1\13\1\15\2\uffff\32\42\1\21\1\4\1\32\1\uffff\1\42\1\uffff"+
            "\1\2\1\5\1\42\1\10\1\12\1\14\2\42\1\16\2\42\1\23\2\42\1\25\4"+
            "\42\1\35\1\42\1\37\1\40\3\42\1\20\1\26\1\31",
            "",
            "\1\44",
            "\1\45",
            "\1\43",
            "\1\50",
            "",
            "\1\51",
            "\1\53",
            "",
            "\1\54\1\uffff\1\55",
            "",
            "\1\56\5\uffff\1\57",
            "\1\60",
            "\1\62\7\uffff\1\63",
            "\1\64\1\65",
            "",
            "",
            "",
            "\1\67",
            "",
            "\1\70",
            "",
            "",
            "\0\72",
            "",
            "",
            "",
            "",
            "\1\73\6\uffff\1\74\11\uffff\1\75",
            "",
            "\1\76",
            "\1\77",
            "",
            "",
            "",
            "\1\100",
            "",
            "",
            "",
            "\1\101",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\1\111",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\113",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\1\122",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\125",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\127",
            "",
            "\1\130",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\136",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\141",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\144",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\146",
            "",
            "\1\147",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AND | ARRAY | ASSIGN | BACKSLASH | BREAK | COLON | COMMA | DIV | DO | DOT | ELSE | END | EQUAL | FOR | FUN | GE | GT | IF | IN | LE | LEFTBRACE | LEFTBRACKET | LEFTPARENTHESIS | LET | LT | MINUS | NE | OF | OR | PLUS | QUOTE | RIGHTBRACE | RIGHTBRACKET | RIGHTPARENTHESIS | SEMICOLON | THEN | TIMES | TO | TYPE | VAR | WHILE | STRING | INT | ID | FORMATCHAR | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_24 = input.LA(1);

                        s = -1;
                        if ( ((LA9_24 >= '\u0000' && LA9_24 <= '\uFFFF')) ) {s = 58;}

                        else s = 57;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}