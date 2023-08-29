public class RangePrimeCheck {
    public static void main(String[] args) {
        for (int i1 = 10; i1 <= 99; i1++) {
            int check = 0;
            for (int i = 2; i <= i1 / 2; i++) {
                if (i1 % i == 0) {
                    check = 1;
                    break;
                }
            }
            if (check == 0) {
                System.out.println(i1);
            }
        }
    }

}
