import java.util.Scanner;

public class NoOfCommonFactors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int factors = 0;
		for(int i=1; i<=n1/2 || i<=n2/2; i++) {
			if(n1%i==0 && n2%i==0) {
				factors++;
			}
		}
		System.out.println(factors);
	}
}
