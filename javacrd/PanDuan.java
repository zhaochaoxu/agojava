public class PanDuan{
    public static void main(String[] args){  
        java.util.Scanner sc= new java.util.Scanner(System.in);
        //请输入一个数字
        System.out.println("请输入一个数字：");
        int sum =sc.nextInt();
        
        //int sum = 6;
        if(sum%2==0){
            System.out.println("您输入的数字是偶数");
        }else{
            System.out.println("您输入的数字是奇数");
        }
        
    }


}