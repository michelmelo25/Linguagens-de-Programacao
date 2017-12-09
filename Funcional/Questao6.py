def repet(n, s):
    if(len(s) == 0):
       return ''
    if(s[0] == 'a' or s[0] == 'A'):
       return n*s[0] + repet(n,s[1:])
    else:
       if(s[0] == 'e' or s[0] == 'E'):
           return n*s[0] + repet(n,s[1:])
       else:
           if(s[0] == 'i' or s[0] == 'I'):
               return n*s[0] + repet(n,s[1:])
           else:
               if(s[0] == 'o' or s[0] == 'O'):
                     return n*s[0] + repet(n,s[1:])
               else:
                   if(s[0] == 'u' or s[0] == 'U'):
                     return n*s[0] + repet(n,s[1:])
                   else:
                     return s[0] + repet(n,s[1:])
  
print repet(input(), raw_input())
