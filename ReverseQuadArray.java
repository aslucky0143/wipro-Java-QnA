public class ReverseQuadArray {
    public static void main(String[] args) {
        if(args.length==4){
            int a[][]=new int[2][2],b[][]=new int[2][2],k=0;
            for (int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    a[i][j]=Integer.parseInt(args[k]);
                    k+=1;
                }
            }
            System.out.println( "The Original Array:");
            for (int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            for (int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    b[i][j]=a[1-i][1-j];
                }
            }
            System.out.println("The Reversed Array:");
            for (int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }
            
        }else{
            System.out.println("Enter exactly 4 elements");
        }
    }
}
