package tw.org.iii;

import javax.swing.JOptionPane;
//此列自動產出
public class jeff04 {
	public static void main(String[] args){
		//輸入對話框
		String input =
				JOptionPane.showInputDialog("輸入年分");
				
		int year = Integer.parseInt(input);
		//
		if(year % 4 == 0){
			if(year % 100 ==0){
				if(year % 400 ==0){
				}else{
					//28
				}
			}else{
				//29
			}
		}else{
			//28
		}
		
	}

}


//閏年 被4整除要閏年
//被100整除不為閏年
//被400整除為閏年