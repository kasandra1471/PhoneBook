package phone3;

import java.util.Scanner;

class PhoneBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneInfo[] pInfo = new PhoneInfo[5];

		while (true) {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1.������ �Է�");
			System.out.println("2.���α׷� ����");
			System.out.print("���� : ");
			int a = sc.nextInt();
			sc.nextLine();

			if (a == 2) {
				System.out.println("��ȭ��ȣ�ΰ� ����Ǿ����ϴ�.");
				sc.close();
				break;
			}

			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("��ȣ : ");
			String phone = sc.nextLine();
			System.out.print("������� : ");
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
		System.out.println("�Էµ� ���� ���");
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNum);
		System.out.println("birth : " + birth);
	}
}