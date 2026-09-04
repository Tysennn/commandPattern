package commandPattern.methodCommands;

import commandPattern.objects.*;
import commandPattern.*;

public class musicStop implements Command {
	private MusicPlayer musicPlayer;

	public musicStop(MusicPlayer musicPlayer){
		this.musicPlayer = musicPlayer;
	}


	@Override
	public String execute() {
		return musicPlayer.stop();
	}
}