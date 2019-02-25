package assignmentpack;

import java.util.Scanner;

public class Assignmentloop {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int a = input.nextInt();
		System.out.println("The number entered is " +a);
		int fact = 1;
		for(int i= 1; i<=a; i++){
			fact = fact *i;
		}
		System.out.println("the factorial of the number "+ a + " is " +fact);

	}

}
