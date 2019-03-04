package package1;

import java.util.Arrays;
import java.util.Scanner;

public class Assignmentfunctions1 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] a = {1,2,3,4,5};
//		int index = findindex(a);
//		System.out.println("The index of the given element is "+index);
//}
//	
//	public static int findindex(int[]a, int k) {
//		if (a == null) {
//			return -1;
//		}
//		
//		for (int i = 0; i<a.length;) {
//			if (a[i] == k){
//				return i;
//			}
//			else {
//				i++;
//			}
//			return -1;
//		}
//	}
	
//	public static void main(String[]args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the current year ");
//		int a = input.nextInt();
//	    System.out.print("Enter the joining year: ");
//	    int b = input.nextInt();
//	    service(a,b);
//	    }
//	
//	public static void service(int a, int b) {
//		if ((a-b)>3) {
//			System.out.println("Employee gets a bonus of 2500");
//		}
//		else {
//			System.out.println("Employee doesn't get a bonus");
//		}
	
//	public static void main(String[]args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter marks in S1: ");
//		float S1 = input.nextFloat();
//		System.out.print("Enter marks in S2: ");
//		float S2 = input.nextFloat();
//		System.out.print("Enter marks in S3: ");
//		float S3 = input.nextFloat();
//		division(S1,S2,S3);
//		
//	}
	
//	public static void division(float S1,float S2,float S3) {
//		float a = ((S1+S2+S3)/300)*100;
//		System.out.println("The percentage obtained is "+a);
//		if (a>= 60) {
//			System.out.println("The student obtained first division");
//		}
//			else if ((a<=59)&&(a>=50)) {
//				System.out.println("The student obtained second division");
//			}
//			else if ((a<=49)&&(a>=40)) {
//				System.out.println("The student obtained third division");
//		}
//			else {
//				System.out.println("The student has failed");
//			}
//	}
	
//	public static void main(String []args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the Cost Price of the item: ");
//		double CP = input.nextDouble();
//		System.out.print("Enter the Selling Price of the item: ");
//		double SP = input.nextDouble();
//		price(CP,SP);
//		
//		}
//	
//	public static void price(double CP,double SP) {
//		double L = CP-SP;
//		double P = SP-CP;
//		if (CP>SP) {
//			System.out.println("The shopkeeper incurred a loss of "+L);
//		}
//		else {
//			System.out.println("The shopkeeper incurred a profit of "+P);
//		}
//	}
	
//	public static void main(String[]args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter any number: ");
//		int num = input.nextInt();
//		check(num);
//	}
//	
//	public static void check(int num) {
//		if (num%2 == 0) {
//			System.out.println("The given number is an even number");
//		}
//		else {
//			System.out.println("The given number is an odd number");
//		}
//	}
	
//public static void main(String[]args) {
//	Scanner input = new Scanner(System.in);
//	System.out.print("Enter any year: ");
//	int y = input.nextInt();
//	check(y);
//}
//public static void check(int y) {
//	if (y%4 == 0) {
//		System.out.println("The year is a leap year");
//			}
//	else {
//		System.out.println("The year is not a leap year");
//	}
//}
	
//	public static void main(String[]args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter any number ");
//		int num = input.nextInt();
//	    int r = check(num, num);
//	    System.out.println("The reverse of the given number is "+r);
//				
//	}
//	public static int check(int num, int rnum) {
//		 rnum = 0;
//		for (;num != 0;) {
//			rnum = rnum*10;
//			rnum = rnum+num%10;
//			num = num/10;
//					}
//		
//		return rnum;
//	}
	
//	public static void main(String[]args) {
//		int[] a = {1,2,3,4,5};
//	int x =	add(a);
//	System.out.println("The sum of the elements of the array is "+x);
//	}
//	
//	public static int add(int[]a) {
//		int s = 0;
//		for (int i = 0;i<a.length;i++) {
//			s = s+a[i];
//		}
//		return s;
//	}
	
//	public static void main(String[]args) {
//		int[] b = {11,22,33,44,55};
//		int z = ave(b);
//		System.out.println("The average of the elements of the array is "+z);
//	}
//	
//	public static int ave(int[]b) {
//		int s = 0; int r = 0; int i = 0;
//		for (i = 0;i<b.length;i++) {
//			s = s+b[i];
//			}
//		r = s/i;
//		return r;
//	}
	
	public static void main(String[]args) {
		int[] a = {34,45,72,56,10};
		int max = getmax(a);
		System.out.println("The max of the elements of the array is "+max);
		int min = getmin(a);
		System.out.println("The min of the elements of the array is "+min);
				}
	public static int getmax(int[]a) {
		int m = a[0];
		for (int i = 1; i<a.length;i++) {
			if (a[i]>m) {
				m = a[i];
			}
			}
		return m;
		
	}
	public static int getmin(int[]a) {
		int m = a[0];
		for (int i = 1;i<a.length;i++) {
			if(a[i]<m) {
				m = a[i];
			}
		}
		return m;
	}
}

