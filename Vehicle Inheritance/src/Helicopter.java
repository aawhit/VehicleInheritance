
public class Helicopter extends AirVehicles
{
public Helicopter()
	{
	speed = 350.0;
	vehicle = "Helicopter";
	parts = "Rotors";
	myHasWheels = (HasWheels) new NotNeedsWheels();
	}
public void speed()
	{
	super.Speed();
	}
public void body()
	{
	super.body();
	}
}
