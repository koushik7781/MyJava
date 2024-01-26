import java.util.Scanner;

public class dowhile {
    public static int dowhie(int n){
        do{
            System.out.print(n);
            n++;
        }while(n>0);
        return n;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int abc=dowhie(n);
        System.out.println(abc);
        sc.close();
    }
}
