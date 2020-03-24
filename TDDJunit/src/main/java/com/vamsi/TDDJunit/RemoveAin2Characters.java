package com.vamsi.TDDJunit;

public class RemoveAin2Characters {
	String remove2Chars(String str) {
		StringBuilder res = new StringBuilder("");
		int len = str.length();
		if(len > 0 && str.charAt(0) != 'A')
			res.append(str.charAt(0));
		if(len > 1) {
			if(str.charAt(1) != 'A')
				res.append(str.substring(1));
			else
				res.append(str.substring(2));
		}
		return res.toString();
	}

}
