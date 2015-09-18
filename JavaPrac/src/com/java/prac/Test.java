package com.java.prac;

public class Test {
	
	
	void myMeth(int i){
		System.out.println(i +" int version");
	}

	void myMeth(String s){
		
		System.out.println(s +" int version");
		
	}
	public static void main(String[] args) {
		
		/*long l = 987654321547l;
		System.out.println(l%2);
		
		System.out.println(l/16);*/
		
		Test t = new Test();
		t.myMeth('A');

	}

}
