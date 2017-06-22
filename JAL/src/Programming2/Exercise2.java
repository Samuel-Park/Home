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
		System.out.println("x의 시작점과 y의 시작점을 입력하시오.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("x의 끝점과 y의 끝점을 입력하시오.");
		int c = sc.nextInt();
		int d = sc.nextInt();
		final double PI = 3.14;
		System.out.println("반지름을 입력하시오.");
		double radius = sc.nextInt();
		
		System.out.print("(" + a +"," + b + ")에서");
		System.out.print("(" + c +"," + d + ")까지 ");
		System.out.println("마우스를 드래그한 사각형의 면적은 " + rectangle(a,b,c,d) + " 입니다." );
		System.out.print("원의 반지름이 " + radius + "일 때 원의 면적은 " + circle(radius,PI) + " 입니다.");
	}
}