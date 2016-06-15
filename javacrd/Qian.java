public class Qian{
    
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        int pice = 0;
        
        String str = "y";
        
        while(str.equals("y")){
            
            System.out.println("请输入金额");
            
            int temp = sc.nextInt();
            
            System.out.println("是否继续 若继续请输入：y/n" );
            
            str = sc.next();
            
            pice += temp;
          
        }
  
        System.out.println("总金额为" + pice);
    } 
}        