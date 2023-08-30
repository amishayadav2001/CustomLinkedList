package com.aurionpro.test;

import com.aurionpro.model.CustomLinkedList;

public class CustomLinkedListTest {

	public static void main(String[] args) {
		CustomLinkedList<Integer> customList = new CustomLinkedList<>();

		customList.add(10);
		customList.add(20);
		customList.add(30);
		customList.add(40);

		System.out.println("Displaying values:");
		customList.display();

		System.out.println("Removing value 20");
		customList.remove(20);

		System.out.println("Displaying values after removal:");
		customList.display();

		System.out.println("Iterating through the list:");
		customList.iterate();
	}
}