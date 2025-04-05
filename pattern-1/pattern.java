import java.util.*;
public class pattern {
  public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
   int n=sc.nextInt();
   int count=1;
   
   for(int i=0;i<=n-1;i++)//i=1
   {
       for(int space=0;space<=n-i;space++)//space=0  
       {
           System.out.print(" ");
       }
       for(int j=0;j<=i;j++)//space=0 
       {  
           int num=0;
           
           if(num%2==0)
           {
              System.out.print(count); 
           }
           
            num++;
            
            System.out.print(" ");
       }
       for(int space=0;space<=n-i;space++)//space=0  
       {
           System.out.print(" ");
       }
        System.out.println("");
    count++;
   }
    System.out.println("done");
  }
}