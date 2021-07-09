  
int a[]=new int[10],d,flag=0,i;
while(input1>0)
{
  d=input1%10;
  a[d]++;
  input1/=10;
}
for(i=0;i<10;i++)
{
  if(a[i]%2!=0)
  if(flag==1)
    return 1;
  else
    flag=1;
}
return 2;
