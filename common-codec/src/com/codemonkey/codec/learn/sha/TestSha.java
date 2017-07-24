package com.codemonkey.codec.learn.sha;

import org.apache.commons.codec.digest.DigestUtils;

public class TestSha {

	public static void main(String [] args){
		System.out.println("----"+sha1());
	}
	
	
	/**
	 * sha1 安全哈希算法
	 * @return
	 */
	public static String sha1(){
		String codeMonkey = "we are codeMonkeys";
		return DigestUtils.sha1Hex(codeMonkey);
	}
	
}
