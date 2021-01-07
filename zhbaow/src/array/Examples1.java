package array;

public class Examples1 {
    public static void main(String[] args){
        int flag;
        int[] arr = {12,34,87,45,63,72};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                     flag = arr[j];
                     arr[j] = arr[i];
                     arr[i] = flag;
                }
            }
        }
        for(int w =0;w<arr.length;w++){
            System.out.println(arr[w]);
        }
    }
}
