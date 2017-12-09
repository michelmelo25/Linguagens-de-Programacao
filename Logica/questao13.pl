n_esimo(N,[X|_],X):- N =:= 1.
n_esimo(N,[_|L],X):- n_esimo(N-1,L,X).
