

package Rest;


import io.restassured.*;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matcher.*;



public class GetTest {

	public static void main(String[] args) {
		
		
		given().
		when().
		get("http://localhost:3000/posts").
		
		then().assertThat().statusCode(200).log().all();
		
		

	}

}
