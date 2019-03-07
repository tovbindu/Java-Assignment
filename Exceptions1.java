package package1;

import java.io.IOException;

public class Exceptions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a = 10/0;
//System.out.println(a);
//System.out.println("Getting Exceptions");
		
//		int[] a = {1,2};
//		a[50] = 100;
//		System.out.println(a[50]);
//		System.out.println("Getting Exception");
		
//		String s = "xyz123";
//		int a = Integer.parseInt(s);
//		System.out.println(a);
		
//		int[] a = new int[5];
//		a[6] = 10;
//		System.out.println(a[6]);
		
//		int a = 5;
//		int b = 0;
//		int result;
//		try {
//			result = a/b;
//			System.out.println(result);
//		} catch (ArithmeticException x) {
//			System.out.println("Divided by zero error");
//			
//		}
//		
//		System.out.println("Java");
//		System.out.println("Selenium");
		
//		int a  =20;
//		int b = 0;
//		int result;
//		try {
//			result = a/b;
//			System.out.println(result);
//		}catch (ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println("Divided by zero error");
//		}
//		System.out.println("Java");
//		System.out.println("Selenium");
		
		int a = 10;
		int b = 0;
		int result;
		int a1[] = new int[5];
//		try {
//			result = a/b;
//			System.out.println(result);
//		} catch(ArithmeticException x) {
//			x.printStackTrace();
//			System.out.println("Divided by zero error");
//		}
//		try {
//		 a1[10] = 100;
//		 System.out.println(a1[10]);
//			} catch(ArrayIndexOutOfBoundsException y) {
//				y.printStackTrace();
//				System.out.println("Out of Bounds error");
//			}
//		System.out.println("Java");
//		System.out.println("Selenium");
		
//		try {
//			result = a/b;
//					}catch(Exception x) {
//						System.out.println("abcd");
//						x.printStackTrace();
//					}
//		try {
//			a1[10] = 100;
//		}catch(Exception x) {
//			System.out.println("def");
//			x.printStackTrace();
//		}
//		System.out.println("Java");
		
//		try {
//			result = a/b;
//		}catch(Exception x) {
//			System.out.println(x);
//		}
//		try {
//			a1[10] = 100;
//		}catch(Exception x) {
//			System.out.println(x);
//		}
//		finally {
//			System.out.println("Finally is always printed");
//		}
//		System.out.println("The End");
		
		try {
			result = a+b;
			System.out.println(result);
		}
			catch(Exception e) {
			System.out.println("abcd");
		}
		try {
			a1[10] = 100;
		}catch(Exception x) {
			System.out.println("def");
		}
		finally {
			System.out.println("Finally is always printed");
		}
		System.out.println("The End");
		
//		try {
//			int age = 10;
//			if (age <18) {
//				throw new NullPointerException("no");
//			}
//			}catch(NullPointerException x) {
//				System.out.println(x);
//			}
//		try {
//			throw new IOException("not valid");
//		}catch (IOException x) {
//			x.printStackTrace();
//		}
//	}
	
//		public static void main(String[] args) {
//		try {
//			validate(10);
//		}catch(ArithmeticException x) {
//			x.printStackTrace();
//			System.out.println("Welcome to Exception");
//		}
//		}
//		static void validate(int age) {
//			if (age<18) {
//				throw new ArithmeticException ("not valid");
//				}
//			else {
//				System.out.println("Eligible to vote");
//			}
//		}

}
}

