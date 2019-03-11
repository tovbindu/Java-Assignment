package package1;
//TODO Auto-generated method stub
class Circle{
	double radius;
	String color;
	
Circle(){
	 double radius;
	 String color;
}
Circle(double r, String c){
	radius = r;
	color = c;
}
void setRadius(double r) {
	radius = r;
}
double getRadius(){
	System.out.println("The radius of the circle is "+radius);
	return radius;
}
void setColor(String c) {
	color = c;
}
String getColor() {
	System.out.println("The color of the circle is "+color);
	return color;
}
public String toString() {
	System.out.println("Circle[radius=?,color =?] "+radius+","+color);
	return radius + color  ;   
			}
double getArea() {
	return radius*radius*Math.PI;
}
}

public class Assignmentcircle1 {

	public static void main(String[] args) {
		Circle mycircle = new Circle();
		double area ;
		mycircle.setColor("red");
		mycircle.setRadius(1);
		mycircle.getRadius();
		mycircle.getColor();
		mycircle.toString();
		area = mycircle.getArea();
		
		System.out.println("The area of the circle is "+area);
		}

}
