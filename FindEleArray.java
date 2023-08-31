import java.util.Scanner;

public class FindEleArray {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Enter the number of elements to be inserted into the array:");
            int n=input.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                 arr[i]=input.nextInt();                
            }
            System.out.println("ENter the element to be searched in the array:");
            int val=input.nextInt();
            for(int i=0;i<arr.length;i++){
                if(arr[i]==val){
                    System.out.println("The element found at "+i);
                    System.exit(0);
                }
            }
            System.out.println("Element No found \nStatus: -1");
        }
    }
}
