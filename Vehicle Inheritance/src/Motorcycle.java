
public class Motorcycle extends MotorVehicle
{
public Motorcycle()
	{
	speed = 150.0;
	vehicle = "Motorcycle";
	myHasWheels = (HasWheels) new WithWheels();
	}
public void wheels()
	{
	System.out.println("A motorcycle has 2 wheels.");
	}
public void speed()
	{
	super.Speed();
	}
}
