/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.Constants_Drive;


public class DriveSystem extends SubsystemBase {
  private final  VictorSPX leftBackMotor = new VictorSPX(Constants_Drive.leftBackMotor) ;
  private final  VictorSPX leftFrontMotor = new VictorSPX(Constants_Drive.leftFrontMotor) ;
  private final  VictorSPX rightBakcMotor = new VictorSPX(Constants_Drive.rightBackMotor) ;
  private final  VictorSPX rightFrontMotor = new VictorSPX (Constants_Drive.rightFrontMotor) ;
  

  /**
   * Creates a new ExampleSubsystem.
   */
  public DriveSystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
