public class Xit{
    public static void main(String[] args){
        java.util.Scanner sc =new java.util.Scanner(System.in);
        //制作登录页面
        System.out.println("   欢迎登陆管理系统   ");
        System.out.println("======================");
        System.out.println("     1.登录           ");
        System.out.println("     2.注册");
        System.out.println("     3.退出");
        System.out.println("======================");
        //请输入选号
        System.out.println("请输入选号");
        int num = sc.nextInt();
        switch(num){
            case 1 :
            //请输入您的名字
            System.out.println("请输入您的名字");
            String name = sc.next();
            //请输入您的密码
            System.out.println("请输入您的密码");
            String psw = sc.next();
            //验证用户名和密码
            if(name.equals("牛丽娟") &&psw.equals ("zyj521") ){
                System.out.println("登录成功"); 
                 }else{
                System.out.println("用户名或密码错误");
             }
            break;
            case 2 :
            //请输入您的身份证号
            System.out.println("请输入您的身份证");
            String str = sc.next();
            //请输入您的名字
            System.out.println("请输入您的名字");
            String ming = sc.next();
            //请输入您的密码
            System.out.println("请输入您的密码");
            String mima = sc.next();
            System.out.println("恭喜您注册完毕");
            break;
            case 3:
            System.out.println("退出");
            break;
        }
    }

}