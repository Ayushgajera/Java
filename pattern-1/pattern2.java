import java.util.*;
public class pattern2 {
  public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
    // System.out.print("Enter number:");
   int n=4;
   char num='A';
   
   for(int i=0;i<=n-1;i++)//i=1
   {
      for(int j=0;j<=i;j++)//space=0 
       {  
           System.out.print(num);
           num++;
       }
    System.out.println("");
   }
  }
}


import java.util.*;
public class pattern2 {
  public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
    // System.out.print("Enter number:");
   int n=4;
   
   
   for(int i=0;i<=n-1;i++)//i=1
   {
      for(int j=0;j<=4;j++)//space=0 
       {  
           System.out.print("*");
        for(int space=0;space<=n-1;space++)//space=0 
         {  
            if(space==1&&(i!=0&&i!=3)){
                System.out.print("a");
           }
               
          }
       }
      
    System.out.println("");
   }
  }
}