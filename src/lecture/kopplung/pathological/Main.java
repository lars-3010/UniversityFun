package lecture.kopplung.pathological;

public class Main {

	public static void main(String[] args) {

		WeatherStation weatherstation = new WeatherStation();
		
		System.out.println(String.format("%.2f ??C", weatherstation.getTemperatur()));
	}

}
