package palindrome;
import java.util.Scanner;
public class checkPalindrome {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        
		        // Input number
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();
		        
		        int originalNumber = number;
		        int reversed = 0;

		        // Reverse the number using a loop
		        while (number != 0) {
		            int digit = number % 10;           // Get last digit
		            reversed = reversed * 10 + digit;  // Build reversed number
		            number = number / 10;              // Remove last digit
		        }

		        // Check if original number and reversed number are equal
		        if (originalNumber == reversed) {
		            System.out.println(originalNumber + " is a palindrome.");
		        } else {
		            System.out.println(originalNumber + " is not a palindrome.");
		        }

		        scanner.close();
		    }
		
	}


