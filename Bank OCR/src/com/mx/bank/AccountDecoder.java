package com.mx.bank;

public interface AccountDecoder {

	int DIGIT_SQUARE_SIZE = 3;
	static  final String UNKNOWN_DIGIT = "?";
	
	public Account decode(String[] codedLines);

	
}
