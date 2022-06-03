package offer.arraylist;

import java.util.Arrays;
import java.util.HashMap;

public class interview_7 {
    public static String fun() {

        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        int[] arr={1,1,1,4,3,6,7,8,-4};
        for (int k = 0; k < arr.length; k++) {
            integerIntegerHashMap.put(k,arr[k]);
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (integerIntegerHashMap.containsValue(0-arr[i]-arr[j])) {
                    for (int i1 = 0; i1 < arr.length; i1++) {
                        if (arr[i1]==0-arr[i]-arr[j]) {
                            return i1+" " +i+" "+j;
                        }
                    }
                }

            }
        }
    return null;
    }

    public static void main(String[] args) {
        System.out.println(fun());
    }

}
