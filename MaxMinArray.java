import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
         try(Scanner input = new Scanner(System.in)){
            System.out.println("Enter the number of elements to be inserted into the array:");
            int n=input.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=input.nextInt();
            }
            int max=a[0],min=a[0];
            for (int i=0;i<n;i++){
                if (max<a[i]){
                    max=a[i];
                }if (min>a[i]){
                    min=a[i];
                }
            }
            System.out.println("Maximum Value:"+max+"\nMinimum Value:"+min);
        }
    }
}
