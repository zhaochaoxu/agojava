public class PanDuan{
    public static void main(String[] args){  
        java.util.Scanner sc= new java.util.Scanner(System.in);
        //������һ������
        System.out.println("������һ�����֣�");
        int sum =sc.nextInt();
        
        //int sum = 6;
        if(sum%2==0){
            System.out.println("�������������ż��");
        }else{
            System.out.println("�����������������");
        }
        
    }


}