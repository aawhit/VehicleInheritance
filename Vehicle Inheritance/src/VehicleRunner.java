
public class VehicleRunner 
{

	public static void main(String[] args) 
	{
		Vehicle v = new Vehicle();
		MotorVehicle mv = new MotorVehicle();
		AirVehicles av = new AirVehicles();
		Car c = new Car();
		Motorcycle m = new Motorcycle();
		Planes p = new Planes();
		Helicopter h = new Helicopter();
		
		
		v.moves();
		
		mv.usesWheels();
		
		av.flies();
		
		c.carWheels();
		c.Speed();
		c.CanRoll();
		
		m.hasWheels();
		m.speed();
		m.CanRoll();
		
		p.speed();
		p.hasWings();
		
		h.speed();
		h.rotors();
			}	
	}


