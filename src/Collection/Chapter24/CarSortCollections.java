package Collection.Chapter24;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

class CarSortCollections {
    static class Car implements Comparable<Collection.Chapter24.CarSortCollections.Car> {
        private int disp;    // ��ⷮ

        public Car(int d) { disp = d; }

        @Override
        public String toString() {
            return "cc: " + disp;
        }
        @Override
        public int compareTo(Collection.Chapter24.CarSortCollections.Car o) {
            return disp - o.disp;
        }
    }

    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car(1200));
        list.add(new Car(3000));
        list.add(new Car(1800));

        // ����
        Collections.sort(list);        

        // ���
        for(Iterator<Car> itr = list.iterator(); itr.hasNext(); )
            System.out.println(itr.next().toString() + '\t');
    }
}