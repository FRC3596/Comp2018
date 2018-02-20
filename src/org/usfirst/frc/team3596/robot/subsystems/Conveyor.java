package org.usfirst.frc.team3596.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Conveyor extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	WPI_VictorSPX Conveyor = new WPI_VictorSPX(0);
	
	Spark RollerLeft = new Spark(1);
	Spark RollerRight = new Spark(2);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	   }
    public void Forward(){
    	Conveyor.set(1);
    	RollerRight.set(-.5);
    	RollerLeft.set(.5);
    }
    public void Backward(){
    	Conveyor.set(-1);
    	RollerRight.set(.5);
    	RollerLeft.set(-.5);
    }
    public void Stop(){
    	Conveyor.set(0);
    	RollerRight.set(0);
    	RollerLeft.set(0);
    }
}

