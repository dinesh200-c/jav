

public class Doctorcheck {
	String special;
	int fee;
	double salary;
	
	public Doctorcheck(String special, int fee, double salary) {
		this.special = special;
		this.fee = fee;
		this.salary = salary;
		
		System.out.println("Doctor Specialist is : " +special);
		System.out.println("Pay to Doctor : " +salary);
		System.out.println("Visitors fee is : " +fee);
	}
	
	public Doctorcheck() {
		// TODO Auto-generated constructor stub
	}
	
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public boolean equals(Doctorcheck obj) {
		Doctorcheck c = (Doctorcheck) obj;
		if(special != c.special) {
			return false;
		}
		if(fee != c.fee) {
			return false;
		}
		if(salary != c.salary) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Doctorcheck doc1 = new Doctorcheck("Obstetrician",500,2250.3);
		Doctorcheck doc2 = new Doctorcheck();
		doc2.setFee(500);
		doc2.setSalary(2250.3);
		doc2.setSpecial("Obstetrician");
		
		if(doc1.equals(doc2) == true) {
			System.out.println("Doctor Specialist is : " +doc1.special);
			System.out.println("Pay to Doctor : " +doc1.salary);
			System.out.println("Visitors fee is : " +doc1.fee);
			
			System.out.println();
			
            System.out.println("Doctor Specialist is : " +doc2.special);
			System.out.println("Pay to Doctor : " +doc2.salary);
			System.out.println("Visitors fee is : " +doc2.fee);
			System.out.println();
			System.out.println("both are same");
		}
			else {
				System.out.println("both are not same");
			}
	}
}
