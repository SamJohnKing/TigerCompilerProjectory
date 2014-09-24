grammar Tiger;


//////////////////////////////////////////////////////////
//**************** Header ******************************//
//////////////////////////////////////////////////////////

options{
	output=AST;
	backtrack=true;
}

tokens{
	DECS;
	TYFIELDS;
	ARRAYCREATION;
	RECORDCREATION;
	ARRAYTYPE;
	FUNCTIONCALL;
	SEQUENCING;
	IFTHENELSE;
	IFTHEN;
	EXPSEQ;
	LVALUE;
	NIL;
	NILROOT;
	ARRAYINDEX;
	SEQ;

	// reserved words
	FUN='function';
	IF='if';
	THEN='then';
	ELSE='else';
	WHILE='while';
	FOR='for';
	DO='do';
	BREAK='break';
	LET='let';
	IN='in';
	END='end';
	OF='of';
	TO='to';
	TYPE='type';
	VAR='var';
	ARRAY='array';
	COLON=':';
	LEFTBRACE='{';
	RIGHTBRACE='}';
	LEFTBRACKET='[';
	RIGHTBRACKET=']';
	LEFTPARENTHESIS='(';
	RIGHTPARENTHESIS=')';
	EQUAL='=';
	MINUS='-';
	PLUS='+';
	TIMES='*';
	DIV='/';
	ASSIGN=':=';
	COMMA=',';
	QUOTE='"';
	GT='>';
	NE='<>';
	LT='<';
	GE='>=';
	LE='<=';
	AND='&';
	OR='|';
	SEMICOLON=';';
	DOT='.';
	BACKSLASH='\\';
}


/////////////////////////////////////////////////////////
//**************** For error handling ****************///
/////////////////////////////////////////////////////////
@members {
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
}




//////////////////////////////////////////////////////////
//**************** Main program ************************//
//////////////////////////////////////////////////////////

prog
@init {paraphrases.push("in prog");}
@after {paraphrases.pop();}	
:	exp -> exp;


//////////////////////////////////////////////////////////
//**************** Declarations ************************//
//////////////////////////////////////////////////////////

decs
@init {paraphrases.push("in decs");}
@after {paraphrases.pop();}	
:	(dec)*-> ^(DECS dec*);
dec
@init {paraphrases.push("in dec");}
@after {paraphrases.pop();}	
:	tydec -> tydec
|	vardec -> vardec
|	fundec -> fundec
;
tydec	
@init {paraphrases.push("in type decarations");}
@after {paraphrases.pop();}
:	TYPE ID EQUAL ty -> ^(TYPE ID ty);
ty
@init {paraphrases.push("in ty");}
@after {paraphrases.pop();}	
:	ID -> ID
|	LEFTBRACE (tyfields) RIGHTBRACE -> tyfields
	|	LEFTBRACE RIGHTBRACE -> NILROOT
|	ARRAY OF ID -> ^(ARRAYTYPE ID)
	;
tyfields
@init {paraphrases.push("in tyfields");}
@after {paraphrases.pop();}	
:	a=ID COLON b=ID (COMMA ID COLON ID )* -> ^(TYFIELDS ($b $a)+);


//////////////////////////////////////////////////////////
//**************** Variables ***************************//
//////////////////////////////////////////////////////////

vardec	
@init {paraphrases.push("in variables declarations");}
@after {paraphrases.pop();}
:	VAR a=ID COLON b=ID ASSIGN exp -> ^(VAR $b $a exp)
|	VAR ID ASSIGN exp -> ^(VAR ID exp)
	;

	//////////////////////////////////////////////////////////
	//**************** Functions ***************************//
	//////////////////////////////////////////////////////////

fundec
@init {paraphrases.push("in function declarations");}
@after {paraphrases.pop();}
:	FUN ID LEFTPARENTHESIS tyfields RIGHTPARENTHESIS EQUAL exp -> ^(FUN ID tyfields exp)
|	FUN a=ID LEFTPARENTHESIS tyfields RIGHTPARENTHESIS COLON b=ID EQUAL exp -> ^(FUN $b $a tyfields exp)
	| FUN ID LEFTPARENTHESIS RIGHTPARENTHESIS EQUAL exp -> ^(FUN ID exp)
	| FUN a=ID LEFTPARENTHESIS RIGHTPARENTHESIS  COLON b=ID EQUAL exp -> ^(FUN $b $a exp)
	;

	//////////////////////////////////////////////////////////
	//**************** Expressions *************************//
	//////////////////////////////////////////////////////////

