package commandPatternn.methodCommands;

import commandPatternn.objects.*;
import commandPatternn.*;

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