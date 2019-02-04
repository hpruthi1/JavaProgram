import java.util.Scanner;

class Exceptionexample{
	public static void main(String[] args)
	{
		int a=0;
		int b=0;
		int c=0;
		Scanner sc = new Scanner (System.in);
		try{

		System.out.print("Enter the value of a ");
		a=sc.nextInt();
		System.out.print("Enter the value of b");
		b=sc.nextInt();
		c=a/b;
	}
		
		catch(ArithmeticException e){
			System.out.print("bye");
			b=1;
		}	
		catch(Exception e)
		{
			System.out.print("hello");

		}	
		c=a/b;
		System.out.print("a=" +a +"b=" +b +"a/b="+c);
	}
}