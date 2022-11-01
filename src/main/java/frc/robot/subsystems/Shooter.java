package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import frc.robot.Constants;
    
public class Shooter extends SubsystemBase {
    private WPI_TalonFX rIght_shooter_motor = new WPI_TalonFX(Constants.Shooter.right_shooter_motor);
    private WPI_TalonFX lEft_shooter_motor = new WPI_TalonFX(Constants.Shooter.left_shooter_motor);     
    private MotorControllerGroup shooter = new MotorControllerGroup(lEft_shooter_motor, rIght_shooter_motor);
    public Shooter () {
        rIght_shooter_motor.setInverted(true);
    }
}
