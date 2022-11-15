import java.util.Scanner;
public class Voteeligibility {
	int age;
	
	public static void checkElgibility(int age) {
		if(age <18) {
			int m = 18 - age;
			System.out.println("not eligible for vote until " +m+ " years");
		}
		else {
			System.out.println("congratulations");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		checkElgibility(a);
	}
}