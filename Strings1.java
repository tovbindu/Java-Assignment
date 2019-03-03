package package1;

public class Strings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder s2 = new StringBuilder("Java");
//		s2.append("Selenium");
//		System.out.println("StringBuilder: "+s2);
//		StringBuffer s3 = new StringBuffer("Selenium");
//		s3.append("Java");
//		System.out.println("StringBuffer: "+s3);
//		s3.reverse();
//		System.out.println("reverse of a string:"+s3);
		
//		String s1 = "Selenium@gmail.com";
//		System.out.println(s1.contains("gmail"));
//		System.out.println(s1.contains("ava"));
		
//		String s1 = "Selenium";
//		String s2 = "SELENIUM";
//		String s3 = "selenium";
//		String s4 = "SELEnium";
//		String s5 = "selenium";
//		System.out.println(s1.compareTo(s3));
//		System.out.println(s3.compareTo(s5));
//		System.out.println(s1.equalsIgnoreCase(s2));
//		System.out.println(s1.toUpperCase());
//		System.out.println(s2.toLowerCase());
		
		StringBuilder s1 = new StringBuilder("selenium");
		s1.insert(0,"SS");
		System.out.println(s1);
		s1.replace(0, 3,"s");
		System.out.println(s1);
		
		

	}

}
