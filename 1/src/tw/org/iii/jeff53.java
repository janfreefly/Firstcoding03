package tw.org.iii;

public class jeff53 {

	public static void main(String[] args) {
		syaYA("brad","peter");
	}
	static void sayYA(String name){
		System.out.println("ya, " + name);		
	}
	static void syaYA(String name1, String name2){
		System.out.println("ya, " + name1);
		System.out.println("ya, " + name2);
	}
	static void syaYA(String... names){
		for (String name : names){
			System.out.println();
		}
	}
	

}
