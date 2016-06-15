public class Bai{
    
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        /* int i =0 ;
        //i++;                     //死循环
        //for(i=0;i<100;i++)
        while(i<100){
            i++;    //100
            System.out.println("您好：第" + i +"次");
            //i++;  //99
            int count = 0;
            while(count<50){
                count ++;
                System.out.println("好好学习，天天练习");
            }
      
        //i++;                     // 死循环 */
        int num = 0;
        //请输入金额
        /* System.out.println("请输入金额");
        int pic = sc.nextInt();
        // 提示 是否继续 若继续请输入“y”
        System.out.println("是否继续 若继续请输入：y/n" );
        String str = sc.next(); */
        //判断是否为“y”
        while(str.equals("y")){
            //i++;
            System.out.println("请输入金额");
            int pic = sc.nextInt();
            System.out.println("是否继续 若继续请输入：y/n" );
        String str = sc.next();
            num = num + pic;
            System.out.println("总金额为" + num);
        }
        // 累计总金额
        /* num = num + pic;
        System.out.println("总金额为"); */
    }
   
}