package lecture.kopplung.common;

public class WeatherStation {


	private ITemperatureStorage storage;

	public WeatherStation(ITemperatureStorage storage) {
		this.storage = storage;

	}
	
	public double getTemperatur()
	{

		return storage.getTemperature();
	}
}
