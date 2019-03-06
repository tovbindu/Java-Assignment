package package1;
import java.io.IOException;
import java.util.Scanner;

public class Assignmentexceptions1 {

static //	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner input = new Scanner(System.in);
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
			public static void main(String[] args) {
			System.out.print("Enter the current year");
			try {
				int a = input.nextInt();
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the joining year");
				int b = input.nextInt();
				check(a,b);
				throw new IOException("not valid");
				}catch (Exception x) {
					System.out.println(x);
					
			}
			}
			public static void check(int year,int jyear) {
				if (year-jyear>3) {
					System.out.println("The employee gets a bonus of 2500");
				}
				else {
					
					System.out.println("The employee doesn't get a bonus");
				}
				
			}
		   
			    

}