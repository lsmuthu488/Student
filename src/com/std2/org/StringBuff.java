package com.std2.org;

public class StringBuff {

	

		public static void main(String[] args) {
			
			StringBuffer sb1= new StringBuffer("Greens");
			StringBuffer sb2= new StringBuffer("Greens");
			StringBuffer sb3= new StringBuffer("Tech");
			
			System.out.println(System.identityHashCode(sb1));
			System.out.println(System.identityHashCode(sb2));
			System.out.println(System.identityHashCode(sb3));
			
		
			
			sb1=sb1.append(sb1);
			
			System.out.println(System.identityHashCode(sb1));
			
		}
		
	}

	

