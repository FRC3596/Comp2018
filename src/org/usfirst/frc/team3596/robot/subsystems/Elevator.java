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
	DigitalInput top = new DigitalInput(4);
	DigitalInput bottom = new DigitalInput(5);
	DigitalInput middle = new DigitalInput(6);
	
	SpeedControllerGroup elevatorMotor = new SpeedControllerGroup(new Spark(3), new Spark(4));
	


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
		elevatorMotor.set(.60);
	}

	public void ElevatorStop(){
		elevatorMotor.set(0);
	}

	
	public void log(){
		SmartDashboard.putBoolean("TOP SWITCH",!top.get());
		SmartDashboard.putBoolean("BOTTOM SWITCH", !bottom.get());
		SmartDashboard.putBoolean("MIDDLE SWITCH", !middle.get());
	}
	public boolean middleCheck(){
		return !bottom.get() ;
	}
	public boolean topCheck(){
		return !top.get();
	}
	public boolean bottomCheck(){
		return !bottom.get();
	}

}

