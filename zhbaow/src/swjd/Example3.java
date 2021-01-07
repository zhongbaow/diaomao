package swjd;
//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        DianLao MacBookAir = new DianLao("MacBookAir",13.3,6999.0,0);

        DianLao ThinkPadT450 = new DianLao("ThinkPadT450",14,5999.0,0);

        DianLao[] arr = {MacBookAir, ThinkPadT450};

        Scanner s = new Scanner(System.in);
        zrr();
        while (true) {
            int flag = s.nextInt();
            if (flag < 0 && flag > 3) {
                System.out.println("输入的数字不存在");
                continue;
            }
            if (flag == 1) {
                ckkxd(arr);
            } else if (flag == 2) {
                xiugai(arr);
            } else if (flag == 3) {
                System.out.println("退出程序成功");
                return;
            }
        }
    }
    public static void xiugai(DianLao[] arr){
        Scanner s = new Scanner(System.in);
        System.out.println("--------------------修改库存数量-----------");
             for(int j=0;j<arr.length;j++){
                 System.out.println("请输入"+arr[j].xinhao+"商品库存数");
                 int flag = s.nextInt();
                 if (flag<0){ System.out.println("输入错误，请输入合法的数字");break;}
                 arr[j].KuCun = flag;
             }
    }
    public static void ckkxd(DianLao[] arr) {

        System.out.println("--------------------查看库存清单-----------");
        for (int i =0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
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
class DianLao{
    String xinhao;double Cicun;
    double JiaGe;int KuCun;

    public DianLao(){}
    public DianLao(String xinhao, double cicun, double jiaGe, int kuCun) {
        this.xinhao = xinhao;
        Cicun = cicun;
        JiaGe = jiaGe;
        KuCun = kuCun;
    }

    public String toString(){
        return xinhao +"    "+Cicun+"    "+JiaGe+"    "+KuCun;
    }
}