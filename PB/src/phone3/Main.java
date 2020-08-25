package phone3;

import java.util.Scanner;

class PhoneBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneInfo[] pInfo = new PhoneInfo[5];

		while (true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.데이터 입력");
			System.out.println("2.프로그램 종료");
			System.out.print("선택 : ");
			int a = sc.nextInt();
			sc.nextLine();

			if (a == 2) {
				System.out.println("전화번호부가 종료되었습니다.");
				sc.close();
				break;
			}

			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("번호 : ");
			String phone = sc.nextLine();
			System.out.print("생년월일 : ");
			String birth = sc.nextLine();

			for (int i = 0; i <= 0; i++) {
				pInfo[i] = new PhoneInfo(name, phone, birth);
				pInfo[i].showPhoneInfo();
				System.out.println();
			}
		}
	}
}

class PhoneInfo {
	private String name;
	private String phoneNum;
	private String birth;

	public PhoneInfo() {
		super();
	}

	public PhoneInfo(String name) {
		super();
		this.name = name;
	}

	public PhoneInfo(String name, String phoneNum) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public PhoneInfo(String name, String phoneNum, String birth) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.birth = birth;
	}

	public void showPhoneInfo() {
		System.out.println("");
		System.out.println("입력된 정보 출력");
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNum);
		System.out.println("birth : " + birth);
	}
}