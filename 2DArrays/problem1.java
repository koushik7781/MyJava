import java.util.*;

public class problem1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns = sc.nextInt();
        int arr[][]=new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(arr[i][j] == x)
                {
                    System.out.println(i +" , "+ j);
                }
            }
        }
    }
}
