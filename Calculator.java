import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        System.out.println("Addition or Subtraction?");
        scanner.nextLine();
        String type = scanner.nextLine();
        switch (type) {
            case "Addition":
                System.out.println(numA + numB);
                break;
            case "Subtraction":
                System.out.println(numA - numB);
                break;
            default:
                System.out.println("INVALID");
                break;
        }
        scanner.close();
    }
}
