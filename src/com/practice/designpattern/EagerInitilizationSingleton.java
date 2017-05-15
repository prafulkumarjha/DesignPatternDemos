package com.practice.designpattern;

public class EagerInitilizationSingleton {

	private EagerInitilizationSingleton() {
		// TODO Auto-generated constructor stub
	}
	private static EagerInitilizationSingleton  instanceObj = new EagerInitilizationSingleton();
	
	public static EagerInitilizationSingleton getInstance() {
		
		return instanceObj;
	}
}
