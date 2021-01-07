package swjd;
//.编写java程序创建圆柱体类，具有求表面积和体积的功能。已知给定一个圆柱体，底面圆心p为(0,0),半径r为10，圆柱体高5，求此圆柱体的表面积和体积。（表面积= 2；体积= 2）
public class Example5 {
    public static void main(String[] args){
        Yaazt flag = new Yaazt(0,0,10,5);
        flag.biaomianjihehe();
        flag.tijihehe();
    }
}

class Yaazt{
      int biaomj;
      int tiji;
    int radius , X, y;
    int high,banjing;
    public Yaazt(int X ,int b,int c,int d){
        radius = X;//0
        radius = b;//0
        high = c;//5
        banjing = d;//10


        biaomj = (2 * radius * high) + (2) * (radius) *(radius);
        tiji = (high)*(radius)*(radius);
    }
    public Yaazt(){ }

    public void biaomianjihehe(){
        System.out.println(biaomj);
    }

    public void tijihehe(){
        System.out.println(tiji);
    }
}
