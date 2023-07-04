import java.util.Scanner;

public class IOusingFor {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr= new int[5];
        for(int i=0; i<5; i++)
        {

            arr[i] = sc.nextInt();//taking input from user
                                // here i is index of array as value of i increases so does the index changes
        }
        for(int k : arr) // for each loop (very useful to traverse through a list or queue)
        {
            System.out.println(k);
        }
    }
}
