package com.java.pracjson;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonTest {

	public static void main(String[] args) {
		
		User user = new User();
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			mapper.writeValue(new File("D:\\user1.json"), user);
			System.out.println(mapper.writeValueAsString(user));
			
		} catch (JsonGenerationException e) {
			
			e.printStackTrace();
		} catch (JsonMappingException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
