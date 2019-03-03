package packageone;

//FOR LOOP:
//public class Loop {
//
//		public static void main(String[] args) {
//		// TODO Auto-generated method stub
//for (int i = 1; i<=10; i++){
//	System.out.println(i);
//}
//	}
//
//}
//public class Loop{
//	public static void main(String []args){
//		for(int i = 1; i<=5; i++){
//			System.out.println("Java");
//		}
//	}
//}
//public class Loop{
//	public static void main(String []args){
//		for (int i = 5; i >=1; i--){
//			System.out.println("Java: "+i);
//		}
//	}
//}
//public class Loop{
//	public static void main(String []args){
//		for(int i = 1; i<=10; i++){
//			if (i!=5){
//				System.out.println(i);
//			}
//			}
//		System.out.println("out of the loop");
//	}
//}
//public class Loop{
//	public static void main(String[]args){
//		for(int i = 1; i<=10; i++){
//			if ((i != 3)&&(i!=8)){
//				System.out.println(i);
//			}
//			else{
//				System.out.println("java: "+i);
//			}
//		}
//	}
//}
//WHILE LOOP:
//public class Loop{
//	public static void main(String []args){
//		int i = 1;
//		while (i<=10){
//			System.out.println(i);
//			i++;
//		}
//	}
//}
//public class Loop{
//	public static void main(String[]args){
//		int i =10;
//		while (i>=1){
//			System.out.println(i);
//			i--;
//		}
//	}
//}
//public class Loop{
//	public static void main(String []args){
//	int	i = 1;
//		while (i<=10){
//			if (i!=5){
//				System.out.println(i);
//				}
//			else {
//				System.out.println("java: "+i);
//			}
//			i++;
//		}
//	}
//}
//USING 'BREAK' IN FOR LOOP:
//public class Loop{
//	public static void main(String[]args){
//		for (int i = 10; i>=1; i--){
//			if (i == 5){
//				System.out.println("Loop will break "+i);
//				break;
//			}
//			System.out.println(i);
//		}
//		System.out.println("outside the Loop");
//	}
//}
//public class Loop{
//	public static void main(String[]args){
//	for (int i = 1; i<=10;i++){
//		if (i==8){
//			break;
//		}
//		System.out.println(i);
//	}
//}
//}
//CONTINUE:
//public class Loop{
//	public static void main(String []args){
//		for (int i = 1; i <=10; i++){
//			if (i ==6){
//				continue;
//			}
//			System.out.println(i);
//		}
//	}
//}
//public class Loop{
//	public static void main(String []args){
//		for(int i = 1; i<=3; i++){
//			for(int j = 1; j<=3; j++){
//			System.out.println(i+ " " +j);	
//			}
//			}
//	}
//}
//LABELLING OUTERLOOP AND INNERLOOP:
//public class Loop{
//	public static void main(String []args){
//	aa:	for (int i = 1; i<=3; i++){
//		bb:	for (int j = 1; j<=3; j++){
//			if ((i == 2)&&(j ==2)){
//				break aa;
//			}
//			System.out.println(i+ " " +j);
//		}
//		}
//	}
//}
//public class Loop{
//	public static void main(String []args){
//	aa:	for (int i = 1; i<=3; i++){
//		bb:	for (int j = 1; j<=3; j++){
//			if ((i == 2)&&(j ==2)){
//				break bb;
//			}
//			System.out.println(i+ " " +j);
//		}
//		}
//	}
//}
//ENHANCED FOR LOOPS:
//public class Loop{
//	public static void main(String[]args){
//		char[] vowels = {'a','e','i','o','u'};
//		System.out.println(vowels);
//		for (char x: vowels){
//			System.out.println(x);
//		}
//	}
//}