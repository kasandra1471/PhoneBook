package phone6;

import java.util.Scanner;

import phone5.MyExcep;

// ¡¶≥ ∏Ø, ΩÃ±€≈Ê, hashSet, 
public class PhoneBook {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PhoneBookManager p = PhoneBookManager.creatManagerInst();

		while (true) {
			Menu.showMenu();
			System.out.print("º±≈√:");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				p.readData();
				break;
			case 2:
				p.searchData();
				break;
			case 3:
				p.deleteData();
				break;
			case 4:
				sc.close();
				System.exit(0);
				break;
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
