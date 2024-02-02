import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int arr[]= new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]<min)
            {
                min=arr[j];
            }
            if(arr[j]>max)
            {
                max=arr[j];
            }
        }
        System.out.println("The minimum number is"+ " " +  min);        
        System.out.println("The maximum number is"+ " " + max);        

    }
}
