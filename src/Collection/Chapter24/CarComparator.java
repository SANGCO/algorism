package Collection.Chapter24;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;

class CarComparator {

    static class Car {
        protected int disp;

        public Car(int d) { disp = d; }

        @Override
        public String toString() {
            return "cc: " + disp;
        }
    }

    // Car�� ������ ���� Ŭ����
    static class CarComp implements Comparator<Collection.Chapter24.CarComparator.Car> {
        @Override
        public int compare(Collection.Chapter24.CarComparator.Car o1, Collection.Chapter24.CarComparator.Car o2) {
            return o1.disp - o2.disp;
        }
    }

    static class ECar extends Collection.Chapter24.CarComparator.Car {
        private int battery;

        public ECar(int d, int b) {
            super(d);
            battery = b;
        }

        @Override
        public String toString() {
            return "cc: " + disp + ", ba: " + battery;
        }
    }

    public static void main(String[] args) {
        List<Car> clist = new ArrayList<>();
        clist.add(new Car(1800));
        clist.add(new Car(1200));
        clist.add(new Car(3000));

        List<ECar> elist = new ArrayList<>();
        elist.add(new ECar(3000, 55));
        elist.add(new ECar(1800, 87));
        elist.add(new ECar(1200, 99));
  
        CarComp comp = new CarComp();

        // ���� ����
        Collections.sort(clist, comp);
        Collections.sort(elist, comp);
        

        // ���� ���
        for(Iterator<Car> itr = clist.iterator(); itr.hasNext(); )
            System.out.println(itr.next().toString() + '\t');
        System.out.println();

        for(Iterator<ECar> itr = elist.iterator(); itr.hasNext(); )
            System.out.println(itr.next().toString() + '\t');

    }
}