
public class VehicleRunner 
{

	public static void main(String[] args) 
	{
		MotorVehicle[] motorvehicle = new MotorVehicle[2];
		motorvehicle[0] = new Car();
		motorvehicle[1] = new Motorcycle();

		for (int i = 0; i < motorvehicle.length; i++)
			{
			motorvehicle[i].usesWheels();
			motorvehicle[i].Speed();
			motorvehicle[i].myHasWheels.WithWheels();
			System.out.println("");
			}

		AirVehicles[] airvehicles = new AirVehicles[2];
		airvehicles[0] = new Planes();
		airvehicles[1] = new Helicopter();

		for (int i = 0; i < airvehicles.length; i++)
			{
			airvehicles[i].Speed();
			airvehicles[i].body();
			airvehicles[i].myHasWheels.WithoutWheels();
			System.out.println("");
			}	
	}	
}


