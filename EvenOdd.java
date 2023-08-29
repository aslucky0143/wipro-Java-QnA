import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int i=input.nextInt();
            if (i%2==0){
                System.out.println(i+" is a Even Number");
            }
            else{
                System.out.println(i+" is a Odd Number");
            }
        }
    }

}
