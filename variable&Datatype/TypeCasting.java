import java.util.*;
public class TypeCasting{
    public static void main(String arg[])
    {
        int i = 100;//valid conversion because int is smaller than double
        double d = i;
        // double i = 100;  //lossy conversion from double to int
        // int d = i;

        //--typecasting-- 
        // double i = 100.000000;//allow conversion from double to int
        // int d = (int)i;
        System.out.println("Value of d after typecasting: " + d);
    }
}