package tw.org.iii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class jeff38 {

	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");
		try{
			FileInputStream fin =
				new FileInputStream(file);
		}catch(FileNotFoundException ee){
			
		}catch(){}
		
	}

}
