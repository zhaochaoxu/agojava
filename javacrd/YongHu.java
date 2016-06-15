public class YongHu{
    public static void main(String[] args){
        
        java.util.Scanner sc= new java.util.Scanner(System.in);
        //输入用户名
        System.out.println("请输入您的用户名：");
        String name = sc.next();
        //输入密码
        System.out.println("请输入您的密码：");
        String psw = sc.next();
        //进行用户和密码匹配
        if(name.equals("赵朝旭") &&psw.equals ("zxc123") ){
           System.out.println("登录成功"); 
        }else{
            System.out.println("用户名或密码错误");
        }
        
        //输出结果
    }
    
}