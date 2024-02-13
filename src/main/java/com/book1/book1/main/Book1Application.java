package com.book1.book1.main;

import com.book1.book1.entity.users;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Book1Application {

	public static void main(String[] args) {


		try {
			ObjectMapper mapper = new XmlMapper();

			FileInputStream inputStream = new FileInputStream(new File("E:/book1/src/main/java/com/book1/book1/xmlfiles/userinput.xml"));
			TypeReference<users> typeReference = new TypeReference<users>() {
			};
			users user = mapper.readValue(inputStream, typeReference);
			inputStream.close();
			System.out.println(user.getId() + " " + user.getBookName());
			user.Database();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

