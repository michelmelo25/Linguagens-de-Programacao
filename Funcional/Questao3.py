import math
     
def variancia_aux(lista, media):
    if(len(lista) < 1):
        return 0
    else:
        return ((int(lista[0]) - media)*(int(lista[0]) - media)) + variancia_aux(lista[1:], media)

def variancia(lista):
     return variancia_aux(lista.split(), media(soma(lista.split()), lista.split())) / float(len(lista.split()))

def media(x, lista):
    return x/float(len(lista))


def soma(lista):
    if(len(lista) < 1):
       return 0
    else:
       return int(lista[0]) + soma(lista[1:])

def media_desvio(lista):
     print media(soma(lista.split()), lista.split()), 
     print math.sqrt(variancia(lista))

media_desvio(raw_input())


    
