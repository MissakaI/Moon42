package test.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3 {

    private static List<Long> fibonacci(){
        List<Long> fib=new ArrayList<>(Arrays.asList(0L,1L));

        int lastIndex=1;
        for (; fib.size()<100; ) {
            fib.add(fib.get(lastIndex)+fib.get(lastIndex-1));
            lastIndex++;
        }

        return fib;
    }

    public static void main(String[] args) {
        List list=fibonacci();

        System.out.println(list.size());
        for (Object o : list) {
            System.out.println(o);
        }
    }

}
