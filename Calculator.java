//simple calculator that can add, subtract, multiply, divide, and calculate exponent
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ans = "";
		System.out.println("Welcome to Calculator\nWhat would you like to do?\n(math/exit)");
		do {
			ans = scan.next();
			if(ans.equalsIgnoreCase("math")){
				System.out.println("Enter operation:\n(add/subtract/multiply/divide/exponent)");
				String op = scan.next();
				switch(op.toLowerCase()){
				case "add":
					add(getSize());
					System.out.println("What else would you like to do?\n(math/exit)");
					break;
				case "subtract":
					subtract(getSize());
					System.out.println("What else would you like to do?\n(math/exit)");
					break;
				case "divide":
					divide();
					System.out.println("What else would you like to do?\n(math/exit)");
					break;
				case "multiply":
					multiply(getSize());
					System.out.println("What else would you like to do?\n(math/exit)");
					break;
				case "exponent":
					exponent();
					System.out.println("What else would you like to do?\n(math/exit)");
					break;
				default:
					System.out.println("Invalid answer.");
					System.out.println("What else would you like to do?\n(math/exit)");
				}
			} else if(ans.equalsIgnoreCase("exit")) {
				ans = "exit";
			}
		} while(!ans.equalsIgnoreCase("exit"));
		System.out.println("Bye");
	}
	public static double[] getSize() {
		Scanner scan = new Scanner(System.in);
		int size = 0;
        System.out.println("Please enter the number of digits:");
		while(!scan.hasNextInt()){
    		System.out.println("Bad input. Please enter a valid integer.");
    		scan.next();
    	}
		size = scan.nextInt();
        double[] numbers = new double[size];
        return numbers;
	}
	public static void add(double[] numbers) {
        Scanner in = new Scanner(System.in);
		System.out.println("Please enter the numbers you want to add.");
        for(int i = 0; i < numbers.length; i++) {
        	if(!in.hasNextDouble()){
        		System.out.println("Bad input.");
        		break;
        	} else {
        		numbers[i] = in.nextDouble();
        	}
        }
        double all = numbers[0];
        for(int i = 1; i<= numbers.length-1; i++) {
            all += numbers[i];
        }
        System.out.println("The total is: " + all);
	}
	public static void multiply(double[] numbers){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the numbers you want to multiply.");
        for(int i = 0; i < numbers.length; i++) {
        	if(!in.hasNextDouble()){
        		System.out.println("Bad input.");
        		break;
        	} else {
        		numbers[i] = in.nextDouble();
        	}
        }
        double all = numbers[0];
        for(int i = 1; i<= numbers.length-1; i++) {
            all *= numbers[i];
        }
        System.out.println("The total is: " + all);
	}
	public static void subtract(double[] numbers){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the numbers you want to subtract.");
        for(int i = 0; i < numbers.length; i++) {
        	if(!in.hasNextDouble()){
        		System.out.println("Bad input.");
        		break;
        	} else {
        		numbers[i] = in.nextDouble();
        	}
        }
        double all = numbers[0];
        for(int i = 1; i<= numbers.length-1; i++) {
            all -= numbers[i];
        }
        System.out.println("The total is: " + all);
	}
	public static void divide(){
		Scanner in = new Scanner(System.in);
		double div;
		double den;
		System.out.println("Please enter the number you want to divide.");
		if(!in.hasNextDouble()){
    		System.out.println("Bad input.");
    		return;
    	} else {
    		div = in.nextDouble();
    	}
		System.out.println("Please enter the denominator.");
		if(!in.hasNextDouble()){
    		System.out.println("Bad input.");
    		return;
    	} else {
    		den = in.nextDouble();
    	}
        System.out.println("The total is: " + div/den);
	}
	public static void exponent() {
		Scanner in = new Scanner(System.in);
		double base;
		double exp;
		System.out.println("Please enter the base number.");
		if(!in.hasNextDouble()){
    		System.out.println("Bad input.");
    		return;
    	} else {
    		base = in.nextDouble();
    	}
		System.out.println("Please enter the exponent.");
		if(!in.hasNextDouble()){
    		System.out.println("Bad input.");
    		return;
    	} else {
    		exp = in.nextDouble();
    	}
        System.out.println("The total is: " + Math.pow(base, exp));
	}
}
