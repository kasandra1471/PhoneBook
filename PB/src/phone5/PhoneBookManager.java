package phone5;

public class PhoneBookManager {
	final int MAX = 100;
	PhoneInfo[] phoneList = new PhoneInfo[MAX];
	int cnt = 0;

	void readData() {
		String sName, sPhoneNum;
		System.out.print("데이터 입력을 시작합니다.");
		System.out.println("1.일반, 2.대학, 3.회사");
		System.out.print("선택 : ");
		int choice = PhoneBook.scan.nextInt();

		System.out.print("이름 : ");
		sName = PhoneBook.scan.next();
		System.out.print("전화번호 : ");
		sPhoneNum = PhoneBook.scan.next();
		// 이름과 전번은 공통 부분으로 체크. 나머지만 선택에 의해서 추가 처리.

		switch (choice) {
		case 1:
			PhoneInfo pi = new PhoneInfo(sName, sPhoneNum);
//			PhoneInfo pi = new PhoneInfo("normal", "111");
			phoneList[cnt] = pi;
			cnt++;
			System.out.print("데이터 입력이 완료되었습니다.");
			break;
		case 2:
//			System.out.print("이름 : ");
//			sName = PhoneBook.scan.next();
//			System.out.print("전화번호 : ");
//			sPhoneNum = PhoneBook.scan.next();
			System.out.print("전공 : ");
			String major = PhoneBook.scan.next();
			System.out.print("학년 : ");
			int year = PhoneBook.scan.nextInt();
			PhoneInfo pui = new PhoneUnivInfo(sName, sPhoneNum, major, year);
			// PhoneInfo pui = new PhoneUnivInfo("univ", "222", "전공", 1);
			phoneList[cnt] = pui;
			cnt++;
			System.out.print("데이터 입력이 완료되었습니다.");
			break;
		case 3:
//			System.out.print("이름 : ");
//			sName = PhoneBook.scan.next();
//			System.out.print("전화번호 : ");
//			sPhoneNum = PhoneBook.scan.next();
			System.out.print("회사 : ");
			String company = PhoneBook.scan.next();
			PhoneInfo pci = new PhoneCompanyInfo(sName, sPhoneNum, company);
			// PhoneInfo pci = new PhoneCompanyInfo("comp", "333", "부서");
			phoneList[cnt] = pci;
			cnt++;
			System.out.print("데이터 입력이 완료되었습니다.");
			break;
		default:
			try {
				throw new MyExcep(choice);
			} catch (MyExcep e) {
				System.out.println(e.getMessage());
				// e.printStackTrace();
			}

		}

//		System.out.print("생년월일 : ");
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
		System.out.println("데이터 검색을 시작합니다.");
		System.out.print("이름 : ");
		String sName = PhoneBook.scan.next();
		int i = searchIndex(sName);
		System.out.println(i + "번째 값을 찾았습니다.");

		if (i != 200) {
			phoneList[i].showPhoneInfo();
		} else {
			System.out.println("찾는 값이 존재하지 않습니다.\n");
		}
	}

	void deleteData() {
		System.out.println("데이터 삭제를 시작합니다..");
		System.out.print("이름 : ");
		String sName = PhoneBook.scan.next();
		int i = searchIndex(sName);

		if (i != 200) {
			arrSort(i);
			System.out.println(i + "번째 데이터가 삭제 되었습니다.");
			cnt--;
		} else {
			System.out.println("찾는 값이 없습니다.");
		}
		System.out.println("현재 등록된 연락처:" + cnt + "\n");
	}

	void arrSort(int index) {
		for (int i = index; i < cnt; i++) {
			phoneList[i] = phoneList[i + 1];
		}
		phoneList[cnt] = null;
		// 필요 없음. 갯수 만큼으로 검색하니, 갯수에서 벗어난 null 아닌 값은 체크 안함.
	}

	void allList() {
		for (int i = 0; i < cnt; i++) {
			phoneList[i].showPhoneInfo();
			System.out.println();
		}
	}
}
