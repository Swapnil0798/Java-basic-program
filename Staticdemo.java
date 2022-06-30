    import java.lang.*;
    class Demo
 { 
     public int i;
    public int j;
    public static int k;

    static
    {
      System.out.println("inside static block");
      k=11;
    }
     public Demo()
   {
      this.i=0;
      this.j=0;   
        System.out.println("inside constructor");

    }

   public static void fun()
  
   {

     System.out.println("inside non-static fun");

       
   }

   public static void gun()
   {

   System.out.println("inside static gun");
   System.out.println(k);
   

   }

}

class Staticdemo
{
 public static void main(String a[])
{
    Demo.gun();
     
    Demo obj=new Demo();
    
    obj.fun();
    System.out.println(obj.i);
    System.out.println(obj.j);


 }
}
