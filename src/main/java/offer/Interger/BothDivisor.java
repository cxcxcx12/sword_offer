package offer.Interger;


public class BothDivisor {
    public static int  fun(int a,int b) {

        if ((a==Integer.MIN_VALUE)&&(b==-1)) {
            return Integer.MAX_VALUE;
        }
        int flag=1;
        if (a<0) {
            a=-a;
            flag--;
        }
        if (b<0) {
            b=-b;
            flag--;
        }
        int reslut=dividercore(a,b);
        return flag==0?-reslut:reslut;

    }

    private static int dividercore(int a, int b) {
      int sum=0;
        while (a-b>0) {
              int cur=b;int cout=1;

        while (a  >= cur+cur) {

            cout+=cout;
            cur+=cur;
        }
        a-=cur;
        sum+=cout;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fun(9, -2));
    }
}
