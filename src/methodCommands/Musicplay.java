package commandPattern;

public class musicPlay implements Command {

	private MusicPlayer musicPlayer;
	public musicPlay(MusicPlayer musicPlayer){
		this.musicPlayer = musicPlayer;
	}
	@Override
	public String execute() {
		return musicPlayer.play();
	}

}