
public class Car extends MotorVehicle
{
public Car()
	{
	vehicle = "Car";
	speed = 200.0;
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
