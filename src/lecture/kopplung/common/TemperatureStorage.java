package lecture.kopplung.common;

public class TemperatureStorage implements ITemperatureStorage {

	double storedTemperature = -9999;
	
	@Override
	public void setTemperature(double value) {
		this.storedTemperature = value;
	}

	@Override
	public double getTemperature() {
		return this.storedTemperature;
	}

}
