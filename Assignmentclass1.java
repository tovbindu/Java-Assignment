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

public class Assignmentclass1{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Marital status of the driver: ");
		String MS = input.next();
		System.out.println("The Marital Status of the driver is " +MS);
		
		if (MS == "Married"){
			System.out.println("The driver is insured");
			}
		else{
		System.out.print("Enter the Age of the Driver: ");
		int Age = input.nextInt();
		System.out.print("Enter the sex of the driver: ");
		String Sex = input.next();
		System.out.println("The age of the driver is " +Age);
		System.out.println("The Sex of the driver is " +Sex);
		
		if ((Sex == "Male")&&(Age > 30)){
				 System.out.println("The driver is insured");
				}
		 if((Sex == "Female")&&(Age > 25)){
				System.out.println("The driver is insured");
					}
		
			System.out.println(" The driver is not insured");
			}
		
			}
		}
	

