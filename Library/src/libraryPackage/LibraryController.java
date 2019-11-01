package libraryPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

// the Controller class

public class LibraryController {

	private Library library;
	private Library_UI gui;
	
	public LibraryController(Library library, Library_UI gui) {
		this.library = library;
		this.gui = gui;
		
		this.gui.addListeners(new MyActionListener());
	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			final String nl = "\n";
	
			if(event.getSource() == gui.add) {
				gui.cardLayout.show(gui.contentPanel, "panel2");
			} else if(event.getSource() == gui.showBooks) {
				gui.textAreaPanel3.setText(null);
				List<Book> books = new ArrayList<Book>();
				books = library.getBooks();
				if(books.size() > 0) {
					for(int i = 0; i < books.size(); i++) {
						gui.textAreaPanel3.append(books.get(i).toString() + nl);
					}
				} else {
					gui.textAreaPanel3.append("No book has been added.");
				}
				gui.cardLayout.show(gui.contentPanel, "panel3");
			} else if(event.getSource() == gui.searchBook) {
				gui.textAreaPanel5.setText(null);
				gui.bookNameField2.setText(null);
				gui.cardLayout.show(gui.contentPanel, "panel4");
			} else if(event.getSource() == gui.backFromPanel3) {
				gui.cardLayout.show(gui.contentPanel, "panel1");
			} else if(event.getSource() == gui.addBook) {
				String bookName, author1, author2, publishingHouse, ISBN;
				int appearanceYear;
				double price;
				try {
					bookName = gui.getBookNameField();
					author1 = gui.getAuthor1Field();
					author2 = gui.getAuthor2Field();
					publishingHouse = gui.getPHouseField();
					ISBN = gui.getISBNField();
					appearanceYear = gui.getYear();
					price = gui.getPrice();
					Book book = new Book(bookName, author1, author2,
						publishingHouse, ISBN, appearanceYear, price);
					library.addABook(book);
				} catch(NumberFormatException e) {
					 gui.displayErrorMessage("Invalid input!");
				}
				gui.bookNameField.setText(null);
				gui.author1Field.setText(null);
				gui.author2Field.setText(null);
				gui.pHouseField.setText(null);
				gui.ISBNField.setText(null);
				gui.yearField.setText(null);
				gui.priceField.setText(null);
				gui.cardLayout.show(gui.contentPanel, "panel1");
			} else if(event.getSource() == gui.search) {
				gui.textAreaPanel5.setText(null);
				String bookName = gui.getBookNameField2();
				gui.textAreaPanel5.append(library.getSearchedBook(bookName));
				gui.cardLayout.show(gui.contentPanel, "panel5");
			} else if(event.getSource() == gui.backFromPanel5) {
				gui.cardLayout.show(gui.contentPanel, "panel1");
			} else if(event.getSource() == gui.exit) {
				gui.dispose();
			}
		}
	}
}
