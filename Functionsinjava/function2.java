import java.util.Scanner;

public class function2 {
    public static int calculatesum(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String []args ){
        Scanner sc=new Scanner(System.in);
       int k=sc.nextInt();
       int l=sc.nextInt();
        int sum=calculatesum(k, l);
       System.out.println(sum);
        sc.close();
    }
}
