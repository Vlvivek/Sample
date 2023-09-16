package org.sam;

public class Test {

	public static void main(String[] args) {

		String s = "Java";
		String s1 = "JaVa";
		boolean equals = s.equals(s);

		boolean equals2 = s1.equals(s);

		System.out.println(equals);
		System.out.println(equals2);
		
		String a1 = "Nisha";
		String a2 = "Nisha";
	
		int hs1 = System.identityHashCode(a1);
		int hs2 = System.identityHashCode(a2);
		
		System.out.println("Hs1:"+hs1+"\nHs2:"+hs2);


		for (int i = 1; i <= 10; i++) {

			System.out.println("Cube Of the Number:" + (i * i * i));

		}

		
		

	}

}
