package com.satya.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public class ShopInfo {
    @WebMethod
	public String getShopInfo(String property) throws InvalidException {
		String response=null;
		if("shopename".equals(property)) {
			response="Test mart";
			
		}else if ("since".equals(property)) {
			response="since 2012";
			
		} else {
			throw new InvalidException("invalid input",property+"is not valid");
		}
		return response;
	}
}
