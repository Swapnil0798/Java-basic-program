import java.lang.*;
class Demo
{

}

class Hash
{
    public static void main(String arg[])throws Exception
    {
        String str1="marvellous";
        String str2="marvellous";
        String str3="marvellous";
        Demo dobj=new Demo();

        System.out.println("Hashcode of str1:"+str1.hashCode());
        System.out.println("Hashcode of str2:"+str2.hashCode());
        System.out.println("Hashcode of str3:"+str3.hashCode());
    System.out.println("Hashcode of dobj:"+dobj.hashCode());
      }
}