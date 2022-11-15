class Employe {
	
	long employeId;
	String employeName;
	String employeAddress;
	long employePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	
	public Employe(long employeId, String employeName, String employeAddress, long employePhone ) {
		
		this.employeId = employeId;
		this.employeName = employeName;
		this.employeAddress = employeAddress;
		this.employePhone = employePhone;
	}
	
	public double calculateSalary() {
		double salary = basicSalary + (basicSalary*specialAllowance/100) + (basicSalary * hra/100);
		return salary;
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = 10/100 * basicSalary;
	}

}

class Manager extends Employe {

	public Manager(long employeId, String employeName, String employeAddress, long employePhone, double basicSalary) {
		super(employeId, employeName, employeAddress, employePhone);
		this.basicSalary = basicSalary;
	}
	
	public double calculateTransportAllowance(Manager m, int i) {
		double transportAllowance = 15 * basicSalary/100;
		return transportAllowance;
	}

}

public class SpecialAllowance extends Manager {

	public SpecialAllowance(long employeId, String employeName, String employeAddress, long employePhone, double basicSalary) {
		super(employeId, employeName, employeAddress, employePhone, basicSalary);
		
	}
	
	public static void main(String[] args) {
		
		Manager m = new Manager(126534, "Peter", "ChennaiIndia", 237844, 65000.0);
		double salary = m.calculateSalary();
		System.out.println("Manager Salary : " +salary);
		double transportAllowance = m.calculateTransportAllowance(m,10);
		
		System.out.println("Manager's TransportAllowance(15%) : " +transportAllowance);
	}

}