package Programming3;
//�ݺ����� �̿��� ������ �� ���

public class Problem1 {
	//�޼ҵ带 �����
	public static void sumPrint(int x) {
		System.out.println(x*(x+1)/2);
	}
	
	public static void main(String[] args) {
		sumPrint(10);
		
		//for���� �����
		int sum =0;
		
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			System.out.print(i);
			if(i==10) {
				System.out.print("=");
				System.out.println(sum);
			}
			else
				System.out.println("+");
		}
	}
}
