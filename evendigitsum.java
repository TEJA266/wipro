int r,s=0;
while(input1>0){
r=input1%10;
if(r%2==0)
s+=r;
input1/=10;
}
return s;
