package undo;

public class RemoteLoader {
 
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 
		Light livingRoomLight = new Light("Living Room");
 
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);
 
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
 
//		remoteControl.onButtonWasPushed(0); // on 상태
//		remoteControl.offButtonWasPushed(0); // off 상태
//		System.out.println(remoteControl);
//		remoteControl.undoButtonWasPushed(); // off 상태를 취소 -> on 상태로 변환
//		remoteControl.offButtonWasPushed(0); // off 상태
//		remoteControl.onButtonWasPushed(0); // on 상태
//		System.out.println(remoteControl);
//		remoteControl.undoButtonWasPushed(); // off 상태
//
		CeilingFan ceilingFan = new CeilingFan("Living Room");

		CeilingFanMediumCommand ceilingFanMedium =
				new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh =
				new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff =
				new CeilingFanOffCommand(ceilingFan);

		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

		remoteControl.onButtonWasPushed(0); // medium 상태
		remoteControl.offButtonWasPushed(0); // off 상태
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed(); // off 상태 취소 -> medium 상태

		remoteControl.onButtonWasPushed(1); // high 상태
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed(); // high 상태 취소 -> medium 상태
	}
}
