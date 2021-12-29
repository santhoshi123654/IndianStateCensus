package com.bridgelabz.IndianStateCensus;

import java.io.IOException;
import java.util.Scanner;

public class UserInterface {
	
	@SuppressWarnings("resource")
	public int showUserMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter \n1 To add state census \n2 write data into CSV file \n3 read data from CSV file "
				+ "\n4 To print states census \n5 Count no of entries \n"+App.QUIT +".quit ");
		int check = scanner.nextInt();
		return check;
	}

	public void printIndianStateCensus() {

		System.out.println(StateCensusAnalyser.censusList);
	}
	public void printCountEntries() {
		StateCensusAnalyser censusAnalyser = new StateCensusAnalyser();
		try {
			System.out.println(censusAnalyser.countEntries());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
