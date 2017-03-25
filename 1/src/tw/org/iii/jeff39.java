package tw.org.iii;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class jeff39 {

	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");
		try {
			FileReader reader = 
					new FileReader(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
