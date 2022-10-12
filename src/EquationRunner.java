import javax.sound.sampled.Line;
import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hello, welcome to the slope calculator.");
        System.out.println("Enter the first x-y coordinate point: ");
        String firstPoint = s.nextLine();
        System.out.println("Enter the second x-y coordinate point: ");
        String secondPoint = s.nextLine();
        int firstComma = firstPoint.indexOf(",");
        int secondComma = secondPoint.indexOf(",");
        int firstParenthesis = firstPoint.indexOf(")");
        int secondParenthesis = secondPoint.indexOf(")");
        int y1Location = firstComma + 1;
        int y2Location = secondComma + 1;
        String xOne = firstPoint.substring(1,firstComma);
        String yOne = firstPoint.substring(y1Location,firstParenthesis);
        String xTwo = secondPoint.substring(1,secondComma);
        String yTwo = secondPoint.substring(y2Location,secondParenthesis);
        int x1 = Integer.parseInt(xOne);
        int y1 = Integer.parseInt(yOne);
        int x2 = Integer.parseInt(xTwo);
        int y2 = Integer.parseInt(yTwo);
        LinearEquation linearEquation = new LinearEquation(x1, y1, x2, y2);
        System.out.println(linearEquation.toString());
    }
}
