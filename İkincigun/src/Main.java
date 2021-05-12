
public class Main {

	public static void main(String[] args){
		Car car = new Car(1,"tofas",15000, 2000);	 
		Musteri musteri = new Musteri("Kağan");
		CarManager carmanager = new CarManager();
		carmanager.satma(car, musteri);
	} 
}
