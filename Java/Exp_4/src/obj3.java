import java.net.*;

public class obj3 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub

		InetAddress me = InetAddress.getLocalHost();
		int len = getVersion(me);
		System.out.print(len);
	}
	
	public static int getVersion(InetAddress ia) {
		byte[] address = ia.getAddress();
		if(address.length == 4) {
			System.out.print("IPV4 : ");
			return 4;
		}
		else if(address.length == 6) {
			System.out.print("IPV6 : ");
			return 6;
		}
		else {
			System.out.print("None : ");
			return -1;
		}
	}

}
