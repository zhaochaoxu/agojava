public class PatternChoice{
	public static void main(String[] args){
	
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("请选择你需要的图形：1、菱形；2、直角三角形；3、圣诞树。");
		
		int i,j,num,num2;
		
		int num1 = input.nextInt();
		switch (num1){
			case 1:
		
				System.out.println("请问你需要对角线为几的菱形：");
				
				num2 = input.nextInt();
				
				for(i=0;i<num2/2;i++){
				
					for(j=0;j<=num2/2+i;j++){
						if(j>=num2/2-i){
							System.out.print("*");
						}else{
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				for(i=num2/2;i>=0;i--){
				
					for(j=0;j<=num2/2+i;j++){
						if(j>=num2/2-i){
							System.out.print("*");
						}else{
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;
			case 2:
				for(i=1;i<10;i++){
					for(j=1;j<=i;j++){
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			case 3:
						System.out.println("请问你需要多大的圣诞树");

				num = input.nextInt();
					 //树冠编程
				for(i=0;i<=num/2-4;i++){
				
					for(j=0;j<=num/2+i;j++){
					
						if(j>=num/2-i){
						
							System.out.print("*");
							
						}else{
						
							System.out.print(" ");
						}
					}
					System.out.println();
				}
					//树身1编程
				for(i=1;i<=num/2-2;i++){
				
					for(j=0;j<=num/2+i;j++){
					
						if(j>=num/2-i){
						
							System.out.print("*");
							
						}else{
						
							System.out.print(" ");
						}
					}
					System.out.println();
				}
					//树身2编程
				for(i=1;i<=num/2;i++){
				
					for(j=0;j<=num/2+i;j++){
					
						if(j>=num/2-i){
						
							System.out.print("*");
							
						}else{
						
							System.out.print(" ");
						}
					}
					System.out.println();
				}
					//树干编程
				for(i=0;i<=num/2;i++){
				
					for(j=0;j<num-3;j++){
					
						if(j>=3){
						
							System.out.print("*");
							
						}else{
						
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;
			default:
				System.out.println("你输入有误!");
		}
	}
}