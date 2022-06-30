import java.lang.*;
class Employee
{
   public String name;
   public int  salary;

   public Employee(String str,int no)
   {
       this.name=str;
       this.salary=no;
   }
   public String toString()
   {
      return"employee name is  " +name+" having salary  " +salary;
   }
}

class Obj1
{
    public static void main(String arg[])throws Exception
    {
        Employee eobj=new Employee("swapnil",11000);
        System.out.println(eobj.toString());
     }
}