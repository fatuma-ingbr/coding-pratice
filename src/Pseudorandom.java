import java.util.Scanner;

public class Pseudorandom {

    private static int a = 12;
    private static int b = 5;
    private static int n = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");

        int cur = sc.nextInt();

        getPseudorandom(cur);

    }

    public static void getPseudorandom(int cur){

        for (int i =0; i<5; i++){
            int next = (a*cur + b)%n;
            cur = next;

            System.out.println("Random number "+ i + " is " + next);
        }
    }
}
