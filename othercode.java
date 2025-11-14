import java.util.Scanner;

public class othercode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextDouble()) {
            System.out.println("Provide three numbers.");
            return;
        }
        double a = sc.nextDouble();
        if (!sc.hasNextDouble()) {
            System.out.println("Provide three numbers.");
            return;
        }
        double b = sc.nextDouble();
        if (!sc.hasNextDouble()) {
            System.out.println("Provide three numbers.");
            return;
        }
        double c = sc.nextDouble();
        System.out.println(a + b + c);
    }
}