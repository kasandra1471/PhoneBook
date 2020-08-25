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
		// 생성자.....그대로..
	}

	static PhoneBookManager inst = null;

	public static PhoneBookManager creatManagerInst() {
		if (inst == null)
			inst = new PhoneBookManager();

		return inst;
	}

	void readData() {// 사용자 선택에 따라서 메소드 호출.
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1.일반, 2.대학, 3.회사");
		System.out.print("선택: ");
		int choice = PhoneBook.sc.nextInt();// 어떤 형식인지 선택.
		boolean already = false;

//		PhoneBook.sc.nextLine();// 눈에 보이지 않는 엔터 제거용.
//		System.out.print("이름:");
//		String name = PhoneBook.sc.nextLine();
//		System.out.print("전화번호:");
//		String phoneNumber = PhoneBook.sc.nextLine();

		switch (choice) {
		case 1:
//			PhoneInfo pi = new PhoneInfo(name, phoneNumber);
			PhoneInfo pi = new PhoneInfo("normal", "1234");
			// 연락처에 대한 객체 생성.
//			phoneList[cnt] = pi;
			already = searchIndex("normal", "search");
			if (already) {
				System.out.println("이미 저장된 데이터입니다.");
			} else {
				phoneList.add(pi);
				System.out.println("데이터 입력이 완료 되었습니다.");
			}
			// cnt++;
			break;
		case 2:
			// 대학 연락처
//			System.out.print("전공: ");
//			String major = PhoneBook.sc.nextLine();
//			System.out.print("학년: ");
//			int year = PhoneBook.sc.nextInt();
//			PhoneInfo pui = new PhoneUnivInfo(name, phoneNumber, major, year);
			PhoneInfo pui = new PhoneUnivInfo("univ", "222", "it", 3);
			// 자식의 객체를 부모 객체 변수에 묵시적 형변환을 통해서 대입.
			// showPhoneInfo를 자식 클래스에서 오버라이드 했으므로,
			// 부모 타입에서 호출해서 사용할때 오버라이드 된 메소드가 우선됨.
//			phoneList[cnt] = pui;
//			cnt++;
			phoneList.add(pui);
			System.out.println("데이터 입력이 완료 되었습니다.");
			break;
		case 3:// 회사 연락처
//			System.out.print("회사: ");
//			String company = PhoneBook.sc.nextLine();
//			PhoneInfo pci = new PhoneCompanyInfo(name, phoneNumber, company);
			PhoneInfo pci = new PhoneCompanyInfo("company", "222", "sale");
//			phoneList[cnt] = pci;
//			cnt++;
			phoneList.add(pci);
			System.out.println("데이터 입력이 완료 되었습니다.");
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
		System.out.println("데이터 검색을 시작합니다.");
		PhoneBook.sc.nextLine();// 엔터값 제거.
		System.out.print("이름:");
		String name = PhoneBook.sc.nextLine();
		boolean has = searchIndex(name, "search");

		if (!has) {
			// 찾는 결과 없음.
			System.out.println("찾는 값이 존재하지 않습니다.");
		}
	}

	boolean searchIndex(String s, String state) {
		Iterator<PhoneInfo> itr = phoneList.iterator();
		boolean has = false;

		while (itr.hasNext()) {
			PhoneInfo p = itr.next(); // PhoneInfo는 가장 상위클래스라서 자식클래스 생성자들을 다 가져올수있음
			if (s.equals(p.getName())) { // p는 겟네임 비교용
				if (state.contentEquals("search")) {
					p.showPhoneInfo();
					has = true;
				} else if (state.contentEquals("del")) {
					itr.remove(); // 반복자, 보다 안전.
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
		System.out.println("데이터 삭제를 시작합니다...");
		PhoneBook.sc.nextLine();// 엔터값 제거.
		System.out.print("이름:");
		String name = PhoneBook.sc.nextLine();
		boolean has = searchIndex(name, "del");

		if (!has) {
			// 찾는 결과 없음.
			System.out.println("찾는 값이 존재하지 않습니다.");
		}

//		System.out.println("현재 등록된 연락처 : " + cnt + "\n");
		// phoneList.size();
		System.out.println("현재 등록된 연락처 : " + phoneList.size() + "\n");
	}

	void arrSort(int index) {
//		for (int i = index; i < phoneList.length; i++) {
//			if (i == (phoneList.length - 1)) {
//				phoneList[i] = null;// 99번째의 경우.
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
