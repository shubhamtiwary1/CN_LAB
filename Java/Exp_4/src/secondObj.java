import java.net.*;
public class secondObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address);
		}
		catch(UnknownHostException ex) {
			System.out.println("Coutd not fond.");
		}
	}

}
