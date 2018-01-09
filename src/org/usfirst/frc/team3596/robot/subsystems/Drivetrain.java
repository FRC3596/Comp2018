package org.usfirst.frc.team3596.robot.subsystems;

//import org.usfirst.frc.team3596.robot.RobotMap;
import org.usfirst.frc.team3596.robot.commands.TankDrive_Joystick;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain extends Subsystem {
	WPI_TalonSRX frontLeftMotor = new WPI_TalonSRX(1);
	WPI_TalonSRX backLeftMotor = new WPI_TalonSRX(2);
	WPI_TalonSRX frontRightMotor = new WPI_TalonSRX(3);
	WPI_TalonSRX backRightMotor = new WPI_TalonSRX(4);
		
	
	SpeedControllerGroup leftMotors = new SpeedControllerGroup(frontLeftMotor, backLeftMotor);
	SpeedControllerGroup rightMotors = new SpeedControllerGroup(frontRightMotor,backRightMotor);
	
	DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void drive(Joystick joy) {
		drive.arcadeDrive(-joy.getY(), -joy.getRawAxis(2));
	}
	public void drive(double left, double right) {
		drive.arcadeDrive(left, right);
	}

    public void initDefaultCommand() {
    	setDefaultCommand(new TankDrive_Joystick());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

