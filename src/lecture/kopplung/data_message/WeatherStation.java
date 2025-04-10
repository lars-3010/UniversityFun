package lecture.kopplung.data_message;

public class WeatherStation {

	TemperatureSensor pt100 = new TemperatureSensor();
	
	public WeatherStation() {
		
	}
	
	public double getTemperatur()
	{
		return pt100.read() - 273.15;
		
	}
}
