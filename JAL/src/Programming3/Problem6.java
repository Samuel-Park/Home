package Programming3;
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;

		System.out.print("나뉨수를 입력하세요 : ");
		dividend = input.nextInt();
		System.out.print("나눗수를 입력하세요 : ");
		divisor = input.nextInt();
		
		try{
			//예외가 발생했으면 이전 코드는 무효가 되고 catch문으로 넘어간다.
			System.out.println(dividend + "를 " + divisor +"로 나누면" + dividend/divisor);
		}
		catch(ArithmeticException e) {
			System.out.println("0을 입력하셨습니다.");
		}
		finally{
			System.out.println("끝");
		}
	}
}
