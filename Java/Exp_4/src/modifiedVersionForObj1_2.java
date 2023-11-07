import java.net.*;

public class modifiedVersionForObj1_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress[] addresses = InetAddress.getAllByName("iitbhubaneswar.com");
			for(InetAddress address : addresses) {
				System.out.println(address);
			}
		}
		catch (UnknownHostException ex){
			System.out.println("Could not find www.oreilly.com");
		}
	}

}
