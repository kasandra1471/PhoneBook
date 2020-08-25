package phone6;

class PhoneInfo {
	private String name;
	private String phoneNumber;

	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void showPhoneInfo() {
		System.out.println("\nname : " + name);
		System.out.println("phone : " + phoneNumber);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
		// ��ȭ��ȣ �ߺ��� �Է��� if �� üũ.
	}

	@Override
	public boolean equals(Object obj) {
		PhoneInfo n = (PhoneInfo) obj;
		if (n.name.equals(name) || n.phoneNumber.equals(phoneNumber))
			return true;
		else
			return false;
	}

}