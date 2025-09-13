package controllerProject;

interface TemperatureControllable {

	// by default, methods in interfaces are public and abstract
	void setTemperature(int degree);
	
	default void greeting() {
		System.out.println("Welcome");
		System.out.println("Inside a @TemperatureController");
	}
	
}