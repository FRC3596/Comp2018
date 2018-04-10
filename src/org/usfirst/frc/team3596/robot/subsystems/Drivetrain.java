package org.usfirst.frc.team3596.robot.subsystems;

//import org.usfirst.frc.team3596.robot.RobotMap;
import org.usfirst.frc.team3596.robot.commands.TankDrive_Joystick;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Drivetrain extends Subsystem {

	Encoder leftEncoder = new Encoder(0,1);
	Encoder rightEncoder = new Encoder(2,3);

	SpeedControllerGroup leftMotors = new SpeedControllerGroup(new WPI_TalonSRX(1),new WPI_TalonSRX(2));
	SpeedControllerGroup rightMotors = new SpeedControllerGroup(new WPI_TalonSRX(3),new WPI_TalonSRX(4));
	DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

	public Drivetrain(){
		leftEncoder.setDistancePerPulse(0.5);
		rightEncoder.setDistancePerPulse(0.5);
		
		
	}
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public void drive(Joystick joy, double ramp) {
		drive.tankDrive(Math.pow(-joy.getRawAxis(1)*ramp, 3),(Math.pow(-joy.getRawAxis(3)*ramp, 3)));
	}

	public void drive(double move, double rotate) {
		drive.tankDrive(move, rotate);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new TankDrive_Joystick());
		// Set the default command for a subsystem here.
		//setDefaultCommand(new MySpecialCommand());
	}
	public void encoderReset(){
		leftEncoder.reset();
		rightEncoder.reset();
	}
	public void log(){
		SmartDashboard.putNumber("Left Encoder", leftEncoder.getDistance());
		SmartDashboard.putNumber("Right Encoder", rightEncoder.getDistance());
	}
}