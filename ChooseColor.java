import java.util.Scanner;
public class ChooseColor {
    public static void main(String[] args) {
        try(Scanner input= new Scanner(System.in)){
            char c = input.next().charAt(0);
            switch(c){
                case 'R':
                    System.out.println("Red");
                break;
                case 'B':
                    System.out.println("Blue");
                break;
                case 'G':
                    System.out.println("Green");
                break;
                case 'O':
                    System.out.println("Orange");
                break;
                case 'W':
                    System.out.println("White");
                break;
                case 'Y':
                    System.out.println("Yellow");
                break;
                default:
                    System.out.println("Invalid Code");

            }
        }
    }
}
