public class PatternChoice{
	public static void main(String[] args){
	
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("��ѡ������Ҫ��ͼ�Σ�1�����Σ�2��ֱ�������Σ�3��ʥ������");
		
		int i,j,num,num2;
		
		int num1 = input.nextInt();
		switch (num1){
			case 1:
		
				System.out.println("��������Ҫ�Խ���Ϊ�������Σ�");
				
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
						System.out.println("��������Ҫ����ʥ����");

				num = input.nextInt();
					 //���ڱ��
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
					//����1���
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
					//����2���
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
					//���ɱ��
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
				System.out.println("����������!");
		}
	}
}