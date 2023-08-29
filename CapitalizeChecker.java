import java.util.Scanner;

public class CapitalizeChecker {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String str = input.next();
            char var = str.charAt(0);
            if (((int) var) >= 97) {
                var = (char) ((int) var - 97 + 65);
            }
            System.out.println(var + str.substring(1, str.length()));
        }
    }
}
