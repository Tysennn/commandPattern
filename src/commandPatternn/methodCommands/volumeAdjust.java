package commandPatternn.methodCommands;

import commandPatternn.objects.*;
import commandPatternn.*;

public class volumeAdjust implements Command {
	private MusicPlayer musicPlayer;
	private int level;

	public volumeAdjust(MusicPlayer musicPlayer, int level){
		this.musicPlayer = musicPlayer;
		this.level = level;
	}

	@Override
	public String execute() {
		return musicPlayer.adjustVolume(level);
	}
}