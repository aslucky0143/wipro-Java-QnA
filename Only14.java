import java.util.Scanner;

public class Only14 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array:");
            int n = input.nextInt(), a[] = new int[n], b = 0;
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
                if (a[i] != 1 && a[i] != 4) {
                    b = 1;
                }
            }
            if (b == 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

        }
    }
}
