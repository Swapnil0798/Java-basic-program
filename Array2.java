import java.lang.*;
import java .util.*;

class Array2
{

public static void main( String arg[])
{
    //arr is 2 diemtional arraywhich contain 2 diementional array
    //each one dimentional array contains 3 element and each elenment
    //is type of integer
    int i=0,j=0;
    int arr[][]=new int[2][3];
    arr[0][0]=11;
    arr[0][1]=21;
    arr[0][2]=31;
    arr[1][0]=41;
    arr[1][1]=51;
    arr[1][2]=61;
    for(i=0;i<arr.length;i++)
    {
        for(j=0;j<arr[i].length;j++)
        {
            System.out.println(arr[i][j]);
        }
    }
}

}