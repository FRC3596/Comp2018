package org.usfirst.frc.team3596.robot.commands;

import org.usfirst.frc.team3596.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ConveyorBkwd extends Command {

	
    public ConveyorBkwd() {
    	requires(Robot.conveyor);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.conveyor.Backward();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.conveyor.Stop();
    }

}
