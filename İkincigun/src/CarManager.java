
public class CarManager {
	public void ekleme(Car car) {
		System.out.println(car.markaAdi + " eklendi");
	}
	public void satma(Car car, Musteri musteri) {
		System.out.println(car.markaAdi + musteri.ad + " Satıldı");
	}
}
