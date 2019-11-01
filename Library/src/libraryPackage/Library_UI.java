package libraryPackage;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;

// the View class

public class Library_UI extends JFrame {

	CardLayout cardLayout;
	JButton add, addBook, showBooks, searchBook, backFromPanel3, search, backFromPanel5, exit;
	JPanel panel1, panel2, panel3, panel4, panel5, contentPanel;
	JLabel bookName, author1, author2, publishingHouse, ISBN, appearanceYear, price, bookName2;
	JTextField bookNameField, author1Field, author2Field, 
				pHouseField, ISBNField, yearField, priceField, bookNameField2;
	JTextArea textAreaPanel3, textAreaPanel5; 
	GridBagConstraints constraints;
	
	public Library_UI() {
		super("Library");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900, 900);
		this.cardLayout = new CardLayout(90, 90);
		this.contentPanel = new JPanel();
		this.constraints = new GridBagConstraints();
		
		// for panel1
		panel1 = new JPanel();
		panel1.setLayout(new GridBagLayout());
		add = new JButton("Add a book");
		panel1.add(add);
		showBooks = new JButton("Show the existing books");
		panel1.add(showBooks);
		searchBook = new JButton("Search book");
		panel1.add(searchBook);
		exit = new JButton("Exit");
		panel1.add(exit);
				
		//for panel2
		panel2 = new JPanel();
		panel2.setLayout(new GridBagLayout());
		bookName = new JLabel("Book name: ");
		constraints.gridx = 0;
		constraints.gridy = 0;
		panel2.add(bookName, constraints);
		bookNameField = new JTextField(20);
		constraints.gridx = 1;
		constraints.gridy = 0;
		panel2.add(bookNameField, constraints);
			
		author1 = new JLabel("Author1: ");
		constraints.gridx = 0;
		constraints.gridy = 1;
		panel2.add(author1, constraints);
		author1Field = new JTextField(20);
		constraints.gridx = 1;
		constraints.gridy = 1;
		panel2.add(author1Field, constraints);
				
		author2 = new JLabel("Author2: ");
		constraints.gridx = 0;
		constraints.gridy = 2;
		panel2.add(author2, constraints);
		author2Field = new JTextField(20);
		constraints.gridx = 1;
		constraints.gridy = 2;
		panel2.add(author2Field, constraints);
				
		publishingHouse = new JLabel("Publishing house: ");
		constraints.gridx = 0;
		constraints.gridy = 3;
		panel2.add(publishingHouse, constraints);
		pHouseField = new JTextField(20);
		constraints.gridx = 1;
		constraints.gridy = 3;
		panel2.add(pHouseField, constraints);
				
		ISBN = new JLabel("ISBN: ");
		constraints.gridx = 0;
		constraints.gridy = 4;
		panel2.add(ISBN, constraints);
		ISBNField = new JTextField(20);
		constraints.gridx = 1;
		constraints.gridy = 4;
		panel2.add(ISBNField, constraints);
				
		appearanceYear = new JLabel("Appearance year: ");
		constraints.gridx = 0;
		constraints.gridy = 5;
		panel2.add(appearanceYear, constraints);
		yearField = new JTextField(20);
		constraints.gridx = 1;
		constraints.gridy = 5;
		panel2.add(yearField, constraints);
				
		price = new JLabel("Price: ");
		constraints.gridx = 0;
		constraints.gridy = 6;
		panel2.add(price, constraints);
		priceField = new JTextField(20);
		constraints.gridx = 1;
		constraints.gridy = 6;
		panel2.add(priceField, constraints);
				
		addBook = new JButton("Add book");
		constraints.gridwidth = 8;
		constraints.gridheight = 8;
		constraints.gridx = 1;
		constraints.gridy = 8;
		panel2.add(addBook, constraints);
				
		// for panel3
		panel3 = new JPanel();
		textAreaPanel3 = new JTextArea(60, 50);
		JScrollPane scrollPane = new JScrollPane(textAreaPanel3); 
		textAreaPanel3.setEditable(false);
		panel3.add(scrollPane, BorderLayout.WEST);
		backFromPanel3 = new JButton("Back");
		constraints.fill = GridBagConstraints.LAST_LINE_END;
		constraints.gridwidth = 7;
		constraints.gridheight = 4;
		panel3.add(backFromPanel3);
				
		//panel4
		panel4 = new JPanel();
		panel4.setLayout(new GridBagLayout());
		bookName2 = new JLabel("Book name "); 
		constraints.gridx = 0;
		constraints.gridy = 4;
		panel4.add(bookName2, constraints);
		bookNameField2 = new JTextField(20);
		constraints.gridx = 8;
		constraints.gridy = 4;
		panel4.add(bookNameField2, constraints);
		search = new JButton("Search");
		constraints.gridwidth = 4;
		constraints.gridheight = 2;
		constraints.gridx = 10;
		constraints.gridy = 12;
		panel4.add(search, constraints);
			
		// panel5
		panel5 = new JPanel();
		textAreaPanel5 = new JTextArea(50, 40);
		JScrollPane scrollPane2 = new JScrollPane(textAreaPanel5); 
		textAreaPanel5.setEditable(false);
		panel5.add(scrollPane2, BorderLayout.WEST);
		backFromPanel5 = new JButton("Back");
		constraints.gridwidth = 7;
		constraints.gridheight = 4;
		constraints.gridx = 4;
		constraints.gridy = 15;
		panel5.add(backFromPanel5);
		backFromPanel5.setBackground(Color.green);
		panel5.add(backFromPanel5);
		contentPanel.setLayout(cardLayout);
		
		contentPanel.add(panel1, "panel1");
		contentPanel.add(panel2, "panel2");
		contentPanel.add(panel3, "panel3");
		contentPanel.add(panel4, "panel4");
		contentPanel.add(panel5, "panel5");

		this.setContentPane(contentPanel);
		
		cardLayout.show(contentPanel, "panel1");
	}
	
	public String getBookNameField() {
		return this.bookNameField.getText();
	}
	
	public String getAuthor1Field() {
		return this.author1Field.getText();
	}
	
	public String getAuthor2Field() {
		if(this.author2Field.getText() == null) {
			author2Field.setText("-");
		}
		return this.author2Field.getText();
	}
	
	public String getPHouseField() {
		return this.pHouseField.getText();
	}
	
	public String getISBNField() {
		return this.ISBNField.getText();
	}
	
	public String getBookNameField2() {
		return this.bookNameField2.getText();
	}
	
	public int getYear() {
		return Integer.parseInt(this.yearField.getText());
	}
	
	public double getPrice() {
		return Double.parseDouble(this.priceField.getText());
	}
	
	public String getSearchedBook() {
		return bookNameField2.getText();
	}
	
	public void setSearchedBook(String bookName) {
		bookNameField2.setText(bookName);
	}
	
	// add ActionListener for each button
	public void addListeners(ActionListener listener) {
		add.addActionListener(listener);
		addBook.addActionListener(listener);
		showBooks.addActionListener(listener);
		searchBook.addActionListener(listener);
		search.addActionListener(listener);
		backFromPanel3.addActionListener(listener);
		backFromPanel5.addActionListener(listener);
		exit.addActionListener(listener);
	}
	
	 // Open a popup that contains the error message passed
	public void displayErrorMessage(String errorMessage){
	        JOptionPane.showMessageDialog(this, errorMessage);
	}
}
