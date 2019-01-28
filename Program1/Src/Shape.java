import java.util.*;
class Shape{
	public void displaymsg(){
		System.out.print("This is a shape");
	}
}
class Circle extends Shape {
	int radius;
	Circle(int radius){
       this.radius=radius;
	}
	double area(){
		return 3.14*radius*radius;
	
	}
	}
	class Rectangle extends Shape {
		int length,breadth;
		Rectangle(int length,int breadth)
		{
			this.length=length;
			this.breadth=breadth;

		}
		double area()
		{
			return length*breadth;

		}

	

  void displayarea(){
  	System.out.print ("\nArea of rectangle ="+area());
}}
class Shapeinheritancedemo{
	public static void main(String[] args){
	Circle c=new Circle(4);
	System.out.print("\nCircle calling its function " );
	c.displayarea();
	c.displaymsg();

     Rectangle r = new Rectangle(2,3);
	System.out.print("\nRectangle calling its function");
    r.displayarea();
	r.displaymsg();
	 }
	}

