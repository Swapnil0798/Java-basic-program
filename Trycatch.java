import java.lang.*;
import java.util.*;
class Trycatch
{
    public static void main(String arg[])
    {
       Scanner sobj = new Scanner(System.in);

       System.out.println("plz enter first no");
       int no1=sobj.nextInt();
        
       System.out.println("plz enter second no");
       int no2=sobj.nextInt();

       int ans=no1/no2;

       System.out.println("DIVISION IS:"+ans);
    }
}