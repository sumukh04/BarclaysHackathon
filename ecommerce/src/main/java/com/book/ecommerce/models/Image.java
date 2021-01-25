package com.book.ecommerce.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Image {
	@JsonProperty("Image")
	private String Image;

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}
}
