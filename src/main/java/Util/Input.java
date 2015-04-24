package Util;

import java.util.Scanner;

/**
 * 간단한 계산을 처리하는 클래스
 * @author mezeet
 */
public class Input {

	/**
	 *  입력을 받는 메소드
	 * @return int i+j 덧셈 연산의 결과
	 */
	public static String input(){
    Scanner input = new Scanner(System.in);
    System.out.print("입력 :");
    String inputString = input.nextLine();
    return inputString; 
	}
	
	
}
