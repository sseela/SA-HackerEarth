import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of characters: ");
		int no = sc.nextInt();
		System.out.println("enter the characters: ");
		char[] arr = new char[no];
		for(int i=0; i<no; i++) {
			arr[i] = sc.next().charAt(0);
		}
		String str="";
		for(char c: arr) {
			str = str+c;
		}
		System.out.println(str);
		
	}
}
