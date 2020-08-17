package com.satya.soap;

import java.util.List;

import javax.jws.WebService;

import com.satya.soap.model.Product;
import com.satya.soap.service.ProductService;

@WebService(endpointInterface="com.satya.soap.ProductCatlogInterface")
public class ProductCatlog implements ProductCatlogInterface {
    ProductService productService=new ProductService();
   
    @Override
	
	public List<String> getCatlog(){
		
		return productService.getCatlog();
		
	}
      
    @Override
        public List<String> getProducts(String category){
		
		return productService.getProducts(category);
		
	}
      
    @Override
       public boolean addProduct(String category,String product){
		
		return productService.addProduct(category, product);
		
	}
       
    @Override
       public List<Product> getProductsV2(String category){
		
		return productService.getProductsV2(category);
		
	}

}
