package assignmentpack1;

import java.util.Arrays;
public class Assignmentfunctions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					int a[]  = {69,72,39,78,5};
		        int max = getmax(a);
		         System.out.println("The max element of the aray is "+max);
		         int min = getmin(a);
		         System.out.println("The min element of the array is "+min);
			}

				public static int getmax(int[]a) {
					int m = a[0];
					for (int i = 1; i<a.length; i++) {
						if (a[i]>m) {
							m = a[i];
						}
					}
					return m;
				}
				
				public static int getmin(int[]a) {
					int m = a[0];
					for (int i = 1; i<a.length;i++) {
						if (a[i]<m) {
							m = a[i];
						}
					}
					return m;
				}
				
	

	}


