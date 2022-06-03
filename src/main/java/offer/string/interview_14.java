package offer.string;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

public class interview_14 {
    public static void main(String[] args) {
        String a="sd";
        String b="dddwedse";
        //把a的每个字符放入到hashmap里面

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            int count=1;
            if (map.containsKey(a.charAt(i)-'a')){
                map.replace(a.charAt(i)-'a',count,++count);
            }
            else {map.put(a.charAt(i)-'a',count);}
        }
        for (int i = 0; i < b.length(); i++) {
            for (int j = i; j < a.length()+i; j++) {

                if (map.containsKey(b.charAt(j)-'a')) {

                    map.replace(b.charAt(j)-'a',map.get(b.charAt(j)-'a'),map.get(b.charAt(j)-'a')-1);
                }
            }


        }


    }
}
