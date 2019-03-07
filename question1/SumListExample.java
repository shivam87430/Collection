package Question.question1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SumListExample {
    public static void main(String[] args) {
        float sum = 0.0f;
        List<Float> list = new ArrayList();
        list.add(10.7f);
        list.add(10.5f);
        list.add(14.23f);
        list.add(11.1f);
        list.add(20.7f);
        Iterator<Float> iterator = list.iterator();
        while(iterator.hasNext()){
            sum+=iterator.next();
        }
        System.out.println(sum);

    }
}
