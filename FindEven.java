public class FindEven {
    public static void main(String[] args) {
        for (int i = 23; i <= 57; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Number of even integers:" + (int) ((57 - 23) / 2));
    }
}
