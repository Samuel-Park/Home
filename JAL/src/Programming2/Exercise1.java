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
			System.out.print(i + "�� " + j + "�� ū ���� " + s + "�Դϴ�. / ");
		}
		else System.out.print(" ");
			
		if (t>0) {
			System.out.println(k + "�� " + l + "�� ū ���� " + t + "�Դϴ�.");
		}
		else System.out.print(" ");
		
	}

}
