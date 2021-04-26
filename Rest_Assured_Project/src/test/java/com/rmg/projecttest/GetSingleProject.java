package com.rmg.projecttest;
import static io.restassured.RestAssured.*;

public class GetSingleProject {

	public static void main(String[] args) {
		
		when()
		  .get("http://localhost:8085/projects/TY_PROJ_003")
		.then()
		  .log().all();

	}

}
