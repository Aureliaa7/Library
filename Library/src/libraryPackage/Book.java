package libraryPackage;

public class Book {

		private String bookName;
		private String author1;
		private String author2;
		private String publishingHouse;
		private String ISBN;
		private int appearanceYear;
		private double price;
		
		public Book() {
			this.bookName = "no book";
			this.author1 = "-";
			this.author2 = "-";
			this.publishingHouse = "-";
			this.ISBN = "-";
			this.appearanceYear = 2000;
			this.price = 0;
		}
		
		public Book(String name, String author1, String author2, String pHouse,
				String ISBN, int year, double price) {
			this.bookName = name;
			this.author1 = author1;
			this.author2 = author2;
			this.publishingHouse = pHouse;
			this.ISBN = ISBN;
			this.appearanceYear = year;
			this.price = price;
		}
		
		public String getBookName() {
			return this.bookName;
		}
		
		public String getAuthor1() {
			return this.author1;
		}
		
		public String getAuthor2() {
			return this.author2;
		}
		
		public String getPublishingHouse() {
			return this.publishingHouse;
		}
		
		public String getISBN() {
			return this.ISBN;
		}
		
		public int getAppearanceYear() {
			return this.appearanceYear;
		}
		
		public double getPrice() {
			return this.price;
		}
		
		public void setBookName(String a) {
			this.bookName = a;
		}
		
		public void setAuthor1(String a) {
			this.author1 = a;
		}
		
		public void setAuthor2(String a) {
			this.author2 = a;
		}
		
		public void setPublishingHouse(String a) {
			this.publishingHouse = a;
		}
		
		public void setAppearanceYear(int a) {
			this.appearanceYear = a;
		}
		
		public void setISBN(String isbn) {
			this.ISBN = isbn;
		}
		
		public void setPrice(double a) {
			this.price = a;
		}
		
		public String toString() {
			return  this.bookName + ":\n\t- author1:  " + this.author1
					+ "\n\t- author2:  " + this.author2 + "\n\t- publishing house:  " + 
					this.publishingHouse + "\n\t- ISBN:  " + this.ISBN +
					"\n\t- appearance year:  " + this.appearanceYear + "\n\t -price:  " + this.price;
		}

	}


