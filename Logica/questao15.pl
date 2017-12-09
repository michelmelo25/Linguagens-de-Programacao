tamanho([],0).
tamanho([_|L],X):- tamanho(L,X1), X is (X1+1).
