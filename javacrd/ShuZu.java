public class ShuZu{
    
    public static void main(String[] args){
        
        /* int arr [] = new int [6];
        arr[0] = 22;
        arr[1] = 33;
        arr[2] = 66; */
        int arr[] = {11,22,33,55,66,99};
        
        for(int i=0; i < arr.length; i++){
            
          System.out.println("第" + (i+1) + "个数字" + arr[i]);  
        }
        /* for(int num : arr){
            System.out.println(num);  
        }
        for(int i=arr.length-1; i>=0; i--){
            
          System.out.println("第" + (i) + "个数字" + arr[i]);  
        } 
        
        int arr[] = {11,22,33,55,66,99};
        //输出最大值
        int min = arr[arr.length-1];
        for(int num : arr){
            if(min>num){
               
                min=num;
            } 
            //System.out.println(min);
        }*/
       /*  java.util.Scanner sc= new java.util.Scanner(System.in);
        
        int score[] = new int[5];
       
        for(int i=0; i<score.length;i++){
            //请输入你的分数
            
            score[i]=sc.nextInt();
           
        }
       
        System.out.println(score[sc.nextInt()]); */
    }
    
}