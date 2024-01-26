import java.util.Scanner;

public class function6 {
    public static int sumofodd(int n)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(sumofodd(n));
        sc.close();
    }

}
