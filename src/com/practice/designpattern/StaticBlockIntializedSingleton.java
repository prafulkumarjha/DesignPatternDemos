package com.practice.designpattern;

public class StaticBlockIntializedSingleton {

	private StaticBlockIntializedSingleton() {
		
	}
	private static StaticBlockIntializedSingleton instance = null;
	static {
		try{
			instance = new StaticBlockIntializedSingleton();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error while creating the singleton instance");
		}
	}
	
	public static StaticBlockIntializedSingleton getInstance() {
		return instance;
	}
}
