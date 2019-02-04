import java.util.Scanner;

class ExceptionWithFunctions{
	public static void abc()
	{
		int a=0;
		int b=0;
		int c=0;
		int[] d ={2};

		Scanner sc = new Scanner (System.in);
	

		System.out.print("Enter the value of a ");
		a=sc.nextInt();
		System.out.print("Enter the value of b");
		b=sc.nextInt();
	
	c=a/b;
	d[7] = 6;
	}
public static void main(String[] args){
	try{
		abc();

	}
	catch(ArithmeticException e){
		System.out.print("\nArithmetic Exception");

	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.print("\nArray bounds Exception");
	}
}

		
		
	}
