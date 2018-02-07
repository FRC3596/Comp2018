package org.usfirst.frc.team3596.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Conveyor extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Spark Conveyor = new Spark(0);
	
	Spark RollerLeft = new Spark(1);
	Spark RollerRight = new Spark(2);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	   }
    public void Forward(){
    	Conveyor.set(1);
    }
    public void Backward(){
    	Conveyor.set(-1);
    	RollerRight.set(.5);
    	RollerLeft.set(-.5);
    }
    public void Stop(){
    	Conveyor.set(0);
    }
}

