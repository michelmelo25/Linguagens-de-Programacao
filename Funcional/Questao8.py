def invert(s):
    if(len(s) == 0):
       return ''
    return invert(s[1:]) + s[0]

def ispalindrome(s,l):
    if(len(s) == 0 and len(l) == 0):
      return True
    if(s[0] == l[0]):
      return True and ispalindrome(s[1:], l[1:])
    else:
      return False

def pali(n,s):
    return filter(lambda x: ispalindrome(s[x-n:x], invert(s[x-n:x])), range(n, len(s)+1))

def main(n, s):
    if(len(s) < n):
       return "nao"
    if(len(pali(n,s) + pali(n+1,s)) > 0):
      return "sim"
    else:
      return "nao"

print main(input(), raw_input())

