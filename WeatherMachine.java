
public class WeatherMachine {
	Thermometer a;
	String city;
	public WeatherMachine() {
		this("Reston");
		a = new Thermometer();
	}
	public WeatherMachine(String city) {
		this.city = city;
	}
	private int[] getPastTemperatures() {
		a = new Thermometer();
		int[] tempList = new int[24];
		for (int i = 0; i < 24; i++) {
			tempList[i] = a.getTemperature();
		}
		return tempList;
	}
	
	public void getWeatherReport() {
		WeatherMachine b = new WeatherMachine();
		int[] tempList = b.getPastTemperatures();
		System.out.println("Your curent location: " + city);
		for (int i = 0; i < 24; i++) {
			String t = String.valueOf(i);
			String time = t + ":00";
			System.out.println(time + " - " + tempList[i] + " degrees");
		}
	}
}
