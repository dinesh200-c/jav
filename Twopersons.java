
import java.util.Scanner;
public class Twopersons {
	
	 String name;
	 int age;
	 char gender;
	 
	public Twopersons() {
	}
	
	public void checkPerson() {
       Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		int c = sc.nextInt();
		
		char e = sc.next().charAt(0);
		
		String b = sc.next();
		
		int d = sc.nextInt();
		
		char f = sc.next().charAt(0);
		int count=0;
		if(a.equals(b)) {
			count++;
		}
		if(c == d) {
			count++;
		}
	if(e == f) {
		count++;
	}
	
	if(count>=3) {
		System.out.println("same");
	}
	else {
		System.out.println("different");
	}
	}
	public static void main(String[] args) {
		
		Twopersons a1 = new Twopersons();
		a1.checkPerson();
}
}
