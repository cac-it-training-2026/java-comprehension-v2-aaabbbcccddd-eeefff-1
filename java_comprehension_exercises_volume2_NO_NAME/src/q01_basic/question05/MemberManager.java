package q01_basic.question05;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	//TODO showAllMembersメソッドを実装する
	static void showAllMembers(AbstMember[] members) {
		for (AbstMember Member : members) {
			Member.showMember();
		}
	}
}
