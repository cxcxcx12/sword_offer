package offer.arraylist;

import java.util.HashMap;

public class presum {
    public static void main(String[] args) {
        int[] nums={1,2,3,5,6,8,2,1,3,6,-9,0,3,2,5,6};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);
        int sum=0; int count=0;int k=0;
        for (int num : nums) {
            sum+=num;
            count+=hashMap.getOrDefault(sum-k,0);
            hashMap.put(sum,hashMap.getOrDefault(sum,0)+1);//没拿到，就是默认0个，相当于省去了put的操作，null赋值为0；

        }

        System.out.println(count);
    }
}
