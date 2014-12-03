
public class Car extends MotorVehicle
{
public Car()
	{
	make = "Chevy";
	speed = 200.0;
	}
public void carWheels()
	{
	System.out.println("A car has 4 wheels.");
	}
public void Speed()
	{
	System.out.println("The car is fast, it travels at " + speed + " mph.");
	}
public void CanRoll()
	{
	System.out.println("A car rolls on wheels.");
	}
}
