import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numA = scanner.nextFloat();
        float numB = scanner.nextFloat();
        System.out.println("(A)ddition, (S)ubtraction, (M)ultiplication, or (D)ivision?");
        scanner.nextLine();
        String type = scanner.nextLine();
        switch (type) {
            case "A":
            case "Addition":
                System.out.println(numA + numB);
                break;
            case "S":
            case "Subtraction":
                System.out.println(numA - numB);
                break;
            case "M":
            case "Multiplication":
                System.out.println(numA * numB);
                break;
            case "D":
            case "Division":
                System.out.println(numA / numB);
                break;
            default:
                System.out.println("INVALID");
                break;
        }
        scanner.close();
    }
}
