public class Yuan{
    public static void main(String[] args){
        java.util.Scanner sc= new java.util.Scanner(System.in);
        double mj = 0;
        //输入圆的半径
        System.out.println("请输入圆的半径");
        double b = sc.nextDouble();
        
        //mj = (int)(b*b*3.14);
        mj = b*b*3.14;
        //求圆的面积
        System.out.println("圆的面积为：" + mj);
        
        //输出圆的面积
    }

}