public class MaleFemale {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[1]);
        int len = args[0].length();
        System.out.println(age+" "+len);
        if (len==6){
            if (age<=58 && age>=1){
                System.out.println("8.2%");
            }else if (age>=59 && age<=100){
                System.out.println("9.2%");
            }
        }
        if (len==4){
            if (age<=58 && age>=1){
                System.out.println("8.4%");
            }else if (age>=59 && age<=100){
                System.out.println("10.5%");
            }
        }
    }
}
