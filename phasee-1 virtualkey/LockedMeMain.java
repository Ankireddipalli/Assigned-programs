package com.viveka;

public class LockedMeMain {
public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		menuOptions.printWelcomeScreen("Locker", "Vivekanadareddy");
		
		HandleOption.handleWelcomeScreenInput();
	}
}
