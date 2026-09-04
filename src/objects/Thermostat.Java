package commandPattern;

public class Thermostat {
	private int temperature = 70;

	public String switchOn() {
		return "Thermostat is switched-on!";
	}

	public String switchOff(){
		return "Thermostat is switched-off";
	}

	public String increaseTemperature() {
		temperature++;
		return "Thermostat temperature increased to " + temperature + " degrees";
	}

	public String decreaseTemperature() {
		temperature--;
		return "Thermostat temperature decreased to " + temperature + " degrees";
	}
}