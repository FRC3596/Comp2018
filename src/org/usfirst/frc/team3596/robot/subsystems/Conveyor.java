package org.usfirst.frc.team3596.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Conveyor extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Spark ConveyorL = new Spark(0);
	Spark ConveyorR = new Spark(1);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void Forward(){
    	
    }
    public void Backward(){
    	
    }
}

