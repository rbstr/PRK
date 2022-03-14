# PRK 2022

# TASK 01 - Vlastní jazyk

## Datové typy

int (0-9)

float (0-9 + "," + 0-9)


## Operace

sčítání [+], odečítání [-], násobení [*], dělení [/], závorky [(,)], inkrementace [++], dekrementace [--], modulo [%]

Priorita
1.  ++, --
2.  *, /, %
3. +, -

## Funkce
zaokrouhlování: round(a), ceil(a)

absolutní hodnota: abs(a)

## Příklady validních dat
int num = 5, int num = 0

float a = 5,555

## Příklady nevalidních dat
int num = 5.5, int num = -5

int num = 00,5

float a = 5.5, float a = -5,5

## Správný výraz

(a * b) / abs(a++) + ceil(round(a--) % b) 

# TASK 02 - Definuj gramatiku

S využitím ANTLR.

```
grammar g;

g:	line+;

line:	expr                            # expression
    |	var ID '='                      # assign
    |   NEWLINE                         # blank
    ;

var:	'int' | 'float';

expr:   expr op=('*'|'/'|'%') expr      # mulDivMod
    |   expr op=('+'|'-') expr          # addSub
    |   op=('++'|'--') expr             # incPre
    |   expr op=('++'|'--')             # incPost
    |	'abs(' expr ')'                 # abs
    |   'round(' expr ')'               # round
    |   '('expr')'                      # parenth
    |   FLOAT                           # float
    |   INT                             # int
    ;

MUL:    '*';
DIV:    '/';
MOD:    '%';
ADD:    '+';
SUB:    '-';
INC:    '++';
DEC:    '--';

WHITESPACE: (' ' | '\t') -> skip;
ID: [a-zA-Z]+;
INT: NUMBER+ ;
FLOAT: NUMBER+ (COMMA NUMBER+)? ;
NEWLINE: [\r\n]+ ;

fragment NUMBER: ('0' .. '9') ;
fragment COMMA: (',') ;

```


