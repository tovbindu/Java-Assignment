package package1;
//TODO Auto-generated method stub

//class Overload {
//	void test() {
//		System.out.println("No parameters");
//	}
//	void test(int a) {
//		System.out.println("a: "+a);
//	}
//	void test (int a, int b) {
//		System.out.println("a and b: "+a +" "+b);
//	}
//	double test(double a) {
//		System.out.println("double a: "+a);
//		return a*a;
//	}
//}
//
//public class OverloadDemo {
//
//	public static void main(String[] args) {
//		Overload x = new Overload();
//		x.test();
//		x.test(10);
//		x.test(10,20);
//		double result = x.test(123.25);
//		System.out.println("result of x.test(123.25): "+result);
//}
//}

//class BoxOverload{
//	double width;
//	double height;
//	double depth;
//	
//	BoxOverload(double w, double h, double d ){
//		width = w;
//		height = h;
//		depth = d;
//	}
//	BoxOverload(){
//		width = -1;
//		height = -1;
//		depth = -1;
//	}
//	BoxOverload(double len){
//		width = height = depth = len;
//	}
//	double volume() {
//		return width*height*depth;
//}
//}
//
//class OverloadDemo{
//	public static void main(String[]args) {
//		BoxOverload mybox1 = new BoxOverload(1,2,3);
//		BoxOverload mybox2 = new BoxOverload();
//		BoxOverload mycube = new BoxOverload(4);
//		double vol;
//		vol = mybox1.volume();
//		System.out.println("Volume of first box: "+vol);
//		vol = mybox2.volume();
//		System.out.println("Volume of second box: "+vol);
//		vol = mycube.volume();
//		System.out.println("Volume of cube: "+vol);
//	}
//}

//class Test{
//	int a; int b;
//	
//	Test(int i, int j){
//		a = i;
//		b = j;
//	}
//	boolean equalto(Test o) {
//		if(o.a == a||o.b == b) {
//			return true;
//			}
//		else {
//			return false;
//		}
//	}
//	}
//
//class OverloadDemo{
//	public static void main(String[]args) {
//		Test ob1 = new Test(-1,22);
//		Test ob2 = new Test(101,22);
//		Test ob3 = new Test(-1,33);
//		System.out.println("ob1==ob2: "+ob1.equalto(ob2));
//		System.out.println("ob2==ob3: "+ob2.equalto(ob3));
//		System.out.println("ob3 == ob1: "+ob3.equalto(ob1));
//	}
//}

//class Boxoverload{
//	double height;
//	double width;
//	double depth;
//	
//	Boxoverload(Boxoverload ob){
//		height = ob.height;
//		width = ob.width;
//		depth = ob.depth;
//	}
//	Boxoverload(double h, double w, double d){
//		height = h;
//		width = w;
//		depth = d;
//	}
//	Boxoverload(){
//		height = -1;
//		width = -1;
//		depth = -1;
//	}
//	Boxoverload(double len){
//		height = width = depth = len;
//	}
//	double volume() {
//		return height*width*depth;
//	}
//	
//}
//
//class OverloadDemo{ 
//	public static void main(String[]args) {
//		Boxoverload mybox1 = new Boxoverload(2,3,4);
//		Boxoverload mybox2 = new Boxoverload();
//		Boxoverload mycube = new Boxoverload(5);
//		Boxoverload myclone = new Boxoverload(mybox1);
//		double vol;
//		vol = mybox1.volume();
//		System.out.println("volume of first box: "+vol);
//		vol = mybox2.volume();
//		System.out.println("volume of second box: "+vol);
//		vol = mycube.volume();
//		System.out.println("volume of cube: "+vol);
//		vol = myclone.volume();
//		System.out.println("volume of clone: "+vol);
//	}
//}
