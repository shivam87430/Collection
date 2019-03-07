package Question.question2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindUniqueCharacterOfStringExample {
    public Set<String> stringUnique(String string){
        Set set=new HashSet();
        for(int i=0;i<string.length();i++){
            set.add(string.charAt(i));
        }
        return set;
    }


    public static void main(String[] args) {
        FindUniqueCharacterOfStringExample findUniqueCharacterOfStringExample=new FindUniqueCharacterOfStringExample();
        Set<String> strings=findUniqueCharacterOfStringExample.stringUnique("nitin");
        Iterator iterator=strings.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
