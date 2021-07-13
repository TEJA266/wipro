String s=input1.toLowerCase();
int j=s.length()-1;
for(int i=0;i<=j;i++,j--)
if(s.charAt(i)!=s.charAt(j))
  return 1;
return 2;
