package com.rmg.projecttest;
import static io.restassured.RestAssured.*;

public class GetAllProjects {

	public static void main(String[] args) {
		
		when()
		  .get("http://localhost:8085/projects")
		.then()
		  .log().all();

	}

}
