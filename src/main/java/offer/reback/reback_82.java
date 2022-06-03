package offer.reback;

import jdk.nashorn.internal.ir.IfNode;

import java.util.LinkedList;
import java.util.List;

public class reback_82 {
    public static List<List<Integer>> subset(int[] nums){
        List<List<Integer>> restlt=new LinkedList<>();
        if (nums.length==0) {
            return  restlt;
        }
        help(0,nums,new LinkedList<Integer>(),restlt);
        return restlt;
    }

    private static void help(int index, int[] nums, LinkedList<Integer> subset, List<List<Integer>> restlt) {


        if (index==nums.length) {
            restlt.add(new LinkedList<>(subset)); //这个是叶子儿子节点,是纯儿子操作.
        }
         else if (index<nums.length) {
             //不赋值逻辑,已经省略了,,这里有逻辑的.   父节点的操作
            help( index+1,  nums, subset, restlt);
            subset.add(nums[index]); //父节点的操作
            help( index+1,  nums, subset, restlt);
            subset.removeLast();  //所有节点的最后操作. 当前节点清空的是父亲修改过的set,但是他没有传回给父亲,所以父亲也要自己删除,
            //else if就是开始状态更多的是中间状态,而if是结束状态.
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2};
        subset(arr);

    }
}
