public class CmdLineArgs3 {
    public static void main(String[] args) {
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        
        System.out.println("The sum of "+args[0]+" and "+args[1]+" is "+(i1+i2));
    }
    
}
/*
Commands to Run for Example 1:
javac CmdLineArgs3.java
java CmdLineArgs 10 20
 */