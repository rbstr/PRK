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
3.  +, -

## Funkce
zaokrouhlování: round(a), ceil(a)

absolutní hodnota: abs(a)

## Správný výraz

Ukončující znak/výraz: 'lol'

(a * b) / abs(a++) + ceil(round(a--) % b) lol

# TASK 02 - Definuj gramatiku

S využitím ANTLR.

## Gramatika

```
grammar g;

g:	line*;
line:	expr LOL                    # expression
    |	decl LOL		            # declare
    |   NEWLINE                     # blank
    ;

var:	'int' | 'float';
decl:	var name '=' expr;
name:	ID;

expr:   expr op=('*'|'/'|'%') expr      # mulDivMod
    |   expr op=('+'|'-') expr          # addSub
    |   expr op=('++'|'--')             # incDec
    |	'abs(' expr ')'                 # abs
    |   'ceil(' expr ')'                # ceil
    |   'round(' expr ')'               # round
    |   '('expr')'                      # parenth
    |   FLOAT                           # float
    |   INT                             # int
    |	name '=' expr			        # assignment
    |	name				            # variable
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
FLOAT: NUMBER+ (COMMA NUMBER+)?;
NEWLINE: [\r\n]+;
LOL : ' lol';

fragment NUMBER: ('0' .. '9');
fragment COMMA: (',') ;

```

## Testovací data

## Validní data

```
number = 5 lol
1 lol
1 + 2 lol
18-- lol
abs(4-5) lol
1 + (10--) * (ceil(3,4-2,5)%2) lol
5,6*2,00 lol 
int number = (20+5)-- lol
number + ceil(0,1) % 1 lol
number = number + 11 lol

```

## Nevalidní data

```
-1
4.4 lol
--54 lol

```


