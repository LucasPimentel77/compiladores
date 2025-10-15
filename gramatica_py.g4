grammar PyLike;

// =======================
// Regras do Parser
// =======================

programa: declaracao* EOF ;

declaracao
    : declaracaoFuncao
    | comandos
    | declaracaoSe
    | declaracaoEnquanto
    | declaracaoPara
    | declaracaoRetorno
    | atribuicao
    | expressao
    | bloco
    ;

comandos
    : escreva
    | leia
    ;
    
bloco: LBRACE declaracao* RBRACE ;

declaracaoFuncao: DEF ID LPAREN listaParametros? RPAREN bloco ;
listaParametros: ID (COMMA ID)* ;

escreva: PRINT LPAREN expressao ( COMMA expressao)* RPAREN ;
leia: INPUT LPAREN expressao? RPAREN ;

declaracaoSe: IF condicao bloco (ELIF condicao bloco)* (ELSE bloco)? ;
condicao: LPAREN expressao RPAREN | expressao ;

declaracaoEnquanto: WHILE condicao bloco ;
declaracaoPara: FOR ID IN expressao bloco ;
declaracaoRetorno: RETURN expressao? ;

atribuicao: ID ASSIGN atribuivel ;
atribuivel: expressao | comandos ;

// -----------------------
// Expressões
// -----------------------

expressao: logicoOu ;

logicoOu  : logicoE ( OR logicoE )* ;
logicoE   : igualdade ( AND igualdade )* ;
igualdade : comparacao ( (EQ | NEQ) comparacao )* ;
comparacao: adicao ( (LT | LTE | GT | GTE) adicao )* ;
adicao    : multiplicacao ( (PLUS | MINUS) multiplicacao )* ;
multiplicacao: unario ( (MUL | DIV | MOD) unario )* ;
unario    : (NOT | MINUS) unario | primario ;

primario
    : literal
    | ID
    | chamadaFuncao
    | LPAREN expressao RPAREN
    ;

chamadaFuncao: ID LPAREN listaArgumentos? RPAREN ;
listaArgumentos: expressao (COMMA expressao)* ;

literal: NUMBER | STRING | TRUE | FALSE | NONE ;


// =======================
// Lexer Tokens
// =======================

// Keywords
DEF: 'def' ;
IF: 'if' ;
ELIF: 'elif' ;
ELSE: 'else' ;
WHILE: 'while' ;
FOR: 'for' ;
IN: 'in' ;
RETURN: 'return' ;
PRINT: 'print' ;
INPUT: 'input' ;
AND: 'and' ;
OR: 'or' ;
NOT: 'not' ;
TRUE: 'True' ;
FALSE: 'False' ;
NONE: 'None' ;

// Operators
EQ: '==' ;
NEQ: '!=' ;
LTE: '<=' ;
GTE: '>=' ;
LT: '<' ;
GT: '>' ;
ASSIGN: '=' ;

PLUS: '+' ;
MINUS: '-' ;
MUL: '*' ;
DIV: '/' ;
MOD: '%' ;

// Symbols
COMMA: ',' ;
LPAREN: '(' ;
RPAREN: ')' ;
LBRACE: '{' ;
RBRACE: '}' ;
LBRACK: '[' ;
RBRACK: ']' ;
DOT: '.' ;

// Literals
NUMBER: [0-9]+ ('.' [0-9]+)? ;
STRING: '"' ( '\\' . | ~["\\] )* '"' | '\'' ( '\\' . | ~['\\] )* '\'' ;
ID: [a-zA-Z_] [a-zA-Z0-9_]* ;

// Comments & Whitespace
LINE_COMMENT: '#' ~[\r\n]* -> skip ;
LINE_COMMENT2: '//' ~[\r\n]* -> skip ;
COMMENT: '/*' .*? '*/' -> skip ;

WS: [ \t\r\n]+ -> skip ;
