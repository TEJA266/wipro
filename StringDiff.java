String s[]=input1.split(" ");
int sum=0,i,n=s.length,tl,x,j;
String t,r="";
for(i=0;i<n;i++)
{
	  tl=s[i].length();
		x=tl/2;
		sum=0;
		t=s[i].toLowerCase();
		for(j=0;j<x;j++)
		{
		  sum=sum+Math.abs(t.charAt(j)-t.charAt(tl-j-1));
		}
		if(tl%2!=0)
		{
		  sum+=t.charAt(x)-96;
		}
		r+=sum;
}
return Integer.parseInt(r);
