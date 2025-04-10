package lecture.kopplung.common;

public interface ITemperatureStorage {

	/**
	 * Store the given value as the current temperature
	 * 
	 * @param value the current temperature
	 */
	void setTemperature(double value);
	
	
	/**
	 * Read the current temperature from storage
	 * 
	 * @return current temperature
	 */
	double getTemperature();
		
}
