import java.net.*;
public class firstobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress address = InetAddress.getByName("172.23.43.12");
			System.out.println(address);
		}
		catch(UnknownHostException ex) {
			System.out.println("Coutd not find www.soa.ac.in");
		}
	}
}
