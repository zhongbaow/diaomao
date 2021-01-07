package swjd;
import java.util.Scanner;
public class Examlp1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int year = s.nextInt();
        System.out.println("请输入一个月份");
        int month = s.nextInt();
        System.out.println("请输入一个天数");
        int day = s.nextInt();



        pdts(year,month,day);
    }
    public static void pdts(int a ,int b, int c){
        int sum = 0;
        if (b>12 || b < 0){
            System.out.println("输入的月份不合法");
            return;
        }

        for (int i = b; i>0; i--) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 10:
                case 12:
                    sum = sum + 31;
                    break;

                case 2:
                    if (sfrn(a)) {
                        sum = sum + 28;
                    } else {
                        sum = sum + 29;
                    }
                    break;
                case 4:
                case 8:
                case 6:
                case 11:
                    sum = sum + 30;
                    break;
            }
        }

        System.out.println("天数是"+sum);
    }














    public static boolean sfrn(int a){
        if((a/4==0&&a/100!=0) || a % 400==0){
            return true;
        }else {
            return false;
        }
    }
}
