package com.book.ecommerce.models;


public class Books {
	
	private long bookID;
	private String title;
	private String authors;
	private String average_rating;
	private String isbn;
	private String language_code;
	private String ratings_count;
	private String price;
	public long getBookID() {
		return bookID;
	}
	public void setBookID(long bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public String getAverage_rating() {
		return average_rating;
	}
	public void setAverage_rating(String average_rating) {
		this.average_rating = average_rating;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getLanguage_code() {
		return language_code;
	}
	public void setLanguage_code(String language_code) {
		this.language_code = language_code;
	}
	public String getRatings_count() {
		return ratings_count;
	}
	public void setRatings_count(String ratings_count) {
		this.ratings_count = ratings_count;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		result = prime * result + ((average_rating == null) ? 0 : average_rating.hashCode());
		result = prime * result + (int) (bookID ^ (bookID >>> 32));
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((language_code == null) ? 0 : language_code.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((ratings_count == null) ? 0 : ratings_count.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		if (average_rating == null) {
			if (other.average_rating != null)
				return false;
		} else if (!average_rating.equals(other.average_rating))
			return false;
		if (bookID != other.bookID)
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (language_code == null) {
			if (other.language_code != null)
				return false;
		} else if (!language_code.equals(other.language_code))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (ratings_count == null) {
			if (other.ratings_count != null)
				return false;
		} else if (!ratings_count.equals(other.ratings_count))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	
}