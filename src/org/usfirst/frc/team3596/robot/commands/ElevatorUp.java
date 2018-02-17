package org.usfirst.frc.team3596.robot.commands;

import org.usfirst.frc.team3596.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorUp extends Command {

	public ElevatorUp() {
		requires(Robot.elevator);
	}

	// Called just before this Command runs the first time
	protected void initialize() {

	}

	protected void execute(){
		Robot.elevator.ElevatorUpward();
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		if(Robot.elevator.bottomCheck() == true)
    	{
    		return false;
    	}
    	else
    	{
    		return true;
    	}
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.elevator.ElevatorStop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
