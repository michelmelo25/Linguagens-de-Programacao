e_primo(2).
e_primo(N) :- N =\= 1, N mod 2 =\= 0, \+divisor(N,3).

divisor(N,P) :- P > 0, N > P,(divisor(N,P+1); 0 is N mod P).

primos([]).
primos([E|L]):- e_primo(E), primos(L).
