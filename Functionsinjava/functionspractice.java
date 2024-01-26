import java.util.Scanner;

public class functionspractice {
    public static int simpleintrest(int p,int t,int r){
        int si= (p * t * r)/100 ;
        return si;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int t=sc.nextInt();
        int r=sc.nextInt();
        System.out.print(simpleintrest(a, t, r));
        sc.close();

    }
}
