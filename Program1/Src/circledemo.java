class Circle {
double radius;

double findArea()
{
	return radius * radius * 3.14159;

}

Circle()

{
	radius=6;
}
void displayArea()
{
	System.out.print ("Area=" + findArea());
}
}

class circledemo {
	public static void main (String[] args)
	{
		Circle C = new Circle();
		//C.radius = 5;
		C.displayArea();

	}
}