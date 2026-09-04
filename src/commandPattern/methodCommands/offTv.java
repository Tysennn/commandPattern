package commandPattern.methodCommands;

import commandPattern.objects.*;
import commandPattern.*;

public class offTv implements Command {
	private Tv tv;

	public offTv(Tv tv){
		this.tv = tv;
	}


	@Override
	public String execute() {
		return tv.switchOff();
	}
}