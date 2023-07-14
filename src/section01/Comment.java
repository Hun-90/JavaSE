package section01;
/*
 * 주석
 * 코드에 영향을 주지 않는 개발자가 사용하는 메모공간
 * 
 * 여러줄 주석
 * 
 * 이 부분은 컴퓨터가 인식을 하지 않음
 * 줄삭제 : Ctrl + d
 * 실행단축키 : Ctrl + f11
 * 주석단축키 : Ctrl + /
 * javadoc 주석단축기 : Alt + shift + J
 */
public class Comment {
	public static void main(String[] args) {
		// 한줄 주석
		System.out.println("Hello, Java!");
		
		printNum(712);
	}
	
	/** JavaDoc 주석
	 * 
	 *  입력받은 정수 출력하는 메소드
	 * @param num - 입력받은 정수
	 * 주로 공신력있는 주석을 사용할때 사용
	 */
	public static void printNum(int num) {
		System.out.println("num: " + num);
	}
}
