package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hi");
		list.add("my");
		list.add("name");
		list.add("is");
		list.add("Hikari");
		for (int i =0;i<5;i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		System.out.println("\n");
		for(String s : list){
			System.out.println(s);
		}
		System.out.println("\n");
		for (int i=0;i<5;i++) {
			if (i%2==0) {
				String s = list.get(i);
				System.out.println(s);
			}
		}
		System.out.println("\n");
		for (int i =4;i>=0;i--) {
			String s = list.get(i);
			System.out.println(s);
		}
		System.out.println("\n");
		for (int i =0;i<5;i++) {
			String s = list.get(i);
			if(s.contains("e")) {
				System.out.println(s);
			}
		}
		
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class

		//2. Add five Strings to your list
		
		//3. Print all the Strings using a standard for-loop
		
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
