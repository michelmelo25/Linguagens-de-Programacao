max([X],X). 
max([Y|R],X):- max(R,X), X > Y.  
max([Y|_],Y).

mim([X],X). 
mim([Y|R],X):- mim(R,X), X < Y.  
mim([Y|_],Y).

primeiro([E|_],E).

ultimo([X],X).
ultimo([_|L],X):- ultimo(L,X).

ultimo_primeiro_maior_menor(L,U,P,M,N):- ultimo(L,U), primeiro(L,P), max(L,M), mim(L,N).
