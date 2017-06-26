package Programming3;
import java.util.Scanner;

public class Exercise1 {
	
	//재사용하기 위해 함수로 정의
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
		System.out.println("덧셈할 범위(시작과 끝을)를 입력하세요.");
		int firstNumber = input.nextInt();
		int lastNumber = input.nextInt();
		sumPrint(firstNumber, lastNumber);
	}
}
