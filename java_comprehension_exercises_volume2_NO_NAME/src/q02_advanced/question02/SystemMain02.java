package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		try {

			System.out.println("===会員情報を表示します===");

			Member member1 = Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);
			Member member2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

			List<Member> members = new ArrayList<>();

			members.add(member1);
			members.add(member2);

			MemberManager.showAllMembers(members);

			System.out.println("===パスワードを変更します===");

			ConsoleReader consoleReader = new ConsoleReader();

			System.out.print("input target id>>");
			int id = consoleReader.inputNumber();

			System.out.print("input new password>>");
			String pass = consoleReader.inputString();

			MemberManager.updatePassword(members, id, pass);

			System.out.println("---SHOW DATA---");

			MemberManager.showAllMembers(members);

		} catch (IOException | NumberFormatException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		}
	}

}
