package com.jihoon.demo.service;

import com.jihoon.demo.repository.Object2Repository;
import com.jihoon.demo.repository.ObjectRepository;

// com.jihoon.demo 프로젝트의 실제 비즈니스 로직을 담당하는 클래스
public class MainService {
	
	private ObjectRepository objectRepository = new ObjectRepository();
	private Object2Repository object2Repository = new Object2Repository();
	
	public void printDatas() {
		int[] datas = objectRepository.getDatas();
		for (int data : datas) System.out.println(data);
	}
	
	public void printDatas2() {
		int[] datas = objectRepository.getDatas();
		for (int data : datas) System.out.println(data);
	}

}
