package tw.org.iii;

public class jeff02 {

	public static void main(String[] args) {
		// [a-zA-Z$_][a-zA-Z0-9$_]*
		// big5 2bytes => 2^16 => 65536; UTF8 => 2^24 
		char var1 = '資';
		char var2 = 0;   //ASCII: d
		System.out.println(var1-var2);
		boolean var3 = true;
		boolean var4 = false;
		//boolean var5 = 0; 
		
		}

}
