import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean isAscending = true;
        for(int j=0;j<arr.length-1;j++)
        {
           if(arr[j]>arr[j+1])
           {
            isAscending = false ;
           }
        }
        if(isAscending)
        {
            System.out.println("yes");
        }
        else 
        {
            System.out.println("no");
        }
        sc.close();
    }
}
