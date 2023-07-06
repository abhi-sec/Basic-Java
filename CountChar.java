import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountChar {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int o;
        Map<Character, Integer> cc=new TreeMap<>();
        for(char c:st.toCharArray())
        {
            if(cc.containsKey(c))
            {
                o=cc.get(c);
                cc.put(c,o+1);
            }
            else {
                cc.put(c,1);
            }
        }
        System.out.println(cc);




    }
}
