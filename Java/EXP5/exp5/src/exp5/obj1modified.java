package exp5;

import java.net.MalformedURLException;
import java.net.URL;

public class obj1modified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL www = new URL ("http://www.ibiblio.org/");
			URL ibiblio = new URL("http://ibiblio.org/");
			if(ibiblio.equals(www)) {
				System.out.println(ibiblio + " is same as " + www);
			}
			else {
				System.out.println(ibiblio + "is not the same as " + www);
			}
		}
		catch(MalformedURLException ex) {
			System.err.println(ex);
		}
	}

}
