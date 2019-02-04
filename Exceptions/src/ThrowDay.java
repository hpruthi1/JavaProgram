import java.util.Scanner;
class ThrowDay{
	public static void main(String[] args){
     int day;
     boolean flag=true;
     Scanner sc = new Scanner(System.in);
	while(flag){
		try{
			System.out.print("Enter day:");
			day=sc.nextInt();
			if (day<0 || day>31)
			throw new Exception("Exception:Invalid Day");
         else 
         	{ System.out.print("\nEntered Day ="+day);
         flag =false;
		}
	}
		catch (Exception e){
			
			System.out.print("\n"+e.getMessage());

		
		}
	}}
}