package controllerProject;

interface LightControllable {

	public static final int NO_OF_LIGHT = 0;
	
	// by default, methods in interfaces are public and abstract
	void turnOnLights(); 
	void turnOffLights();
	
	default void greeting() {
		System.out.println("Welcome");
	}
	
//	private void myMethod() {
//		System.out.println("I am responsible for turning lights on and off");
//	}
	
	
}