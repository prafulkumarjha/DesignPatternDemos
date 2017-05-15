package com.practice.designpattern;

public class LazyIntilializedSingleton {

	
	private LazyIntilializedSingleton() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private static LazyIntilializedSingleton instance = null;
	
	public static LazyIntilializedSingleton getInstance() {
		if(instance == null) {
			instance = new LazyIntilializedSingleton();
		}
		
		return instance;
	}

}
