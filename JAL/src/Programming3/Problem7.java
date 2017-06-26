package Programming3;

public class Problem7 {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		intArray[0] = 0;
		
		try {	
			for (int i =0; i<=5; i++) {
				intArray[i] = i + intArray[i];
				System.out.println("intArray[" + i + "] =" + intArray[i]);
				}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("에러 발생");
		}
	}
}
