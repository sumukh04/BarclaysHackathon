package com.book.ecommerce.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.ecommerce.models.Books;
import com.book.ecommerce.models.Image;
import com.book.ecommerce.service.IBooksService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BooksController {
	
	@Autowired
	IBooksService iBooksService;

	@GetMapping("/get")
	public Books[] getBooks() {
		Books [] myArray = iBooksService.getBooks();
		//List<Books> l=Arrays.asList(myArray);
	      
		return myArray;
	}
	
	@GetMapping("/getAllImages")
	public Image[] getAllImages() {
		Image[] images = iBooksService.getAllImages();
		return images;
	}
	
}
