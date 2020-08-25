package phone2;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public void ShowMenu() {
		System.out.println("\n메뉴를 선택하세요\n--------------------");
		System.out.println("1.데이터입력");
		System.out.println("2.프로그램 종료 \n--------------------");
		System.out.print("선택:");
	}

	public void readData() {
		System.out.print("이름 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("전화번호 : ");
		String num = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();

		PhoneInfo plnfo = new PhoneInfo(name, num, birth);
//		PhoneInfo plnfo = new PhoneInfo("홍길동", "111-2222", "99년 4월 17일생");
		System.out.println("\n입력된정보를 출력...\n");
		plnfo.showPhoneInfo();
	}

	public static void main(String[] args) {
		Main m = new Main();
		int select;

		while (true) {
			m.ShowMenu();
			select = sc.nextInt();
			sc.nextLine();

			switch (select) {
			case 1:
				m.readData();
				break;
			case 2:
				System.out.println("전화번호부 종료.");
				return;
			}
		}
	}
}

class PhoneInfo {
	private String name;
	private String phoneNum;
	private String birth;

	public PhoneInfo(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public PhoneInfo(String name, String phoneNum, String birth) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.birth = birth;
	}

	public void showPhoneInfo() {
		String s = "";
		if (birth != null) {
			s = "PhoneInfo [name=" + name + ", phoneNum=" + phoneNum + ", birth=" + birth + "]";
		} else {
			s = "PhoneInfo [name=" + name + ", phoneNum=" + phoneNum + "]";
		}
		System.out.println(s);
	}
}
