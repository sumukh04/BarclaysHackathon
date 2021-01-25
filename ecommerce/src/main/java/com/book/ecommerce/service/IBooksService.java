package com.book.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.book.ecommerce.models.Books;
import com.book.ecommerce.models.Image;

@Service
public interface IBooksService {
	public Books[] getBooks();
	public void addBook(Books books);
	public Image[] getAllImages();
}
