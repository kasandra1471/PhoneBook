package phone4;

public class PhoneCompanyInfo extends PhoneInfo {
	String company;

	public PhoneCompanyInfo(String name, String phoneNum, String company) {
		super(name, phoneNum);
		this.company = company;
	}

	@Override
	void showPhoneInfo() {
		System.out.println("�̸�:" + super.getName());
		System.out.println("��ȭ��ȣ:" + super.getPhoneNum());
		System.out.println("ȸ��:" + company);

	}
}
