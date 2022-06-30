import java.lang.*;
import java.util.*;
class Trycatch1
{
   
    public static void main(String arg[])
    {
         int ans=0,no1=0,no2=0;
       Scanner sobj = new Scanner(System.in);

       System.out.println("plz enter first no");
       no1=sobj.nextInt();
        
       System.out.println("plz enter second no");
        no2=sobj.nextInt();
       try
       {
        ans=no1/no2;//exception prone code
       }
       catch(ArithemeticException obj )
       {
           System.out.println("exception occured as:"+obj);
       }
     System.out.println("DIVISION IS:"+ans);
    }
}