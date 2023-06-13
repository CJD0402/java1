package com.jihoon.demo.repository;

public class Object2Repository {

	private int[] datas;
	
	public Object2Repository () {
		this.datas = new int[] {1, 2, 3};
	}
	
	public int[] getDatas() {
		int[] result = 
				new int[] { datas[0] * datas[0], datas[1] * datas[1], datas[2] * datas[2] };
		return result;
	}
	
}
