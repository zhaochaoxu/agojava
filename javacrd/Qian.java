public class Qian{
    
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        int pice = 0;
        
        String str = "y";
        
        while(str.equals("y")){
            
            System.out.println("��������");
            
            int temp = sc.nextInt();
            
            System.out.println("�Ƿ���� �����������룺y/n" );
            
            str = sc.next();
            
            pice += temp;
          
        }
  
        System.out.println("�ܽ��Ϊ" + pice);
    } 
}        