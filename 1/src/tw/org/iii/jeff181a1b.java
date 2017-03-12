package tw.org.iii;

import javax.swing.JOptionPane;

public class jeff181a1b {

	public static void main(String[] args) {
		
	//1.create answer
		
		String answer = createAnswer();
		System.out.println(answer);
		//2.start
		for(int i=0; i<10; i++){
		//2.1 input number string	
			String guess = JOptionPane.showInputDialog("猜數字遊戲");
		//2.2 compare string >>result	
		String result = checkAB(answer, guess);
		}
		
		
		
		boolean[] check = new boolean[10];	// 0 - 51: false
		int[] poker = new int[10]; // 0- 51: 0
		int temp; 
		for (int i=0; i<10; i++){
			do{
				temp = (int)(Math.random()*10);
			}while (check[temp]);
			
			poker[i] = temp;
			check[temp] = true;
		}
		String ret = "";
		for(int v:poker) ret += v;
		
		return ;
	}
	
	
	
	//2.3 winner >> break
	//2.4 repeat 10 times >>loser
	//3 show-off
	
	
	
	//method：create a answer
	static String createAnswer(){
		return"742";
	}
}
