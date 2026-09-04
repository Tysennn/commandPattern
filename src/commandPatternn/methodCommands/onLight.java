package commandPatternn.methodCommands;

import commandPatternn.objects.*;
import commandPatternn.*;

public class onLight implements Command {

	private Light light;
	public onLight(Light light){
		this.light = light;
	}
	@Override
	public String execute() {
		return light.switchOn();
	}

}