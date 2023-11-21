package exp5;

import java.net.URL;
import java.util.Scanner;
import java.net.URI;
import java.net.URISyntaxException;

public class obj3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the uri");
		String url = sc.nextLine();
		try {
			URI u = new URI(url);
			System.out.println("The protocol is " + u.getScheme());
			System.out.println("The user info is " + u.getRawUserInfo());
			String host = u.getHost();
			if(host != null) {
				System.out.println("The host is " + host);
			}
			else {
				System.out.println("The host is null.");
			}
			System.out.println("The post is " + u.getPath());
			System.out.println("The path is " + u.getPath());
			System.out.println("The query string is " + u.getQuery());
		}
		catch(URISyntaxException ex) {
			System.out.println(ex);
		}

	}

}
