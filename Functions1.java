package package1;

public class Functions1 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Before function");
//		javaclass();
//		pythonclass();
//		rubyclass();
//		System.out.println("After function");
//	}
//		public static void javaclass() {
//			System.out.println("I am learning Java");
//		}
//		
//public static void pythonclass() {
//	System.out.println("I am learning Python");
//}
//public static void rubyclass() {
//	System.out.println("I am learning Ruby");
//}
	
//	public static void main(String[] args) {
//		jclass("java");
//		jclass("Python");
//		jclass("Ruby");
//		otherlang("Java"," Selenium"," Pearl");
//	}
//	
//	public static void jclass(String s) {
//		System.out.println("I am learning "+s);
//	}
//	public static void otherlang(String s1, String s2, String s3) {
//		System.out.println("I am learning " +s1 +s2 +s3);
//	}
	
//	public static void main(String[]args) {
//		double r = 12.5;
//		getarea(r);
//	}
//	public static void getarea(double r) {
//		double a = r*r*3.14;
//		System.out.println("The area of the given circle is "+a);
//		}
	
//	public static void main(String[]args) {
//		double d = 24;
//		getarea(d);
//				}
//	public static void getarea(double d) {
//		double a = d*d*3.14/4;
//		System.out.println("The area of the given circle is "+a);
//		System.out.println("Price per area is "+a*10);
//	}
	
//	public static void main(String[]args) {
//		double r = 5;
//		double price = getarea(r);
//		double p = price * 4000;
//		System.out.println("The price per area is "+p);
//	}
//	public static double getarea(double r) {
//		double area = r* r* Math.PI;
//		return area;
//	}
	
//	public static void main(String []args) {
//		int c, d;
//		c = add(15,12);
//		d = add(4000,5000);
//		System.out.println(c*10);
//		System.out.println(d);
//		}
//	public static int add(int a,int b) {
//	int result = a + b;
//	return result;
//	}
	
//	public static void main(String[]args) {
//	    
//		rank(1498);
//	    }
//	public static void rank(int m) {
//		if (m >= 600) {
//			System.out.println("The Student achieved a grade A");
//		}
//		else if ((m >400)&&(m<600)) {
//			System.out.println("The student achieved a grade B");
//		}
//		else {
//			System.out.println("The student achieved a grade C");
//		}
//	}
	
//	public static void main(String[]args) {
//		grade(1500);
//		String Rank = grade(1500);
//		System.out.println(Rank);
//	}
//	public static String grade(int m) {
//		if(m >= 600) {
//			String r = "A";
//			return r;
//		}
//		else if ((m < 600)&& (m>400)) {
//			String r = "B";
//			return r;
//		}
//		else {
//			String r = "C";
//			return r;
//		}
//	}
	
//	public static void main(String[] args) {
//		String[] a = {"abc", "def","ghi","jkl"};
//		name(a);
//	}
//public static void name(String[]a) {
//	System.out.println(a[0]);
//}

	public static void main(String[]args) {
		add(1000);
		add(1000,2000);
		add(1000,2000,3000);
		System.out.println("After Execution");
		double a = 5000;
		double b = 5000;
		add(a,b);
	}
public static void add(int a) {
	 int result = a + 10;
	System.out.println("Output with one parameter is" + result);
}
public static void add(int a, int b, int c) {
	int result = a+b+c;
	System.out.println("Output with three parameters is "+result);
}
public static void add(int a, int b) {
	int result  = a + b;
	System.out.println("Output with two parameters is "+result);
}
public static void add(double a, double b) {
	double result = a+b;
	System.out.println("Output of double parameters is "+result);
}
}