
import java.util.Scanner;

public class Hrdesignation {
	public static void main(String[] args) {
		int n,k=0;
		String arr[] = new String[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value: ");
		n = sc.nextInt();
		if(n<=0) {
			System.out.println("invalid");
		}
		else {
			System.out.println("enter array elements :");
			for(int i=0;i<=n;i++) {
				arr[i] = sc.nextLine();
			}
			for(int i=0;i<=n;i++) {
				if(arr[i].contains("hr")) {
					k = k+1;
					//System.out.println(arr[i]);
				}
			}
			if(k==0) {
				System.out.println("no hr designations");
			}
			else {
				System.out.println("total hr designations are : " +k);
				for (String a : arr) {
                    if (a.contains("hr")) {
                        System.out.println(a);
                    }
			}
			    }
		}
	}
}


