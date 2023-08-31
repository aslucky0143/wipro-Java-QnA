import java.util.Scanner;
public class AvgSumArray {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Enter the number of elements to be inserted into the array:");
            int n=input.nextInt();
            float sum=0;
            for(int i=0;i<n;i++){
                sum+=input.nextInt();
            }
            System.out.println("Sum:"+sum+"\nAverage:"+(sum/n));
        }
    }
}
