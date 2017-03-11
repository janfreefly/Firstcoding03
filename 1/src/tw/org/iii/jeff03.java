package tw.org.iii;

public class jeff03 {

	public static void main(String[] args) {
		//double score = Math.random();\
		// 0 - 100
		int intScore = (int)(Math.random()*100+1);
		System.out.println(intScore);
		
		if (intScore>=90){	
			System.out.println("A");
		}else{
			if (intScore>=80){	
				System.out.println("B");
			}else{
				if (intScore>=70){	
					System.out.println("C");
				}else{
					if (intScore>=60){	
						System.out.println("D");
					}else{
						if (intScore>=50){	
							System.out.println("E");
						}
					}
				}
			  }
			}
		}
	}



//score >=90 A
//score >=80 b
//score >=70 c
//score >=60 D
//以下為 = F

//大括號為程式區塊 
//大括號 分號 為一個單為敘述句



