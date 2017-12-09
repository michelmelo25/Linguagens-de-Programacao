def fib_aux(x,y,z,q):
    if(q >= z):
       return
    print y,
    fib_aux(y,x+y,z,q+1)

def fib (x):
    print 1,
    fib_aux(1,1,int(x),1)

fib(input())
