package phone6;

import java.util.HashSet;
import java.util.Iterator;

import phone5.MyExcep;

class PhoneBookManager {
//	final int MAX = 100;
//	PhoneInfo[] phoneList = new PhoneInfo[MAX];
	HashSet<PhoneInfo> phoneList = new HashSet<PhoneInfo>();
//	int cnt = 0;

	private PhoneBookManager() {
		// ������.....�״��..
	}

	static PhoneBookManager inst = null;

	public static PhoneBookManager creatManagerInst() {
		if (inst == null)
			inst = new PhoneBookManager();

		return inst;
	}

	void readData() {// ����� ���ÿ� ���� �޼ҵ� ȣ��.
		System.out.println("������ �Է��� �����մϴ�.");
		System.out.println("1.�Ϲ�, 2.����, 3.ȸ��");
		System.out.print("����: ");
		int choice = PhoneBook.sc.nextInt();// � �������� ����.
		boolean already = false;

//		PhoneBook.sc.nextLine();// ���� ������ �ʴ� ���� ���ſ�.
//		System.out.print("�̸�:");
//		String name = PhoneBook.sc.nextLine();
//		System.out.print("��ȭ��ȣ:");
//		String phoneNumber = PhoneBook.sc.nextLine();

		switch (choice) {
		case 1:
//			PhoneInfo pi = new PhoneInfo(name, phoneNumber);
			PhoneInfo pi = new PhoneInfo("normal", "1234");
			// ����ó�� ���� ��ü ����.
//			phoneList[cnt] = pi;
			already = searchIndex("normal", "search");
			if (already) {
				System.out.println("�̹� ����� �������Դϴ�.");
			} else {
				phoneList.add(pi);
				System.out.println("������ �Է��� �Ϸ� �Ǿ����ϴ�.");
			}
			// cnt++;
			break;
		case 2:
			// ���� ����ó
//			System.out.print("����: ");
//			String major = PhoneBook.sc.nextLine();
//			System.out.print("�г�: ");
//			int year = PhoneBook.sc.nextInt();
//			PhoneInfo pui = new PhoneUnivInfo(name, phoneNumber, major, year);
			PhoneInfo pui = new PhoneUnivInfo("univ", "222", "it", 3);
			// �ڽ��� ��ü�� �θ� ��ü ������ ������ ����ȯ�� ���ؼ� ����.
			// showPhoneInfo�� �ڽ� Ŭ�������� �������̵� �����Ƿ�,
			// �θ� Ÿ�Կ��� ȣ���ؼ� ����Ҷ� �������̵� �� �޼ҵ尡 �켱��.
//			phoneList[cnt] = pui;
//			cnt++;
			phoneList.add(pui);
			System.out.println("������ �Է��� �Ϸ� �Ǿ����ϴ�.");
			break;
		case 3:// ȸ�� ����ó
//			System.out.print("ȸ��: ");
//			String company = PhoneBook.sc.nextLine();
//			PhoneInfo pci = new PhoneCompanyInfo(name, phoneNumber, company);
			PhoneInfo pci = new PhoneCompanyInfo("company", "222", "sale");
//			phoneList[cnt] = pci;
//			cnt++;
			phoneList.add(pci);
			System.out.println("������ �Է��� �Ϸ� �Ǿ����ϴ�.");
			break;
		default:

			try {
				throw new MyExcep(choice);
			} catch (MyExcep e) {
				System.out.println(e.getMessage());
				// e.printStackTrace();
			}

		}
	}

	void searchData() {
		System.out.println("������ �˻��� �����մϴ�.");
		PhoneBook.sc.nextLine();// ���Ͱ� ����.
		System.out.print("�̸�:");
		String name = PhoneBook.sc.nextLine();
		boolean has = searchIndex(name, "search");

		if (!has) {
			// ã�� ��� ����.
			System.out.println("ã�� ���� �������� �ʽ��ϴ�.");
		}
	}

	boolean searchIndex(String s, String state) {
		Iterator<PhoneInfo> itr = phoneList.iterator();
		boolean has = false;

		while (itr.hasNext()) {
			PhoneInfo p = itr.next(); // PhoneInfo�� ���� ����Ŭ������ �ڽ�Ŭ���� �����ڵ��� �� �����ü�����
			if (s.equals(p.getName())) { // p�� �ٳ��� �񱳿�
				if (state.contentEquals("search")) {
					p.showPhoneInfo();
					has = true;
				} else if (state.contentEquals("del")) {
					itr.remove(); // �ݺ���, ���� ����.
					// phoneList.remove(p); // hashSet_remove
					has = true;
				}
				break;
			}
		}

//		for (PhoneInfo p : phoneList) {
//			System.out.println(p.getName());
//		}

		return has;
	}

	void deleteData() {
		System.out.println("������ ������ �����մϴ�...");
		PhoneBook.sc.nextLine();// ���Ͱ� ����.
		System.out.print("�̸�:");
		String name = PhoneBook.sc.nextLine();
		boolean has = searchIndex(name, "del");

		if (!has) {
			// ã�� ��� ����.
			System.out.println("ã�� ���� �������� �ʽ��ϴ�.");
		}

//		System.out.println("���� ��ϵ� ����ó : " + cnt + "\n");
		// phoneList.size();
		System.out.println("���� ��ϵ� ����ó : " + phoneList.size() + "\n");
	}

	void arrSort(int index) {
//		for (int i = index; i < phoneList.length; i++) {
//			if (i == (phoneList.length - 1)) {
//				phoneList[i] = null;// 99��°�� ���.
//				// phoneList[cnt-1]=null;
//			} else {
//				phoneList[i] = phoneList[i + 1];
//			}
//		}
	}

	void allList() {
//		for (int i = 0; i < cnt; i++) {
//			phoneList[i].showPhoneInfo();
//			System.out.println();
//		}
	}

}// end class
