package function;
import java.util.*;
public class function2{
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

public class function2{
   
   public static int bincofi(int num){
       
        
        int rev=0;
        
       while(num>0)
        {
            int digit=num%10;
            rev=rev*10+digit;
             num /= 10; 
            
            
        }
       return rev;
       
   }
   public static int binaryConvert(int num){
       int myNum=num;
        int pow=0;
        int dec=0;
        
       while(num>0)
        {
            int lastdigit=num%10;
            dec=dec+lastdigit*((int)Math.pow(2,pow));
            pow++;
            num /= 10; 
            
        }
            System.out.println("binary :"+myNum+" to Decimal:"+dec);
       return dec;
       
   }

   
    public static void main(String args[])
    {
        int num=122;
       int reverse=bincofi(num);
       if(reverse==num)
       {
           System.out.println("Palindrome");
       }
       else
       {
           System.out.println("Not Palindrome");

       }
    binaryConvert(1101);
    }
}