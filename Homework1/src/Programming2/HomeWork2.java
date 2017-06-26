package Programming2;

import java.util.Scanner;
  // 세 쌍의 좌표를 입력받고 면적을 구하는 코드

public class HomeWork2 {
    //
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a1 = input.nextInt();
		int b1 = input.nextInt();		
		int a2 = input.nextInt();
		int b2 = input.nextInt();
		int a3 = input.nextInt();
		int b3 = input.nextInt();
		triangle(a1,b1,a2,b2,a3,b3);
	}

	// HomeWork1에서 정의한 메소드를 이용하여 삼각형이 가능한지 확인한다.
	public static boolean isEnableTriangle(double x1, double x2, double x3) {
		if((x1<(x2+x3)) && (x2<(x1+x3)) && (x3<(x2+x1))) {
			return true;
		}
		else 
			return false;
	}
	
	// triangle함수
	public static void triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		double result = (((x1*y2)+(x2*y3)+(x3*y1))-((x2*y1)+(x3*y2)+(x1*y3)))/2;
		int aa = (((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		int bb = (((x2-x3)*(x2-x3))+((y2-y3)*(y2-y3)));
		int cc = (((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1)));
		double a = Math.sqrt(aa);
		double b = Math.sqrt(bb);
		double c = Math.sqrt(cc);
		
		if(isEnableTriangle(a, b, c) == false) {
			System.out.println("삼각형을 만들 수 없음");
		}
		else {
			if(result<0) {
				result = result * (-1);
				System.out.print("Input : "+x1+" "+y1+" "+x2+" "+y2+" "+x3+" "+y3+" ");
				System.out.println("-> Output : 삼각형의 면적은 "+ result + "입니다.");
			}
			else {
				System.out.print("Input : "+x1+" "+y1+" "+x2+" "+y2+" "+x3+" "+y3+" ");
				System.out.println("-> Output : 삼각형의 면적은 "+ result + "입니다.");
			}
		}
	}

}
