package phone6;

public class PhoneCompanyInfo extends PhoneInfo {
	String company;

	public PhoneCompanyInfo(String name, String phoneNum, String company) {
		super(name, phoneNum);
		this.company = company;
	}

	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("È¸»ç:" + company);

	}
}
