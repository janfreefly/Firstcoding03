package tw.org.iii;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class jeff63 {

	public static void main(String[] args) {
		String data = "jeff";
		byte[] sendData = data.getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(sendData, sendData.length, InetAddress.getByName("127.0.0.1"),4444);
			socket.send(packet);
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
