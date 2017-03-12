package tw.org.iii;

public class jeff17 {

	public static void main(String[] args) {
		String s1 = new String();
		
		byte[] b1 = {1,2,3,4,5};
		String s2 = new String(b1);
		
		String s3 = new String(b1,2,4);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		String s4 = "abcdefg"; //任何爽引號標註內容皆為物件實體
		
		char a1 = s2.charAt(3);
		System.out.println(a1);
		System.out.println("abcdefg".charAt(3));		
	}

}
