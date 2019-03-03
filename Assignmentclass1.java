package assignmentpack;

import java.util.Scanner;

//EMPLOYEE BONUS:

//public class Assignmentclass1 {
//
//		public static void main(String[] args) {
//		// TODO Auto-generated method stub
//			Scanner input = new Scanner(System.in);
//			System.out.print("Enter the current year: ");
//			int year = input.nextInt();
//			System.out.println("The current year is: " +year);
//			
//			System.out.print("Enter the joining year of the employee: ");
//			int jyear = input.nextInt();
//			System.out.println("The joining year of the employee is: " +jyear);
//			int service = (year - jyear);
//			if (service>3){
//				System.out.println("Employee gets a bonus of Rs.2500");
//			}
//			else {
//			System.out.println("Quit");
//			}
//			}
//}

//STUDENT MARKS:
//
//public class Assignmentclass1{
//	public static void main(String [] args){
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the marks in S1: ");
//		float S1 = input.nextFloat();
//		System.out.print("Enter the marks in S2: ");
//		float S2 = input.nextFloat();
//		System.out.print("Enter the marks in S3: ");
//		float S3 = input.nextFloat();
//		System.out.print("Enter the marks in S4: ");
//		float S4 = input.nextFloat();
//		System.out.print("Enter the marks in S5: ");
//		float S5 = input.nextFloat();
//		System.out.println("The marks obtained in S1: " +S1);
//		System.out.println("The marks obtained in S2: " +S2);
//		System.out.println("The marks obtained in S3: " +S3);
//		System.out.println("The marks obtained in S4: " +S4);
//		System.out.println("The marks obtained in S5: " +S5);
//		float T = (S1+S2+S3+S4+S5);
//		float P = (T/500)*100;
//		System.out.println("The percentage obtained is " +P);
//		if (P>=60){
//			System.out.println("The Student obtained First Division");
//			}
//		else if (P>=50 && P<=59) {
//			System.out.println("The Student obtained Second Division");
//			}
//		else if (P >= 40 && P <= 49){
//			System.out.println("The Student obtained Third Division");
//		}
//		else if (P < 40) {
//			System.out.println(" The Student has Failed");
//		}
//	}
//}
//DRIVER INSURANCE:
//
public class Assignmentclass1{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Age of the Driver: ");
         int Age = input.nextInt();
        System.out.print("Enter the sex of the driver: ");
       String Sex = input.next();
       	System.out.print("Enter the Marital status of the driver: ");
		String MS = input.next();
		System.out.println("The age of the driver is " +Age);
	    System.out.println("The Sex of the driver is " +Sex);
		System.out.println("The Marital Status of the driver is " +MS);
		if (MS == "Married"){
			System.out.println("The driver is insured");
			}
		     
		else if ((MS == "UnMarried")&&(Sex == "M")&&(Age > 30)){
				 System.out.println("The driver is insured");
				}
		else if((MS == "UnMarried")&&(Sex == "F")&&(Age > 25)){
				System.out.println("The driver is insured");
					}
		else{
			System.out.println(" The driver is not insured");
			}
		
			}
		}
//PROFIT AND LOSS OF SHOPKEEPER:
//
//public class Assignmentclass1{
//	public static void main(String []args){
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the Cost price of the item: ");
//		double CP = input.nextDouble();
//		System.out.print("Enter the Selling Price of the item: ");
//		double SP = input.nextDouble();
//		System.out.println("The Cost price of the item is "+CP);
//		System.out.println("The Selling Price of the item is "+SP);
//		double L = CP - SP;
//		double P = SP - CP;
//		if (CP >= SP){
//			System.out.println("The shopkeeper has incurred a loss of " +L);
//			}
//		else {
//			System.out.println("The shopkeeper has incurred a profit of " +P);
//		}
//	}
//}
// EVEN AND ODD NUMBERS:
//
//public class Assignmentclass1{
//	public static void main(String [] args){
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter any integer: ");
//		int a = input.nextInt();
//		System.out.println("The number entered is "+a);
//		if (a%2 == 0){
//			System.out.println("This number is an Even number");
//			}
//		else{
//			System.out.println("This number is an Odd number");
//		}
//	}
//}
//LEAP YEAR:
//
//	public class Assignmentclass1{
//		public static void main(String []args){
//			Scanner input = new Scanner(System.in);
//			System.out.print("Enter any year: ");
//			int year = input.nextInt();
//			System.out.println("The year entered is "+year);
//			if (year%4 == 0){
//				System.out.println("This year is a Leap Year");
//			}
//			else{
//				System.out.println("This year is NOT a Leap Year");
//			}
//		}
//	}	
//YOUNGEST OF THREE:
//public class Assignmentclass1{
//	public static void main(String []args){
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the age of Ram: ");
//		int Ram = input.nextInt();
//		System.out.print("Enter the age of Shyam: ");
//		int Shyam = input.nextInt();
//		System.out.print("Enter the age of Ajay: ");
//		int Ajay = input.nextInt();
//		System.out.println("The age of Ram is " +Ram);
//		System.out.println("The age of Shyam is " +Shyam);
//		System.out.println("The age of Ajay is " +Ajay);
//		if ((Ram < Shyam) && (Ram < Ajay)){
//			System.out.println("Ram is the youngest");
//		}
//			else if ((Shyam < Ram)&& (Shyam < Ajay)){
//			System.out.println("Shyam is the youngest");	
//			}
//			else{	
//		System.out.println("Ajay is the youngest");
//			}
//	}
//}
//VALIDITY OF A TRIANGLE:
//public class Assignmentclass1{
//	public static void main(String []args){
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the Angle1 of the triangle: ");
//		float A1 = input.nextFloat();
//		System.out.print("Enter the Angle2 of the triangle: ");
//		float A2 = input.nextFloat();
//		System.out.print("Enter the Angle3 of the triangle: ");
//		float A3 = input.nextFloat();
//		System.out.println("The Angle1 of the triangle is " +A1);
//		System.out.println("The Angle2 of the triangle is " +A2);
//		System.out.println("The Angle3 of the triangle is " +A3);
//		if (A1+A2+A3 == 180){
//			System.out.println("The triangle is valid");
//			}
//		else{
//			System.out.println("The triangle is invalid");
//		}
//	}
//}
//ABSOLUTE VALUE OF A NUMBER:(WORKS FOR DOUBLE,FLOAT AND INTEGER)
//
//public class Assignmentclass1{
//	public static void main(String []args){
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter any number: ");
//		double a = input.nextDouble();
//		System.out.println("The number entered is "+a);
//		System.out.println("Absolute value of this number is " + Math.abs(a));
//	}
//}
//REVERSE OF A NUMBER:
//public class Assignmentclass1{
//	public static void main(String[]args){
//		Scanner input = new Scanner(System.in);
//		int num = 0;
//		int rnum = 0;
//		System.out.print("Enter any number: ");
//		num = input.nextInt();
//		System.out.println("The number entered is "+num);
//		for (;num != 0;){
//			 rnum = rnum *10;
//			 rnum = rnum + num%10;
//			 num = num/10;
//			 }
//		System.out.println("Reverse of the entered number is " +rnum);
//		}
//}
