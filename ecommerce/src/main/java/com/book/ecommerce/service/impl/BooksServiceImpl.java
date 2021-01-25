package com.book.ecommerce.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.book.ecommerce.models.Books;
import com.book.ecommerce.models.Image;
import com.book.ecommerce.service.IBooksService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class BooksServiceImpl implements IBooksService {
 
	RestTemplate restTemplate=new RestTemplate();
	
	@Override
	public Books[] getBooks() {
		// TODO Auto-generated method stub
		String url = "https://s3-ap-southeast-1.amazonaws.com/he-public-data/books8f8fe52.json";
        return this.restTemplate.getForObject(url, Books[].class);
	}

	@Override
	public void addBook(Books books) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Image[] getAllImages() {
		// TODO Auto-generated method stub
		String urlImages="https://s3-ap-southeast-1.amazonaws.com/he-public-data/bookimage816b123.json";
		return this.restTemplate.getForObject(urlImages, Image[].class);
	}
	
	//@HystrixCommand(fallbackMethod = "callBooksDefaultData_Fallback")
	@SuppressWarnings("unused")
	private String callBooksDefaultData_Fallback() {
		System.out.println("Book Service is down!!! fallback route enabled...");
		return "CIRCUIT BREAKER ENABLED!!!No Response From Book Service at this moment. Service will be back shortly - " + new Date();
	}

}