exp	
@init {paraphrases.push("in expressions declarations");}
@after {paraphrases.pop();}
:	LEFTPARENTHESIS exp (SEMICOLON exp)+ RIGHTPARENTHESIS -> ^(EXPSEQ exp exp+)
	|	MINUS exp -> ^(MINUS exp)
	|	ifexp -> ifexp
	|	WHILE exp DO exp* -> ^(WHILE exp+)
	|	FOR ID ASSIGN exp TO exp DO exp* -> ^(FOR ID exp exp+)
	|	LET decs IN (exp (SEMICOLON exp)*)? END -> ^(LET decs (exp+)?)		
	|	ID LEFTBRACE ID EQUAL exp (COMMA ID EQUAL exp)* RIGHTBRACE -> ^(RECORDCREATION ID (ID exp)+)
	|	ID LEFTBRACE  RIGHTBRACE -> ^(RECORDCREATION NILROOT)
|	ID LEFTBRACKET exp RIGHTBRACKET OF exp -> ^(ARRAYCREATION ID exp exp)
|	lvalue ASSIGN exp -> ^(ASSIGN lvalue exp)
	|	biopexp -> biopexp
	;
	//////////////// if then ////////////////////////////////
ifexp	:	IF exp THEN exp ELSE exp -> ^(IFTHENELSE exp exp exp)
|	IF exp THEN exp -> ^(IFTHEN exp exp)
;


biopexp	
@init {paraphrases.push("in boolean expressions");}
@after {paraphrases.pop();}
:	cmpexp ((OR|AND)^ cmpexp)+
|	cmpexp -> cmpexp
;

cmpexp
@init {paraphrases.push("in comparison expressions");}
@after {paraphrases.pop();}
:	addexp (EQUAL|NE|GT|LT|LE|GE)^ addexp
|	addexp -> addexp
;

addexp	
@init {paraphrases.push("in arithmetic expressions");}
@after {paraphrases.pop();}
:	multiexp ((PLUS|MINUS)^ multiexp)+
|	multiexp -> multiexp
;

multiexp
@init {paraphrases.push("in arithmetic expressions");}
@after {paraphrases.pop();}
:	term ((TIMES|DIV)^ term)+
|	term -> term
;

term
@init {paraphrases.push("in term");}
@after {paraphrases.pop();}	
:	STRING -> STRING
	|	INT	-> INT
 	|	BREAK
	|	functioncall -> functioncall
	|	lvalue -> lvalue
	|	LEFTPARENTHESIS  RIGHTPARENTHESIS -> NILROOT		
	|	LEFTPARENTHESIS  exp RIGHTPARENTHESIS -> exp
	;

	///////////////  function call //////////////////////
functioncall
@init {paraphrases.push("in function call");}
@after {paraphrases.pop();}
:	ID LEFTPARENTHESIS exp (COMMA exp)* RIGHTPARENTHESIS -> ^(FUNCTIONCALL ID exp+)
|	ID LEFTPARENTHESIS RIGHTPARENTHESIS -> ^(FUNCTIONCALL ID)
	;

	////////////// lvalue //////////////////////////////
dotlvalue
@init {paraphrases.push("in dot left value");}
@after {paraphrases.pop();}	
:	ID (DOT^ ID)+;
arrayindexlvalue	
@init {paraphrases.push("in array index value");}
@after {paraphrases.pop();}
:	ID (LEFTBRACKET exp RIGHTBRACKET)+ -> ^(ARRAYINDEX ID exp)+;

lvalue	
@init {paraphrases.push("in left value");}
@after {paraphrases.pop();}
:	arrayindexlvalue (DOT^ lvalue)+
|	dotlvalue (LEFTBRACKET exp RIGHTBRACKET)+ -> ^(ARRAYINDEX dotlvalue exp)+
|	dotlvalue
|	arrayindexlvalue
|	ID -> ID
;


STRING	:	QUOTE ((~(BACKSLASH|QUOTE))|ESCAPEDSEQ)* QUOTE;
fragment
ESCAPEDSEQ	:	'\\n'
|	'\\t'
|	'\\^c'
|	BACKSLASH DIGIT DIGIT DIGIT
|	'\\\"'
|	'\\\\'
;


//////////////////////////////////////////////////////////
//**************** Lexical issues **********************//
//////////////////////////////////////////////////////////



// integer and string
INT	:	DIGIT+;
ID	:	PRINTABLECHAR (PRINTABLECHAR|DIGIT)*;

// rename single or double characters
fragment
DIGIT	:	'0'..'9';
fragment
PRINTABLECHAR	:	'a'..'z'|'A'..'Z'|'_';

FORMATCHAR	:	(' '|'\t'|'\n'|'\f'|BACKSLASH BACKSLASH){skip();};
COMMENT	: '/*' (options{greedy=false;}:~('/')|(('/')~('*')))* (COMMENT (options{greedy=false;}:~('/')|(('/')~('*')))*)* '*/'{skip();};


