int cnt=0,len=0,cnt1=0;
boolean flag=false;
for(int i=0;i<input2-1;i++){
if(input1[i]>input1[i+1]){
if(flag==false){
flag=true;
cnt1++;
}
cnt++;
if(cnt>len){
len=cnt;
}
}
else{
if(flag==true){
flag=false;
cnt=0;
}
}
}
if(cnt1>0){
len++;
}
return new Result(cnt1,len);
