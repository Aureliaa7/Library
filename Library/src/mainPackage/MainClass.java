package mainPackage;

import libraryPackage.*;


public class MainClass {

	public static void main(String[] args) {
		
		Library library = new Library();
		Library_UI gui = new Library_UI();
		gui.setResizable(false);
		LibraryController controller = new LibraryController(library, gui);
		gui.setVisible(true);
	}
}
