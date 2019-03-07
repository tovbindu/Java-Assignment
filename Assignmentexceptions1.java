package package1;
import java.io.IOException;
import java.util.Scanner;

public class Assignmentexceptions1 {

//static //	public static void main(String[] args) {
		// TODO Auto-generated method stub
//EVEN OR ODD NUMBER:		

//			Scanner input = new Scanner(System.in);
//			System.out.print("Enter an integer");
//			try {
//				int a = input.nextInt();
//				if(a%2 == 0) {
//					System.out.println("The entered value is an even number");
//				}
//				else {
//					System.out.println("The entered value is an odd number");
//				}
//			}catch(Exception x) {
//				System.out.println("The entered value is not valid");
//				
//				System.out.println(x);
//				x.printStackTrace();


// EMPLOYEE BONUS:
//			public static void main(String[] args) {
//			System.out.print("Enter the current year");
//			try {
//				int a = input.nextInt();
//				Scanner input = new Scanner(System.in);
//				System.out.print("Enter the joining year");
//				int b = input.nextInt();
//				check(a,b);
//				}catch (Exception x) {
//					System.out.println("The values entered are invalid");
//							}
//			}
//			public static void check(int year,int jyear) {
//				if (year-jyear>3) {
//					System.out.println("The employee gets a bonus of 2500");
//				}
//				else {
//					
//					System.out.println("The employee doesn't get a bonus");
//				}
//				
//			}

//FACTORIAL OF A NUMBER:
		   
//	public static void main(String[]args) {
//	Scanner input = new Scanner(System.in);
//	System.out.print("Enter any number");
//	try {
//		int a = input.nextInt();
//		validate(a, a, a);
//	}catch (Exception x) {
//		System.out.println("The number entered is invalid");
//		
//	}
//	
//		}
//	public static int validate(int fact, int y,int i) {
//		fact = 1;
//		for(i = 1; i<=y;i++) {
//			fact = fact*i;
//					}
//		System.out.println("The factorial of the number "+y+"is " +fact);
//		return fact;
//		
//	}
//


// STUDENT MARKS:
public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the marks in S1");
	try {
		float a = input.nextFloat();
		System.out.print("Enter the marks in S2");
		float b = input.nextFloat();
		System.out.print("Enter the marks in S3");
		float c = input.nextFloat();
		String z = null;
		String y = validate(a,b,c, c, c, z);
		System.out.println("The student obtained "+y + "division");
		}catch(Exception e) {
			System.out.println("The marks entered are invalid");
		}
	
}

public static String validate(float S1,float S2,float S3,float t,float p, String S) {
	t = S1+S2+S3;
	p = (t/300)*100;
	if (p>= 60) {
	 S = "First";
	}
	else if((p<=59)&&(p>=50)) {
		 S = "Second";
	}
	else if ((p<=49)&&(p>=40)) {
		 S = "Third";
	}
	else {
		 S = "Fail";
	}
	return S;
}
}