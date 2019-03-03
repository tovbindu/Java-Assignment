package corejavapack1;

//public class IF_ELSE {
//
//		public static void main(String[] args) {
//		// TODO Auto-generated method stub
//int a = 10, b = 20;
//if (a == b){
//	System.out.println("a and b are equal");
//}
//    System.out.println("a and b are not equal");
//	}
//
//}
//public class IF_ELSE{
//	public static void main(String []args){
//		int a = 15, b = 10;
//		if (a > b){
//			System.out.println("a is a big number");
//		}
//		System.out.println("Exit");
//	}
//}
//public class IF_ELSE{
//	public static void main(String []args){
//	int a = 100, b = 50;
//	if(a>b){
//		System.out.println("A is a big number");
//	}else{
//		System.out.println("B is a big number");
//	}
//	System.out.println("Exit statement");
//	}
//}

//ELIF CONDITION (MULTIPLE CONDITION STATEMENTS)
//public class IF_ELSE{
//	public static void main(String []args){
//		int a = 25, b = 50;
//		if (a>b){
//			System.out.println("A is big number");
//			}
//		else if (a == b){
//			System.out.println("A and B are equal");
//			}
//		else {
//			System.out.println("A is a small number");
//		}
//	System.out.println("Exit Statement");
//	}
//}
//MULTIPLE IF CONDITIONS:

//public class IF_ELSE{
//	public static void main(String[] args){
//		int a = 10, b = 15;
//		if (a<b){
//			if (a<5){
//				System.out.println("A is a smaller number");
//			}
//			else {
//				System.out.println("A is a small number");
//			}
//		}
//			System.out.println("Exit Statement");
//		
//	}
//}

//SWITCH CASE:
//public class IF_ELSE{
//	public static void main(String []args){
//	int a = 40;
//	switch (a){
//	case 10:
//		System.out.println("excellent");
//		break;
//	case 20:
//		System.out.println("Very Good");
//		break;
//	case 30:
//		System.out.println("Better");
//		break;
//	default:
//		System.out.println("Invalid Grade");
//		
//	}
//	System.out.println("Exit Statement");
//	}
//}
//MULTIPLE SWITCH CONDITIONS:
public class IF_ELSE{
	public static void main(String[]args){
		String a = "Excellent";
		int marks = 80;
		switch (a){
		case "Excellent":
			switch (marks){
			case 80:
				System.out.println("First Division");
				break;
			case 70:
				System.out.println("Second Division");
				break;
			case 60:
			    System.out.println("Third Division");
			    break;
			 default:
				 System.out.println("Invalid Grade");
				 }
			System.out.println("Excellent Grades");
			break;
		case "very good":
			System.out.println("Very Good Grades");
			break;
		default:
			System.out.println("Average Grades");
		
	}
}
}

