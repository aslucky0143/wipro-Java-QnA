import java.util.Scanner;

public class WithoutTen {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array:");
            int n = input.nextInt(), a[] = new int[n],b[] = new int[n], c = 0;
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
                if (a[i]!=10){
                    b[c]=a[i];
                    c+=1;
                }
            }
            System.out.println("The Array Without 10");
            for (int i=0;i<n;i++){
                if (i<b.length){
                    System.out.println(b[i]);
                }else{
                    System.out.println(0);
                }
            }

        }
    }
}