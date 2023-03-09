package kr.codesquad.view;

import java.util.Scanner;

public class InputView {

	private final Scanner sc = new Scanner(System.in);

	public String getParticipantNames() {
		System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
		return sc.nextLine();
	}

	public String getExecutionResults() {
		System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
		return sc.nextLine();
	}

	public String getHeightOfLadder() {
		System.out.println("최대 사다리 높이는 몇 개인가요?");
		return sc.nextLine();
	}
}
