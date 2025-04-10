package lecture.kopplung.extern_via_file;

public class Main {

	public static void main(String[] args) {

		FileSystem fileSystem = new FileSystem();
		
		TemperatureSensor pt100 = new TemperatureSensor(fileSystem);
		
		pt100.update();;
		
		WeatherStation weatherstation = new WeatherStation(fileSystem);
		
		System.out.println(String.format("%.2f ??C", weatherstation.getTemperatur()));
	}

}
