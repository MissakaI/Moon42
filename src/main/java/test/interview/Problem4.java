package test.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Problem4 {

    private static String largestNumber(List<Integer> integers){
        List<String> strings = integers.stream()
                .map(Object::toString)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        return String.join("",strings);
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(50,2,1,9));

        System.out.println(largestNumber(list));
    }

}
