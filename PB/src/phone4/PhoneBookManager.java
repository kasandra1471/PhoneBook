package phone4;

public class PhoneBookManager {
	final int MAX = 100;
	PhoneInfo[] phoneList = new PhoneInfo[MAX];
	int cnt = 0;

	void readData() {
		String sName, sPhoneNum;
		System.out.print("������ �Է��� �����մϴ�.");
		System.out.println("1.�Ϲ�, 2.����, 3.ȸ��");
		System.out.print("���� : ");
		int choice = PhoneBook.scan.nextInt();
		
		System.out.print("�̸� : ");
		sName = PhoneBook.scan.next();
		System.out.print("��ȭ��ȣ : ");
		sPhoneNum = PhoneBook.scan.next();
		// �̸��� ������ ���� �κ����� üũ. �������� ���ÿ� ���ؼ� �߰� ó��.

		switch (choice) {
		case 1:			
			PhoneInfo pi = new PhoneInfo(sName, sPhoneNum);
//			PhoneInfo pi = new PhoneInfo("normal", "111");
			phoneList[cnt] = pi;
			cnt++;
			break;
		case 2:
//			System.out.print("�̸� : ");
//			sName = PhoneBook.scan.next();
//			System.out.print("��ȭ��ȣ : ");
//			sPhoneNum = PhoneBook.scan.next();
			System.out.print("���� : ");
			String major = PhoneBook.scan.next();
			System.out.print("�г� : ");
			int year = PhoneBook.scan.nextInt();
			PhoneInfo pui = new PhoneUnivInfo(sName, sPhoneNum, major, year);
			// PhoneInfo pui = new PhoneUnivInfo("univ", "222", "����", 1);
			phoneList[cnt] = pui;
			cnt++;
			break;
		case 3:
//			System.out.print("�̸� : ");
//			sName = PhoneBook.scan.next();
//			System.out.print("��ȭ��ȣ : ");
//			sPhoneNum = PhoneBook.scan.next();
			System.out.print("ȸ�� : ");
			String company = PhoneBook.scan.next();
			PhoneInfo pci = new PhoneCompanyInfo(sName, sPhoneNum, company);
			// PhoneInfo pci = new PhoneCompanyInfo("comp", "333", "�μ�");
			phoneList[cnt] = pci;
			cnt++;
			break;
		default:
			System.out.print("������ �Է��� �Ϸ�Ǿ����ϴ�.");
		}

//		System.out.print("������� : ");
//		String sBirth = PhoneBook.scan.next();
		System.out.println();

	}

	int searchIndex(String name) {
		int index = 200;

		for (int i = 0; i < cnt; i++) {
			if (name.equals(phoneList[i].getName())) {
				index = i;
			}
		}

		return index;
	}

	void searchData() {
		System.out.println("������ �˻��� �����մϴ�.");
		System.out.print("�̸� : ");
		String sName = PhoneBook.scan.next();
		int i = searchIndex(sName);
		System.out.println(i + "��° ���� ã�ҽ��ϴ�.");

		if (i != 200) {
			phoneList[i].showPhoneInfo();
		} else {
			System.out.println("ã�� ���� �������� �ʽ��ϴ�.\n");
		}
	}

	void deleteData() {
		System.out.println("������ ������ �����մϴ�..");
		System.out.print("�̸� : ");
		String sName = PhoneBook.scan.next();
		int i = searchIndex(sName);

		if (i != 200) {
			arrSort(i);
			System.out.println(i + "��° �����Ͱ� ���� �Ǿ����ϴ�.");
			cnt--;
		} else {
			System.out.println("ã�� ���� �����ϴ�.");
		}
		System.out.println("���� ��ϵ� ����ó:" + cnt + "\n");
	}

	void arrSort(int index) {
		for (int i = index; i < cnt; i++) {
			phoneList[i] = phoneList[i + 1];
		}
		phoneList[cnt] = null;
		// �ʿ� ����. ���� ��ŭ���� �˻��ϴ�, �������� ��� null �ƴ� ���� üũ ����.
	}

	void allList() {
		for (int i = 0; i < cnt; i++) {
			phoneList[i].showPhoneInfo();
			System.out.println();
		}
	}
}
