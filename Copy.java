import java.lang.*;
class Employee implements Cloneable
{
    public int EID;
    public String Ename;
    public int Esalary;

    public Employee(int id,String str,int no)
    {
        this.EID=id;
        this.Ename=str;
        this.Esalary=no;
    }

public Object clone()throws CloneNotSupportedException
{
    return super.clone();
}
}

class Copy
{
    public static void main(String arg[])throws Exception
    {
     Employee eobj=new Employee(11,"swapnil",21000);
     System.out.println("EID:"+eobj.EID+"name:"+eobj.Ename+"salaryP:"+eobj.Esalary);
    Employee eobjx=(Employee)eobj.clone();
    System.out.println("EID:"+eobjx.EID+"name:"+eobjx.Ename+"salaryP:"+eobjx.Esalary);
    eobj.Ename="sam";
    System.out.println("EID:"+eobjx.EID+"name:"+eobjx.Ename+"salaryP:"+eobjx.Esalary);
     }
}