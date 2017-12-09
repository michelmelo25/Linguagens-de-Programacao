n_ocorrencias_X([],_,0).
n_ocorrencias_X([E|L],X,N):- n_ocorrencias_X(L,X,N1), N is (N1+1),X=:=E.
n_ocorrencias_X([E|L],X,N):- n_ocorrencias_X(L,X,N1),X=\=E, N is N1.
