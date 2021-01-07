package array;

public class Examples4 {
    public static void main(String[] args){
        int d = 257;
        int a = 0;

        for(int i=0;i<3;i++){
            a = d % 10 + a;
            d = d / 10;
        }

        System.out.println(a);
    }

}
