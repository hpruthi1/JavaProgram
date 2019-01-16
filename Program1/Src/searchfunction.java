import java.util.*;
class searchfunction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]a=new int[10];
		int item;
		System.out.print("Enter the elements of the array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();

		}
         System.out.print("Enter the item to search");
         item=sc.nextInt();
         int loc=search(a,item);
         if(loc==1)
         System.out.print("item not in the list");
         else
         System.out.print("item at location" +loc);
         }  
		


		static int search (int[]a,int item)
    {
    	int status;
    	int i;
    	for (i=0;i<a.length;i++)
    		{
    			if (item==a[i])
               return i;
               }
              return -1;
              }
             }