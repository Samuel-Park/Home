package Programming3;
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;

		System.out.print("�������� �Է��ϼ��� : ");
		dividend = input.nextInt();
		System.out.print("�������� �Է��ϼ��� : ");
		divisor = input.nextInt();
		
		try{
			//���ܰ� �߻������� ���� �ڵ�� ��ȿ�� �ǰ� catch������ �Ѿ��.
			System.out.println(dividend + "�� " + divisor +"�� ������" + dividend/divisor);
		}
		catch(ArithmeticException e) {
			System.out.println("0�� �Է��ϼ̽��ϴ�.");
		}
		finally{
			System.out.println("��");
		}
	}
}
