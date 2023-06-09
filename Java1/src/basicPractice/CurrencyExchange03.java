package basicPractice;

import java.util.Scanner;

class ExchangeRateInformation {
	
	String monetaryUnit;
	double exchangeRate;
	
	ExchangeRateInformation() {}
	
	ExchangeRateInformation(String monetaryUnit, double exchangeRate) {
		this.monetaryUnit = monetaryUnit;
		this.exchangeRate = exchangeRate;
	}
	
}

public class CurrencyExchange03 {
	
	static ExchangeRateInformation[] exchangeRateArray;
	
	static void initExchangeRateArray() {
		exchangeRateArray = new ExchangeRateInformation[] { 
				new ExchangeRateInformation("달러", 1307.5),
				new ExchangeRateInformation("엔", 1307.5),
				new ExchangeRateInformation("위안", 183.78)
		};
	}
	
	public static void main(String[] args) {
		
		initExchangeRateArray();
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("화폐 단위를 입력하세요. ('종료' 입력시 프로그램 종료)");
			
			String inputMonetaryUnit = scanner.nextLine();
			if (inputMonetaryUnit.equals("종료")) break;
			
			
			
			
			
			ExchangeRateInformation exchangeRateInformation = null;
			
			for (ExchangeRateInformation item: exchangeRateArray) {
				if (item.monetaryUnit.equals(inputMonetaryUnit)) {
					exchangeRateInformation = item;
					break;
				}
			}
			
			if (exchangeRateInformation == null) {
				System.out.println("잘못된 화폐 단위입니다.");
				continue;
			}
			
			
			
			
			
		}
		
		System.out.println("프로그램 종료!");
		
	}
	
}
