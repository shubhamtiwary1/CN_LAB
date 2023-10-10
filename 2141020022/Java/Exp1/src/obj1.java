import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class obj1 {
	 	public static void main (String[] args) throws IOException{
	 		Scanner sc = new Scanner(System.in);
	 		try {
	        	FileOutputStream fwrite=new FileOutputStream("D:\\2141020022\\exp2_obj1.txt");
	        	System.out.println("Enter your name and regd number : ");
	        	String name = sc.nextLine();
	        	String reg = sc.next();
	        	String data = name + "\n" + reg;
	        	for(char c : data.toCharArray()) {
	        		fwrite.write(c);
	        	}
	        	fwrite.close();
	        }
	        catch(IOException e){
	        	System.out.println("An error occured.");
	     	}
	       
	        FileInputStream obj=new FileInputStream("D:\\2141020022\\exp2_obj1.txt");
	        try {
	        	Scanner sc1=new Scanner(obj);
	        	while(sc1.hasNextLine()) {
	        	String data=sc1.nextLine();
	        		System.out.println(data);
	        	}
	        	obj.close();
	        }
	        catch(FileNotFoundException e) {
	        	System.out.println("An error is occured.");
	        }  
	    }

	 }

