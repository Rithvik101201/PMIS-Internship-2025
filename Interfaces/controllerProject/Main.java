package controllerProject;

public class Main {

	public static void main(String[] args) {

		SmartHomeController controller = new SmartHomeController();
		
		System.out.println("---- Lighting System ----");
//		controller.myMethod(); // we cannot call this method because it is private
		controller.turnOnLights();
		controller.turnOffLights();
		
		System.out.println("\n---- Temperature Control ----");
		controller.greeting();
		controller.setTemperature(22);
		
		System.out.println("\n---- Security System ----");
		controller.armSecurity();
		controller.disarmSecurity();
		
		System.out.println("\n---- Entertainment ----");
		controller.playMusic();
		controller.stopMusic();
	}

}
