duplica_X(X, [E|L1], [E,E|L2]):- X=:=E, duplica_X(X, L1, L2).
duplica_X(X, [E|L1], [E|L2]):- duplica_X(X, L1, L2).
duplica_X(_,[],[]).
