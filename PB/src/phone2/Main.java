package phone2;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public void ShowMenu() {
		System.out.println("\n�޴��� �����ϼ���\n--------------------");
		System.out.println("1.�������Է�");
		System.out.println("2.���α׷� ���� \n--------------------");
		System.out.print("����:");
	}

	public void readData() {
		System.out.print("�̸� : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String num = sc.nextLine();
		System.out.print("������� : ");
		String birth = sc.nextLine();

		PhoneInfo plnfo = new PhoneInfo(name, num, birth);
//		PhoneInfo plnfo = new PhoneInfo("ȫ�浿", "111-2222", "99�� 4�� 17�ϻ�");
		System.out.println("\n�Էµ������� ���...\n");
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
				System.out.println("��ȭ��ȣ�� ����.");
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
