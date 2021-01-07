package array;

import java.util.Random;
import java.util.Scanner;
public class Examples5 {
    public static void main(String[] args) {
        Random r = new Random();
        int i = 0;
        int baich = r.nextInt(101);
        Scanner s = new Scanner(System.in);
        while (true){
            int dd = s.nextInt();
         if(dd>baich){ System.out.println("这个数大了");}
         if(dd<baich){System.out.println("这个数小了");}
          if(dd==baich) {System.out.println("猜对了");break;}

            i++;

        }
        System.out.println(i);
    }
}
