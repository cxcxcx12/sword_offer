package offer.reback;

import jdk.nashorn.internal.ir.IfNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NightQue {


    public static LinkedList<LinkedList<String>> quen(){
        int n=8;
        int i=0;
        char[] q=new char[n];
        for (int k = 0; k < n; k++) {
            q[k]='.';
        }
        int[] arr=new int[n];
        for (int b = 0; b < arr.length; b++) {
            arr[b]=Integer.MAX_VALUE;
        }
        LinkedList<LinkedList<String>> result=new LinkedList();
        LinkedList<String> set=new LinkedList<>();
        helper(result,set,q,n,i,arr);
        return result;


    }

    private static void helper(LinkedList<LinkedList<String>> result, LinkedList<String> set,char[] q,int n,int i,int[] arr) {
        if (i==n) {
           result.add(new LinkedList<>(set)) ;

        } else {
            for (int j = 0; j < n; j++) {
                if(isvalid(i,n,arr,j)){
                    continue;
                }

                q[j]='Q';
                String Q=new String(q);
                set.add(Q);
                arr[i]=j;
                q[j]='.';
                helper(result,set,q,n,i+1,arr);
                set.removeLast();
                arr[i]=Integer.MAX_VALUE;
            }
        }


    }

    private static boolean isvalid(int i, int n,int[] arr,int j) {
        if(i==0){
            return false;
        }
        for (int m = 0; m < arr.length; m++) {
            if(j==arr[m]-i+m||j==arr[m]||j==arr[m]+i-m){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(quen().size());
    }


}



