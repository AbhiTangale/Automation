package AccessToken;


	import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;



	import api.endpoints.Routes;
import api.endpoints.Routes2;
import api.endpoints.Routes3;
import io.restassured.http.ContentType;
	import io.restassured.path.json.JsonPath;
	import io.restassured.response.Response;

   

	public class LoginAPI {
		public static String name;
		public static String name1;
		public static String name2;
  @Test
	   public static String Createlogin()
		{
	        Response response=given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body("{\r\n"
					+ "    \"action\": \"EMAIL_LOGIN\",\r\n"
					+ "    \"payload\": {\r\n"
					+ "        \"email\": \"ab@samta.ai\",\r\n"
					+ "        \"password\": \"Atcf@123\"\r\n"
					+ "    }\r\n"
					+ "}")
			.when()
			.post(Routes.post1_url);
			 JsonPath jsonPath = response.jsonPath();
		     name = jsonPath.get("access_token");
			System.out.println(name);
			return name;
			
			}
	   @Test
	   public static String Createlogin1()
		{
	        Response response=given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body("{\r\n"
					+ "    \"action\": \"EMAIL_LOGIN\",\r\n"
					+ "    \"payload\": {\r\n"
					+ "        \"email\": \"abhitangale@gmail.com\",\r\n"
					+ "        \"password\": \"Atcf@123\"\r\n"
					+ "    }\r\n"
					+ "}")
			.when()
			.post(Routes2.post1_url);
			 JsonPath jsonPath = response.jsonPath();
		        name1= jsonPath.get("access_token");
		        System.out.println(name1);
			return name1;
			}
	   public static String Createlogin2()  {
		   Response response=given()
					.contentType(ContentType.JSON)
					.accept(ContentType.JSON)
					.body("{\r\n"
							+ "    \"action\": \"EMAIL_LOGIN\",\r\n"
							+ "    \"payload\": {\r\n"
							+ "        \"email\": \"abhijittangale@gmail.com\",\r\n"
							+ "        \"password\": \"Atcf@123\"\r\n"
							+ "    }\r\n"
							+ "}")
					.when()
					.post(Routes3.post1_url);
					 JsonPath jsonPath = response.jsonPath();
				        name2= jsonPath.get("access_token");
				        System.out.println(name2);
					return name2;
	   }
	}
	  
	
	   
	  

	    

	
