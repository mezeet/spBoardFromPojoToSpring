package Util;

import java.util.Scanner;

public class Input {

	public void input(){
	//Scanner example
    Scanner input = new Scanner(System.in);
    System.out.print("입력 ");
    String inputString = input.nextLine();
    System.out.print("확인 : ");
    System.out.println(inputString);
	}
}
