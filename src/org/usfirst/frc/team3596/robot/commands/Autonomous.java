package org.usfirst.frc.team3596.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous extends CommandGroup {

    public Autonomous() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

    	addSequential(new GoForward(3));
    	
    	
    	
    	
    	
    }
}
