# PRK 2022

# TASK 01 - Vlastní jazyk

Datové typy: int [32-bit] (0-9), float [32-bit] (0-9 + "," + 0-9)


Operace: sčítání [+], odečítání [-], násobení [*], dělení [/], závorky [(,)], inkrementace [++], dekrementace [--], modulo [%]

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



