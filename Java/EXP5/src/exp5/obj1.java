package exp5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.*;

class obj1{
		
	public static void main(String[] args) throws Exception{
		try {
			System.out.println("Enter the url: ");
			Scanner sc = new Scanner(System.in);
			String website=sc.nextLine();
			URL u = new URI(website).toURL();
			Object o = u.getContent();
			System.out.println("I got a " + o.getClass().getName() + "\n");
			BufferedReader in = new BufferedReader(new InputStreamReader(u.openStream()));
			String readLine;
			while((readLine = in.readLine()) != null) {
				System.out.println(readLine);
			}
			in.close();
			
		}
		catch(Exception e) {
			System.out.println("I did'n get anything.\n" + e);
		}	
	}	
}