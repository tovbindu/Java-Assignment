package corejavapack2;

import java.util.Arrays.sort;


//public class Arrays {

//		public static void main(String[] args) {
		// TODO Auto-generated method stub
//			int a[] = new int [4];
//			a[0] = 0;
//			a[1] = 10;
//			a[2] = 20;
//			a[3] = 30;
//			System.out.println(a[0]);
//			System.out.println(a[2]);
//			System.out.println(a[1]+a[3]);
			
//			char[] a = {'A','B','C','D'};
//			int[] b = {10,20,30,40};
//			String[]c = {"Selenium","Java","Ruby","Python"};
//			float[] d = {34.56f,78.43f,10.0f,2.3f};
//			boolean[]e = {true,false,true,true};
//			System.out.println(a[2]);
//			System.out.println(b[1]);
//			System.out.println(c[0]);
//			System.out.println(d[3]);
//			System.out.println(e[4]);
			
//			int[] a1 = {23,34,56,12,78,32};
//			System.out.println(a1.length);
//			for(int i = 0; i<a1.length;i++){
//				System.out.println(a1[i]);
//			}
//			int[]a2 = a1;
//				System.out.println(a1 == a2);
//			int[] a2 = new int[a1.length];
//			for (int i = 0; i<a1.length; i++){
//				System.out.println(a1[i]);
//				a2[i] = a1[i];
//						}
//						for (int i = 0; i<a2.length;i++){
//				System.out.println(a2[i]);
//			}

//			ENHANCED LOOP:
//			char[]vowels = {'a','e','i','o','u'};
//			for(int i = 0; i<vowels.length; i++){
//			System.out.println(vowels[i]);
//			}
//			for (char x: vowels){
//				System.out.println(x);
//			}
	public class Arrays1{
		public static void main(String[]args){
//		String[] s = {"Ruby", "Pearl","Python", "Java","Selenium"};
//		for(String x: s){
//			System.out.println(x);
//		}
			
//			int[]a1 = {12,13, 14,15,16,17};
//			int[]a2 = {2,3,4,5,6, 7};
//		System.arraycopy(a1,2,a2,3,3);
//		for (int i = 0; i<a2.length;i++){
//			System.out.println(a2[i]);
//		}
			
		String[] a1 = {"Ruby", "Pearl", "Java"};
	String s = Arrays.tostring(a1);
		System.out.println(s);
		
//			ArrayList<Integer> arrL = new ArrayList<Integer>(3);
//			arrL.add(1);
//			arrL.add(2);
//			arrL.add(3);
//			arrL.add(4);
//			arrL.add(5);
//			arrL.add(6);
//			System.out.println(arrL.get(4));
//			System.out.println(arrL);
//			System.out.println(arrL.size());
			
		int[] a = {13,35, 21, 76,12};
		Arrays.sort(a);
		for(int i = 0; i<a.length;i++){
			System.out.println(a[i]);
			
		}
		}

		
		}
		

	
