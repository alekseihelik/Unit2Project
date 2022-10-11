import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hello, welcome to the slope calculator.");
        System.out.println("Enter the first x-y coordinate point: ");
        String firstPoint = s.nextLine();
        System.out.println("Enter the second x-y coordinate point: ");
        String secondPoint = s.nextLine();
    }
}
