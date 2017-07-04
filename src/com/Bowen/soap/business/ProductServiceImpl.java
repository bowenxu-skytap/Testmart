package com.Bowen.soap.business;

import java.util.ArrayList;
import java.util.List;

import com.Bowen.soap.model.Product;

public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> movieList = new ArrayList<String>();
	
	public ProductServiceImpl() {
		bookList.add("Pride and Prejudice");
		bookList.add("One Hundred Years of Solitude");
		bookList.add("Wuthering Heights");
		
		musicList.add("If I Ain't Got You");
		musicList.add("Bad Romance");
		musicList.add("You Are Not Alone");
		
		movieList.add("La La Land");
		movieList.add("The Godfather");
		movieList.add("The Shawshank Redemption");
	}

	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		default:
			return null;
		}
	}
	
	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}

	public List<Product> getProductsv2(String category) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product("Book 1", "1234", 128.00));
		productList.add(new Product("Book 2", "ABCD", 999.90));
		return productList;
	}
}
