import java.lang.*;
import java.io.*;
class Input
{
    public static void main(String arg[])throws IOException
    {  
        
      InputStreamReader iobj=new InputStreamReader(System.in);

      BufferedReader bobj=new BufferedReader(iobj);
      try
      {
      System.out.println("enter your name");
        
      String name=bobj.readLine();
      System.out.println("your name is:"+name);  

      int age=Integer.parseInt(bobj.readLine());
      System.out.println("your age is:"+age);  
      
       }
       catch(IOException obj)
       {
           System.out.println("exception occures");  
       }
       finally
       {
           iobj=null;
           bobj=null;
       }
    }

}