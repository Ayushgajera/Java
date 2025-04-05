import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        
        
        if (year % 4 == 0) {
            if (!(year % 100 == 0)) 
            { 
               System.out.println(year + " is a Leap Year.");
            } 
            else if (year % 400 == 0){
                System.out.println(year + "is a Leap Year.");
            }
            else {
            System.out.println(year + " is NOT a Leap Year.");
               }
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        // Close the scanner
        scanner.close();
    }
}
