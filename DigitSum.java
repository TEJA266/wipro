import java.io.*;
import  java.util.*;
class DigitSum
{
    public int digitSum(int input1)
    {
        int count=0,flag=0;
        if(input1<0)
	    {
            input1*=-1;
            flag=1;
        }
        if(input1<10 && input1>=0)
        {
            return input1;
        }
        else
        {
            while(input1>0)
		    {
                count+=input1%10;
                input1/=10;
            }
        }
        if(flag==1)
            return -(digitSum(count));
        else
            return digitSum(count);
    }
    public static void main(String args[])
    {
        Main a=new Main();
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        int r=a.digitSum(b);
        System.out.println(r);
    }
 }
