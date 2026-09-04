package commandPatternn;

public class Tv {
	private int channel = 1;

	public String switchOn() {
		return "Tv is switched-on!";
	}

	public String switchOff(){
		return "Tv is switched-off";
	}

	public String changeChannel(int channel) {
		this.channel = channel;
		return "Tv channel changed to " + channel;
	}
}