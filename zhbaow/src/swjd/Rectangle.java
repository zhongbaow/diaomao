package swjd;

public class Rectangle {
     /*定义一个矩形类Rectangle：
            1)定义三个方法：getArea()求面积、getPer()求周长，showAll()分别在控制台输出长、宽、面积、周长。
            2)有2个属性：长length、宽width。
            3)通过构造方法Rectangle(int width, int length)，分别给两个属性赋值。*/
         int langth;
         int width;

         public Rectangle (){

         }
         public Rectangle(double a, double b){
             langth = (int)a;
             width = (int)b;
         }

         public double getArea(){
             return this.langth * this.width;
         }
        public double getPer(){
             return (this.langth+this.langth)/2;
        }

        public void showAll(Rectangle a){
            System.out.println("长【"+a.langth+"】 宽【"+a.width+"】 面积【"+a.getArea());
        }
}
