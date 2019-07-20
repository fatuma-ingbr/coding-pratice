import java.util.Scanner;

public class Swapper {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();

        System.out.println("Your vales are A is " + a + " and B is " + b);
        System.out.println("Swapping...");

        a = a-(b-a);
        b = b + a;
        a = b - a;
        b = b/2;

        System.out.println("Your new vales are A is " + a + " and B is " + b);
    }
}
