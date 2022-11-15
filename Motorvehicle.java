
class Motorvehicle {
	public String driveStatus() {
		return("preparing for drive");
	}
	public String driveVehicle() {
		return null;
	}
	
}
class TwoWheeler extends Motorvehicle {

	@Override
	public String driveVehicle() {
		// TODO Auto-generated method stub
		return("You are Driving two wheeler");
	}

}
class FourWheeler extends Motorvehicle {

	@Override
	public String driveVehicle() {
		// TODO Auto-generated method stub
		return ("You are driving four wheeler");
	}
	
	public static void main(String[] args) {
		
		Motorvehicle mar = new Motorvehicle(); 
		System.out.println(mar.driveStatus());
		
		TwoWheeler tar = new TwoWheeler();
		System.out.println(tar.driveVehicle());
		
		Motorvehicle kar = new Motorvehicle(); 
		System.out.println(kar.driveStatus());
	
		FourWheeler var = new FourWheeler();
		System.out.println(var.driveVehicle());
		
		
		
	}	

}

