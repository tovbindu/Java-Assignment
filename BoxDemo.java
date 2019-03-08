package package1;
//TODO Auto-generated method stub
//class Box1{
//	double height;
//	double width;
//	double depth;
//}
//
//class BoxDemo {
//
//	public static void main(String[] args) {
//		Box1 mybox = new Box1();
//		double vol;
//		mybox.height = 10;
//		mybox.width = 20;
//		mybox.depth = 30;
//		vol = mybox.height*mybox.width*mybox.depth;
//		System.out.println("The volume of the box is " +vol);
//
//	}
//
//}

//class Box1{
//	double height;
//	double width;
//	double depth;
//}
//
//class BoxDemo{
//public static void main(String[] args) {
//	Box1 mybox1 = new Box1();
//	Box1 mybox2 = new Box1();
//	double vol;
//	mybox1.depth = 10;
//	mybox1.height = 20;
//	mybox1.width = 30;
//	mybox2.height = 5;
//	mybox2.width = 10;
//	mybox2.depth = 15;
//	vol = mybox1.depth*mybox1.height*mybox1.width;
//	System.out.println("Volume of box1 "+vol);
//	vol = mybox2.height*mybox2.depth*mybox2.width;
//	System.out.println("Volume of box2 "+vol);
//}
//}

//METHOD:

//class Box1{
//	double height;
//	double width;
//	double depth;
//
//void volume() {
//	System.out.println("volume is "+width*height*depth);
//}
//}
//
//class BoxDemo{
//	public static void main(String[]args) {
//		Box1 mybox1 = new Box1();
//		Box1 mybox2 = new Box1();
//		mybox1.height = 10;
//		mybox1.width = 20;
//		mybox1.depth = 50;
//		mybox2.height = 5;
//		mybox2.width = 10;
//		mybox2.depth = 15;
//		mybox1.volume();
//		mybox2.volume();
//	}
//}

//RETURNING A VALUE:

//class Box1{
//	double height;
//	double width;
//	double depth;
//	
//	double volume() {
//		return height*depth*width;
//	}
//}
//class BoxDemo{
//	public static void main(String[] args) {
//		Box1 mybox1 = new Box1();
//		Box1 mybox2 = new Box1();
//		mybox1.height = 1;
//		mybox1.width = 2;
//		mybox1.depth = 3;
//		mybox2.height = 5;
//		mybox2.width = 2;
//		mybox2.depth = 1;
//		double vol = mybox1.volume();
//		System.out.println("Volume is "+vol);
//		double rate = vol*100;
//		System.out.println("Rate is "+rate);
//		vol = mybox2.volume();
//		System.out.println("volume of box 2 is "+vol);
//	}
//}

//FUNCTION THAT TAKES PARAMETER:

//class Box1{
//	double height;
//	double width;
//	double depth;
//	
//	double volume() {
//		return height*depth*width;
//	}
//
//void setdim(double h,double w,double d) {
//	height = h;
//	depth = d;
//	width = w;
//}
//}
//class BoxDemo{
//	public static void main(String[] args) {
//		Box1 mybox1  = new Box1();
//		Box1 mybox2 = new Box1();
//		Box1 mybox3 = new Box1();
//		double vol;
//		mybox1.setdim(1, 5, 3);
//		mybox2.setdim(2,3,4);
//		mybox3.setdim(3, 4, 5);
//		vol = mybox1.volume();
//		System.out.println("First box volume "+vol);
//		vol = mybox2.volume();
//		System.out.println("Second box volume "+vol);
//		vol = mybox3.volume();
//		System.out.println("Third box volume "+vol);
//	}
//}

//BOX WITH CONSTRUCTOR:

//class Box1{
//	double height;
//	double width;
//	double depth;

//CONSTRUCTOR:

//	Box1(){
//		System.out.println("Constructing box");
//		height = 1;
//		depth = 2;
//		width = 4;
//	}
//	double volume() {
//		return height*depth*width;
//	}
//}
//
//class BoxDemo{
//	public static void main(String[]args) {
//	Box1 mybox1 = new Box1();
//	Box1 mybox2 = new Box1();
//	Box1 mybox3 = new Box1();
//	double vol;
//	System.out.println("The height is "+mybox1.height);
//	mybox1.height = 2;
//	vol = mybox1.volume();
//	System.out.println("volume is "+vol);
//	vol = mybox2.volume();
//	System.out.println("volume is "+vol);
//	
//}
//}

//BOX WITH CONSTRUCTOR PARAMETERS:

class Box1{
	double height;
	double width;
	double depth;
	
	Box1(double h,double w, double d){
		height = h;
		width = w;
		depth = d;
	}
	double volume() {
		return height*width*depth;
	}
}
class BoxDemo{
	public static void main(String[]args) {
		Box1 mybox1 = new Box1(4,5,1);
		Box1 mybox2 = new Box1(1,5,6);
		Box1 mybox3 = new Box1(3,2,4);
		double vol;
		vol = mybox1.volume();
		System.out.println("volume is "+vol);
		vol = mybox2.volume();
		System.out.println("volume is "+vol);
		vol = mybox3.volume();
		System.out.println("volume is "+vol);
	}
}