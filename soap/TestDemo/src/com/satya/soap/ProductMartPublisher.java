package com.satya.soap;

import javax.xml.ws.Endpoint;

public class ProductMartPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/productcatlog", new ProductCatlog());
	}
}
