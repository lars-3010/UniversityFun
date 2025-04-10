package lecture.kopplung.common;

public class Main {

	public static void main(String[] args) {

		ITemperatureStorage storage = new DataBaseStorage();
		
		WeatherStation weatherstation = new WeatherStation(storage);
		
		TemperatureSensor tempSensor = new TemperatureSensor();
		tempSensor.setStorage(storage);
		
		tempSensor.update();
		
		
		System.out.println(String.format("%.2f °C", weatherstation.getTemperatur()));
	}

}
