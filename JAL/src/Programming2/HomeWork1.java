package Programming2;

import java.util.Scanner;
  // �� ���� ���̸� �Է¹޾� �ﰢ���� ���� �� �ִ��� ������ Ȯ���ϴ� �ڵ� 

public class HomeWork1 {
	public static boolean isEnableTriangle(int x1, int x2, int x3) {
		if((x1<(x2+x3)) && (x2<(x1+x3)) && (x3<(x2+x1))) {
			return true;
		}
		else 
			return false;
	}
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		boolean result;
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(isEnableTriangle(a, b, c)) {
			System.out.print("input : " +a+ " "+b+" "+c);;
			System.out.println(" -> Output : �ﰢ���� ���� �� ����" );
		}
		else {
			System.out.print("input : " +a+ " "+b+" "+c);
			System.out.println(" -> Output : �ﰢ���� ���� �� ����" );
		}

	}
}