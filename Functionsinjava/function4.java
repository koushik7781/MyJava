import java.util.Scanner;

public class function4 {
    public static int factorialofnumber(int a){
        int fact =1;
        for(int i = 1;i<=a;i++)
        {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int factorial=factorialofnumber(a);
        System.out.print(factorial);
        sc.close();
    }
}
