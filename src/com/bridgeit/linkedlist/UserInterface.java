package com.bridgeit.linkedlist;

import java.util.Scanner;

public class UserInterface {
	
	public int inputData() {
		
		System.out.println("enter element : ");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		return value;	
	}
	
	public int showUserMenu() {
		
		System.out.println("enter 1 : for add \n enter 2 : for push \n ente 3 : for insert at position"
				+ "enter 4 : for pop first \n enter 5 : for pop last \n enter 6 : for search element \n enter 0 for exit program : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		return num;
	}
}
