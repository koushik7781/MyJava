
import java.util.Scanner;

public class function5 {
    public static float average(int a,int b,int c)
    {
        float avg= (a+b+c)/3;
        return avg;
    }
    public static void main(String []args ){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.print(average(a, b, c));
        sc.close();
    }
}
