package tw.org.iii;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.Socket;

import org.omg.CORBA.portable.OutputStream;

public class jeff66 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
			java.io.OutputStream out = socket.getOutputStream();
			socket.close();
		} catch (IOException e) {
			
		}
	}

}
