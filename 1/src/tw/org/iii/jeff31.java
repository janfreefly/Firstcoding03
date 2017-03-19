package tw.org.iii;

public class jeff31 {
	public static void main(String[]args){
		StringBuffer b1 = new StringBuffer();
		StringBuffer b2 = b1;
		b1.append("123456789012345");
		System.out.println(b1.capacity());
		}
}
