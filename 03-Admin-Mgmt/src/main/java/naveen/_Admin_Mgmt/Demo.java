package naveen._Admin_Mgmt;

import naveen._pwd_utils.PasswordService;

public class Demo {
	public static void main(String[] args) {
		String encodedTxt = PasswordService.encode("india@123");
		System.out.println(encodedTxt);
		String decodedTxt = PasswordService.decode(encodedTxt);
		System.out.println(decodedTxt);
	}
}
