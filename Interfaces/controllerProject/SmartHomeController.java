package controllerProject;

// SmartHomeController implements All Interfaces
public class SmartHomeController implements LightControllable, SecurityControllable, TemperatureControllable, EntertainmentControllable{
	
	public void turnOnLights() {
		System.out.println(LightControllable.NO_OF_LIGHT);
		System.out.println("Turning on all lights");
	}
	
	public void turnOffLights() {
		System.out.println("Turning off all lights");
	}
	
	public void setTemperature(int degree) {
		System.out.println("Setting temperature to " + degree + " degree C");
	}
	
	public void armSecurity() {
		System.out.println("Security system armed");
	}
	
	public void disarmSecurity() {
		System.out.println("Security system disarmed");
	}
	
	public void playMusic() {
		System.out.println("Playing your favorite music playlist");
	}
	
	public void stopMusic() {
		System.out.println("Stopping music playback");
	}

	@Override
	public void greeting() {
		TemperatureControllable.super.greeting();
	}
	
}