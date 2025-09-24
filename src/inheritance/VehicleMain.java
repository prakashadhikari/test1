package inheritance;

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		vehicle.start();
		vehicle = new Car();
		vehicle.start();
		

	}

}
