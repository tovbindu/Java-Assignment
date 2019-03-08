package package1;
//TODO Auto-generated method stub

//class A1{
//	int i, j;
//	
//	void showij() {
//		System.out.println("i and j:"+i+" "+j);
//	}
//	}
//class B1 extends A1{
//	int k;
//	
//	void showk() {
//		System.out.println("k: "+k);
//	}
//	void sum() {
//		System.out.println("sum of i,j,k: "+(i+j+k));
//	}
//}
//
//public class InheritanceDemo {
//
//	public static void main(String[] args) {
//		A1 superob = new A1();
//		B1 subob = new B1();
//		superob.i = 1;
//		superob.j = 2;
//		System.out.println("contents of superobject: ");
//		superob.showij();
//		subob.i = 3;
//		subob.j = 4;
//		subob.k = 5;
//		System.out.println("contents of subobject: ");
//		subob.showij();
//		subob.showk();
//		System.out.println();
//		subob.sum();
//		}
//
//}

//class A1{
//	int i;
//	private int j;
//	protected int k;
//	
//	void setij(int x, int y) {
//		i = x;
//		j = y;
//	}
//}
//class B1 extends A1{
//	int total;
//	
////	void sum() {
////		total = i+j+k;
////	}
//	void sum1() {
//		total = i+k;
//	}
//}
//
//class InheritanceDemo{
//	public static void main(String[] args) {
//		B1 subob = new B1();
//		subob.setij(8,9);
//		System.out.println("Sum of the contents of subobject: ");
//		subob.sum1();
//		System.out.println();
//		System.out.println("Sum of contents of subobject: "+subob.total);
//	}
//}

//class Box{
//	double height;
//	double width;
//	double depth;
//	
//	Box(Box ob){
//		height = ob.height;
//		width = ob.width;
//		depth = ob.depth;
//	}
//	Box(){
//		height = -1;
//		width = -1;
//		depth = -1;
//	}
//	Box(double h, double w, double d){
//		height = h;
//		width = w;
//		depth = d;
//	}
//	Box(double len){
//		height = width = depth = len;
//	}
//	double volume() {
//	return height*width*depth;
//}
//}
//class Boxweight extends Box{
//	double weight;
//	
//	Boxweight(double m, double h, double w, double d){
//		weight = m;
//		height = h;
//		width = w;
//		depth = d;
//	}
//}
//
//class InheritanceDemo{
//	public static void main(String[]args) {
//		Boxweight mybox1 = new Boxweight(1,2,3,4);
//		Boxweight mybox2 = new Boxweight(5,6,7,8);
//		double vol;
//		vol = mybox1.volume();
//		System.out.println("volume of box1 is "+vol);
//		System.out.println("Weight of box1 is "+mybox1.weight);
//		vol = mybox2.volume();
//		System.out.println("volume of box2 is "+vol);
//		System.out.println("weight of box2 is "+mybox2.weight);
//	}
//}

//class Box{
//	double height;
//	double width;
//	double depth;
//	
//	Box(Box ob){
//		height = ob.height;
//		width = ob.width;
//		depth = ob.depth;
//	}
//	
//	Box(double h, double w, double d){
//		height = h;
//		width = w;
//		depth = d;
//	}
//	
//	Box(){
//		height = -1;
//		width = -1;
//		depth = -1;
//	}
//	Box(double len){
//		height = width = depth = len;
//	}
//	double volume() {
//		return height*width*depth;
//	}
//}
//
//class Boxweight extends Box{
//	double weight;
//	
//	Boxweight(Boxweight ob){
//		super (ob);
////		height = ob.height;
////		width = ob.width;
////		depth = ob.depth;
//		weight = ob.weight;
//	}
//	Boxweight(double h,double w, double d, double m){
//		super(w,h,d);
//		weight = m;
//	}
//	Boxweight(){
//		super();
//		weight = -1;
//	}
//	Boxweight(double len,double m){
//		super(len);
//		weight = m;
//	}
//	
//}
//
//class InheritanceDemo{
//	public static void main(String[]args) {
//		Boxweight mybox1 = new Boxweight(10,20,30,40);
//		Boxweight mybox2 = new Boxweight(2,3,4,5);
//		Boxweight mybox3 = new Boxweight();
//		Boxweight mycube = new Boxweight(6,7);
//		Boxweight myclone = new Boxweight(mybox1);
//		double vol;
//		vol = mybox1.volume();
//		System.out.println("volume of first box: "+vol);
//		System.out.println("weight of first box: "+mybox1.weight);
//		System.out.println();
//		vol = mybox2.volume();
//		System.out.println("volume of second box: "+vol);
//		System.out.println("weight of second box: "+mybox2.weight);
//		System.out.println();
//		vol = mybox3.volume();
//		System.out.println("volume of third box: "+vol);
//		System.out.println("weight of third box: "+mybox3.weight);
//		System.out.println();
//		vol = mycube.volume();
//		System.out.println("volume of cube: "+vol);
//		System.out.println("weight of cube: "+mycube.weight);
//		System.out.println();
//		vol = myclone.volume();
//		System.out.println("volume of clone: "+vol);
//		System.out.println("weight of clone: "+myclone.weight);
//	}
//}

//MULTILEVEL INHERITANCE:
class Grandparent{
	void fun1() {
		System.out.println("Grandparent...");
	}
}
class Parent extends Grandparent{
	void fun2() {
		System.out.println("Parent...");
	}
}
class Child extends Parent{
	void fun3() {
	System.out.println("Child...");	
	}
}

class InheritanceDemo{
	public static void main(String[]args) {
		Child a = new Child();
		a.fun1();
		a.fun2();
		a.fun3();
	}
}