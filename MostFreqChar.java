import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class MostFreqChar {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int o;
        int n,l=0;
        char mc=' ';
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
        for(char ct:cc.keySet())
        {
          n=cc.get(ct);

          if(l<n)
          {
              l=n;
              mc=ct;

          }
        }
        System.out.println(mc);

    }
}

