package phone4;

public class PhoneUnivInfo extends PhoneInfo {
	String major;
	int year;

	public PhoneUnivInfo(String name, String phoneNum, String major, int year) {
		super(name, phoneNum);		
		this.major = major;
		this.year = year;
	}

	@Override
	void showPhoneInfo() {
//		System.out.println("�̸�:" + super.getName());
//		System.out.println("��ȭ��ȣ:" + super.getPhoneNum());
		super.showPhoneInfo();
		System.out.println("����:" + major);
		System.out.println("�г�:" + year);

	}

}
