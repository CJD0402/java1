package com.jihoon.demo;

import java.util.Scanner;

import com.jihoon.demo.controller.MainController;
import com.jihoon.demo.repository.Object2Repository;
import com.jihoon.demo.repository.ObjectRepository;
import com.jihoon.demo.service.MainService;

// com.jihoon.demo 프로젝트의 실제 실행 클래스
public class MainApplication {
	
	private static MainController mainController;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		ObjectRepository objectRepository = new ObjectRepository(input);
		Object2Repository object2Repository = new Object2Repository();
		MainService mainService = null;
		
		if (input <= 0) mainService = new MainService(object2Repository);
		else mainService = new MainService(objectRepository);
		
		mainController = new MainController(mainService);
		mainController.printDatas();
		
	}

}


