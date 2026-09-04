package commandPattern;

public class offLight implements Command {
	private Light light;

	public offLight(Light light){
		this.light = light;
	}


	@Override
	public String execute() {
		return light.switchOff();
	}
}