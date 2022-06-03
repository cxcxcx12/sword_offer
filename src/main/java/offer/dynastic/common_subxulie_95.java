package offer.dynastic;

import java.util.Arrays;

public class common_subxulie_95 {
    public static void main(String[] args) {
        int[] arr={1,6,4,8,7,6};
        int[] ajj={1,3,4,5,6,7,1,4,5};
        int[][] dp=new int[arr.length][ajj.length];
        dp[0][0]=1;
        dp[0][1]=1;
        dp[1][0]=1;
        dp[1][1]=1;
        for (int i =1; i < arr.length; i++) {
            for (int j = 0; j < ajj.length; j++) {
                int k;
                for ( k = j; k > 0; k--) {
                    if (ajj[k]==arr[i]) {

                        break;
                    }
                }
                dp[i][j]=dp[i-1][k]+1;


            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < ajj.length; j++) {
                System.out.println(dp[i][j]);
            }
            System.out.println("-----------------------");
        }



    }


}
