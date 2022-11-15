
import java.util.Scanner;

class Countsalesdesignation {
	public static void main(String[] args) {
		
		int n ,k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value: ");
		n = sc.nextInt();
		if(n<=0) {
			System.out.println("invalid input");
		}
		else {
			
		System.out.println("enter no of elements: ");
		//n = sc.nextInt();
		String arr [] = new String[100];
		for(int i=0;i<=n;i++) {
			arr[i] = sc.nextLine();
		}
		for(int i=0;i<=n;i++) {
			if(arr[i].contains("sales")) {
				k = k+1;
				//System.out.println(arr[i]);
			}
		}
		if(k==0) {
			System.out.println("No sales manager");
		}
		else {
		System.out.println("sales is :" +k);
		for(String a : arr) {
			if(a.contains("sales")) {
				System.out.println(a);
			}
		}
		
	}
	}

}
}