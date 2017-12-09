progenitor(maria,joao).  
progenitor(jose,joao).  
progenitor(maria,ana).  
progenitor(jose,ana).     
progenitor(joao,mario). 
progenitor(ana,helena).   
progenitor(ana,joana).   
progenitor(helena,carlos).  
progenitor(mario,carlos).   

sexo(ana,feminino). 
sexo(maria,feminino). 
sexo(joana,feminino). 
sexo(helena,feminino).  
sexo(mario,masculino). 
sexo(joao,masculino). 
sexo(jose,masculino). 
sexo(carlos,masculino). 

descendente(X,Y):- progenitor(X,Y).
descendente(X,Y):- progenitor(X,Z), descendente(Z,Y).

irma(X,Y):- sexo(X,feminino), progenitor(Z,X), progenitor(Z,Y), X =\= Y.

irmao(X,Y):- sexo(X, masculino), progenitor(Z,X), progenitor(Z,Y), X =\= Y.

mae(X,Y):- sexo(X,feminino), progenitor(X,Y).

pai(X,Y):- sexo(X,masculino), progenitor(X,Y).

avo(X,Y):- sexo(X,masculino), progenitor(X,Z), progenitor(Z,Y).

avo(X,Y):- sexo(X,feminino), progenitor(X,Z), progenitor(Z,Y).

tio(X,Y):- irmao(X,Z), progenitor(Z,Y).

tia(X,Y):- irma(X,Z), progenitor(Z,Y).

primo(X,Y):- progenitor(Z,X), progenitor(K,Y), (irmao(Z,K);irma(Z,K)), sexo(X,mesculino).

prima(X,Y):- progenitor(Z,X), progenitor(K,Y), (irmao(Z,K);irma(Z,K)), sexo(X,feminino).
