package com.ibm.cio.ws.helper;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;


/**
 * Helper class to convert JSON string to JSON object and 
 * parse it into Paint class and in reverse
 * 
 * */
public class JSONParser {
	
	/**
	 * parse json message into Paint object
	 * */
	public static Object parseJsonMsg(String message){
		
		JsonReader reader = Json.createReader(new StringReader(message));
		
		JsonObject json = reader.readObject();
		
		//TODO parse json into paint class attrs
		
		reader.close();
		
		return json;
	}
	
	
	/**
	 * Builds json message from Paint class
	 * */
	public static String createJson(Object obj){
		
		String response = "";
		
		JsonObjectBuilder builder = Json.createObjectBuilder();
		// TODO build json from paint
		builder.add("holo", "holo");
		
		return builder.toString();
	}

}
