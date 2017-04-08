package tw.org.iii;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class jeff55 {

	public static void main(String[] args) {
		int a=1, b=2; String c = "jeff";
		try {
			FileOutputStream fout = new FileOutputStream("./dir1/data1.dat");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
