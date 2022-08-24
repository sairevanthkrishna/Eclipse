package com.kanerika.practice2;

import java.io.FileReader;
import java.util.Properties;

public class File1 {
	public static  void main(String[]args) {
		FileReader reader=new FileReader("");
		Properties p=new Properties();
		p.load(reader);
	}

}
