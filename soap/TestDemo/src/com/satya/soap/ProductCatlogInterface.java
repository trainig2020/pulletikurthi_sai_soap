package com.satya.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import com.satya.soap.model.Product;


@WebService(name="TestmartName",portName="TestmartPort")
public interface ProductCatlogInterface {

	@WebMethod
	public abstract  List<String> getCatlog();
	@WebMethod
	public abstract  List<String> getProducts(String category);
	@WebMethod
	public abstract boolean addProduct(String category, String product);
	@WebMethod
	public abstract List<Product> getProductsV2(String category);

}