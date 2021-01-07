package swjd;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Example2 {
    public static void main(String[] args) {
        int[] arr = {31, 28, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31};
        System.out.println("请输入一个年份");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        System.out.println("请输入一个月份");
        int month = s.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("您输入的月数不存在");
            return;
        }
        System.out.println("请输入天数");
        int days = s.nextInt();

        if (days > 31 || days < 0) {
            System.out.println("您输入的天数不存在");
            return;
        }
        if ((year / 4 == 0 && year / 100 == 0) || year / 400 == 0) {
            arr[1] = 29;
        }
        //int day = ？？？？;
          int c = pdts(arr,month,days);
        System.out.println(c);
    }

    public static int pdts(int[] arr,int month,int days) {
        int sum = 0;
        if(month ==1){
            return days;

        }
        month--;
        for (; month >0 ; month--) {
            sum = sum + arr[month - 1];

        }
       return sum+days;

    }
}
