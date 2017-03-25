package tw.org.iii;

public class jeff35 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try{
		b1.setLeg(2);
		}catch(Exception ee){
			
		}
	}
}
class Bird {
	private int leg ;
	void setLeg(int n) throws Exception {
		if (n>2 || n<0){
			throw new Exception();
		}
		leg=n;
	}
}