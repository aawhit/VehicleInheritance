
public class Motorcycle extends MotorVehicle
{
public Motorcycle()
	{
	speed = 150.0;
	vehicle = "Motorcycle";
	numWheels = 4;
	myHasWheels = (HasWheels) new NeedsWheels();
	}
public void wheels()
	{
	super.wheels();
	}
public void speed()
	{
	super.Speed();
	}
}
