package com;

public class MainApp {
	public int addition(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		MainApp m=new MainApp();
		int addition = m.addition(10, 20);
		System.out.println(addition);
	}
}
