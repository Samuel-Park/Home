package Programming3;
import java.util.Scanner;

public class Exercise1 {
	
	//�����ϱ� ���� �Լ��� ����
	public static void sumPrint(int x, int y) {
		int sum = 0;
		for(int i=x; i<=y; i++) {
			sum += i;
			System.out.print(i);
			if(i != y)
				System.out.print("+");
			else
				System.out.print("=");
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ ����(���۰� ����)�� �Է��ϼ���.");
		int firstNumber = input.nextInt();
		int lastNumber = input.nextInt();
		sumPrint(firstNumber, lastNumber);
	}
}
