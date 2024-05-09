import java.util.*;
public class sb2 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
       String arr[]=new String[size];
       int cumlen = 0;
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.next();
            cumlen+=arr[i].length();
        }

        System.out.println(cumlen);
    }
}
