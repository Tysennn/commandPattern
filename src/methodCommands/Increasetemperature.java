package commandPattern;

public class increaseTemperature implements Command {

	private Thermostat thermostat;
	public increaseTemperature(Thermostat thermostat){
		this.thermostat = thermostat;
	}
	@Override
	public String execute() {
		return thermostat.increaseTemperature();
	}

}