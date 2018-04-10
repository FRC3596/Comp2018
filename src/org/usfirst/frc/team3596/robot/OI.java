package org.usfirst.frc.team3596.robot;


import org.usfirst.frc.team3596.robot.commands.ElevatorDown;
import org.usfirst.frc.team3596.robot.commands.ElevatorStop;
import org.usfirst.frc.team3596.robot.commands.ElevatorUp;
import org.usfirst.frc.team3596.robot.commands.ConveyorBkwd;
import org.usfirst.frc.team3596.robot.commands.ConveyorFwd;
import org.usfirst.frc.team3596.robot.commands.ConveyorStop;
import org.usfirst.frc.team3596.robot.commands.Drive_Slow;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick joy = new Joystick(0);
	

	JoystickButton X = new JoystickButton(joy, 1);
	JoystickButton A = new JoystickButton(joy, 2);
	JoystickButton B = new JoystickButton(joy, 3);
	JoystickButton Y = new JoystickButton(joy, 4);
	JoystickButton LB = new JoystickButton(joy, 5);
	JoystickButton RB = new JoystickButton(joy, 6);
	JoystickButton LT = new JoystickButton(joy, 7);
	JoystickButton RT = new JoystickButton(joy, 8);
	JoystickButton BACK = new JoystickButton(joy, 9);
	JoystickButton START = new JoystickButton(joy, 10);
	JoystickButton LSB = new JoystickButton(joy, 11);
	JoystickButton RSB = new JoystickButton(joy, 12);

	double LEFT_X_AXIS = joy.getRawAxis(0);
	double LEFT_Y_AXIS = joy.getRawAxis(1);
	double RIGHT_X_AXIS = joy.getRawAxis(2);
	double RIGHT_Y_AXIS = joy.getRawAxis(3);

	boolean topTrigger = Robot.elevator.topCheck();
	boolean bottomTrigger = Robot.elevator.bottomCheck();
	public OI(){
		// Put Command triggers Here

		LB.whenActive(new ElevatorUp());
		RB.whenActive(new ElevatorDown());

		LB.whenInactive(new ElevatorStop());
		RB.whenInactive(new ElevatorStop());
		
		RT.whenActive(new ConveyorFwd());
		RT.whenInactive(new ConveyorStop());
		
		LT.whenActive(new ConveyorBkwd());
		LT.whenInactive(new ConveyorStop());
		
		X.toggleWhenPressed(new Drive_Slow());
		
	}

	public Joystick getJoystick() {
		return joy;
	}

	public void log(){

		SmartDashboard.putBoolean("X Button", X.get());
		SmartDashboard.putBoolean("A Button", A.get());
		SmartDashboard.putBoolean("B Button", B.get());
		SmartDashboard.putBoolean("Y Button", Y.get());
		SmartDashboard.putBoolean("LB Button", LB.get());
		SmartDashboard.putBoolean("RB Button", RB.get());
		SmartDashboard.putBoolean("LT Button", LT.get());
		SmartDashboard.putBoolean("RT Button", RT.get());
		SmartDashboard.putBoolean("BACK Button", BACK.get());
		SmartDashboard.putBoolean("START Button", START.get());
		SmartDashboard.putBoolean("LSB Button", LSB.get());
		SmartDashboard.putBoolean("RSB Button", RSB.get());

		SmartDashboard.putNumber("Left X Axis", LEFT_X_AXIS);
		SmartDashboard.putNumber("Left Y Axis", LEFT_Y_AXIS);
		SmartDashboard.putNumber("Right X Axis", RIGHT_X_AXIS);
		SmartDashboard.putNumber("Right Y Axis", RIGHT_Y_AXIS);

	}
}
