package commandPattern;

public class LampOn implements Command {

	private Lamp lamp;
	public LampOn(Lamp lamp){
		this.lamp = lamp;
	}
	@Override
	public String execute() {
		return lamp.switchOn();
	}

}
