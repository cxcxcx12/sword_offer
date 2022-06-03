package offer.dynastic;

public class huiwen_min {

    public static void main(String[] args) {
        String a="afadrwvdwrdwa";
        int[] dp=new int[a.length()];

        for (int i = 1; i < a.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(ishuiwen(a,j,i)){
                    dp[i]=dp[j-1]+1;

                }

                 else {



                }


            }
        }





    }

    private static boolean ishuiwen(String a, int j, int i) {


      return false;
    }


}
