package commandPatternn.methodCommands;

import commandPatternn.objects.*;
import commandPatternn.*;

public class channelChange implements Command {
	private Tv tv;
	private int channel;

	public channelChange(Tv tv, int channel){
		this.tv = tv;
		this.channel = channel;
	}

	@Override
	public String execute() {
		return tv.changeChannel(channel);
	}
}