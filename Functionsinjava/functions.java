import java.util.Scanner;

public class functions {
    public static void printmyname(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String name=a.next();

        printmyname(name);
        a.close();
    }
}
