

public class ToString{
	
	String firstName;
	String lastName;
	int phoneNumber;
	
	public ToString () {
		
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return "Employee [ firstName = " +firstName+", lastName = " +lastName+", phoneNumber = " +phoneNumber+"]";
		
	}
	
	public static void main(String[] args) {
		
		ToString emp = new ToString();
		
		emp.setFirstName("jay");
		emp.setLastName("Kumar");
		emp.setPhoneNumber(77777);
		
		System.out.println(emp);
			
	}
}


