package array;

public class Examples3 {
    public static void main(String[] args){
        int flag;
        int sum = 0;
        int[] arr = {-10,2,3,246,-100,0,5};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    flag = arr[j];
                    arr[j] = arr[i];
                    arr[i] = flag;
                }
            }
        }
        System.out.println("最大值"+"  "+arr[arr.length-1]);
        System.out.println("最小值"+"  "+arr[0]);
        for(int w=0;w<=arr.length-1;w++) {
            sum = sum + arr[w];
        }
            System.out.println(sum/arr.length);
    }
}
