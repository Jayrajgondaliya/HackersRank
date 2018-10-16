import java.util.Scanner;

public class ABC {
	public static void main(String args[]) {
		System.out.println("Enter Number of Fibinacci: ");
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		System.out.println("This is Recursive: ");
		for(int i = 1; i<= num; i++ ) {
			System.out.print(fibonaciRecursive(i)+" ");
		}
		
		System.out.println("\nThis is Loop: ");
		for(int i = 1; i<= num; i++ ) {
			System.out.print(fibonaciLoop(i)+" ");
		}
	}	
	
	// fibonacci with Recursive function
	public static int fibonaciRecursive(int num) {
		if(num == 2 || num == 1) {
			return 1;
		}
			return fibonaciRecursive(num - 1) + fibonaciRecursive(num - 2);
	}
	
	public static int fibonaciLoop(int num) {
		if(num == 1 || num == 2) {
			return 1;
		}
		int fib1 = 1, fib2 = 1, fibonaci = 1;
		for(int i = 3; i <= num; i++) {
			fibonaci = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibonaci;
		}
		
		return fibonaci;
	}
}