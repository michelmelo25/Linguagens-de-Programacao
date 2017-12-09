def contido(x,y):
   if(x not in y):
      return x
  
def unir(lista1, lista2):
    if(len(lista1) > 0):
       print lista1[0],
       return unir(lista1[1:],lista2)
    else:
       if(len(lista2) > 0):
          if(len(lista2) == 1):
            print lista2[0]
            #return unir(lista1, lista2[1:])
          else:
            print lista2[0],
            return unir(lista1, lista2[1:])
       

def main(x,y):
    unir(list(filter(lambda k: contido(k, y.split()), x.split())), list(filter(lambda j: contido(j,x.split()),y.split())))
     

main(raw_input(), raw_input())
