package lecture.kopplung.extern_via_file;

import java.util.HashMap;

public class FileSystem {

	HashMap<String, Double> filesystem = new HashMap<>();
	
	public void storeData(String filename, double data)
	{
		filesystem.put(filename, data);
	}
	
	public double readFile(String filename)
	{
		return filesystem.get(filename);
	}
}
