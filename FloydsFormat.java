public class FloydsFormat {
    public static void main(String[] args) {

        for (int i=1;i<=Integer.parseInt(args[0]);i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
