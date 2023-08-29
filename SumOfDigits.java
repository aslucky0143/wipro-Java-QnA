import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int num=input.nextInt();
            int len=(String.valueOf(num)).length();
            int sum=0;
            while (len!=0){
                sum+=num%10;//sum update
                num=(int)num/10;//number update
                len-=1;//lenght update
            }
            System.out.println(sum);
        }

    }
}
