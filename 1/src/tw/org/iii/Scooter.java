package tw.org.iii;

public class Scooter extends Bike{
	Scooter(){
		System.out.println("Scooter()");
	}
	void upSpeed(){
		speed = (speed<1)?1:(speed*3.2);
	}
}



//存取修飾字   public > protected > 沒有(相同package) > private(calss) 