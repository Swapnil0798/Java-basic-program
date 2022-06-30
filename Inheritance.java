import java.lang.*;
class Inheritance
{
      
    class Base
    {
       public int i;
       public int j;

      public Base()
      {
          System.out.println("inside base constructor");

      }
      public void fun()
      {

          System.out.println("inside fun");

      }
      public void fun(int x)
      {

          System.out.println("inside base fun with integer arg ");

      }
       public void gun()
      {
          System.out.println("inside gun");
      }
      
      

    }

    class Derived extends Base      // class Derived : public Base
{
    public int m;
    public int y;

    public Derived()
    {
        System.out.println("Inaide derived constructor");
    }

    public void sun()
    {
        System.out.println("Inside derived sun");
    }
}


  public static void main(String a[])
  {
      Derived dobj = new Derived();
      
     

    
  }

}

