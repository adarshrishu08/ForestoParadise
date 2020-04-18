package com.webapp.foresto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {

	public static void main(final String... args) {
		// TODO Auto-generated method stub

		final List<String> list = Arrays.asList("a","b","c");
		List<String> alist = new ArrayList<>(list);
		if(list.size()>3){
			alist.add("d");
		} else {
			alist.add("e");
		}
		System.out.println(list);
	}

}
