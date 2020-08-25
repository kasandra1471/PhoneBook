package phone5;

import java.util.Scanner;

public class PhoneBook {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager();

		while (true) {
			Menu.showMenu();
			System.out.print("���� : ");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				manager.readData();
				break;
			case 2:
				manager.searchData();
				break;
			case 3:
				manager.deleteData();
				break;
			case 4:
				manager.allList();
				break;
			case 5:
				scan.close();
				System.exit(0);
			default:
				try {
					throw new MyExcep(choice);
				} catch (MyExcep e) {
					// e.printStackTrace();
					// e.getMessage();
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
