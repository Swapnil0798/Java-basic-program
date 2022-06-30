import java.lang.*;
class Marvellous extends Thread  // implement
{
    public void run()
    {
        System.out.println("inside thread:"+Thread.currentThread().getName());
    }
    
}
class Multithread
{
    public static void main(String arg[])
    {
      Marvellous.mobj1=new Marvellous();
      Thread t1=new Thread(mobj1,"first");

      Marvellous.mobj2=new Marvellous();
      Thread t2=new Thread(mobj2,"second");

      t1.start();
      t2.start();
    }
    
}