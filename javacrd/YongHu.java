public class YongHu{
    public static void main(String[] args){
        
        java.util.Scanner sc= new java.util.Scanner(System.in);
        //�����û���
        System.out.println("�����������û�����");
        String name = sc.next();
        //��������
        System.out.println("�������������룺");
        String psw = sc.next();
        //�����û�������ƥ��
        if(name.equals("�Գ���") &&psw.equals ("zxc123") ){
           System.out.println("��¼�ɹ�"); 
        }else{
            System.out.println("�û������������");
        }
        
        //������
    }
    
}