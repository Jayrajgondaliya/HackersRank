import java.util.Scanner;

public class JavaStaticInitializerBlock {
	static boolean flag = true;
    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    
    static {
	    if(B < 0 || H < 0){
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	        flag = false;
	    }
	}
    
    public static void main(String args[]) {
    	if(flag) {
    		int area = B*H;
    		System.out.println(area);
    	}
    }
}
