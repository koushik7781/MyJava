import java.util.Scanner;

public class function3 {
    public static int calculateproduct(int a,int b){
        int product = a * b;
        return product;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int l=sc.nextInt();
        System.out.print(calculateproduct(k, l));
        sc.close();
    }
}
