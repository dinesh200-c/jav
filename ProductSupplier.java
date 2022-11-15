import java.util.Scanner;
class Product {
	
	private long id;
	private String productName;
	private String supplierName;
	
	public Product() {
		
	}

	public Product(long id, String productName, String supplierName) {
		super();
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}

	
	public void display() {
		System.out.println("product id is : " +id);
		System.out.println("product name is : " +productName);
		//System.out.println("Supplier Name is : Nivas");
	}
}
class ProductSupplier {
	
	static String sky;
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("enter product id : ");
    	int a = sc.nextInt();
    	
    	sc.nextLine();
    	
    	System.out.println("enter a product name : ");
    	String b = sc.nextLine();
    	
    	System.out.println("Is product supplied by nivas yes or no : ");
    	String c = sc.nextLine();
    	
    
    	Product p1 = new Product(a,b,c);
    	
    	
    	switch(c) {
    	  case "yes" :
    		  p1.display();
    		  System.out.println("Supplier is : nivas");
    		  break;
    		 default :
    			 System.out.println("Enter Supplier Name : ");
    			  String sky = sc.nextLine();
    			  p1.display();
    			  System.out.println("Supplier is :" +sky);
				  break;
    	  }
	}

}

