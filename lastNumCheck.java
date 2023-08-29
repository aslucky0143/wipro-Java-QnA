import java.util.Scanner;
public class lastNumCheck {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int i1 = input.nextInt();
            int i2 = input.nextInt();
            if (i1%10==i2%10){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }

    }
    
}
