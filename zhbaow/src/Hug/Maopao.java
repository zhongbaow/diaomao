package Hug;

public class Maopao {
    public static void main(String[] args) {
        int[] arr = {59, 63, 79, 84, 36, 82, 45};
        int num;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    num = arr[j];
                    arr[j] = arr[i];
                    arr[i] = num;
                }
            }
        }
        for(int c=0;c<arr.length;c++) {
            System.out.println(arr[c]);
        }
    }
}
