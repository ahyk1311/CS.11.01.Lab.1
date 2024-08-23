import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scanner.nextInt() /2 +7;
        System.out.println("Your dateable age is " + age + ".");
    }
}
