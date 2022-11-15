import java.util.Scanner;
class Doctor {
	
	private int doctorId;
	private String doctorName;
	private String location;
	
	public Doctor() {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.location = location;
	}

	
	public String getDetails(int doctorId, String doctorName, String location) {
		return("DoctorId is: " +doctorId+ "\ndoctorName is: " +doctorName+ "\nLocation is: " +location);
	
	}
}

class SpecalistDoctor extends Doctor {
	
	String specialist;
	
	public SpecalistDoctor () {
		this.specialist = specialist;
	}
	
	public String getDetails(int doctorId,String doctorName, String location, String specialist ) {
		
		return ("doctor id is: " +doctorId+ "\nDoctor Name is : " +doctorName+ "\nDoctor location is : " +location+ "\nDoctor speciality is : " +specialist);
		
	}

}



public class Doctorprogram {
	
	public static void main(String[] args) {
		
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name: ");
		name = sc.nextLine();
		
		switch(name) {
		case "doctor" :
			System.out.println();
			break;
			
		case "specialist" :
			System.out.println();
			break;
			
			default:
				System.out.println("invalid");
		}	
		
		//System.out.println("enter doctorId: ");
		int doctorId = sc.nextInt();
		
		sc.nextLine();
		
		//System.out.println("enter doctor Name: ");
		String doctorName = sc.nextLine();
		
		//System.out.println("enter location : ");
		String location = sc.nextLine();
		
		//System.out.println("enter speciality: ");
		String specialist = sc.nextLine();
		
         Doctor d1 = new Doctor();
		
		System.out.println();
		
		SpecalistDoctor s1 = new SpecalistDoctor();
		
		switch(name) {
		
		case "doctor" :
			System.out.println(d1.getDetails(doctorId, doctorName, location));
			break;
			
		case "specialist" :
			System.out.println(s1.getDetails(doctorId, doctorName, location, specialist));
			break;

			default:
				System.out.println("invalid");
		}	
		
	}

}

