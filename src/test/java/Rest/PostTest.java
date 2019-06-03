package Rest;

import io.restassured.*;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matcher.*;



public class PostTest {

	public static void main(String[] args) {
		
		
		RestAssured.baseURI = "http://localhost:3000";
		
		
		ValidatableResponse response = RestAssured.given().
		when().headers("Content-Type","application/json").
		body("{\n" + 
				"    \"id\": 23,\r\n" + 
				"    \"title\": \"json-server23\",\r\n" + 
				"    \"author\": \"typicode23\"\r\n" + 
				"  }").
		post("/posts").
		then().assertThat().log().all().statusCode(201);
		

		System.out.println("All info " + response.extract().asString());
	}

}
