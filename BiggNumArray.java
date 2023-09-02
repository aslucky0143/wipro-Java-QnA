
public class BiggNumArray {
    public static void main(String[] args) {
        int a[][] = new int[3][3], k = 0;
        if (args.length == 9) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = Integer.parseInt(args[k]);
                    k += 1;

                }
            }
            int max = a[0][0];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(a[i][j] + " ");
                    if (a[i][j] > max) {
                        max = a[i][j];
                    }
                }
                System.out.println();
            }
            System.out.println("The maximum number in the 3*3 array is "+max);
        } else {
            System.out.println("Enter 9 values exactly");
        }
    }
}
