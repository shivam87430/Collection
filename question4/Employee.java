package Question.question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee {
    String name;
    Double age;
    Double Salary;
    public Employee(String name,Double age,Double salary){
        this.name=name;
        this.age=age;
        this.Salary=salary;
    }
    public String toString(){
        return this.name+" "+this.age+" "+this.Salary;
    }

}
class sortByAddress implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        return (o1.Salary).compareTo(o2.Salary);
    }
}

class Main{
    public static void main(String[] args) {
        ArrayList<Employee> arrayList=new ArrayList<>();
        arrayList.add(new Employee("shivam",21D,5000.1D));
        arrayList.add(new Employee("pulkit",21D,5000.2D));
        arrayList.add(new Employee("manidhar",21D,41000.34D));
        arrayList.add(new Employee("chotu",21D,11000.34D));
        Collections.sort(arrayList,new sortByAddress());
        for(int i=arrayList.size()-1;i>=0;i--){
            System.out.println(arrayList.get(i));
        }
    }
}
//Another method for calculate Maximum salary
/*if((o1.Salary).intValue()>(o2.Salary).intValue()) {
            return -1;
        }if((o1.Salary).intValue()==(o2.Salary).intValue()){
            return 0;
        }else
            return +1;
*/