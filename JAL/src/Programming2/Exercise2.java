package Programming2;
import java.util.Scanner;

public class Exercise2 {
	
	public static double rectangle(int x1, int y1, int x2, int y2) {
		int x= x2-x1;
		int y= y2-y1;
		return x*y;
	}
	public static double circle(double r, double PI) {
		return r*r * PI;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x�� �������� y�� �������� �Է��Ͻÿ�.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("x�� ������ y�� ������ �Է��Ͻÿ�.");
		int c = sc.nextInt();
		int d = sc.nextInt();
		final double PI = 3.14;
		System.out.println("�������� �Է��Ͻÿ�.");
		double radius = sc.nextInt();
		
		System.out.print("(" + a +"," + b + ")����");
		System.out.print("(" + c +"," + d + ")���� ");
		System.out.println("���콺�� �巡���� �簢���� ������ " + rectangle(a,b,c,d) + " �Դϴ�." );
		System.out.print("���� �������� " + radius + "�� �� ���� ������ " + circle(radius,PI) + " �Դϴ�.");
	}
}