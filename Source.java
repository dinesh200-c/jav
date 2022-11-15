import java.util.Scanner;
class Source {
	
	public static void ink(String a, int b , char c) {
		System.out.println("a is : " +a);
		System.out.println("b is : " +b);
		System.out.println("c is : " +c);
	}
	public static void ik(String d, int e, char f) {
		System.out.println("d is : " +d );
		System.out.println("e is : " +e );
		System.out.println("f is : " +f);
	}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	System.out.println("enter a :");
	String x = sc.nextLine();
	
	System.out.println("enter b :");
	int y = sc.nextInt();
	//sc.nextLine();
	
	System.out.println("enter c:");
	char z = sc.next().charAt(0);
	
	sc.nextLine();
	
	System.out.println("enter d:");
	String l = sc.nextLine();
	
	System.out.println("enter e: ");
	int n = sc.nextInt();
	
	
	System.out.println("enter f: ");
	char m = sc.next().charAt(0);
	
	
	Source k1 = new Source();
	Source k2 = new Source();
	
	ink(x,y,z);
	ik(l,n,m);
	
	
}

		

	
	
}
