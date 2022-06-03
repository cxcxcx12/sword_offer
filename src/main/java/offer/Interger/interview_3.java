package offer.Interger;

import java.util.ArrayList;

public class interview_3 {
    public static void main(String[] args) {
        int a=4000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int j = 0; j <= a; j++) {
            int count=1;
            int size=0;
            for (int i = 1; i <= 32; i++) {
                if ((j&count)==count) {
                    size++;
                }
                count=(count<<1);
            }
            arrayList.add(size);

        }
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

    }
}
