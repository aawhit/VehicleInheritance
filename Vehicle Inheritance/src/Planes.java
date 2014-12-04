
public class Planes extends AirVehicles
{
	public Planes()
	{
	vehicle = "Plane";
	speed = 700.0;
	myHasWheels = (HasWheels) new NotNeedsWheels();
	parts = "Wings";
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
