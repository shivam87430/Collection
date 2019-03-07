package Question.question5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
    String Name;
    Double Score;
    Double Age;

    public Student(String name, Double score, Double age) {
        this.Name = name;
        this.Score = score;
        this.Age = age;
    }
    public double getScore(){
       return this.Score;
    }

    public String toString() {
        return this.Name + "  " + this.Score + "  " + this.Age;
    }
}

class SortOnScore implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if ((o1.Score) == (o2.Score)) {
            return (o1.Name).compareTo(o2.Name);
        } else
            return (o1.Score).compareTo(o2.Score);
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("shivam", 321.2D, 23D));
        arrayList.add(new Student("sa", 321.2D, 23D));
        arrayList.add(new Student("manidhar", 321.2D, 23D));
        arrayList.add(new Student("ansal", 321.2D, 21D));
        arrayList.add(new Student("vishal", 231.2D, 22D));
        arrayList.add(new Student("chotu", 231.2D, 22D));
        Collections.sort(arrayList, new SortOnScore());
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
    }
}
