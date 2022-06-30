import java.lang.*;
import java.util.*;
class Multithread
{
    public static void main(String arg[])
    {
        System.out.println("inside main");
        Thread tobj=Thread.currentThread();
        System.out.println("name of current thread:"+tobj.getName());
    }
}

