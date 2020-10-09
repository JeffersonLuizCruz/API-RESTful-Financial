package com.financial.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FinancialApiUtil {
	
	/**
	 * Field to represent API version on the requests/responses header
	 */
	public static final String HEADER_FINANCIAL_API_VERSION = "financialapi-version";
	
	/**
	 * Field to represent API key on the requests/responses header
	 */
	public static final String HEADER_API_KEY = "X-api-key";
	
	/**
	 * Field to represent API Rate Limit Remaining on the requests/responses header
	 */
	public static final String HEADER_LIMIT_REMAINING = "X-Rate-Limit-Remaining";
    
	/**
	 * Field to represent API Rate Limit Retry After Seconds on the requests/responses header
	 */
	public static final String HEADER_RETRY_AFTER = "X-Rate-Limit-Retry-After-Seconds";
	
	private FinancialApiUtil() {}
	

	/**********************************/
	
	//Method that format a date as yyyy-MM-dd.
	public static DateTimeFormatter getDateFormater() {
		return DateTimeFormatter.ofPattern("yyyy-MM-dd");
	}
	
	//Method that format a date as yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.
	public static DateTimeFormatter getDateTimeFormater() {
		return DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	}
	
	
	//Method that converts a local date to a local date time.
	public static LocalDateTime convertLocalDateToLocalDateTime(LocalDate date) {
		return date.atTime(0, 0, 0);
	
	}

}
