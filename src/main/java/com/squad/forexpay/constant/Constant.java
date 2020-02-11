package com.squad.forexpay.constant;

import org.springframework.http.HttpStatus;

public class Constant {
	
	private Constant() {

	}

	//Common 
	public static final String FAILURE_MESSAGE = "FAILURE";
	public static final String SUCCESS_MESSAGE = "SUCCESS";
	public static final String NO_RECORDS_FOUND = "No Records Found";
	public static final String USER_NOT_FOUND = "User not found";
	public static final String AUTHENTICATION_SUCCESSFUL = "Authentication Successful";
	public static final String AUTHENTICATION_FAILED = "Authentication Failed";

	public static final Integer AUTHENTICATION_SUCCESSFUL_CODE = HttpStatus.OK.value();
	public static final String CURRENCY_NOT_FOUND = "Currency not found";

	public static final String EXCHANGE_API = "https://api.exchangeratesapi.io/latest?base=";
	public static final String CURRENCY_CODE_USD = "USD";


}

