
public class Car extends MotorVehicle
{
public Car()
	{
	vehicle = "Car";
	speed = 200.0;
	myHasWheels = (HasWheels) new NeedsWheels();
	}
public void wheels()
	{
	System.out.println("A car has 4 wheels.");
	}
public void speed()
	{
	super.Speed();
	}
}
