def ocorrencia(l,p,q):
    if(len(l) == 0):
       return
    if(int(l[0]) == p):
       print p+q,
    else:
       print l[0],
    ocorrencia(l[1:], p, q)


ocorrencia(raw_input().split(), input(), input())
