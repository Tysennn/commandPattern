package commandPatternn.methodCommands;

import commandPatternn.objects.*;
import commandPatternn.*;

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