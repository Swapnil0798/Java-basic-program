import java.lang.*;
import java.util.*;
class Input1
{
    public static void main(String a[])
 {
       Scanner sobj=new Scanner(System.in);

       System.out.println("enter your name: ");
       String Name=sobj.nextLine();
    
      System.out.println("enter your age: ");
       int Age=sobj.nextInt();

     System.out.println("enter your percentage: ");
       float Percentage=sobj.nextFloat();
    
    System.out.println( "your name is :"+Name);
    System.out.println( "your Age: "+Age); 
  System.out.println( "your percentage: "+Percentage);

       
    }
}