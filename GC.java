import java.lang.*;
class Demo
{
    public int Arr[];
    public Demo(int size)
    {
        System.out .println("Allocating the resouce in constructer");
        this.Arr=new int [size];
    }

protected void finalize()
{
     System.out .println("Deallocating the resouce in finalized");
        this.Arr=null;
 
}
}
class GC 
{
    public static void main(String arg[])
    {
        Demo dobj=new Demo(10);
        dobj=null;
        System.gc();
       System.out.println("end of main");
    }
}