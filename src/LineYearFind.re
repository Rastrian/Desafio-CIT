/*
Made with love in ReasonML <3

Online IDE if you want to test: https://reasonml.github.io/en/try

Paste of the code: https://reasonml.github.io/en/try?rrjsx=true&reason=PQKgUAsghgJgpgAgO4EsAuALBAbA9gN0RQDsEAlOKAZ12IgBkEAeAZjDAHljsTEBJACIBRBCgBmCAJ64ArsijE0CNLmVwqaAFwIMaNAAcqm4MABOlGsQC22AHQBzdBhkAjWylzA4xYGlOSwEGB2bDglAA8EAF4EAApJSlNtMTwoNABKBGTUpSiAPgQAKSpbaExbAGM4FGwAfRTcNNiqAEdTNHjE9PSAbjBi2zx7WPDYgEYATgA2CdsABjnunoQgA
*/

let x = (year: float) : float => Js.Math.ceil_float(sqrt(year));
Js.log(x(1969.00));