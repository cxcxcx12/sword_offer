package offer.arraylist;



public class interview_8 {
    public static int fun() {
        int[] arr={1,1,1,7,2,4,6,1,7,8,2,4,5};

        int target=24;
        int Length=arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            int c=arr[i];
            int j=i;
            int count=1;     //这个题还是很经典的。

            while ((j<arr.length-1)&&(c<target)) {  //j一定要在i的基础上做动作，所以，必定要新定义一个变量，且j=xxi；
                count++;   //这个是循环体
                c+=arr[j+1];  //这个是逻辑判断的    有一个不满住都直接跳过循环了。
                j++;

            } //跳出循环的条件可能来自是遍历完数组了但没加到target，有可能是大于target了。
            if (c>=target){ Length=Math.min(Length,count);}  //要看是哪个跳过循环的，所以要在这里判断一下是怎么出循环的。


        }
      return Length;
    }

    public static void main(String[] args) {
        System.out.println(fun());
    }
}
