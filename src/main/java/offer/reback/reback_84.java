package offer.reback;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class reback_84 {

   public static List<List<Integer>> fun(){
        LinkedList<List<Integer>> result=new LinkedList<>();
        LinkedList<Integer> integers = new LinkedList<>();
        int num=1;
        per(num,10,integers,result);
        return result;
    }

    private static void per(int num,int n,LinkedList<Integer> list,List<List<Integer>> result){

        if (n==0) {
          /*  result.add(list);*/   //我这里犯错了,大家注意哈.
            result.add(new LinkedList<>(list));
        } else {

            for (int k = 1; k < n+1; k++) { //这里也犯错了,写成了k=i了
                list.add(k);
                per(num,n-k,list,result);


  //这里也犯错了,溯回的时候,我还n=n+K了
                list.removeLast();
            }

        }
    }

    public static void main(String[] args) {
        List<List<Integer>> result= fun();
        System.out.println(result);

    }

}
//这个题目的总结是:传递给子递归的参数如果有所变化的话,不用在本递归上进行还原,因为本递归代表的是横向的哦.

