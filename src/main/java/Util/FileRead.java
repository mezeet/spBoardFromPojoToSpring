package Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 간단한 계산을 처리하는 클래스
 * @author mezeet
 */
public class FileRead {

	/**
	 *  파일에서 메뉴를 읽어서 배열로 리턴한다.
	 * @param String fileName 읽을 파일의 이름
	 * @return String[] menu 파일에 있는 각 메뉴 원소명을 모두 가진 배열
	 *  @see http://force44.blog.me/130096936294 
	 */
	public String[] readMenuElements(String service, String fileName){
		
		File file = new File("src/main/java/webapp/WEB-INF/dep/route.txt");
		try {
			Scanner scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없네요.");
		}
		return null;
	}
	
	
	public String[] readAnnouncement(String service,String fileName){
		return null;
	}
}


