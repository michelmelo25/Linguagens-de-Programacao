sum([],0).
sum([E|L],M):- sum(L,S),M is (E+S).

tamanho([],0).
tamanho([_|L],T):- tamanho(L,T1), T is (T1+1).

variancia([],_,0).
variancia([E|L],M,V):- variancia(L,M,V1), V is V1 + (E-M)**2.

calcul(L,M,V):- tamanho(L,T), sum(L,S), M is (S/T), variancia(L,M,V1), V is (V1/T).

media_desvio_padrao(L,M,DP):- calcul(L,M1,V), M is M1, DP is sqrt(V).
