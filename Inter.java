import java .lang.*;
interface circle
{
    float PI=3.14f;// public static final PI=3.14

    float calculateArea(float Radius);//PUBLIC ABSTRACT float calculate area(float radius);
    float calculatecircumference(float Radius);//public abstract float calculate circumference (float radius);

}
    class Area implements circle
 {

  public float calculateArea(float Radius)
 {
     return(PI*Radius*Radius);
 }

   public float calculatecircumference(float Radius)
  {
      return(2*PI*Radius);
  }

} 
/////////////////////////////////////////
//Date : 21/04/2022
/////////////Auther///////////////////// 
/////////SWAPNIL SHIVAJI JAGTAP///////////////////////////////

class Inter
{
    public static void main(String arg[])
    {
        Area obj = new Area();
        float fret = 0.0f;

        fret = obj.calculateArea(10.5f);
        System.out.println("Area is:"+fret);
        
        fret=obj.calculatecircumference(10.5f);
        System.out.println("Area is:"+fret);
    }
}