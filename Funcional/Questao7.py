def print_bonito(l):
    if(len(l) == 1):
       print l[0]
    else:
       print l[0],
       print_bonito(l[1:])

def merge(l1,l2):
    if(len(l1) == 0):
       print_bonito(l2)
       return
    else:
       if(len(l2) == 0):
          print_bonito(l1)
          return
    if(l1[0] <= l2[0]):
       print l1[0],
       merge(l1[1:],l2)
    else:
       print l2[0],
       merge(l1,l2[1:])

merge(raw_input().split(),raw_input().split())
