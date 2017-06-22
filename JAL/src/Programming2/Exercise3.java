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
		char result = 0; //변수를 선언해준다.
		char input = sc.next().charAt(0);  //index가 0번째부터시작.
		if(isAlphabet(input) == false){
			System.out.println("영문자가 아닙니다.");
		}
		else{
			//대문자일때  true를 반환 ,소문자일때 false를 반환
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