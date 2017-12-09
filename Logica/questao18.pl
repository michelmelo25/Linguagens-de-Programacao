n_ocorrencias_X([],_,0).
n_ocorrencias_X([E|L],X,N):- n_ocorrencias_X(L,X,N1), N is (N1+1),X=:=E.
n_ocorrencias_X([E|L],X,N):- n_ocorrencias_X(L,X,N1),X=\=E, N is N1.

tamanho([],0).
tamanho([_|L],T):- tamanho(L,T1), T is T1+1.

moda([E|L],E):- tamanho([E|L],T), T=:=1.
moda([E|L],X):- moda(L,X1),n_ocorrencias_X([E|L],E,N), n_ocorrencias_X([E|L],X1,N1), N > N1, X is E.
moda([E|L],X):- moda(L,X1),n_ocorrencias_X([E|L],E,N), n_ocorrencias_X([E|L],X1,N1), N =< N1, X is X1.

