public class Xit{
    public static void main(String[] args){
        java.util.Scanner sc =new java.util.Scanner(System.in);
        //������¼ҳ��
        System.out.println("   ��ӭ��½����ϵͳ   ");
        System.out.println("======================");
        System.out.println("     1.��¼           ");
        System.out.println("     2.ע��");
        System.out.println("     3.�˳�");
        System.out.println("======================");
        //������ѡ��
        System.out.println("������ѡ��");
        int num = sc.nextInt();
        switch(num){
            case 1 :
            //��������������
            System.out.println("��������������");
            String name = sc.next();
            //��������������
            System.out.println("��������������");
            String psw = sc.next();
            //��֤�û���������
            if(name.equals("ţ����") &&psw.equals ("zyj521") ){
                System.out.println("��¼�ɹ�"); 
                 }else{
                System.out.println("�û������������");
             }
            break;
            case 2 :
            //�������������֤��
            System.out.println("�������������֤");
            String str = sc.next();
            //��������������
            System.out.println("��������������");
            String ming = sc.next();
            //��������������
            System.out.println("��������������");
            String mima = sc.next();
            System.out.println("��ϲ��ע�����");
            break;
            case 3:
            System.out.println("�˳�");
            break;
        }
    }

}