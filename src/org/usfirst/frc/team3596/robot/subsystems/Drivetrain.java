package org.usfirst.frc.team3596.robot.subsystems;

//import org.usfirst.frc.team3596.robot.RobotMap;
import org.usfirst.frc.team3596.robot.commands.TankDrive_Joystick;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain extends Subsystem {

	Encoder enc1 = new Encoder(0,1);
	Encoder enc2 = new Encoder(2,3);

	SpeedControllerGroup leftMotors = new SpeedControllerGroup(new WPI_TalonSRX(1),new WPI_TalonSRX(2));
	SpeedControllerGroup rightMotors = new SpeedControllerGroup(new WPI_TalonSRX(3),new WPI_TalonSRX(4));

	DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

	public Drivetrain(){
		enc1.setDistancePerPulse(0.5);
		enc2.setDistancePerPulse(0.5);
		
		
	}
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public void drive(Joystick joy) {
		drive.arcadeDrive(joy.getY(), joy.getRawAxis(2));
	}
	public void drive(double move, double rotate) {
		drive.arcadeDrive(move, rotate);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new TankDrive_Joystick());
		// Set the default command for a subsystem here.
		//setDefaultCommand(new MySpecialCommand());
	}
	public void encoderReset(){
		enc1.reset();
		enc2.reset();
	}
}