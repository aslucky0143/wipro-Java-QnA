import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
         try(Scanner input = new Scanner(System.in)){
            System.out.println("Enter the number of elements to be inserted into the array:");
            int n=input.nextInt(),max=0,min=0;
            
            for(int i=0;i<n;i++){
                int val=input.nextInt();
                if(max>val){
                    max=val;
                }
                if (min<val){
                    min=val;
                }
            }
            System.out.println("Maximum Value:"+max+"\nMinimum Value:"+min);
        }
    }
}
