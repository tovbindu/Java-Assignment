package package1;
//TODO Auto-generated method stub
class Rectangle{
	float length;
	float width;
	
	Rectangle(float l, float w){
		length = l;
		width = w;
	}
	float getLength() {
		System.out.println("The length of the rectangle is "+length);
		return length;
	}
	void setLength(float l) {
		length = l;
	}
	float getWidth() {
		System.out.println("The width of the rectangle is "+width);
		return width;
	}
	void setWidth(float w) {
		width = w;
	}
		double getArea() {
		return length*width;
	}
	double getPerimeter() {
		return 2*(length+width);
	}
	public String toString() {
		System.out.println("Rectangle[length = ?, width = ?]: "+length+","+width);
		return length+","+width;
	}
}


public class Assignmentrectangle1 {

	public static void main(String[] args) {
		Rectangle myrectangle = new Rectangle(0,0);
		double area;
		double perimeter;
		myrectangle.setLength(2);
		myrectangle.setWidth(3);
		myrectangle.getLength();
		myrectangle.getWidth();
		myrectangle.toString();
		area = myrectangle.getArea();
		perimeter = myrectangle.getPerimeter();
		System.out.println("The area of the rectangle is "+area);
		System.out.println("The perimeter of the rectangle is "+perimeter);
	}

}
