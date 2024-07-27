package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.DriveTrainCommand;
import frc.robot.commands.ShooterCommand;


public class Shootersubsystem extends SubsystemBase{
    CANSparkMax rightShooter;
    CANSparkMax leftShooter;
    XboxController controller;


    public Shootersubsystem(){ 
        rightShooter = new CANSparkMax(1, MotorType.kBrushless);
        leftShooter = new CANSparkMax(2, MotorType.kBrushless);

        controller = new XboxController(1);

    }
    public void leftSpeed(double speed) {
        leftShooter.set(speed);
    }
    public void rightSpeed(double speed) {
    rightShooter.set(speed);

    }

    public double leftY() {
        return controller.getLeftY();
    }
    public double rightY() {
        return controller.getRightY();
    }

    public double speedMult(){
        return 0.2;
    }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    setDefaultCommand(new ShooterCommand());
  }

    
}
