
public abstract class Motorcycle extends MotorVehicle
{
public Motorcycle()
	{
	speed = 150.0;
	make = "Harley Davidson";
	//myHasWheels = (HasWheels) new CanRoll();
	}
public void hasWheels()
	{
	System.out.println("A motorcycle has 2 wheels.");
	}
public void speed()
	{
	System.out.println("A motorcylce travels at " + speed + " mph.");
	}
public void CanRoll()
	{
	System.out.println("A motorcyle rolls on wheels.");
	}
}
