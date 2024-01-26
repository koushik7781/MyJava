import java.util.Scanner;

public class function7 {
    public static int greatestof2numbers(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else 
        {
            return b;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(greatestof2numbers(a, b));
        sc.close();
    }
}
