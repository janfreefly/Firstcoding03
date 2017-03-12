package tw.org.iii;

/*
 * 
 */

public class jeff15 {

	public static void main(String[] args) {
		int[] a ={0,1,2,3,4,5};
		//method 1 :
		for (int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		System.out.println("-----");
		
		//method 2
		for (int v: a){
			System.out.println(v);
		}
		//exchange [2]<->[5]
		int temp = a[2];
		a[2] = a[5];
		a[5] = temp;
		System.out.println("-----");
		
		//method 2
		for (int v: a){
			System.out.println(v);
		}		
		System.out.println("-----");
		
		int[][] b ={{1,2,3,4},{5,6,7,8},{9,10},{10},{11,12,13}};
			for ( int i=0; i<b.length; i++){
			
		}
		
		
	}
}
