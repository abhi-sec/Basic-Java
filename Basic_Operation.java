public class Basic_Operation {
    public static void main(String[] args)
    {
        int a=2;
        int b=9;
        int c=a*b;
        int d=b/a;
        double e=b/a; // Both b and a are integer value so the output will be 4.0 because before being stored in double data type they are integer
        double f=(double)b/a; //type casting of b so that the answer is also double OUTPUT = 4.5
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
