package lecture.kopplung.extern_via_file;

public class WeatherStation {

	FileSystem fileSystem;
	
	
	public WeatherStation(FileSystem fileSystem) {
		this.fileSystem = fileSystem;
		

	}
	
	public double getTemperatur()
	{
		return fileSystem.readFile("temp.dat") - 273.15 ;
		
	}
}
