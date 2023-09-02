import java.util.Scanner;

public class Min2Max2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number of elements to be inserted into the arr:");
            int n = input.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=input.nextInt();
            }
            for (int i=0;i<n;i++){
                for (int j=i;j<n;j++){
                    int temp=0;
                    if (a[i]>a[j]){
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
            System.out.println(String.valueOf("min2").length());
            System.out.println("\nMin1:" + a[0] + "\nMin2:" + a[1] + "\nMax1:" + a[a.length-1] + "\nmax2:" + a[a.length-2]);
        }
    }
}