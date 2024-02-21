import java.util.Scanner;

public class matrixmul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int a[][]=new int[rows][col];
        int b[][]=new int[rows][col];
        int c[][]=new int[rows][col];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {      
            for(int j=0;j<col;j++)
            {
                for(int k=0;k<rows;k++)
                {
                        c[i][j]+=a[i][k] * b[k][j];
                }             
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
            
        
        sc.close();
    }
}