

class Equalitycheck {
	int customerId;
	String name;
	String city;
	String phone;
	String email;
	
	public Equalitycheck(int customerId, String name, String city, String phone, String email) {
		
		this.customerId = customerId;
		this.name = name;
		this.city = city;
		this.phone = phone;
		this.email = email;

	}
	
	public Equalitycheck() {
		// TODO Auto-generated constructor stub
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean equals(Equalitycheck obj) {
		Equalitycheck c = (Equalitycheck) obj;
		if(customerId != c.customerId ) {
			return false;
		}
		if(name != c.name) {
			return false;
		}
		if(city != c.city) {
			return false;
		}
		if(phone != phone) {
			return false;
		}
		if(email != email) {
			return false;
		}
		if(c.getEmail() != email) {
			return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Equalitycheck c1 = new Equalitycheck(1,"Vinod","Banglore",null,null);
		Equalitycheck c2 = new Equalitycheck(1,"Vinod","Banglore",null,null);
		
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c1));
		
		System.out.println();
		
		c1.setEmail("vinod@gmail.com");
		
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c1));
		
		System.out.println();
		
		c2.setEmail("vinod@gmail.com");
		
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c1));
		
		System.out.println();
		
		Equalitycheck c3 = new Equalitycheck();
		Equalitycheck c4 = new Equalitycheck();
		
		System.out.println(c3.equals(c4));
		//System.out.println(c4.equals(c3));
		
	}


}
