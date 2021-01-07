package swjd;

public class Example4 {

//1.已知数组{95,63,79,84,36,82,45}，先将数组进行升序排列，再将70插入数组中，并依然按升序输出数组。
       public static void main(String[]args){
        //   int[] brr =new int[10]; int[] wrr = new int[]{12,34};定义数组的三种方式。
           int[] arr = {12,34,87,45,63,72};
           int[] arr2 = new int[8];
           arr2 = arr;
           arr2[arr2.length - 1] = 70;

          fuck(arr2);

           for(int s =0;s<arr2.length;s++){
               System.out.println(arr2[s]);
           }
       }

    public static void fuck (int[] arr){
        int paix;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    paix =  arr[i];
                    arr[i] = arr[j];
                    arr[j] = paix;
                }
            }
        }

    }

}

