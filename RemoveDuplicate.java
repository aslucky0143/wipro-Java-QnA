import java.util.Scanner;
public class RemoveDuplicate {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Enter the number of elements to be inserted into the arr:");
            int n = input.nextInt();
            int a[]=new int[n],b[]=new int[n],c=0;
            for (int i=0;i<n;i++){
                a[i]=input.nextInt();
            }
            for (int i=0;i<n;i++){
                int k=0;
                for (int j=i+1;j<n;j++){
                    if(a[i]==a[j]){
                        k=1;
                    }
                }
                if (k==0){
                    b[c]=a[i];
                    c+=1;
                }
            }System.out.println("After Removing Duplicates");
            for (int i=0 ;i<c;i++){
                System.out.print(b[i]+"  ");
            }
        }
    }
}
