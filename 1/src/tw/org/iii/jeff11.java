package tw.org.iii;

public class jeff11 {

	public static void main(String[] args) {
		int[] p = new int[6];   // 0-5
		for (int i=0; i<1000;i++){
			int dice = (int)(Math.random()*6);
			p[(dice>=6)?dice-3:dice]++;
		}
		for (int i=0; i<p.length; i++){
			System.out.println( (i+1) + "點出現" + p[i] + "次");
		}
	}
}

//new 為一哥物件 看到  new就是物件實體
//(boolean)?直1:直2