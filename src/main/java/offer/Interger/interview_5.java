package offer.Interger;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class interview_5 {
    public static void fun() {
        String[] words=new String[43];
        int[] flagds=new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                flagds[i]|=1<<(c-'a');

            }
        }
        for (int i = 0; i < words.length; i++) {
            for (int i1 = 0; i1 < words.length; i1++) {

            }

        }




    }
}
