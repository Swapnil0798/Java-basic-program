import java.lang.*;
class Command
{
    public static void main(String arg[])
    {
        System.out.println("first no is:"+arg[0]);
        System.out.println("second no is:"+arg[1]);
        int ans=Integer.parseInt(arg[0])+Integer.parseInt(arg[1]);
        System.out.println("addition is:"+ans);
    }
}