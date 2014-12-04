
public class Vehicle 
{
protected double speed;
protected String vehicle;
protected HasWheels myHasWheels;
protected String parts;
public void moves()
	{
	System.out.println("All vehicles move.");
	}
public void Speed()
	{
	System.out.println("The " + vehicle + " can travel at " + speed + " mph.");
	}	
}
