package com.jihoon.demo.repository;

// com.jihoon.demo 프로젝트에서 데이터베이스의 Object 테이블에 접근하는 클래스
public class ObjectRepository {
	
	private int[] datas;
	
	public ObjectRepository() {
		this.datas = new int[] {1, 2, 3};
	}
	
	public int[] getDatas() {
		return this.datas;
	}

}
