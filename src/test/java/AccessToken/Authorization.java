package AccessToken;


	import org.json.JSONObject;
	import org.testng.annotations.Test;

	import api.endpoints.UserEndPoints;
	import io.restassured.RestAssured;
	import io.restassured.http.ContentType;
import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;

	public class Authorization {
		
		public static final String Bearer = "Authorization";
		public static final String RequestSpecification = null;
		
		
		public static RequestSpecification BearerToken()
		{
		RequestSpecification requestspac=RestAssured.given();
		String AuthToken="Bearer"+LoginAPI.name;
	    String AuthToken1="Bearer"+LoginAPI.name1;
		String AuthToken2="Bearer"+LoginAPI.name2;
	    requestspac.headers(Bearer,AuthToken);
	    requestspac.headers(Bearer,AuthToken1);
		requestspac.headers(Bearer,AuthToken2);
	    requestspac.contentType(ContentType.JSON);
		return requestspac;
			
	}}
	
	


