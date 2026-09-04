package commandPattern.methodCommands;

import commandPattern.objects.*;
import commandPattern.*;

public class brightnessAdjust implements Command {
	private Light light;
	private int level;

	public brightnessAdjust(Light light, int level){
		this.light = light;
		this.level = level;
	}

	@Override
	public String execute() {
		return light.setBrightness(level);
	}
}