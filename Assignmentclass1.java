package package1;

import java.util.Scanner;

public class Assignmentclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	


