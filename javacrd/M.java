public class M{
    public static void main(String[] args){
        
        /* int count = 0;
        while(count<5){
            
            count++;
            if(count==3){
                //break;
                continue;
            }
            System.out.println(count);
        }
        //System.out.println(count); */
        
        java.util.Scanner sc= new java.util.Scanner(System.in);
        double num=0;
        do{
            System.out.println("进行编程考试");
            System.out.println("考试得分");
            //输入您的成绩
            System.out.println("输入您的成绩");
            double num = sc.nextDouble();
            System.out.println("");
           
        } while (num < 60);
        
        System.out.println("考试成绩合格，通过");
        
        
       /* /*  for(int i=0; i<5; i++){
            
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(); 
          } */
        
         /* for(int i=0; i<9; i++){
            
            for(int j=0;j<=i;j++){
                System.out.print((i+1)+"*"+(j+1)+"="+((i+1)*(j+1))+"\t");
            }
            System.out.println();
         } */
   
   }       
    
}