import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = 100 - scanner.nextInt();
        System.out.println("Try reading " + age + " pages before giving up on your book.");
    }
}
