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
    	   }
    public void Forward(){
    	ConveyorL.set(1);
    	ConveyorR.set(-1);
    }
    public void Backward(){
    	ConveyorL.set(-1);
    	ConveyorR.set(1);
    }
    public void Stop(){
    	ConveyorL.set(0);
    	ConveyorR.set(0); 
    }
}

