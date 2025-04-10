package lecture.kopplung.data_message;

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
		this.update();

		return this.currentTemperature;
	}
}
