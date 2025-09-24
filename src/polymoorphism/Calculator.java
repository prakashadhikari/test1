package polymoorphism;

public class Calculator {
		// Method to add two integers
	    public int add(int a, int b) {
	        return a + b;
	    }

	    // Method to add three integers
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    // Method to add two double values
	    public double add(double a, double b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        Calculator calc = new Calculator();

	        // Using overloaded methods
	        System.out.println("Sum of 10 and 20 (int): " + calc.add(10, 20));
	        System.out.println("Sum of 10, 20, and 30 (int): " + calc.add(10, 20, 30));
	        System.out.println("Sum of 5.5 and 3.2 (double): " + calc.add(5.5, 3.2));
	    }
	}

	


