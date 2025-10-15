grammar PyLike;

// =======================
// Parser Rules
// =======================

program: statement* EOF ;

statement
    : funcDecl
    | ifStat
    | whileStat
    | forStat
    | returnStat
    | assignment
    | expression SEMI? 
    | block
    ;

block: LBRACE statement* RBRACE ;

funcDecl: DEF ID LPAREN paramList? RPAREN block ;
paramList: ID (COMMA ID)* ;

ifStat: IF cond block (ELIF cond block)* (ELSE block)? ;
cond: LPAREN expression RPAREN | expression ;

whileStat: WHILE cond block ;
forStat: FOR ID IN expression block ;
returnStat: RETURN expression? SEMI? ;

assignment: ID ASSIGN expression SEMI? ;

// -----------------------
// Expressions
// -----------------------

expression: logicOr ;

logicOr  : logicAnd ( OR logicAnd )* ;
logicAnd : equality ( AND equality )* ;
equality : comparison ( (EQ | NEQ) comparison )* ;
comparison : addition ( (LT | LTE | GT | GTE) addition )* ;
addition : multiplication ( (PLUS | MINUS) multiplication )* ;
multiplication : unary ( (MUL | DIV | MOD) unary )* ;
unary : (NOT | MINUS) unary | primary ;

primary
    : literal
    | ID
    | functionCall
    | LPAREN expression RPAREN
    ;

functionCall: ID LPAREN argList? RPAREN ;
argList: expression (COMMA expression)* ;

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
SEMI: ';' ;
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
