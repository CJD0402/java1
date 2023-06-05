package basicPractice;

import java.util.Scanner;

public class CurrencyExchange02 {

	public static void main(String[] args) {
		final String[] MONETARY_UNIT_LIST = {"달러", "엔", "위안"};
		final double[] EXCHANGE_RATE_LIST = {1307.5, 9.32, 183.78};
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("화폐 단위를 입력하세요. ('종료' 입력시 프로그램 종료)");
			
			String inputMonetaryUnit = scanner.nextLine();
			if (inputMonetaryUnit.equals("종료")) break;
			if (!MONETARY_UNIT_LIST[0].equals(inputMonetaryUnit) &&
					!MONETARY_UNIT_LIST[1].equals(inputMonetaryUnit) &&
					!MONETARY_UNIT_LIST[2].equals(inputMonetaryUnit)) {
				System.out.println("잘못된 화폐 단위입니다.");
				continue;
			}
		}
		
		System.out.println("프로그램 종료!!");
	}

}



