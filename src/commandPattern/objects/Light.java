package commandPattern;

public class Light {
	private int brightness = 50;

	public String switchOn() {
		return "Light is switched-on!";
	}

	public String switchOff(){
		return "Light is switched-off";
	}

	public String setBrightness(int level) {
		this.brightness = level;
		return "Light brightness set to " + level + "%";
	}
}