import java.util.*;
public class question1{
    //function for factorial
   public static int fact(int n){
        int f=1;
       for(int i=1;i<=n;i++)
       {
           f=f*i;
       }
       return f;
       
   }
   //function for binomial coefficient
   public static int bincofi(int a,int b){
       
        int num=fact(a);
        int r=fact(b);
        int nr=fact((a-b));
        int ncr=num/(r*nr);
        System.out.println(ncr);
       return ncr;
       
   }
   
    public static void main(String args[])
    {
       bincofi(5,2);
    }
}