public class RevString {
    public static void main(String[] args) {
        int strlen=args[0].length();
        int i=0;
        String b="";
        while (i!=strlen){
            b=args[0].charAt(i)+b;
            i+=1;
        }
        System.out.println("Reversed String :"+b);

    }
}
