import java.util.*;

/*
public class Teight {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("Sachin");
        al.add("Sourav");
        al.add("Shami");
        System.out.println("ArrayList Elements");
        System.out.print("\t" + al);
        List<String> L1 = new LinkedList<String>();
        L1.add("Mumbai");
        L1.add("Kolkata");
        L1.add("Vadodara");
        System.out.println();
        System.out.println("LinkedList Elements");
        System.out.print("\t" + L1);
    }
} 



public class Teight {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        System.out.print("Contents of list: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
    }
}
*/




class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator<Student> 
{
    public int compare(Student o1, Student o2) {
        if (o1.age == o2.age) return 0;
        else if (o1.age > o2.age) return 1;
        else return -1;
    }
}

public class Teight {
    public static void main(String args[]) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student("Vijay", 23));
        al.add(new Student("Ajay", 27));
        al.add(new Student("Jai", 21));

        System.out.println("Sorting by age");
        Collections.sort(al, new AgeComparator());

        Iterator<Student> itr2 = al.iterator();
        while (itr2.hasNext()) {
            Student st = itr2.next();
            System.out.println(st.name + " " + st.age);
        }
    }
}

