package test.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1 {

    private static int forLooped(List<Integer> integers){
        int sum=0;
        for (Integer num : integers) {
            sum+=num;
        }
        return sum;
    }

    private static int whileLooped(List<Integer> integers){
        int sum=0;
        int i=0;
        do{
            sum+=integers.get(i);
            i++;
        }while (i<integers.size());
        return sum;
    }

    private static int recursion(List<Integer> integers){
        if (integers.size()==1){
            return integers.get(0);
        }
        int lastIndex = integers.size()-1;
        int val=integers.get(lastIndex);
        return val+recursion(integers.subList(0,lastIndex));
    }

    public static void main(String[] args) {
        List<Integer> integers= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(forLooped(integers));
        System.out.println(whileLooped(integers));
        System.out.println(recursion(integers));
    }

}
