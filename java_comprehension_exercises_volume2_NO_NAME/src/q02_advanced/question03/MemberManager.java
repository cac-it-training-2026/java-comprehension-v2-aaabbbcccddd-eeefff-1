package q02_advanced.question03;

import java.util.List;

public class MemberManager {
	private MemberManager() {

	}

	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int targetId, String newPassword) {
		boolean found = false;

		for (Member member1 : members) {//1人ずつみんなを確認する
			if (member1.getId() == targetId) {//IDが一致しているか確認
				member1.setPassword(newPassword);//見つかったらパスワードを新しいものにする
				found = true;
				break;
			}
		}

		if (!found) {//見つからなかったら
			System.out.println("該当者はいませんでした。");
		}
	}

}
