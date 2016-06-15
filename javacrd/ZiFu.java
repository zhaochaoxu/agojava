public class ZiFu{
    public static void main(String[] args){
        
        java.util.Scanner sc= new java.util.Scanner(System.in);
        //先定义字符串
        /* String a="369";
        String b="699"; */
        //请输入你所需要的字符串
        System.out.println("请输入您的字符串：");
        String str=sc.next();
        //输入的字符串与定义的字符串进行对比 
        //name.equals("赵朝旭")
  
            if(str.equals("ily") || str.equals("zxc")){
                System.out.println("您输入的字符串匹配"+ true);
            }else{
                System.out.println("您输入的字符串匹配"+ false);
               
                 }
                 
       
        
    }
    
    
    
}