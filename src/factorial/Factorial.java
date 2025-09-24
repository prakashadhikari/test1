package factorial;
import java.util.Scanner;

public class Factorial {

		    
		    // Recursive method to calculate factorial
		    public static long factorial(int n) {
		        if (n == 0 || n == 1) {
		            return 1;  // Base case
		        }
		        else {
		            return n * factorial(n - 1);  // Recursive call
		        }
		    }
		
		
		public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        // Input number
		        System.out.print("Enter a number to find factorial: ");
		        int number = scanner.nextInt();

		        if (number < 0) {
		            System.out.println("Factorial is not defined for negative numbers.");
		        } else {
		            long result = factorial(number);
		            System.out.println("Factorial of " + number + " is: " + result);
		        }

		        scanner.close();
		    }
		

	}


