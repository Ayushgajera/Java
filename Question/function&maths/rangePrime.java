import java.util.*;

public class rangePrime {
    public static boolean primeNum(int num) {

        if (num < 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                
                return false;
            }
        }
        return true;

    }
    public static void rangenum(int num){
      
        for(int i=2;i<num;i++)
        {
            if(primeNum(i)){
              
                System.out.print(i);
                System.err.print(" ");
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        boolean isPrime = primeNum(num);
        rangenum(num);

        
    }
}