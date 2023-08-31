public class PalinCheck {
    public static void main(String[] args) {
        int i=0,j=0,strlen=args[0].length();
        while (i<strlen){
            if (args[0].charAt(i)!=args[0].charAt(strlen-i-1)){
                j=1;
                break;
            }
            i+=1;
        }
        if (j!=0){
            System.out.println("Not a palindrome");
        }else{
            System.out.println("Palidrome Number");
        }
    }
}
