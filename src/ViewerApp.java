package commandPattern;

public class ViewerApp {
	public static void main(String[] args){
		Tv tv = new Tv();
		Light light = new Light();
		Thermostat thermostat = new Thermostat();
		MusicPlayer musicPlayer = new MusicPlayer();
		RemoteControl remote = new RemoteControl();

		//testing devices
        System.out.println("Tv:");
        remote.setCommand(new onTv(tv));
        remote.clickButton();
        
        remote.setCommand(new channelChange(tv, 8));
        remote.clickButton();
        
        remote.setCommand(new offTv(tv));
        remote.clickButton();
        System.out.println("\nLight:");
        remote.setCommand(new onLight(light));
        remote.clickButton();
        
        remote.setCommand(new brightnessAdjust(light, 75));
        remote.clickButton();
        
        remote.setCommand(new offLight(light));
        remote.clickButton();
        System.out.println("\nThermostat:");
        remote.setCommand(new increaseTemperature(thermostat));
        remote.clickButton();
        
        remote.setCommand(new decreaseTemperature(thermostat));
        remote.clickButton();
        System.out.println("\nMusic Player:");
        remote.setCommand(new musicPlay(musicPlayer));
        remote.clickButton();
        
        remote.setCommand(new volumeAdjust(musicPlayer, 20));
        remote.clickButton();
        
        remote.setCommand(new musicStop(musicPlayer));
        remote.clickButton();
    }
}