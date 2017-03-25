package tw.org.iii;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class jeff40 {

	public static void main(String[] args) {
		File file = new File("./dir1/aaa.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
	}

}
