import java.util.Scanner;

// Function is Armstrong if it is the sum of the cube of each digit of its.
public class Armstrong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.nextLine();
		if(isArmstrong(num)) {
			System.out.println(num + " is Armstrong Number");
		}else {
			System.out.println(num + " is not a Armstrong Number");		
		}
		
	}

	public static boolean isArmstrong(int num) {
		int number = num, temp = 0, remain;
		while(number != 0) {
			remain = number%10;
			number = number/10;
			
			temp += remain*remain*remain;
		}
		System.out.println(temp);
		if(temp == num) {
			return true;
		}else
		return false;
	}
}
