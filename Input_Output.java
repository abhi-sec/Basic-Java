import java.util.Scanner; // Scanner is a utility class to read user input or process simple regex-based parsing of file or string source

public class Input_Output {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//taking input from user nextInt decide what type of input we are taking
        int b=sc.nextInt();
        int d=a*b;
        System.out.println(d);
    }
}
