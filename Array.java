import java.lang.*;

class Array
{
    public static void main(String a[])
    {
        int icnt=0;
      int arr[]=new int[5];
      arr[0]=10;
       arr[1]=20;
        arr[2]=30;
         arr[3]=40;
            arr[4]=50;
             System.out.println("size of array is:"+arr.length);

             System.out.println("for for loop");

             for(icnt=0;icnt<arr.length;icnt++)
             {
                 System.out.println(arr[icnt]);
             }

             System.out.println("for while loop");
             icnt=0;
             while(icnt<arr.length)
             {
                 System.out.println(arr[icnt]);
                 icnt++;
             }

             System.out.println("for data ");
             for(int no:arr)//place holder
             {
                 System.out.println((no));
             }
    }
}