import java.io.*;
import java.util.*;

 class FileAllDataTypes {
   
   public static void main(String[] args) {
            
      try {
            //File object 
            File f = new File("data.txt");
            FileWriter fout = new FileWriter(f);
			BufferedWriter bout= new BufferedWriter(fout);
			
            Scanner sc = new Scanner(System.in);
            boolean flag=true;

            while(flag){
            	System.out.print("Enter S.No: ");
            	bout.write(Integer.toString(sc.nextInt()));  //text file. Convert integer to String 
                bout.write(' ');   
                System.out.print("Enter Name: ");                          // contents of file separated by space (Split by space)
                bout.write(sc.next());
                bout.write(' ');  
                System.out.print("Enter CGPA: ");
                bout.write(Float.toString(sc.nextFloat()));   // text file. Convert float to String
                bout.write(' ');
                System.out.print("Enter Grade: (A / B / C / D): ");
                bout.write(sc.next().charAt(0));
                        
                bout.newLine();
                System.out.print("\nDo you want to continue entering data Y / N: ");
                char c = sc.next().charAt(0);
                if(c=='n' || c=='N'){
                	flag=false;

                }
            }
            bout.close();
                 
            FileReader fin = new FileReader(f);
			      BufferedReader bin= new BufferedReader(fin);
			      String sr;
			      System.out.println("The contents of the file are:\n ");	
			      while((sr=bin.readLine())!=null){
                String[] strs = sr.split(" "); // identifying ths split between values
                System.out.println((strs[0])+ " "+ strs[1]+ " "+strs[2]+" "+strs[3]);
			} 
		}
		catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
     }
 }
}
