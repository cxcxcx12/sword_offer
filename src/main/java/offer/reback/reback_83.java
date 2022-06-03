package offer.reback;

import java.util.LinkedList;
import java.util.List;

public class reback_83 {
    public static List<List<Integer>> permute(int[] nums){

        List<List<Integer>> result=new LinkedList<>();
        helper(nums,0,result);
        return result;

    }

    private static void helper(int[] nums, int i, List<List<Integer>> result) {
        if (i==nums.length) {
            List<Integer> permuter=new LinkedList<>();
            for (int num : nums) {
                permuter.add(num);
            }
            result.add(permuter);
        }
        for (int j = i; j < nums.length; j++) {
            swap(nums,i,j);  //每次都是i为0,那把i写成0不就行了吗,这不是0,而是当前数组的第一个元素,
            helper(nums,i+1,result);
            swap(nums,i,j);
        }

    }

    private static void swap(int[] nums, int i, int j) {
        if (i!=j) {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }

    public static void main(String[] args) {
        int[] nums={1,4,7,9};
        permute(nums);
    }

}
