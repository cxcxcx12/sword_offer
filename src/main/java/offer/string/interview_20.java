package offer.string;

import java.util.concurrent.CountDownLatch;

public class interview_20 {
    public static void main(String[] args) {
    String s="dadasd ";
    int count=0;
        for (int i = 0; i < s.length(); i++) {
            count+=lenthofhuiwen(s,i,i+1);
            count+=lenthofhuiwen(s,i,i);
        }

    }

    private static int lenthofhuiwen(String s, int i, int j) {
         int start=i,end=j;int count=0;
        while (start >= 0 && end <= s.length() - 1) {
            start--; end++;
            if (s.charAt(start)!=s.charAt(end)){
                break;
            }
            count++;

        }

return  count;
    }


}
