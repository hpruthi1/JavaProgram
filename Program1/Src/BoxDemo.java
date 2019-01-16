import java.util.*;
class Box{
	double width, height, depth;
	void setDim(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter width, height and depth of box: ");
		width = in.nextDouble();
		height = in.nextDouble();
		depth = in.nextDouble();
	}
	double volume(){
		return width*height*depth;
	}
}
public class BoxDemo{
	public static void main(String[] args){
		Box b = new Box();
		b.setDim();
		System.out.print("Volume = "+b.volume());
	}
}