package lecture.kopplung.pathological;

public class WeatherStation {

	TemperatureSensor pt100 = new TemperatureSensor();
	
	public WeatherStation() {
		pt100.update();
	}
	
	public double getTemperatur()
	{
		return pt100.currentTemperature - 273.15;
		
	}
}
