package tw.org.iii;

public class jeff06 {

	public static void main(String[] args) {
		int a = 12;
		final int b = 10;
		//switch 的基本型別 在int內  byte/short/int/char
		//exp: final int b =10 b為常數
		//case 1 為常數
		switch(a){
		case 1:
			System.out.println("a");
			break;
		case b-2:
			System.out.println("b");
			break;	
		case 3:
			System.out.println("c");
			break;
		default:
			System.out.println("d");
			break;
		}
	}

}
