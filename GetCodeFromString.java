String s[]=input1.split(" ");
int count=0,sum=0;
for(int i=0;i<s.length;i++)
  count+=s[i].length();
while(count>9)
{
  sum=0;
  while(count>0)
  {
    sum+=count%10;
    count/=10;
   }
  count=sum;
}
return count;


