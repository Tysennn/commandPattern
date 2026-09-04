package commandPattern;

public class LampOff implements Command {
	private Lamp lamp;

	public LampOff(Lamp lamp){
		this.lamp = lamp;
	}


	@Override
	public String execute() {
		return lamp.switchOff();
	}
}
