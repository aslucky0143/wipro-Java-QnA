import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int i1 = input.nextInt();
            int check = 0;
            for (int i = 2; i <= i1 / 2; i++) {
                if (i1 % i == 0) {
                    System.out.println("Not Prime");
                    check = 1;
                    break;
                }
            }
            if (check == 0) {
                System.out.println("Prime");
            }
        }
    }

}
