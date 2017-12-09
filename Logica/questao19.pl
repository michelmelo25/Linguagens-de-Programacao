n_ocorrencias_X([],_,0).
n_ocorrencias_X([E|L],X,N):- n_ocorrencias_X(L,X,N1), N is (N1+1),X=:=E.
n_ocorrencias_X([E|L],X,N):- n_ocorrencias_X(L,X,N1),X=\=E, N is N1.

elimina_repetidos([],[]).
elimina_repetidos([E|L1],L2):- elimina_repetidos(L1,L2), n_ocorrencias_X([E|L1],E,N), N > 1.
elimina_repetidos([E|L1],[E|L2]):- elimina_repetidos(L1,L2).
