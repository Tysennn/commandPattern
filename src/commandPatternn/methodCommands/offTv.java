package commandPatternn.methodCommands;

import commandPatternn.objects.*;
import commandPatternn.*;

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