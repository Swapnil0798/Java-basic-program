import java .lang.*;
class Demo extends Thread
{
    public void run()//Running state
    {
        System.out.println("inside thread"+Thread.currentThread().getName());
      System.out.println("inside threadpriority"+Thread.currentThread().getPriority());
    }
}

class Mythread9 
{
    public static void main(String arg[])throws Exception
    {
         System.out.println("inside main threadpriority"+Thread.currentThread().getPriority());
        Demo obj1=new Demo();
        Thread t1=new Thread(obj1,"first");   //new state
    
        Demo obj2=new Demo();
        Thread t2=new Thread(obj2,"second"); //new state

        t1.setPriority(10);
        t2.setPriority(2);
        t1.start();  //Runnable state

        t2.start();   //Runnable state
         
       //  Dead state
    }
}