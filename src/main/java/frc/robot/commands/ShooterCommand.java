// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.Shootersubsystem;

/** An example command that uses an example subsystem. */
public class ShooterCommand extends Command {
  Shootersubsystem shootersubsystem;
  public ShooterCommand(){
    addRequirements(Robot.shootersubsystem);
  }
  

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
   Robot.shootersubsystem.leftSpeed(Robot.shootersubsystem.leftY()*Robot.shootersubsystem.speedMult());
   Robot.shootersubsystem.rightSpeed(Robot.shootersubsystem.rightY()*Robot.shootersubsystem.speedMult());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
