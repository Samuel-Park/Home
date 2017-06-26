package Programming3;
//반복문을 이용한 숫자의 합 출력

public class Problem1 {
	//메소드를 사용함
	public static void sumPrint(int x) {
		System.out.println(x*(x+1)/2);
	}
	
	public static void main(String[] args) {
		sumPrint(10);
		
		//for문을 사용함
		int sum =0;
		
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			System.out.print(i);
			if(i==10) {
				System.out.print("=");
				System.out.println(sum);
			}
			else
				System.out.println("+");
		}
	}
}
