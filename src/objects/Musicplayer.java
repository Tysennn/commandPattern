package commandPattern;

public class MusicPlayer {
	private int volume = 50;

	public String play() {
		return "MusicPlayer is now playing";
	}

	public String stop(){
		return "MusicPlayer is stopped";
	}

	public String adjustVolume(int level) {
		this.volume = level;
		return "MusicPlayer volume set to " + level;
	}
}