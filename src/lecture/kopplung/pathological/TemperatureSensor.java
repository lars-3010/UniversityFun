package lecture.kopplung.pathological;

import java.util.Random;

public class TemperatureSensor {

	double currentTemperature;
	
	public void update()
	{
		Random rnd = new Random();
		
		this.currentTemperature = 273.15 - 20 + 50 * rnd.nextDouble();
		
	}
	public double read()
	{
		return this.currentTemperature;
	}
}
