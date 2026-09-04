package commandPattern.methodCommands;

import commandPattern.objects.*;
import commandPattern.*;

public class decreaseTemperature implements Command {
	private Thermostat thermostat;

	public decreaseTemperature(Thermostat thermostat){
		this.thermostat = thermostat;
	}


	@Override
	public String execute() {
		return thermostat.decreaseTemperature();
	}
}