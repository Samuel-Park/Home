package Programming2;

import java.util.Scanner;

public class Exercise3 {
	public static boolean isAlphabet(char a) {
		if((a>='A' && a<'Z') || (a>='a' && a<='z')) 
			return true;
		return false;
	}
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		char result = 0; //������ �������ش�.
		char input = sc.next().charAt(0);  //index�� 0��°���ͽ���.
		if(isAlphabet(input) == false){
			System.out.println("�����ڰ� �ƴմϴ�.");
		}
		else{
			//�빮���϶�  true�� ��ȯ ,�ҹ����϶� false�� ��ȯ
			if(Character.isUpperCase(input)) {
				result = Character.toLowerCase(input);
			}
			else
				result = input;
		}
		System.out.print("Input : "+ input + "->");
		System.out.println(" Output : " + result);
	}
}