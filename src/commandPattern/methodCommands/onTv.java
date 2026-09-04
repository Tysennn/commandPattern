package commandPattern.methodCommands;

import commandPattern.objects.*;
import commandPattern.*;

public class onTv implements Command {

	private Tv tv;
	public onTv(Tv tv){
		this.tv = tv;
	}
	@Override
	public String execute() {
		return tv.switchOn();
	}

}