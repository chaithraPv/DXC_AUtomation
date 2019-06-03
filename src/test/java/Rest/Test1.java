package Rest;

import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.Matcher.*;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class Test1 {

	
	@Test(priority =1)
	
	private void GetMethod() {
				
      
	    RestAssured.baseURI = "https://samples.openweathermap.org/data/2.5/weather";
	    
	    ValidatableResponse response= RestAssured
	    .given().param("q", "London,uk").param("appid", "b6907d289e10d714a6e88b30761fae22")
	    .when()
		.get()
		.then().assertThat().statusCode(200);
		
	    response.statusCode(200);
	    response.contentType(ContentType.JSON);

	  //  System.out.println("Out Put data " + response.extract().asString());
	    
	    Reporter.log(response.extract().asString(),true);

	}

		
		
		
	}


