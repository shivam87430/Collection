package Question.question3;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacterExample {
    static void charOccurence(String string){
        HashMap<Character,Integer> charCountMap=new HashMap<Character, Integer>();
        char[] strArray=string.toCharArray();
        for(char c:strArray){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }else{
                charCountMap.put(c,1);
            }
        }
        for(Map.Entry entry:charCountMap.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
    }

    public static void main(String[] args) {
        OccurenceOfCharacterExample.charOccurence("sshhaac");
    }
}
