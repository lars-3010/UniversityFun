package lecture.kopplung.common;

public class DataBaseStorage implements ITemperatureStorage {

	double dbvalue;
	@Override
	public void setTemperature(double value) {
		// save in database
		dbvalue = value;
	}

	@Override
	public double getTemperature() {
		// SELECT * from DB;
		
		return this.dbvalue;
	}

}
