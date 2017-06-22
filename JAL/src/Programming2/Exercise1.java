package Programming2;

public class Exercise1 {

	public static double max(double a, double b) {
		if(a<b) {
			return b;
		}
		return a;
	}

	public static void main(String[] args) {
		int i = 4;
		int j = 3;
		double k = 5.5;
		double l = 5.2;
		double s,t;
		s = max(i, j);
		t = max(k, l);
		
		if (s>0) {
			System.out.print(i + "와 " + j + "중 큰 수는 " + s + "입니다. / ");
		}
		else System.out.print(" ");
			
		if (t>0) {
			System.out.println(k + "와 " + l + "중 큰 수는 " + t + "입니다.");
		}
		else System.out.print(" ");
		
	}

}
