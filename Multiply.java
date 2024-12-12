package K;
import java.util.Scanner;
public class Multiply {

	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		
		int n = b.nextInt();
		
		System.out.println("multiplication table：");
		
        for (int i = 1; i <= 9; i++) {
        	
        System.out.println(n + " * " + i + " = " + (n * i));
        
        }
        b.close();

	}

}
