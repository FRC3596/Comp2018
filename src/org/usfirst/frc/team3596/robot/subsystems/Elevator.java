package org.usfirst.frc.team3596.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Elevator extends Subsystem {

	Spark mainMotor = new Spark(0);

	DigitalInput top = new DigitalInput(0);
	DigitalInput bottom = new DigitalInput(1);
	DigitalInput middle = new DigitalInput(2);


	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		//setDefaultCommand(new MySpecialCommand());
	}
	public void ElevatorDown(){
		mainMotor.set(-1);
	}
	
	public void ElevatorUp(){
		mainMotor.set(1);
	}
	
	public void ElevatorStop(){
		mainMotor.set(0);
	}
	
	public boolean isSwitchTrigger(){
		return (top.get() || bottom.get() || middle.get());
	}
	public void log(){
		SmartDashboard.putNumber("Elevator Motor", mainMotor.getSpeed());
		SmartDashboard.putBoolean("TOP SWITCH",top.get());
		SmartDashboard.putBoolean("BOTTOM SWITCH", bottom.get());
		SmartDashboard.putBoolean("MIDDLE SWITCH", middle.get());
	}
	public boolean topCheck(){
		return top.get();
	}
	public boolean bottomCheck(){
		return bottom.get();
	}

}

