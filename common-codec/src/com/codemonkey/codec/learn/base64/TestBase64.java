package com.codemonkey.codec.learn.base64;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

public class TestBase64 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println(encode3());
		System.out.println(decode(base64Encode()));
	}

	public static String base64Encode(){
		String codeString = "wo are codemonkeys 中文";
		Base64 base = new Base64();
		try {
		byte[] ecodeBytes = base.encode(codeString.getBytes("utf8"));
		 return new String(ecodeBytes,"GBK");
		//return	base.encodeToString(codeString.getBytes("utf8"));
		} catch (UnsupportedEncodingException e) {
		}
		return null;
	}
	
	/**
	 * 当代码量（以  字节为单位，下同）
	 * 约比编码前的代码量多了1/3
	 * 当代码量不是3的整数倍时，代码量/3的余数自然就是2或者1。
	 * @return
	 */
	public static String encode3(){
		String codeString = "wo are codemonkey 中文";
		Base64 base = new Base64();
		try {
		return	base.encodeToString(codeString.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
		}
		return null;
	}
	
	public static String decode(String encodeString) throws UnsupportedEncodingException{
		Base64 base = new Base64();
		byte [] decodeBytesString = base.decodeBase64(encodeString);
		byte [] decodeBytes = base.decodeBase64(encodeString.getBytes("UTF8"));
		return new String(decodeBytes);
	}
	
}
