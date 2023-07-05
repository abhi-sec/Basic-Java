import java.util.*;
public class HS {
        public static void main(String[] args)
        {
            Set<Integer> t=new LinkedHashSet<>();
            t.add(7);
            t.add(-9);
            t.add(5);
            t.add(-2);
            t.add(1);
            for(int k:t)
            {
                System.out.println(k);
            }
        }
    }
