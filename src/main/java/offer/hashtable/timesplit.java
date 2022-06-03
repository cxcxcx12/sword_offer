package offer.hashtable;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;

public class timesplit {

    public static int findmintime(ArrayList<String> arrayList) {

       Boolean[] arr=new Boolean[1440];

        for (String s : arrayList) {
            String[] split = s.split(":");
            int var = Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
            arr[var] = true;
        }
        int start=-1,end=-1;int minx=Integer.MAX_VALUE;
        while (end<1439){  //数组最长1439，如果这个时候end等于1439了，则调用gettureindex 会让end++，变成1440，就超过了指针长度。
            if (end==-1){ end=getTrueIndex(arr,end);}

            end=getTrueIndex(arr,end);
            start=getTrueIndex(arr,start);
           minx=Math.min(minx,end-start);

        }
        return minx;

    }


    public static int getTrueIndex( Boolean[] arr,int begin) {
         begin++;

        while (arr[begin]==null&&(begin<1439)) {
            begin++;
        }
        return begin;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("0:10");
        arrayList.add("1:20");
        arrayList.add("2:54");
        arrayList.add("10:06");
        arrayList.add("4:48");
        arrayList.add("5:20");
        arrayList.add("6:31");
        arrayList.add("19:30");
        arrayList.add("6:10");
        System.out.println(findmintime(arrayList));;
    }
}
