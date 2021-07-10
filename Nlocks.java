int a[]={input1%10,input2%10,input3%10};
int b[]={(input1/10)%10,(input2/10)%10,(input3/10)%10};
int c[]={(input1/100)%10,(input2/100)%10,(input3/100)%10};
int min1=a[0],min2=b[0],min3=c[0],maximum=-999;
for(int i=0;i<3;i++)
{
if(a[i]<min1)
min1=a[i];
if(b[i]<min2)
min2=b[i];
if(c[i]<min3)
min3=c[i];
if(maximum<a[i])
maximum=a[i];
if(maximum<b[i])
maximum=b[i];
if(maximum<c[i])
maximum=c[i];
}
return maximum*1000+min3*100+min2*10+min1;
    
