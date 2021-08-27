package test.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
    private static List<Object> combineLists(List<Object> list1, List<Object> list2){
        List<Object> objects=new ArrayList<>();
        for (int i = 0; i < list1.size() || i<list2.size(); i++) {
            try{
                objects.add(list1.get(i));
            }catch (IndexOutOfBoundsException e){
                //ignored
            }
            try{
                objects.add(list2.get(i));
            }catch (IndexOutOfBoundsException e){
                //ignored
            }
        }
        return objects;
    }

    public static void main(String[] args) {
        List list1 = Arrays.asList("A","B","C");
        List list2 = Arrays.asList(1,2,3);

        List res=combineLists(list1,list2);

        for (Object re : res) {
            System.out.println(re.toString());
        }
    }
}
