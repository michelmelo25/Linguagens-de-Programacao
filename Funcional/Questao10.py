def imprimir(lista):
    if(len(lista) == 1):
       print lista[0]
    else:
       print lista[0],
       imprimir(lista[1:])

def divid(n,x):
    if((n%x) == 0):
       return True
    return False

def n_primo(n):
   return len(filter(lambda x: divid(n,x), range(1,n+1)))

def primo(n):
    if(n_primo(n) == 2):
       return True
    return False

def primos(lista):
    return filter(lambda x: primo(int(x)), lista.split())

imprimir(primos(raw_input()))
