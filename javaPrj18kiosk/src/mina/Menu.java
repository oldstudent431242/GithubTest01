package mina;

public class Menu {
	static int burger;

	public int burgerMenu() {
		// 버거 메뉴
		// 정수 입력받기
		System.out.println("===========햄버거===========");
		System.out.println("1. " + Main.BURGER01);
		System.out.println("2. " + Main.BURGER02);
		System.out.println("3. " + Main.BURGER03);
		return burger = Main.sc.nextInt();
	}
}
