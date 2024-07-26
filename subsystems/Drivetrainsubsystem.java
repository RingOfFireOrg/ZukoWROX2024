// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.DriveTrainCommand;

public class Drivetrainsubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  VictorSP frontLeft;
  VictorSP frontRight;
  VictorSP backRight;
  VictorSP backLeft;
  XboxController controller;

  public Drivetrainsubsystem() {
    frontLeft = new VictorSP(1);
    frontRight = new VictorSP(2);
    backRight = new VictorSP(3);
    backLeft = new VictorSP(4);

    frontRight.setInverted(true);
    backRight.setInverted(true);

    controller = new XboxController(0);
  }



  public void leftSpeed(double speed) {
    frontLeft.set(speed);
    frontRight.set(speed);
  }
  public void rightSpeed(double speed) {
  backLeft.set(speed);
  backRight.set(speed);
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
    setDefaultCommand(new DriveTrainCommand());
  }




}



