package tw.org.iii;

public class jeff27 {

	public static void main(String[] args) {
		jeff271 b1 = new jeff271();
		b1.m1();
	}

}
abstract class jeff271{
	jeff271(){System.out.println("Jeff271()");}
	void m1(){System.out.println("jeff271:m1()");}
	abstract void m2();
}
class jeff272 extends jeff271{
	void m2(){}
}
class jeff273 extends jeff271{
	void m2(){}
	}
abstract class jeff274 extends jeff271{
	void m3(){}
}