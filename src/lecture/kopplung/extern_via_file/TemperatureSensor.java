package lecture.kopplung.extern_via_file;

import java.util.Random;

public class TemperatureSensor {

	FileSystem fileSystem;
	double currentTemperature;
	
	public TemperatureSensor(FileSystem fs)
	{
		fileSystem = fs;
	}
	
	public void update()
	{
		Random rnd = new Random();
		
		this.currentTemperature = 273.15 - 20 + 50 * rnd.nextDouble();
	
		this.fileSystem.storeData("temp.dat", this.currentTemperature);
	}
	public double read()
	{
		return this.currentTemperature;
	}
}
