import java.util.Scanner;
public class checkNum {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int i = input.nextInt();
            if (i>0){
                System.out.println("Positive");
            }
            else if(i<0){
                System.out.println("Negative");
            }else{
                System.out.println("Zero");
            }
        }
    }
    
}
