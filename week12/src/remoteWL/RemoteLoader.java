package remoteWL;

public class RemoteLoader {
 
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
 
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan= new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("Main house");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub("My Room");

//		remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
		remoteControl.setCommand(0, ()->livingRoomLight.on(), ()->livingRoomLight.off());
		remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
		remoteControl.setCommand(2, ceilingFan::high, ceilingFan::off);
		
		Command stereoOnWithCD = () -> { 
			stereo.on(); stereo.setCD(); stereo.setVolume(11);
		};
		remoteControl.setCommand(3, stereoOnWithCD, stereo::off);
		remoteControl.setCommand(4, garageDoor::up, garageDoor::down);
  		remoteControl.setCommand(5, hottub::on, hottub::off);
		remoteControl.setCommand(6, hottub::bubblesOn, hottub::bubblesOff);

		System.out.println(remoteControl);

		// setCommand를 하지 않으면 동작 x
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtonWasPushed(4);  
		remoteControl.offButtonWasPushed(4);
		remoteControl.onButtonWasPushed(5);
		remoteControl.onButtonWasPushed(6);
		remoteControl.offButtonWasPushed(6);
		remoteControl.offButtonWasPushed(5);
	}
}
