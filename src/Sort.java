import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        int [] a = new int[]{8, 6, 5, 9, 1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        List<Integer> list = new ArrayList<>();
        for (int b : a) {
            list.add(b);
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list.toString());
    }
}
