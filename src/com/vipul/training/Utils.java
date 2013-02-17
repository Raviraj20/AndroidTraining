package com.vipul.training;

public class Utils {
	public static String getContentString(String... contents) {

		String content = "&#8226;&emsp;";

		for (int i = 0; i < contents.length - 1; i++) {
			content += contents[i];
			content += "<br><br>&#8226;&emsp;";
		}

		content += contents[contents.length - 1];

		return content;

	}
}
