
public abstract class Helicopter extends AirVehicles
{
public Helicopter()
	{
	speed = 350.0;
	make = "EuroCopter";
	}
public void speed()
	{
	System.out.println("A helicopter travels at " + speed + " mph.");
	}
public void rotors()
	{
	System.out.println("A helicopter has rotors to fly.");
	}
}
