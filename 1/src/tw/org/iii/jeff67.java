package tw.org.iii;

import java.io.IOException;
import java.net.ServerSocket;

public class jeff67 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5555);
			Server.accept();
			Server.close();
		} catch (IOException e) {
			System.out.println(e.printStackTrace());
		}
	}

}
