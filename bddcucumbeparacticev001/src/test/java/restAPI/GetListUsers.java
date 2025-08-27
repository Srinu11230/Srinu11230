package restAPI;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;

import org.testng.*;

import org.testng.annotations.*;

import io.cucumber.java.it.Data;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetListUsers {
	int id;
	@Test(priority = 1)
	void getListUsers() {
		given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("page", equalTo(2)).log().all();
		//String name = res.jsonPath().getString(DEFAULT_BODY_ROOT_PATH);
		//System.out.println(name);
		//assertEquals(name, "Michael");
	}
	@Test(priority = 2)
	void createNewUser() {
		/*
		 * String body = "{ \"name\": \"morpheus\", \"job\": \"leader\" }";
		 * 
		 * Response response = RestAssured.given() .contentType("application/json")
		 * .body(body) .when() .post("https://reqres.in/api/users");
		 * 
		 * response.then().statusCode(201).log().all();
		 * 
		 * // Extract id as String (not int) String id =
		 * response.jsonPath().getString("id"); System.out.println("Generated User ID: "
		 * + id);
		 * 
		 * Assert.assertNotNull(id, "ID should not be null");
		 */
		
		  HashMap Body = new HashMap(); 
		  Body.put("name", "morpheus"); 
		  Body.put("job","leader"); 
		  given().contentType("application/json").body(Body).when().post("https://reqres.in/api/users").then().statusCode(201).log().all();
		 
		/*
		 * Response response =
		 * RestAssured.given().contentType("application.json").body(body).when().post(
		 * "https://reqres.in/api/users"); response .then().statusCode(201).log().all();
		 * JsonPath js = response.jsonPath(); int id = js.getInt("id");
		 * System.out.println("ID is : " + id);
		 */
	} 
	@Test(priority = 3, dependsOnMethods = {"createNewUser"})
	void updateUser() {
		HashMap Body = new HashMap();
		Body.put("name", "Srinu");
		Body.put("job", "Tester");
		given().contentType("application/json").body(Body).when().put("https://reqres.in/api/users/"+id).then().statusCode(200).log().all();
		
	}
}
