import java.util.Scanner;

public class PrimeNumbeFinder {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number to Check Number is Prime or Not");
		int t = scan.nextInt();
		scan.nextLine();
		if(isPrime(t)) {
			System.out.println(t+ " is prime");
		}else {
			System.out.println(t+ " is not a prime");
		}
	}
	
	public static boolean isPrime(int num) {
		int temp = num/2;
		for(int i=1; i<=temp; i++ ) {
			if(num % i == 0) {
				return true;
			}
			continue;
		}
		return false;
	}
}
