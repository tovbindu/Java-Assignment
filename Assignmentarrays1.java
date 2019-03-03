package assignmentpack1;

import java.util.Arrays;

public class Assignmentarrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
// SUM OF ELEMENTS OF AN ARRAY:

//		int a[] = {1,2,3,4,5};
//		 int s = 0;
//		for (int i = 0; i<a.length; i++) {
//			s = s + a[i];
//					
//				}
//		System.out.println(s);

//	AVERAGE VALUE OF ELEMENTS OF AN ARRAY:
//		int [] a = {11,22,33,44,55};
//		int s = 0;
//		float f;
//		for (int i = 0; i<a.length; i++){
//			s = s + a[i];
//		}
//		f = s/a.length;
//		System.out.println("The average of the given array is "+f);
	
//	MAX VALUE OF AN INTEGER ARRAY:
			int a[] = {34,45,76,67,89,21};
	         int m = a[0];
		for (int i = 1; i < a.length;i++) {
				if (a[i]>m) {
				m = a[i];
						}
			}
		System.out.println("The max. element of the array is " +m);
		
//	MIN VALUE OF AN INTEGER ARRAY:
		int b[] = {23,54,67,21,89,9,13};
		int x = b[0];
		for(int i = 1; i<b.length;i++) {
			if (b[i]<x) {
				x = b[i];
			}
		}
		System.out.println("The min element of the array is "+x);
		
	
		
		
		
	
	
	
	}
	
}

