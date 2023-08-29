import java.util.Scanner;
public class SwapCase {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            char c= input.next().charAt(0);
            if ((int)c<=90){
                System.out.println((char)((int)c+32));
            }else if ((int)c<=122){
                System.out.println((char)((int)c-32));
            }
        }
    }
}