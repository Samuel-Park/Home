package Programming3;
import java.util.Scanner;

public class Exercise2 {
	public static void guguPrint(int x) {
		for(int i=1; i<10; i++){
				System.out.print(+ x + "*" + i + "=" + x*i);
				System.out.println();
		}
	}
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		System.out.println("�ܼ��� �Է��ϼ���");
		while((number =input.nextInt()) != -1) {
			guguPrint(number);
		}
	}
}