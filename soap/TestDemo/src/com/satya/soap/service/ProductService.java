package com.satya.soap.service;

import java.util.ArrayList;
import java.util.List;

import com.satya.soap.model.Product;

public class ProductService {
	
	public List<String> bookList=new ArrayList<>();
	public List<String> musicList=new ArrayList<>();
	public List<String> movieList=new ArrayList<>();
	
	public ProductService() {
		bookList.add("harry potter1");
		bookList.add("harry potter2");
		bookList.add("harry potter3");
		
		musicList.add("emayachasavey...");
		musicList.add("pella nuvuleni...");
		musicList.add("pachabottu...");
		
		movieList.add("bahubali1");
		movieList.add("bahubali2");
		movieList.add("bahubali3");
		

	}
	
	

	public List<String> getCatlog(){
		List<String> categories=new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
        }
	public List<String> getProducts(String category){
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music" :
			return musicList;
		case "movies" :
			return movieList;
			
		}
		return bookList;
		
	}
	public boolean addProduct(String category,String product){
		switch (category.toLowerCase()) {
		case "books":
			 bookList.add(product);
			break;
		case "music" :
			 musicList.add(product);
			break;
		case "movies" :
			 movieList.add(product);
			break;
	
			default :
			return false;
			
		}
		return true;
	}



	public List<Product> getProductsV2(String category) {
		List<Product> listProducts=new ArrayList<>();
		listProducts.add(new Product("chamber", "1234", 340.9));
		listProducts.add(new Product("chamber2", "ABCD", 345.9));
		return listProducts;
	}
	
}
