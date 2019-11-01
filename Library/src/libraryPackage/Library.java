package libraryPackage;

import java.util.ArrayList;
import java.util.List;

// the Model class

public class Library {

	private List<Book> books;
	private List<Book> searchedBooks;
	
	public Library() {
		this.books = new ArrayList<Book>();
		this.searchedBooks = new ArrayList<Book>();
	}
	
	public Library(List<Book> books) {
		this.books = new ArrayList<Book>();
		this.books = books;
		this.searchedBooks = new ArrayList<Book>();
	}
	
	public void addABook(Book book) {
		if(book != null) {
			this.books.add(book);
		}
	}
	
	public void showAllBooks() {
		for(int i = 0; i < this.books.size(); i++) {
			System.out.println(books.get(i).toString());
		}
	}
	
	private Book searchBook(String name) {
		for(int i = 0; i < this.books.size(); i++) {
			if(books.get(i).getBookName().contains(name)) {
				return books.get(i);
			}
		}
		return null;
	}
	
	public String getSearchedBook(String name) {
		Book book = new Book();
		book = searchBook(name);
		if(book != null) {
			return book.toString();
		}
		return "The book is not in library";
	}
	
	public List<Book> getBooks() {
		return this.books;
	}
	
	public List<Book> getSearchedBooks(String name) {
		this.searchBook(name);
		return this.searchedBooks;
	}
	
}
