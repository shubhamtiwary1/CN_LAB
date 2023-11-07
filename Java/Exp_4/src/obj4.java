import java.net.*;
import java.util.*;

public class obj4 {

	public static void main(String[] args) throws SocketException {
		// TODO Auto-generated method stub
		Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
		while (interfaces.hasMoreElements()) {
			NetworkInterface ni = interfaces.nextElement();
			System.out.println(ni);
		}
	}

}
