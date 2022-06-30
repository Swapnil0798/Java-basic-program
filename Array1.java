import java.lang.*;
import java.util.*;
class Array1
{
    public static void main(String arg[])
    {
        //single dimentional array
        int icnt=0;
        Scanner sobj=new Scanner(System.in);
        System.out .println("enter the element");
        int size=sobj.nextInt();

        int Arr[]=new int[size];
        
     System.out .println("enter the element of array");
     for(icnt=0;icnt<Arr.length;icnt++)
     {
         Arr[icnt]=sobj.nextInt();
     }

        System.out .println("enter if array are ");
        for(icnt=0;icnt<Arr.length;icnt++)
        {
            System.out.println(Arr[icnt]);;
        }
    }
}