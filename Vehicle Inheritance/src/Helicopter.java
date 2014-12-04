
public class Helicopter extends AirVehicles
{
public Helicopter()
	{
	speed = 350.0;
	vehicle = "Helicopter";
	myHasWheels = (HasWheels) new WithoutWheels();
	parts = "Rotors";
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
