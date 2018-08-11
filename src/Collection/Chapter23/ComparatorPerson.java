package Collection.Chapter23;

import java.util.TreeSet;
import java.util.Comparator;

class ComparatorPerson {

    static class Person implements Comparable<Collection.Chapter23.ComparatorPerson.Person> {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() { return name + " : " + age; }

        @Override
        public int compareTo(Collection.Chapter23.ComparatorPerson.Person p) {
            return this.age - p.age;
        }
    }

    static class PersonComparator implements Comparator<Collection.Chapter23.ComparatorPerson.Person> {
        public int compare(Collection.Chapter23.ComparatorPerson.Person p1, Collection.Chapter23.ComparatorPerson.Person p2) {
            return p2.age - p1.age;
        }
    }

    public static void main(String[] args) {
        TreeSet<Person> tree = new TreeSet<>(new PersonComparator());
        tree.add(new Person("YOON", 37));
        tree.add(new Person("HONG", 53));
        tree.add(new Person("PARK", 22));
	
        for(Person p : tree)
            System.out.println(p);
    }
}