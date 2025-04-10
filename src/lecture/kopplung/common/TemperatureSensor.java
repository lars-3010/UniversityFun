package lecture.kopplung.common;

import java.util.Random;

public class TemperatureSensor {

	ITemperatureStorage storage;
	
	double currentTemperature = 0;
	
	public TemperatureSensor()
	{
		
		
	}
	
	public void setStorage(ITemperatureStorage storage) {
		this.storage = storage;
	}
	
	public void update()
	{
		Random rnd = new Random();
		
		this.currentTemperature = 30; //273.15 - 20 + 50 * rnd.nextDouble();

		storage.setTemperature(currentTemperature);
		
	}

	public double read()
	{
		return this.currentTemperature;
	}
}
