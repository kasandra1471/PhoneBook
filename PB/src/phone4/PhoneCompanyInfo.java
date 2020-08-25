package phone4;

public class PhoneCompanyInfo extends PhoneInfo {
	String company;

	public PhoneCompanyInfo(String name, String phoneNum, String company) {
		super(name, phoneNum);
		this.company = company;
	}

	@Override
	void showPhoneInfo() {
		System.out.println("이름:" + super.getName());
		System.out.println("전화번호:" + super.getPhoneNum());
		System.out.println("회사:" + company);

	}
}
