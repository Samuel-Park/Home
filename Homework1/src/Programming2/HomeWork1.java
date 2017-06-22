package Programming2;

import java.util.Scanner;
  // 세 변의 길이를 입력받아 삼각형을 만들 수 있는지 유무를 확인하는 코드 

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
			System.out.println(" -> Output : 삼각형을 만들 수 있음" );
		}
		else {
			System.out.print("input : " +a+ " "+b+" "+c);
			System.out.println(" -> Output : 삼각형을 만들 수 없음" );
		}

	}
}