import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        // Edge case: if the number is less than 2, it's not prime
        if (num < 2) {
            System.out.println("Number is not Prime");
            return;
        }

        boolean isPrime = true;
        System.out.print("Factors: ");
        
        // Check for factors from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                System.out.print(i + " ");  // Print the factor directly
            }
        }
        
        // Final check and result output
        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println();  // Move to next line after factors
            System.out.println("Number is not Prime");
        }
    }
}
