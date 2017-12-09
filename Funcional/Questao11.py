def retan(x,y,l,a,px,py):
    if(x <= px and l >= px):
       if(y <= py and a >= py):
          print "sim"
       else:
          print "nao"
    else:
       print "nao"


def main(x,y,l,a,px,py):
     retan(x,y,l,a,px,py)

main(input(),input(),input(),input(),input(),input())
