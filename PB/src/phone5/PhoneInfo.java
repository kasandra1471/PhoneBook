package phone5;

public class PhoneInfo {
	private String name;
	private String phoneNum;
//	private String birth;

	// "이순신", "222-3333"
	public PhoneInfo(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	

	// "홍길동", "111-2222", "90/08/30"
//	public PhoneInfo(String name, String phoneNum, String birth) {
////		this.name = name;
////		this.phoneNum = phoneNum;
//		this(name, phoneNum);
//		this.birth = birth;
//	}


	// showPhoneInfo()
	void showPhoneInfo() {
		System.out.println("이름:" + name);
		System.out.println("전화번호:" + phoneNum);
//		System.out.print("생일:" );
//		if (birth!=null) {			
//			System.out.println(birth + "\n");
//		} else {
//			System.out.println();
//		}
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}



	public String getName() {
		return name;
	}
}






