package array;

public class Examples2 {
    public static void main(String[] args){
        int[] arr = {12,34,24,56,34,78,12};
        int[] arr1 = new int[arr.length];
        int f = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    arr1[f++] = arr[i];
                }
            }
        }

        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

    }
}
