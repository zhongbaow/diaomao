package Hug;

import java.util.Scanner;

public class Example1 {
    public static void xiugai(int[] arr){
        Scanner s = new Scanner(System.in);
        System.out.println("--------------------修改库存数量-----------");
        for(int j=0;j<arr.length;j++){
            System.out.println("请输入"+arr[j]+"商品库存数");
            int flag = s.nextInt();
            if (flag<0){ System.out.println("输入错误，请输入合法的数字");break;}
            arr[j] = flag;
        }
    }
    public static void ckkxd(int[] arr) {

        System.out.println("--------------------查看库存清单-----------");
        for (int i =0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void zrr(){
        System.out.println("----------库存管理---------");
        System.out.println("1.查看库存清单");
        System.out.println("2.修改库存数量");
        System.out.println("3.退出");
        System.out.println("请输入要执行的操作序号:");
    }
}
