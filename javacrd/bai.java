public class Bai{
    
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        /* int i =0 ;
        //i++;                     //��ѭ��
        //for(i=0;i<100;i++)
        while(i<100){
            i++;    //100
            System.out.println("���ã���" + i +"��");
            //i++;  //99
            int count = 0;
            while(count<50){
                count ++;
                System.out.println("�ú�ѧϰ��������ϰ");
            }
      
        //i++;                     // ��ѭ�� */
        int num = 0;
        //��������
        /* System.out.println("��������");
        int pic = sc.nextInt();
        // ��ʾ �Ƿ���� �����������롰y��
        System.out.println("�Ƿ���� �����������룺y/n" );
        String str = sc.next(); */
        //�ж��Ƿ�Ϊ��y��
        while(str.equals("y")){
            //i++;
            System.out.println("��������");
            int pic = sc.nextInt();
            System.out.println("�Ƿ���� �����������룺y/n" );
        String str = sc.next();
            num = num + pic;
            System.out.println("�ܽ��Ϊ" + num);
        }
        // �ۼ��ܽ��
        /* num = num + pic;
        System.out.println("�ܽ��Ϊ"); */
    }
   
}