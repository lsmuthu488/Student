package com.std2.org;

public class StringImmutble {

	public static void main(String[] args) {

		String s1="Greens";
		String s2="Greens";
		String s3="Tech";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		s1=s2+s3;
		
		System.out.println(System.identityHashCode(s1));
		
	}

}
