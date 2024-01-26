

import java.util.Scanner;

public class function8 {
    public static double circumferenceOfCircle(float r)
    {
        double  circumference = (2 * 3.14 * r);
        return circumference;

    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.print(circumferenceOfCircle(r));
        sc.close();

    }
}
