def orde(l,m):
    if(len(l) == 0):
       return [m]
    if(int(l[0]) > m):
       return [m] + l
    return [l[0]] + orde(l[1:], m)
    
def aux(l, b):
    if(len(l) == 0):
       return b
    return aux(l[1:], orde(b,int(l[0])))

def imprimir(l):
    if(len(l) == 1):
       print l[0]
    else:
       print l[0],
       imprimir(l[1:])


def main(l):
    imprimir(aux(l[1:], [int(l[0])]))

main(raw_input().split())
