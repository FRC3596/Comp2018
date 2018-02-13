package org.usfirst.frc.team3596.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Elevator extends Subsystem {
	Spark leftMotor = new Spark(0);
	Spark rightMotor = new Spark(1);

	DigitalInput top = new DigitalInput(0);
	DigitalInput bottom = new DigitalInput(1);
	DigitalInput middle = new DigitalInput(2);
	
	SpeedControllerGroup elevatorMotor = new SpeedControllerGroup(leftMotor, rightMotor);
	


	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		//setDefaultCommand(new MySpecialCommand());
	}
	public void ElevatorDownward(){
		elevatorMotor.set(-.5);
		
	}

	public void ElevatorUpward(){
		elevatorMotor.set(.5);
	}

	public void ElevatorStop(){
		elevatorMotor.set(0);
	}

	public boolean isSwitchTrigger(){
		return (top.get() || bottom.get() || middle.get());
	}
	public void log(){
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

