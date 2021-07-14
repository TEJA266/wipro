int digit[]=new int[10];
int a[]={input1,input2,input3,input4};
for(int i=0;i<4;i++)
{
  if(a[i]==0)
  {
    digit[0]++;
    continue;
  }
  while(a[i]>0)
  {
    digit[a[i]%10]++;
    a[i]=(int)a[i]/10;
  }
}
int max=digit[9],j=9;
for(int i=9;i>=0;i--)
if(max<digit[i])
{
  max=digit[i];
  j=i;
}
return j;
