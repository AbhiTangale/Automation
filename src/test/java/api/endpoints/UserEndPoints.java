package api.endpoints;
import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import AccessToken.Authorization;
import AccessToken.LoginAPI;
import api.payload.User;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
	
	

	

	public class UserEndPoints {
		private static final Response RequestSpecification = null;
		public static String name;
		public static String name1;
		public static String name2;

	    private String access_token;
	   private String access_token1;
		
	public static Response Createuserchangepassword(String url) 
	{
	String Access_Token = LoginAPI.Createlogin();
			 
    Response response = given()
   .header("Authorization", "Bearer " + Access_Token)
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
   .post(Routes.post2_url);
   return response;
    }

	 public static Response Createresetpassword(String url)
	   {
	   
		 String Access_Token = LoginAPI.Createlogin();
	        Response response = given()
			.header("Authorization", "Bearer " + Access_Token)
		    .contentType(ContentType.JSON) 
			.accept(ContentType.JSON)
			.body("{\r\n"
					+ "    \"schemaName\": \"exotel\",\r\n"
					+ "    \"email\": \"ab@samta.ai\"\r\n"
					+ "}")
			.when()
		 .post(Routes.post3_url);
	      return response;
	      }
	
	public static Response CreateUpdatepassword(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
		
	   Response response = given()
	   .header("Authorization", "Bearer " + Access_Token)
	   .contentType(ContentType.JSON) 
	   .accept(ContentType.JSON)
	   .body("{\r\n"
					+ "    \"email\": \"ab@samta.ai\",\r\n"
					+ "    \"oldPassword\":\"Atcf@123\",\r\n"
					+ "    \"newPassword\": \"Atcf@123\"\r\n"
					+ "}")
		 .when()
		 .post(Routes.post4_url);
          return response;

	}
	
	 public static Response Createaddsecuritypulserecord(String url)
	{
		 String Access_Token = LoginAPI.Createlogin();
		 Response response = given()
		 .header("Authorization", "Bearer " + Access_Token)
	     .contentType(ContentType.JSON) 
		 .accept(ContentType.JSON)
		 .body("{\r\n"
						+ "    \"securityPulseTitle\": \" Nuevo ataque NTLM Relay\",\r\n"
						+ "    \"mainTitle\": \"Un nuevo ataque de retransmisión NTLM denominado DFSCoerce se aprovecha del Sistema de archivos distribuido (DFS) con el fin de tomar control de un dominio de windows.\",\r\n"
						+ "    \"criticality\":\"High\",\r\n"
						+ "    \"sections\": [\r\n"
						+ "        {\r\n"
						+ "            \"imageData\": \"data:image/png;base64,vCqEiABEiABEiABEiABEiABIpIgOKmiMB4OQmQAAmQAAmQAAmQAAmQgDkJ/B+pM/8QN3EbowAAAABJRU5ErkJggg==\",\r\n"
						+ "            \"info\": \"El ataque de retrasnmisión NTLM es un método que consiste en la explotación del mecanismo desafío-respuesta. Esto permite a un atacante posicionarse entre un cliente y un servidor e interceptar y transmitir solicitudes de autenticación validadas y así obtener acceso no autorizado a los recursos de una red o en el caso de DFSCoerce, potencialmente apoderarse de todo un dominio.\"\r\n"
						+ "        },\r\n"
						+ "        {\r\n"
						+ "            \"imageData\": \"data:image/png;base64,ESIAESIAESKCIBChuigiMl5MACZAACZAACZAACZAACZiTAMWNOevCqEiABEiABEiABEiABEiABIpIgOKmiMB4OQmQAAmQAAmQAAmQAAmQgDkJ/B+pM/8QN3EbowAAAABJRU5ErkJggg==\",\r\n"
						+ "            \"info\": \"El ataque de retrasnmisión NTLM es un método que consiste en la explotación del mecanismo desafío-respuesta. Esto permite a un atacante posicionarse entre un cliente y un servidor e interceptar y transmitir solicitudes de autenticación validadas y así obtener acceso no autorizado a los recursos de una red o en el caso de DFSCoerce, potencialmente apoderarse de todo un dominio.\"\r\n"
						+ "        }\r\n"
						+ "    ],\r\n"
					+ "    \"recommendations\": [\r\n"
						+ "        \"Habilitar la protección extendida para funciones de autenticación (EPA) así como la firma SMB para proteger las credenciales de Windows \",\r\n"
						+ "        \"HTTP en los servidores AD CS\",\r\n"
						+ "        \"Desactivar NTLM en los controladores de dominio\"\r\n"
						+ "    ],\r\n"
						+ "    \"links\": [\r\n"
						+ "        {\r\n"
						+ "            \"linkText\": \"Habilitar la protección extendida para funciones de autenticación (EPA) así como la \",\r\n"
						+ "            \"linkUrl\": \"https://support.microsoft.com/en-gb/topic/kb5005413-mitigating-ntlm-relay-attacks-on-active-directory-certificate- services-ad-cs-3612b773-4043-4aa9-b23d-b87910cd3429\"\r\n"
						+ "        },\r\n"
						+ "        {\r\n"
						+ "            \"linkText\": \"Desactivar HTTP en los servidores AD CS\",\r\n"
						+ "            \"linkUrl\": \"https://support.microsoft.com/en-gb/topic/kb5005413-mitigating-ntlm-relay-attacks-on-active-directory-certificate- services-ad-cs-3612b773-4043-4aa9-b23d-b87910cd3429\"\r\n"
						+ "        },\r\n"
						+ "        {\r\n"
						+ "            \"linkText\": \"Desactivar HTTP en los servidores AD CS\",\r\n"
						+ "            \"linkUrl\": \"https://securityaffairs.co/wordpress/13\"\r\n"
						+ "        }\r\n"
						+ "    ],\r\n"
						+ "    \"selectedIncidents\": [\r\n"
						+ "        \"11223344\",\r\n"
						+ "        \"11223345\",\r\n"
					+ "        \"11223346\"\r\n"
						+ "    ],\r\n"
					+ "    \"selectedAssets\": [\r\n"
					+ "        \"laptop\",\r\n"
						+ "        \"mobile\",\r\n"
						+ "        \"desktop\"\r\n"
						+ "    ],\r\n"
						+ "    \"selectedEntities\": [\r\n"
						+ "        \"tcs\",\r\n"
						+ "        \"tata\",\r\n"
						+ "        \"reliance\"\r\n"
						+ "    ],\r\n"
						+ "	\"isPublished\":true\r\n"
						+ "}")
		 .when()
		 .post(Routes.post5_url);
          return response;
	}

	public static Response Createpredefinedfunction(String url)
	 {
		 String Access_Token = LoginAPI.Createlogin();
		 Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
	    .body("{\r\n"
		     		+ "    \"updatedData\":[\r\n"
		     		+ "        {\r\n"
		     		+ "        \"functionId\":\"predefined-1\",\r\n"
		     		+ "        \"functionName\":\"sita_function1\",\r\n"
		     		+ "        \"process\":[\r\n"
		     		+ "                {\r\n"
		     		+ "                    \"processName\":\"sita_process1\",\r\n"
		     		+ "                    \"isuserDef\":\"False\"\r\n"
		     		+ "                },\r\n"
		     		+ "                {\r\n"
		     		+ "                    \"processName\":\"sita_process2\",\r\n"
		     		+ "                    \"isuserDef\":\"False\"\r\n"
		     		+ "                }\r\n"
		     		+ "            ]\r\n"
		     		+ "        },\r\n"
		     		+ "        {\r\n"
		     		+ "        \"functionId\":\"predefined-2\",\r\n"
		     		+ "        \"functionName\":\"sita_function2\",\r\n"
		     		+ "        \"process\":[\r\n"
		     		+ "                {\r\n"
		     		+ "                    \"processName\":\"sita_process3\",\r\n"
		     		+ "                    \"isuserDef\":\"False\"\r\n"
		     		+ "                },\r\n"
		     		+ "                {\r\n"
		     		+ "                    \"processName\":\"sita_process4\",\r\n"
		     		+ "                    \"isuserDef\":\"False\"\r\n"
		     		+ "                }\r\n"
		     		+ "            ]\r\n"
		     		+ "        }\r\n"
		     		+ "    ]\r\n"
		     		+ "}")
		 .when()
		 .post(Routes.post6_url);
          return response;
     }
	
  public static Response Createentity_creation(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
		Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
	    .accept(ContentType.JSON)
		     // .body("")
		 .when()
		 .post(Routes.post7_url);
          return response;

	}

	public static Response Createentity_function_process(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		    // .body("") 
		 .when()
		 .post(Routes.post8_url);
          return response;
		}
	public static Response Createget_entity_assets(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		    // .body("") 
		 .when()
		 .post(Routes.post9_url);
          return response;
		}
	public static Response Createasset_risk(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		    // .body("") 
		 .when()
		 .post(Routes.post10_url);
          return response;
		}
	public static Response Createprocess_risk(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		    // .body("") 
		 .when()
		 .post(Routes.post11_url);
          return response;
		}
	public static Response Createfunction_risk(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		    // .body("") 
		 .when()
		 .post(Routes.post12_url);
          return response;
		}
	public static Response Creategeo_risk(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"locations\":[\"Gandhi Nagar,patna,India\"]\r\n"
				+ "}")
		.when()
		.post(Routes.post13_url);
		
		return response;
	}
	
	public static Response Createget_all_dashboard_risk_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"locations\":[\"Gandhi Nagar,patna,India\"]\r\n"
				+ "}")
		.when()
		.post(Routes.post14_url);
		
		return response;
	}
	
	public static Response CreateAllAssets_avg_risk_details(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post15_url);
		
		return response;
	}
	public static Response Createuploaded_data_status(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{}")
		.when()
		.post(Routes.post16_url);
		
		return response;
	}
	public static Response Createfetch_risk_journey(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"page\":1\r\n"
				+ "}")
		.when()
		.post(Routes.post17_url);
		
		return response;
	}
	public static Response Createupdate_risk_journey(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "   \"page\":1,\r\n"
				+ "   \"entity_id\":1,\r\n"
				+ "   \"page_data\":{\r\n"
				+ "      \"security_governance\":{\r\n"
				+ "         \"CISO'S_LINE_OF_REPORTING\":{\r\n"
				+ "            \"selected\":\"CEO\",\r\n"
				+ "            \"value\":\"CEO\"\r\n"
				+ "         },\r\n"
				+ "         \"members\":{\r\n"
				+ "            \"selected_members\":[\r\n"
				+ "               \"AUDIT\"\r\n"
				+ "            ]\r\n"
				+ "         },\r\n"
				+ "         \"Is_there_a_steering_committee\":\"NO\",\r\n"
				+ "         \"HOW_OFTEN_DO_THEY_MEET\":\"Annually\",\r\n"
				+ "         \"INTERNAL_AUDIT_FREQUENCY\":\"Quarterly\"\r\n"
				+ "      },\r\n"
				+ "      \"security_organization\":{\r\n"
				+ "         \"direct_reports\":100,\r\n"
				+ "         \"indirect_reports\":85,\r\n"
				+ "         \"FUNCTIONS_LINE_OF_REPORT\":[\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"CYBERSECURITY\",\r\n"
				+ "               \"selected\":\"OUTSIDE CISO ORG\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"COMPLIANCE(SECURITY)\",\r\n"
				+ "               \"selected\":\"CISO ORG\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"RISK\",\r\n"
				+ "               \"selected\":\"NA\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"SOC\",\r\n"
				+ "               \"selected\":\"OUTSIDE CISO ORG\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"OT SECURITY\",\r\n"
				+ "               \"selected\":\"CISO ORG\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"FRAUD\",\r\n"
				+ "               \"selected\":\"NA\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"OTHERS\",\r\n"
				+ "               \"value\":null,\r\n"
				+ "               \"selected\":\"OUTSIDE CISO ORG\"\r\n"
				+ "            }\r\n"
				+ "         ],\r\n"
				+ "         \"SECURITY_BUDGET\":1000000\r\n"
				+ "      },\r\n"
				+ "      \"security_compliance\":{\r\n"
				+ "         \"Regulation\":[\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"ISO 27001\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"ISO 27701\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"ISO 31000\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"SOC 1 TYPE 1\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"SOC 1 TYPE 2\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"SOC 2 TYPE 1\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"SOC 2 TYPE 2\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"HITRUST\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"HIPAA\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"PCI DSS\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"SOX\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":{\r\n"
				+ "                  \"OTHERS\":null\r\n"
				+ "               },\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            }\r\n"
				+ "         ]\r\n"
				+ "      }\r\n"
				+ "   }\r\n"
				+ "}")
		.when()
		.put(Routes.post18_url);
		
		return response;
	}
	public static Response Createreset_mfa_status(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"email\": \"ab@samta.ai\",\r\n"
				+ "    \"password\": \"Atcf@123\"\r\n"
				+ "}")
		.when()
		.post(Routes.post19_url);
		
		return response;
	}
	
	
	public static Response Createsource(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"name\": \"SIEM\",\r\n"
				+ "    \"credentials\": [\r\n"
				+ "        {\r\n"
				+ "            \"source_IP\": \"https://192.168.200.206\",\r\n"
				+ "            \"source_API_KEY\": \"6934da86-4cbb-4244-b556-80b169d87a9e\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"source_type\": \"sentinel\",\r\n"
				+ "    \"payload\": [\r\n"
				+ "        {\r\n"
				+ "            \"resource_name\": \"f52645f4-0dcf-400f-bb6c-56c9e20f87c6\",\r\n"
				+ "            \"workspace_name\": \"SURA ASSET MANAGEMENT PERU S.A\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"url\": \"https://192.168.200.206\",\r\n"
				+ "    \"first_sync_time\": \"2023-05-05 00:00:00\"\r\n"
				+ "}")
		.when()
		.post(Routes.post20_url);
		
		return response;
	}

	 public static Response Createwrapper(String url)
	{
		 String Access_Token = LoginAPI.Createlogin();
	        Response response = given()
			.header("Authorization", "Bearer " + Access_Token)
		    .contentType(ContentType.JSON) 
			.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"schema\": \"admin\",\r\n"
				+ "    \"name\": \"admin\"\r\n"
				+ "}")
		.when()
		.post(Routes.post21_url);
		
		return response;
	}
	
	public static Response CreateUser_Data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"schema\": \"suraperu\"\r\n"
				+ "}")
		.when()
		.post(Routes.post22_url);
		
		return response;
	}
	public static Response Createtenant_list(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post23_url);
		
		return response;
	}
	public static Response CreateCreate_tenant(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post24_url);
		
		return response;
	}
	public static Response CreateSend_Mail(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"email\": \"ab@samta.ai\"\r\n"
				+ "}")
		.when()
		.post(Routes.post25_url);
		
		return response;
	}
	
      public static Response Createuser_enable_disable(String url)
	{
    	  String Access_Token = LoginAPI.Createlogin();
          Response response = given()
  		.header("Authorization", "Bearer " + Access_Token)
  	    .contentType(ContentType.JSON) 
  		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"schemaName\":\"exotel\",\r\n"
				+ "    \"email\":\"ab@samta.ai\"\r\n"
				+ "}")
		.when()
		.post(Routes.post26_url);
		
		return response;
	}
	
	public static Response Createmfa_reset_Admin(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"schemaName\":\"exotel\",\r\n"
				+ "    \"email\":\"ab@samta.ai\"\r\n"
				+ "}")
		.when()
		.post(Routes.post27_url);
		
		return response;
	}
	public static Response Createpackages_list(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post28_url);
		
		return response;
	}
	public static Response Createpredefined_category_type(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post29_url);
		
		return response;
	}
	
	public static Response Createget_tags(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post30_url);
		
		return response;
	}
	
	
	public static Response Createtenant_matrix(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post31_url);
		
		return response;
	}
	public static Response Createuser_matrix(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"schemaName\": \"admin\"\r\n"
				+ "}")
		.when()
		.post(Routes.post32_url);
		
		return response;
	}
	public static Response Createsecurity_pulse_Data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"id\":1\r\n"
				+ "}")
		.when()
		.post(Routes.post33_url);
		
		return response;
	}
	public static Response Createsecurity_pulse_grid_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"fromDate\":\"2023-02-21\",\r\n"
				+ "    \"toDate\":\"2023-02-22\",\r\n"
				+ "    \"dropdownFilters\":[]\r\n"
				+ "}")
		.when()
		.post(Routes.post34_url);
		
		return response;
	}
	public static Response CreateAdd_predefined_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post35_url);
		
		return response;
	}
	public static Response Createmaster_function_process(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post36_url);
		
		return response;
	}
	public static Response Createmaster_function_update(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"functionId\":\"Userdef-1\",\r\n"
				+ "    \"functionName\":\"function1\"\r\n"
				+ "}")
		.when()
		.post(Routes.post37_url);
		
		return response;
	}
	public static Response Createmaster_function_delect(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"functionId\":\"Userdef-1\",\r\n"
				+ "    \"functionName\":\"function1\"\r\n"
				+ "}")
		.when()
		.post(Routes.post38_url);
		
		return response;
	}
	public static Response Createmaster_process_update(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"parentFunctionId\":\"predefined-1\",\r\n"
				+ "    \"isuserDef\":\"True\",\r\n"
				+ "    \"processName\":\"function1\"\r\n"
				+ "}")
		.when()
		.post(Routes.post39_url);
		
		return response;
	}

	
	public static Response Createget_predefined_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post40_url);
		
		return response;
	}
	
	public static Response Createadd_new_predefined_function(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"functionId\": \"userdefined-1\",\r\n"
				+ "    \"functionName\": \"ccsa\"\r\n"
				+ "}")
		.when()
		.post(Routes.post41_url);
		
		return response;
	}
	public static Response Createfetch_new_predefined_function(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"functionId\": \"userdefined-1\",\r\n"
				+ "    \"functionName\": \"ccsa\"\r\n"
				+ "}")
		.when()
		.post(Routes.post42_url);
		
		return response;
	}
	public static Response Createcreate_predefined_process(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"parentFunctionId\": \"preDefFunction-1\",\r\n"
				+ "    \"isuserDef\": true,\r\n"
				+ "    \"processName\": \"asssd\",\r\n"
				+ "    \"processId\":\"Predefined-1\"\r\n"
				+ "}")
		.when()
		.post(Routes.post43_url);
		
		return response;
	}
	
	
	
	
	public static Response Createepoch_time_convert(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post44_url);
		
		return response;
	}
	public static Response Createcsv_template_download(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post45_url);
		
		return response;
	}
	public static Response CreateAdd_source_data_siem(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"name\": \"SIEM\",\r\n"
				+ "    \"credentials\": [\r\n"
				+ "        {\r\n"
				+ "            \"source_IP\": \"https://management.azure.com\",\r\n"
				+ "            \"source_API_KEY\": \"f52645f4-0dcf-400f-bb6c-56c9e20f87c15\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"first_sync_time\": \"2023-09-21 00:00:00\",\r\n"
				+ "    \"source_type\": \"seceon\",\r\n"
				+ "    \"payload\": [\r\n"
				+ "        {\r\n"
				+ "            \"token\":\"Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCIsImtpZCI6ImQ4NzgwM2Q5LTdlMzgtNTgwMy04YjBjLTAyNTIxYjJhMzZlZCJ9.eyJtaWQiOiJhZjFlNDgyZi0yNTk3LTQzZTQtMzc3Yi02YTIwYTE5ODk4YTEiLCJ0ZW5hbnRfaWQiOiJTZWNlb25NU1NQIiwic3ViIjoiU2VjZW9uTVNTUCIsInJvbGVzIjoiIiwidG9rZW5faWQiOiI4ODdkNzBmMS03OTdkLTQ4NjMtYTM5OC01ZDcwOGYwMDk5OWYiLCJpYXQiOjE2ODYxNTMyNjQsImV4cCI6MjIyMjczNTAxNiwiaXNzdWVkX3RvIjoic29jX2V0ZWtAZXRlay5jb20iLCJhdWQiOiI3NDRhZTUxYmU2MjE4YmViMDRlY2VjY2MyMzQxMWQ3NDA5NGI1NjA0ZjZlZWQ4NjQ4MGY4MDI4NzA2ZjYyZWRmIiwiaXNzIjoiZDUxZjllYzdhYWQ5MjAwN2FiMjhhOGZkOWVkMzAwMzkwZWY4MDU5OGJjYmZkNDg4ZDhmMTZhZjNkZGRjODBlNyJ9.sH7QcvzaxoaVDJ158Gmb5UHWb5DnZpq2OkoLFavMvGhFX8ac0FhVuJk4UZ3IXzBlPcyVOUjhiWu6xgks-bfDXg\",\r\n"
				+ "            \"tenant_id\":\"RMN1506\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"url\": \"https://api01.seceon.com\"\r\n"
				+ "}")
		.when()
		.post(Routes.post46_url);
		
		return response;
	}
	public static Response Createuser_enable_and_disable(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"schemaName\":\"admin\",\r\n"
				+ "    \"email\":\"ab@samta.ai\"\r\n"
				+ "}")
		.when()
		.post(Routes.post47_url);
		
		return response;
	}
	
	
	
	public static Response Createget_entity_with_location(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post48_url);
		
		return response;
	}
	public static Response Createget_schema_language(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post49_url);
		
		return response;
	}
	
	public static Response Createlayout_update(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"page\":\"Insights\",\r\n"
				+ "    \"layoutInformation\":[\r\n"
				+ "       {\"id\": \"alert_by_confidence\", \"hidden\": true, \"position\": 0},\r\n"
				+ "       {\"id\": \"alert_by_confidence\", \"hidden\": false, \"position\": 0}\r\n"
				+ "    ]\r\n"
				+ "}")
		.when()
		.post(Routes.post50_url);
		
		return response;
	}
	public static Response Createlayout_fetch(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"page\":\"rosi\"\r\n"
				+ "}")
		.when()
		.post(Routes.post51_url);
		
		return response;
	}
	public static Response Createget_rgu(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post52_url);
		
		return response;
	}
	
	public static Response Createasset_risk_change(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"schema_name\": \"etek\"\r\n"
				+ "}")
		.when()
		.post(Routes.post53_url);
		
		return response;
	}
	
	public static Response Createtotal_investment_chart(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"header_filters\": {\r\n"
				+ "        \"function\": [\r\n"
				+ "            {\r\n"
				+ "                \"value\": 6\r\n"
				+ "            }\r\n"
				+ "        ],\r\n"
				+ "        \"process\": [],\r\n"
				+ "        \"geo_location\": []\r\n"
				+ "    }\r\n"
				+ "}")
		.when()
		.post(Routes.post54_url);
		
		return response;
	}
	public static Response Createget_location_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"header_filters\": {\r\n"
				+ "        \"function\": [\r\n"
				+ "            {\"value\":2}\r\n"
				+ "        ],\r\n"
				+ "        \"process\": [\r\n"
				+ "        ],\r\n"
				+ "        \"geo_location\": [],\r\n"
				+ "        \"asset\":[]\r\n"
				+ "    }\r\n"
				+ "}")
		.when()
		.post(Routes.post55_url);
		
		return response;
	}
	public static Response Createget_asset_type_summary(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post56_url);
		
		return response;
	}
	public static Response Createseceon_services_list(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"status\": 200,\r\n"
				+ "    \"data\": [\r\n"
				+ "        {\r\n"
				+ "            \"type_id\": 1,\r\n"
				+ "            \"type_name\": \"EndPoint\",\r\n"
				+ "            \"total_asset_qty\": 200,\r\n"
				+ "            \"enrolled_assets\": 150,\r\n"
				+ "            \"soc_coverage\": 75,\r\n"
				+ "            \"same_as_enrolled\": true\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type_id\": 2,\r\n"
				+ "            \"type_name\": \"Server\",\r\n"
				+ "            \"total_asset_qty\": 100,\r\n"
				+ "            \"enrolled_assets\": 50,\r\n"
				+ "            \"soc_coverage\": 75,\r\n"
				+ "            \"same_as_enrolled\": true\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}")
		.when()
		.post(Routes.post57_url);
		
		return response;
	}
	
	
	
	
	public static Response Createadd_security_pulse_record(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"securityPulseTitle\": \" Nuevo ataque NTLM Relay\",\r\n"
				+ "    \"mainTitle\": \"Un nuevo ataque de retransmisión NTLM denominado DFSCoerce se aprovecha del Sistema de archivos distribuido (DFS) con el fin de tomar control de un dominio de windows.\",\r\n"
				+ "    \"criticality\":\"High\",\r\n"
				+ "    \"sections\": [\r\n"
				+ "        {\r\n"
				+ "            \"imageData\": \"data:image/png;base64,vCqEiABEiABEiABEiABEiABIpIgOKmiMB4OQmQAAmQAAmQAAmQAAmQgDkJ/B+pM/8QN3EbowAAAABJRU5ErkJggg==\",\r\n"
				+ "            \"info\": \"El ataque de retrasnmisión NTLM es un método que consiste en la explotación del mecanismo desafío-respuesta. Esto permite a un atacante posicionarse entre un cliente y un servidor e interceptar y transmitir solicitudes de autenticación validadas y así obtener acceso no autorizado a los recursos de una red o en el caso de DFSCoerce, potencialmente apoderarse de todo un dominio.\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"imageData\": \"data:image/png;base64,ESIAESIAESKCIBChuigiMl5MACZAACZAACZAACZAACZiTAMWNOevCqEiABEiABEiABEiABEiABIpIgOKmiMB4OQmQAAmQAAmQAAmQAAmQgDkJ/B+pM/8QN3EbowAAAABJRU5ErkJggg==\",\r\n"
				+ "            \"info\": \"El ataque de retrasnmisión NTLM es un método que consiste en la explotación del mecanismo desafío-respuesta. Esto permite a un atacante posicionarse entre un cliente y un servidor e interceptar y transmitir solicitudes de autenticación validadas y así obtener acceso no autorizado a los recursos de una red o en el caso de DFSCoerce, potencialmente apoderarse de todo un dominio.\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"recommendations\": [\r\n"
				+ "        \"Habilitar la protección extendida para funciones de autenticación (EPA) así como la firma SMB para proteger las credenciales de Windows \",\r\n"
				+ "        \"HTTP en los servidores AD CS\",\r\n"
				+ "        \"Desactivar NTLM en los controladores de dominio\"\r\n"
				+ "    ],\r\n"
				+ "    \"links\": [\r\n"
				+ "        {\r\n"
				+ "            \"linkText\": \"Habilitar la protección extendida para funciones de autenticación (EPA) así como la \",\r\n"
				+ "            \"linkUrl\": \"https://support.microsoft.com/en-gb/topic/kb5005413-mitigating-ntlm-relay-attacks-on-active-directory-certificate- services-ad-cs-3612b773-4043-4aa9-b23d-b87910cd3429\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"linkText\": \"Desactivar HTTP en los servidores AD CS\",\r\n"
				+ "            \"linkUrl\": \"https://support.microsoft.com/en-gb/topic/kb5005413-mitigating-ntlm-relay-attacks-on-active-directory-certificate- services-ad-cs-3612b773-4043-4aa9-b23d-b87910cd3429\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"linkText\": \"Desactivar HTTP en los servidores AD CS\",\r\n"
				+ "            \"linkUrl\": \"https://securityaffairs.co/wordpress/13\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"selectedIncidents\": [\r\n"
				+ "        \"11223344\",\r\n"
				+ "        \"11223345\",\r\n"
				+ "        \"11223346\"\r\n"
				+ "    ],\r\n"
				+ "    \"selectedAssets\": [\r\n"
				+ "        \"laptop\",\r\n"
				+ "        \"mobile\",\r\n"
				+ "        \"desktop\"\r\n"
				+ "    ],\r\n"
				+ "    \"selectedEntities\": [\r\n"
				+ "        \"tcs\",\r\n"
				+ "        \"tata\",\r\n"
				+ "        \"reliance\"\r\n"
				+ "    ],\r\n"
				+ "	\"isPublished\":true\r\n"
				+ "}")
		.when()
		.post(Routes.post58_url);
		
		return response;
	}
	public static Response Createentity_assets(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post59_url);
		
		return response;
	}
	public static Response Createupload_assets_file(String url)
	{String Access_Token = LoginAPI.Createlogin();
    Response response = given()
	.header("Authorization", "Bearer " + Access_Token)
    .contentType(ContentType.JSON) 
	.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post60_url);
		
		return response;
	}
	public static Response Creategeo_risk1(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"locations\":[\"Gandhi Nagar,patna,India\"]\r\n"
				+ "}")
		.when()
		.post(Routes.post61_url);
		
		return response;
	}
	public static Response Createmfa_status_reset(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "        \"email\": \"ab@samta.ai\",\r\n"
				+ "        \"password\": \"Atcf@123\"\r\n"
				+ "    }")
		.when()
		.post(Routes.post62_url);
		
		return response;
	}
	public static Response Createwrapper1(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"schema\": \"admin\",\r\n"
				+ "    \"name\": \"admin\"\r\n"
				+ "}")
		.when()
		.post(Routes.post63_url);
		
		return response;
	}
	public static Response CreateSend_mail1(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"email\": \"ab@samta.ai\"\r\n"
				+ "}")
		.when()
		.post(Routes.post64_url);
		
		return response;
	}
	public static Response Createuser_matrix1(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"schemaName\": \"admin\"\r\n"
				+ "}")
		.when()
		.post(Routes.post65_url);
		
		return response;
	}
	public static Response Createsecurity_pulse_data1(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"id\":1\r\n"
				+ "}")
		.when()
		.post(Routes.post66_url);
		
		return response;
	}
	public static Response Createget_asset_type_summary1(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post67_url);
		
		return response;
	}
	
//Part--3
	
	public static Response CreateAdmin_reset_password(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"schemaName\": \"admin\",\r\n"
				+ "    \"email\": \"ab@samta.ai\"\r\n"
				+ "}")
		.when()
		.post(Routes.post68_url);
		
		return response;
	}
	public static Response CreateUpdate_User_language(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"email\":\"ab@samta.ai\",\r\n"
				+ "    \"language\":\"enUS\"\r\n"
				+ "}")
		.when()
		.post(Routes.post69_url);
		
		return response;
	}
	public static Response Createoei_page_data_new(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"headerFilters\": {\r\n"
				+ "        \"GeoLocation\": [],\r\n"
				+ "        \"Function\": [],\r\n"
				+ "        \"Process\": [],\r\n"
				+ "        \"Asset\": []\r\n"
				+ "    },\r\n"
				+ "    \"fromDate\": \"2023-04-01\",\r\n"
				+ "    \"toDate\": \"2023-05-04\"\r\n"
				+ "}")
		.when()
		.post(Routes.post70_url);
		
		return response;
	}
	public static Response Createget_advisory_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"start_date\": \"2023-07-01\",\r\n"
				+ "    \"end_date\": \"2023-07-18\"\r\n"
				+ "}")
		.when()
		.post(Routes.post71_url);
		
		return response;
	}
	public static Response Createadd_source_data_siem(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"name\": \"SIEM\",\r\n"
				+ "    \"credentials\": [\r\n"
				+ "        {\r\n"
				+ "            \"source_IP\": \"https://management.azure.com\",\r\n"
				+ "            \"source_API_KEY\": \"f52645f4-0dcf-400f-bb6c-56c9e20f87c15\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"first_sync_time\": \"2023-09-21 00:00:00\",\r\n"
				+ "    \"source_type\": \"seceon\",\r\n"
				+ "    \"payload\": [\r\n"
				+ "        {\r\n"
				+ "            \"token\":\"Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCIsImtpZCI6ImQ4NzgwM2Q5LTdlMzgtNTgwMy04YjBjLTAyNTIxYjJhMzZlZCJ9.eyJtaWQiOiJhZjFlNDgyZi0yNTk3LTQzZTQtMzc3Yi02YTIwYTE5ODk4YTEiLCJ0ZW5hbnRfaWQiOiJTZWNlb25NU1NQIiwic3ViIjoiU2VjZW9uTVNTUCIsInJvbGVzIjoiIiwidG9rZW5faWQiOiI4ODdkNzBmMS03OTdkLTQ4NjMtYTM5OC01ZDcwOGYwMDk5OWYiLCJpYXQiOjE2ODYxNTMyNjQsImV4cCI6MjIyMjczNTAxNiwiaXNzdWVkX3RvIjoic29jX2V0ZWtAZXRlay5jb20iLCJhdWQiOiI3NDRhZTUxYmU2MjE4YmViMDRlY2VjY2MyMzQxMWQ3NDA5NGI1NjA0ZjZlZWQ4NjQ4MGY4MDI4NzA2ZjYyZWRmIiwiaXNzIjoiZDUxZjllYzdhYWQ5MjAwN2FiMjhhOGZkOWVkMzAwMzkwZWY4MDU5OGJjYmZkNDg4ZDhmMTZhZjNkZGRjODBlNyJ9.sH7QcvzaxoaVDJ158Gmb5UHWb5DnZpq2OkoLFavMvGhFX8ac0FhVuJk4UZ3IXzBlPcyVOUjhiWu6xgks-bfDXg\",\r\n"
				+ "            \"tenant_id\":\"RMN1506\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"url\": \"https://api01.seceon.com\"\r\n"
				+ "}")
		.when()
		.post(Routes.post72_url);
		
		return response;
	}
	public static Response Createupdate_asset_type_summary(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"status\": 200,\r\n"
				+ "    \"data\": [\r\n"
				+ "        {\r\n"
				+ "            \"type_id\": 1,\r\n"
				+ "            \"type_name\": \"EndPoint\",\r\n"
				+ "            \"total_asset_qty\": 200,\r\n"
				+ "            \"enrolled_assets\": 150,\r\n"
				+ "            \"soc_coverage\": 75,\r\n"
				+ "            \"same_as_enrolled\": true\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type_id\": 2,\r\n"
				+ "            \"type_name\": \"Server\",\r\n"
				+ "            \"total_asset_qty\": 100,\r\n"
				+ "            \"enrolled_assets\": 50,\r\n"
				+ "            \"soc_coverage\": 75,\r\n"
				+ "            \"same_as_enrolled\": true\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}")
		.when()
		.post(Routes.post73_url);
		
		return response;
	}
	public static Response Createvulnerabilities_grid_view(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post74_url);
		
		return response;
	}
	public static Response Createvulnerabilities_master_grid_view(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post75_url);
		
		return response;
	}
	public static Response Createchange_tenant_package(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"schema_name\": \"exotel\",\r\n"
				+ "    \"package_name\":\"Enterprise\"\r\n"
				+ "}")
		.when()
		.post(Routes.post76_url);
		
		return response;
	}
	public static Response Createchange_customer_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"schema_name\": \"exotel\",\r\n"
				+ "    \"new_name\":\"EXO2023\",\r\n"
				+ "    \"syncData\":1\r\n"
				+ "}")
		.when()
		.post(Routes.post77_url);
		
		return response;
	}
	public static Response Createtenant_list1(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post78_url);
		
		return response;
	}
	public static Response Createpackages_list1(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post79_url);
		
		return response;
	}
	public static Response Createadd_security_pulse_data(String url)
	{
	String Access_Token = LoginAPI.Createlogin();
    Response response = given()
	.header("Authorization", "Bearer " + Access_Token)
    .contentType(ContentType.JSON) 
	.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"securityPulseTitle\": \" Nuevo ataque NTLM Relay\",\r\n"
				+ "    \"mainTitle\": \"Un nuevo ataque de retransmisión NTLM denominado DFSCoerce se aprovecha del Sistema de archivos distribuido (DFS) con el fin de tomar control de un dominio de windows.\",\r\n"
				+ "    \"criticality\":\"High\",\r\n"
				+ "    \"sections\": [\r\n"
				+ "        {\r\n"
				+ "            \"imageData\": \"data:image/png;base64,vCqEiABEiABEiABEiABEiABIpIgOKmiMB4OQmQAAmQAAmQAAmQAAmQgDkJ/B+pM/8QN3EbowAAAABJRU5ErkJggg==\",\r\n"
				+ "            \"info\": \"El ataque de retrasnmisión NTLM es un método que consiste en la explotación del mecanismo desafío-respuesta. Esto permite a un atacante posicionarse entre un cliente y un servidor e interceptar y transmitir solicitudes de autenticación validadas y así obtener acceso no autorizado a los recursos de una red o en el caso de DFSCoerce, potencialmente apoderarse de todo un dominio.\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"imageData\": \"data:image/png;base64,ESIAESIAESKCIBChuigiMl5MACZAACZAACZAACZAACZiTAMWNOevCqEiABEiABEiABEiABEiABIpIgOKmiMB4OQmQAAmQAAmQAAmQAAmQgDkJ/B+pM/8QN3EbowAAAABJRU5ErkJggg==\",\r\n"
				+ "            \"info\": \"El ataque de retrasnmisión NTLM es un método que consiste en la explotación del mecanismo desafío-respuesta. Esto permite a un atacante posicionarse entre un cliente y un servidor e interceptar y transmitir solicitudes de autenticación validadas y así obtener acceso no autorizado a los recursos de una red o en el caso de DFSCoerce, potencialmente apoderarse de todo un dominio.\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"recommendations\": [\r\n"
				+ "        \"Habilitar la protección extendida para funciones de autenticación (EPA) así como la firma SMB para proteger las credenciales de Windows \",\r\n"
				+ "        \"HTTP en los servidores AD CS\",\r\n"
				+ "        \"Desactivar NTLM en los controladores de dominio\"\r\n"
				+ "    ],\r\n"
				+ "    \"links\": [\r\n"
				+ "        {\r\n"
				+ "            \"linkText\": \"Habilitar la protección extendida para funciones de autenticación (EPA) así como la \",\r\n"
				+ "            \"linkUrl\": \"https://support.microsoft.com/en-gb/topic/kb5005413-mitigating-ntlm-relay-attacks-on-active-directory-certificate- services-ad-cs-3612b773-4043-4aa9-b23d-b87910cd3429\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"linkText\": \"Desactivar HTTP en los servidores AD CS\",\r\n"
				+ "            \"linkUrl\": \"https://support.microsoft.com/en-gb/topic/kb5005413-mitigating-ntlm-relay-attacks-on-active-directory-certificate- services-ad-cs-3612b773-4043-4aa9-b23d-b87910cd3429\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"linkText\": \"Desactivar HTTP en los servidores AD CS\",\r\n"
				+ "            \"linkUrl\": \"https://securityaffairs.co/wordpress/13\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"selectedIncidents\": [\r\n"
				+ "        \"11223344\",\r\n"
				+ "        \"11223345\",\r\n"
				+ "        \"11223346\"\r\n"
				+ "    ],\r\n"
				+ "    \"selectedAssets\": [\r\n"
				+ "        \"laptop\",\r\n"
				+ "        \"mobile\",\r\n"
				+ "        \"desktop\"\r\n"
				+ "    ],\r\n"
				+ "    \"selectedEntities\": [\r\n"
				+ "        \"tcs\",\r\n"
				+ "        \"tata\",\r\n"
				+ "        \"reliance\"\r\n"
				+ "    ],\r\n"
				+ "	\"isPublished\":true\r\n"
				+ "}")
		.when()
		.post(Routes.post80_url);
		
		return response;
	}
	public static Response Createupdate_risk_journey1(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "   \"page\":1,\r\n"
				+ "   \"entity_id\":1,\r\n"
				+ "   \"page_data\":{\r\n"
				+ "      \"security_governance\":{\r\n"
				+ "         \"CISO'S_LINE_OF_REPORTING\":{\r\n"
				+ "            \"selected\":\"CEO\",\r\n"
				+ "            \"value\":\"CEO\"\r\n"
				+ "         },\r\n"
				+ "         \"members\":{\r\n"
				+ "            \"selected_members\":[\r\n"
				+ "               \"AUDIT\"\r\n"
				+ "            ]\r\n"
				+ "         },\r\n"
				+ "         \"Is_there_a_steering_committee\":\"NO\",\r\n"
				+ "         \"HOW_OFTEN_DO_THEY_MEET\":\"Annually\",\r\n"
				+ "         \"INTERNAL_AUDIT_FREQUENCY\":\"Quarterly\"\r\n"
				+ "      },\r\n"
				+ "      \"security_organization\":{\r\n"
				+ "         \"direct_reports\":100,\r\n"
				+ "         \"indirect_reports\":85,\r\n"
				+ "         \"FUNCTIONS_LINE_OF_REPORT\":[\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"CYBERSECURITY\",\r\n"
				+ "               \"selected\":\"OUTSIDE CISO ORG\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"COMPLIANCE(SECURITY)\",\r\n"
				+ "               \"selected\":\"CISO ORG\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"RISK\",\r\n"
				+ "               \"selected\":\"NA\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"SOC\",\r\n"
				+ "               \"selected\":\"OUTSIDE CISO ORG\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"OT SECURITY\",\r\n"
				+ "               \"selected\":\"CISO ORG\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"FRAUD\",\r\n"
				+ "               \"selected\":\"NA\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"OTHERS\",\r\n"
				+ "               \"value\":null,\r\n"
				+ "               \"selected\":\"OUTSIDE CISO ORG\"\r\n"
				+ "            }\r\n"
				+ "         ],\r\n"
				+ "         \"SECURITY_BUDGET\":1000000\r\n"
				+ "      },\r\n"
				+ "      \"security_compliance\":{\r\n"
				+ "         \"Regulation\":[\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"ISO 27001\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"ISO 27701\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"ISO 31000\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"SOC 1 TYPE 1\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"SOC 1 TYPE 2\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"SOC 2 TYPE 1\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"SOC 2 TYPE 2\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"HITRUST\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"HIPAA\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"PCI DSS\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":\"SOX\",\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"label\":{\r\n"
				+ "                  \"OTHERS\":null\r\n"
				+ "               },\r\n"
				+ "               \"is_checked\":false,\r\n"
				+ "               \"cycle\":null\r\n"
				+ "            }\r\n"
				+ "         ]\r\n"
				+ "      }\r\n"
				+ "   }\r\n"
				+ "}")
		.when()
		.put(Routes.put81_url);
		
		return response;
	}
	public static Response Createpreference_input(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post82_url);
		
		return response;
	}
	public static Response Createpreference_fetch(String url)
	{String Access_Token = LoginAPI.Createlogin();
    Response response = given()
	.header("Authorization", "Bearer " + Access_Token)
    .contentType(ContentType.JSON) 
	.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post83_url);
		
		return response;
	}
	public static Response Createtheme_preference_update(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"theme_preference\": \"light\"\r\n"
				+ "}")
		.when()
		.post(Routes.post84_url);
		
		return response;
	}
	public static Response Createupdate_language(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"email\":\"ab@samta.ai\",\r\n"
				+ "    \"language\":\"enUS\"\r\n"
				+ "}")
		.when()
		.post(Routes.post85_url);
		
		return response;
	}
	public static Response Createlayout(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"page\":\"dashboard\"\r\n"
				+ "}")
		.when()
		.post(Routes.post86_url);
		
		return response;
	}
	public static Response Createupdate_layout(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"page\":\"Insights\",\r\n"
				+ "    \"layoutInformation\":[\r\n"
				+ "       {\"id\": \"alert_by_confidence\", \"hidden\": true, \"position\": 0},\r\n"
				+ "       {\"id\": \"alert_by_confidence\", \"hidden\": false, \"position\": 0}\r\n"
				+ "    ]\r\n"
				+ "}")
		.when()
		.post(Routes.post87_url);
		
		return response;
	}
	public static Response Createreset_layout(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"page\":\"Insights\",\r\n"
				+ "    \"layoutInformation\":[\r\n"
				+ "       {\"id\": \"alert_by_confidence\", \"hidden\": true, \"position\": 0},\r\n"
				+ "       {\"id\": \"alert_by_confidence\", \"hidden\": false, \"position\": 0}\r\n"
				+ "    ]\r\n"
				+ "}")
		.when()
		.post(Routes.post88_url);
		
		return response;
	}
	public static Response Createreset_layout_admin(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"schema_name\": \"admin\",\r\n"
				+ "    \"email\": \"ab@samta.ai\"\r\n"
				+ "}")
		.when()
		.post(Routes.post89_url);
		
		return response;
	}
	public static Response Createfetch_risk_pages(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{}")
		.when()
		.post(Routes.post90_url);
		
		return response;
	}
	public static Response Createfetch_risk_questions(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"screen_id\": 1,\r\n"
				+ "    \"lang_code\": \"enUS\"\r\n"
				+ "}")
		.when()
		.post(Routes.post91_url);
		
		return response;
	}
	public static Response Createadd_update_risk_question(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"question\": {\r\n"
				+ "        \"question_id\": null,\r\n"
				+ "        \"question\": \"how service work?\",\r\n"
				+ "        \"question_no\": 1,\r\n"
				+ "        \"answers\": [\r\n"
				+ "            {\r\n"
				+ "                \"answer_value\": 0,\r\n"
				+ "                \"answer_text\": \"a\",\r\n"
				+ "                \"on_hover\": \"1\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"answer_value\": 1,\r\n"
				+ "                \"answer_text\": \"b\",\r\n"
				+ "                \"on_hover\": \"2\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"answer_value\": 2,\r\n"
				+ "                \"answer_text\": \"c\",\r\n"
				+ "                \"on_hover\": \"3\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"answer_value\": 3,\r\n"
				+ "                \"answer_text\": \"d\",\r\n"
				+ "                \"on_hover\": \"4\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"answer_value\": 4,\r\n"
				+ "                \"answer_text\": \"e\",\r\n"
				+ "                \"on_hover\": \"5\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"answer_value\": 5,\r\n"
				+ "                \"answer_text\": \"f\",\r\n"
				+ "                \"on_hover\": \"6\"\r\n"
				+ "            }\r\n"
				+ "        ],\r\n"
				+ "        \"selected_answer\": 0\r\n"
				+ "    },\r\n"
				+ "    \"screen_id\": 1,\r\n"
				+ "    \"screen_name\": \"Directorio Activo\",\r\n"
				+ "    \"screen_type\": \"CONTROL_CONF\",\r\n"
				+ "    \"lang_code\": \"es\"\r\n"
				+ "}")
		.when()
		.post(Routes.post92_url);
		
		return response;
	}
	
	public static Response Createdelete_risk_question(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"question_id\": 1,\r\n"
				+ "    \"question_no\": 1,\r\n"
				+ "    \"screen_id\": 1,\r\n"
				+ "    \"screen_name\": \"Directorio Activo\",\r\n"
				+ "    \"screen_type\": \"CONTROL_CONF\",\r\n"
				+ "    \"lang_code\": \"es\"\r\n"
				+ "}")
		.when()
		.post(Routes.post93_url);
		
		return response;
	}
	public static Response Createfaq(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{}")
		.when()
		.post(Routes.post94_url);
		
		return response;
	}
	public static Response Createview_email_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"schema_key\": \"admin\"\r\n"
				+ "}")
		.when()
		.post(Routes.post95_url);
		
		return response;
	}
	public static Response Createcreate_update_email_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"wrapper_emails\": [\r\n"
				+ "        {\r\n"
				+ "            \"id\": null,\r\n"
				+ "            \"email\": \"ab@samta.ai\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"usecase_and_assets_emails\": [\r\n"
				+ "        {\r\n"
				+ "            \"id\": null,\r\n"
				+ "            \"email\": \"ab@samta.ai\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"schema_key\": \"admin\"\r\n"
				+ "}")
		.when()
		.post(Routes.post96_url);
		
		return response;
	}
	public static Response Createdelete_email_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"wrapper_emails\": [],\r\n"
				+ "    \"usecase_and_assets_emails\": [\r\n"
				+ "        {\r\n"
				+ "            \"id\": 1\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"schema_key\": \"exotel\"\r\n"
				+ "    \r\n"
				+ "}")
		.when()
		.post(Routes.post97_url);
		
		return response;
	}
	public static Response Createreactive_email_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"wrapper_emails\": [\r\n"
				+ "        {\r\n"
				+ "            \"id\": 1\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"usecase_and_assets_emails\": [],\r\n"
				+ "    \"schema_key\": \"admin\"\r\n"
				+ "}")
		.when()
		.post(Routes.post98_url);
		
		return response;
	}
	public static Response Createcontact_us(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"description\": \"where is source?\"\r\n"
				+ "}")
		.when()
		.post(Routes.post99_url);
		
		return response;
	}
	public static Response Createadd_source(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"schema_name\": \"demo\",\r\n"
				+ "    \"name\": \"CYBLE\",\r\n"
				+ "    \"credentials\": [\r\n"
				+ "        {\r\n"
				+ "            \"source_IP\": \"324255256\",\r\n"
				+ "            \"source_API_KEY\": \"53372727\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"source_type\": \"cyble\",\r\n"
				+ "    \"payload\": [\r\n"
				+ "        {\r\n"
				+ "            \"key\": \"token\",\r\n"
				+ "            \"value\": \"3245\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"key\": \"tenant_id\",\r\n"
				+ "            \"value\": \"hdtd\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"url\": \"abc@url\",\r\n"
				+ "    \"first_sync_time\": \"2024-03-27 05:30:00\"\r\n"
				+ "}")
		.when()
		.post(Routes.post100_url);
		
		return response;
	}
	
	public static Response Createtenant_lang(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{}")
		.when()
		.post(Routes.post101_url);
		
		return response;
	}
	
	public static Response Createentity_predefined_function(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post102_url);
		
		return response;
	}
	public static Response Createget_predefined_category(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post103_url);
		
		return response;
	}
	public static Response Createget_predefined_type(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post104_url);
		
		return response;
	}
	public static Response Createcreate_predefined_function(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"id\": null,\r\n"
				+ "    \"functionId\": \"78a2f243-6a52-4110\",\r\n"
				+ "    \"functionName\": \"Service\"\r\n"
				+ "}")
		.when()
		.post(Routes.post105_url);
		
		return response;
	}
	
	public static Response Createdelete_predefined_function(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"functionId\": \"78a2f243-6a52-4110\"\r\n"
				+ "}")
		.when()
		.post(Routes.post106_url);
		
		return response;
	}
	public static Response Createtenant_data_status(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{}")
		.when()
		.post(Routes.post107_url);
		
		return response;
	}
	public static Response Createfetch_predefined_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{}")
		.when()
		.post(Routes.post108_url);
		
		return response;
	}
	public static Response Createadd_tenant(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"schema_name\": \"mango22\",\r\n"
				+ "    \"name\": \"mango22\",\r\n"
				+ "    \"domain\": \"mango22.localhost\",\r\n"
				+ "    \"package\": \"\"\r\n"
				+ "}")
		.when()
		.post(Routes.post109_url);
		
		return response;
	}
	public static Response Createpackages(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{}")
		.when()
		.post(Routes.post110_url);
		
		return response;
	}
	public static Response Createsecurity_pulse_details_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post111_url);
		
		return response;
	}
	
	public static Response Createfetch_predefined_category(String url)
	{
	String Access_Token = LoginAPI.Createlogin();
    Response response = given()
	.header("Authorization", "Bearer " + Access_Token)
    .contentType(ContentType.JSON) 
	.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post112_url);
		
		return response;
	}
	public static Response Createcreate_category(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"categoryName\": \"other\",\r\n"
				+ "    \"categoryId\": null\r\n"
				+ "}")
		.when()
		.post(Routes.post113_url);
		
		return response;
	}
	public static Response Createcreate_subcategory(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"subcatName\": \"Service\",\r\n"
				+ "    \"categoryId\": 3,\r\n"
				+ "    \"subcatId\": null\r\n"
				+ "}")
		.when()
		.post(Routes.post114_url);
		
		return response;
	}
	public static Response Createdelete_category(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"categoryId\": 10\r\n"
				+ "}")
		.when()
		.post(Routes.post115_url);
		
		return response;
	}
	public static Response Createdelete_subcategory(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"subcatId\": 16\r\n"
				+ "}")
		.when()
		.post(Routes.post116_url);
		
		return response;
	}
	public static Response Createfetch_predefined_type(String url)
	{String Access_Token = LoginAPI.Createlogin();
    Response response = given()
	.header("Authorization", "Bearer " + Access_Token)
    .contentType(ContentType.JSON) 
	.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post117_url);
		
		return response;
	}
	public static Response Createcreate_subtype(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"subtypeName\": \"other\",\r\n"
				+ "    \"typeId\": 13,\r\n"
				+ "    \"subtypeId\": null\r\n"
				+ "}")
		.when()
		.post(Routes.post118_url);
		
		return response;
	}
	public static Response Createdelete_subtype(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"subtypeId\": 16\r\n"
				+ "}")
		.when()
		.post(Routes.post119_url);
		
		return response;
	}
	public static Response Createcreate_tag(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"tagsId\": null,\r\n"
				+ "    \"tagsName\": \"Service\"\r\n"
				+ "}")
		.when()
		.post(Routes.post120_url);
		
		return response;
	}
	public static Response Createdelete_tag(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"tagsId\": 1\r\n"
				+ "}")
		.when()
		.post(Routes.post121_url);
		
		return response;
	}
	public static Response Createget_tmf_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{}")
		.when()
		.post(Routes.post122_url);
		
		return response;
	}
	public static Response Createdelete_tmf_factor(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"id\": 82\r\n"
				+ "}")
		.when()
		.post(Routes.post123_url);
		
		return response;
	}
	public static Response Createget_usecase(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{}")
		.when()
		.post(Routes.post124_url);
		
		return response;
	}
	public static Response Createadd_usecase(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"usecaseName\": \"test\",\r\n"
				+ "    \"usecaseId\": null\r\n"
				+ "}")
		.when()
		.post(Routes.post125_url);
		
		return response;
	}
	public static Response Createdelete_usecase(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"usecaseId\": 1\r\n"
				+ "}")
		.when()
		.post(Routes.post126_url);
		
		return response;
	}
	public static Response Createadd_rule(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"usecaseId\": 2,\r\n"
				+ "    \"ruleName\": \"test\",\r\n"
				+ "    \"ruleId\": null\r\n"
				+ "}")
		.when()
		.post(Routes.post127_url);
		
		return response;
	}
	public static Response Createdelete_rule(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"ruleId\": 1\r\n"
				+ "}")
		.when()
		.post(Routes.post128_url);
		
		return response;
	}
	public static Response Createget_feeds(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post129_url);
		
		return response;
	}
	public static Response Createget_advisory(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"start_date\": \"2023-07-01\",\r\n"
				+ "    \"end_date\": \"2023-07-18\"\r\n"
				+ "}")
		.when()
		.post(Routes.post130_url);
		
		return response;
	}
	
	
//	public static Response Createget_feeds()
//	{
//		String Access_Token = LoginAPI.Createlogin();
//        Response response = given()
//		.header("Authorization", "Bearer " + Access_Token)
//	    .contentType(ContentType.JSON) 
//		.accept(ContentType.JSON)
//		.body("{\r\n"
//				+ "    \"start_date\": \"2023-07-01\",\r\n"
//				+ "    \"end_date\": \"2023-07-18\"\r\n"
//				+ "}")
//		.when()
//		.post(Routes.post132_url);
		
		//return response;
	//}
	public static Response Createadd_predefined_function()
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"updatedData\":[\r\n"
				+ "        {\r\n"
				+ "        \"functionId\":\"predefined-1\",\r\n"
				+ "        \"functionName\":\"sita_function1\",\r\n"
				+ "        \"process\":[\r\n"
				+ "                {\r\n"
				+ "                    \"processName\":\"sita_process1\",\r\n"
				+ "                    \"isuserDef\":\"False\"\r\n"
				+ "                },\r\n"
				+ "                {\r\n"
				+ "                    \"processName\":\"sita_process2\",\r\n"
				+ "                    \"isuserDef\":\"False\"\r\n"
				+ "                }\r\n"
				+ "            ]\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "        \"functionId\":\"predefined-2\",\r\n"
				+ "        \"functionName\":\"sita_function2\",\r\n"
				+ "        \"process\":[\r\n"
				+ "                {\r\n"
				+ "                    \"processName\":\"sita_process3\",\r\n"
				+ "                    \"isuserDef\":\"False\"\r\n"
				+ "                },\r\n"
				+ "                {\r\n"
				+ "                    \"processName\":\"sita_process4\",\r\n"
				+ "                    \"isuserDef\":\"False\"\r\n"
				+ "                }\r\n"
				+ "            ]\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}")
		.when()
		.post(Routes.post131_url);
		
		return response;
	}
	
	public static Response CreateUser_Create(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"userId\":null,\r\n"
				+ "    \"schemaName\":\"mango\",\r\n"
				+ "    \"firstName\":\"FirstName\",\r\n"
				+ "    \"lastName\":\"LastName\",\r\n"
				+ "    \"email\":\"myemail111@gmail.com\",\r\n"
				+ "    \"isAdmin\":\"True\",\r\n"
				+ "    \"role\":\"ClientAdmin\",\r\n"
				+ "    \"password\":\"12345678\"\r\n"
				+ "}")
		.when()
		.post(Routes.post132_url);
		
		return response;
	}
	
	public static Response Createfetchrisk_journey(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"page\":2\r\n"
				+ "}")
		.when()
		.post(Routes.post133_url);
		
		return response;
	}
	
	public static Response Createdeletepredefined_function(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"functionId\":\"preDefFunction-2\"\r\n"
				+ "}")
		.when()
		.post(Routes.post134_url);
		
		return response;
	}
	
	public static Response Createupdate_entity_status(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\"page\":1}")
		.when()
		.post(Routes.post135_url);
		
		return response;
	}
	
	public static Response Createget_pdf(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post136_url);
		
		return response;
	}
	
	public static Response Createget_pdf_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post137_url);
		
		return response;
	}
	
	public static Response Createget_excel_template(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post138_url);
		
		return response;
	}
	
	public static Response Createmaster_filters(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post139_url);
		
		return response;
	}
	
	public static Response Createget_function_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"header_filters\": {\r\n"
				+ "        \"geo_location\": [],\r\n"
				+ "        \"function\": [],\r\n"
				+ "        \"process\": [],\r\n"
				+ "        \"asset\": []\r\n"
				+ "    }\r\n"
				+ "}")
		.when()
		.post(Routes.post140_url);
		
		return response;
	}
	
	
	public static Response Createget_process_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"header_filters\": {\r\n"
				+ "        \"geo_location\": [],\r\n"
				+ "        \"function\": [],\r\n"
				+ "        \"process\": [],\r\n"
				+ "        \"asset\": []\r\n"
				+ "    }\r\n"
				+ "}")
		.when()
		.post(Routes.post141_url);
		
		return response;
	}
	
	public static Response Createget_heat_map_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"header_filters\": {\r\n"
				+ "        \"geo_location\": [],\r\n"
				+ "        \"function\": [],\r\n"
				+ "        \"process\": [],\r\n"
				+ "        \"asset\": []\r\n"
				+ "    }\r\n"
				+ "}")
		.when()
		.post(Routes.post142_url);
		
		return response;
	}
	
	public static Response Createget_risk_aggregation(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"header_filters\": {\r\n"
				+ "        \"geo_location\": [],\r\n"
				+ "        \"function\": [],\r\n"
				+ "        \"process\": [],\r\n"
				+ "        \"asset\": []\r\n"
				+ "    }\r\n"
				+ "}")
		.when()
		.post(Routes.post143_url);
		
		return response;
	}
	
	public static Response Createget_risk_aggr_bar_chart_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"header_filters\": {\r\n"
				+ "        \"geo_location\": [],\r\n"
				+ "        \"function\": [],\r\n"
				+ "        \"process\": [],\r\n"
				+ "        \"asset\": []\r\n"
				+ "    }\r\n"
				+ "}")
		.when()
		.post(Routes.post144_url);
		
		return response;
	}
	
	public static Response Createrisk_screen_details_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"screen_id\": 8\r\n"
				+ "}")
		.when()
		.post(Routes.post145_url);
		
		return response;
	}
	
	public static Response Createupdate_risk_configuration(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"screen_type\": \"CONTROL_CONF\",\r\n"
				+ "    \"payload\": {\r\n"
				+ "        \"screen_id\": 1,\r\n"
				+ "        \"screen_name\": \"Active Directory\",\r\n"
				+ "        \"questions\": [\r\n"
				+ "            {\r\n"
				+ "                \"question_id\": 2,\r\n"
				+ "                \"selected_option\": 2\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"question_id\": 3,\r\n"
				+ "                \"selected_option\": 3\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"question_id\": 4,\r\n"
				+ "                \"selected_option\": 2\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"question_id\": 5,\r\n"
				+ "                \"selected_option\": 2\r\n"
				+ "            }\r\n"
				+ "        ]\r\n"
				+ "    }\r\n"
				+ "}")
		.when()
		.post(Routes.post146_url);
		
		return response;
	}
	
	
	public static Response Createrisk_screen_details(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"screen_id\": 2\r\n"
				+ "}")
		.when()
		.post(Routes.post147_url);
		
		return response;
	}
	

	public static Response Createcreate_update_entity(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"companyId\": 1,\r\n"
				+ "    \"companyName\": \"Samta\",\r\n"
				+ "    \"companyLogo\": null,\r\n"
				+ "    \"companyLocations\": [\r\n"
				+ "        {\r\n"
				+ "            \"locationId\": \"2\",\r\n"
				+ "            \"countryobj\": {\r\n"
				+ "                \"id\": 101,\r\n"
				+ "                \"iso2\": \"IN\",\r\n"
				+ "                \"name\": \"India\"\r\n"
				+ "            },\r\n"
				+ "            \"city\": \"Bengaluru\",\r\n"
				+ "            \"cityobj\": {\r\n"
				+ "                \"id\": 57933,\r\n"
				+ "                \"name\": \"Bengaluru\"\r\n"
				+ "            },\r\n"
				+ "            \"state\": \"Karnataka\",\r\n"
				+ "            \"stateobj\": {\r\n"
				+ "                \"id\": 4026,\r\n"
				+ "                \"iso2\": \"KA\",\r\n"
				+ "                \"name\": \"Karnataka\"\r\n"
				+ "            },\r\n"
				+ "            \"country\": \"India\",\r\n"
				+ "            \"office\": \"ghij\",\r\n"
				+ "            \"position\": {\r\n"
				+ "                \"lat\": 12.96614,\r\n"
				+ "                \"lng\": 77.58694\r\n"
				+ "            }\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"countryobj\": {\r\n"
				+ "                \"id\": 101,\r\n"
				+ "                \"name\": \"India\",\r\n"
				+ "                \"iso2\": \"IN\"\r\n"
				+ "            },\r\n"
				+ "            \"stateobj\": {\r\n"
				+ "                \"id\": 4031,\r\n"
				+ "                \"name\": \"Chandigarh\",\r\n"
				+ "                \"iso2\": \"CH\"\r\n"
				+ "            },\r\n"
				+ "            \"cityobj\": {\r\n"
				+ "                \"id\": 133386,\r\n"
				+ "                \"name\": \"Patna\"\r\n"
				+ "            },\r\n"
				+ "            \"country\": \"India\",\r\n"
				+ "            \"state\": \"Chandigarh\",\r\n"
				+ "            \"city\": \"Patna\",\r\n"
				+ "            \"office\": \"Patna \",\r\n"
				+ "            \"locationId\": \"3\",\r\n"
				+ "            \"position\": {\r\n"
				+ "                \"lat\": null,\r\n"
				+ "                \"lng\": null\r\n"
				+ "            }\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"no_of_employee\": 25\r\n"
				+ "}")
		.when()
		.post(Routes.post148_url);
		
		return response;
	}
	
	public static Response Createget_entity(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{}")
		.when()
		.post(Routes.post149_url);
		
		return response;
	}
	
	
	public static Response Createadd_custom_function(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"functionId\": \"4c82b6a6-a6ce-45ec\",\r\n"
				+ "    \"functionName\": \"network\"\r\n"
				+ "}")
		.when()
		.post(Routes.post150_url);
		
		return response;
	}
	
	public static Response Createdelete_custom_process(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"parentFunctionId\": \"72473f39-f18c-4fae\",\r\n"
				+ "    \"processId\": \"5ca939b7-feca-4d9e\"\r\n"
				+ "}")
		.when()
		.post(Routes.post151_url);
		
		return response;
	}
	
	
	public static Response create_entity_function_process(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"updatedData\": [\r\n"
				+ "        {\r\n"
				+ "            \"id\": 1,\r\n"
				+ "            \"functionId\": \"3a1b2faf-da45-4e1a\",\r\n"
				+ "            \"isuserDef\": true,\r\n"
				+ "            \"functionColor\": \"#FFFF00\",\r\n"
				+ "            \"functionName\": \"Undefined\",\r\n"
				+ "            \"process\": [\r\n"
				+ "                {\r\n"
				+ "                    \"id\": 1,\r\n"
				+ "                    \"processId\": \"0a893f43-2669-4816\",\r\n"
				+ "                    \"isuserDef\": true,\r\n"
				+ "                    \"processName\": \"Undefined\",\r\n"
				+ "                    \"processColor\": \"#FFFF00\",\r\n"
				+ "                    \"parentId\": \"3a1b2faf-da45-4e1a\"\r\n"
				+ "                }\r\n"
				+ "            ]\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"id\": 2,\r\n"
				+ "            \"functionId\": \"f6bb7883-7542-4953\",\r\n"
				+ "            \"isuserDef\": true,\r\n"
				+ "            \"functionColor\": \"#FFFF00\",\r\n"
				+ "            \"functionName\": \"  Information Technology \",\r\n"
				+ "            \"process\": [\r\n"
				+ "                {\r\n"
				+ "                    \"id\": 2,\r\n"
				+ "                    \"processId\": \"7b03faf0-4301-4b78\",\r\n"
				+ "                    \"isuserDef\": true,\r\n"
				+ "                    \"processName\": \"  Data Center  \",\r\n"
				+ "                    \"processColor\": \"#FFFF00\",\r\n"
				+ "                    \"parentId\": \"f6bb7883-7542-4953\"\r\n"
				+ "                }\r\n"
				+ "            ]\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}")
		.when()
		.post(Routes.post152_url);
		
		return response;
	}
	
	

	
	
	public static Response create_entity_assets(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"assetTableData\": [\r\n"
				+ "        {\r\n"
				+ "            \"assetId\": null,\r\n"
				+ "            \"assetName\": \"Test\",\r\n"
				+ "            \"functionData\": {\r\n"
				+ "                \"functionId\": \"3a1b2faf-da45-4e1a\",\r\n"
				+ "                \"functionName\": \"Undefined\",\r\n"
				+ "                \"processes\": [\r\n"
				+ "                    {\r\n"
				+ "                        \"id\": 1,\r\n"
				+ "                        \"processId\": \"0a893f43-2669-4816\",\r\n"
				+ "                        \"isuserDef\": true,\r\n"
				+ "                        \"processName\": \"Undefined\",\r\n"
				+ "                        \"processColor\": \"#FFFF00\",\r\n"
				+ "                        \"parentId\": \"3a1b2faf-da45-4e1a\"\r\n"
				+ "                    }\r\n"
				+ "                ]\r\n"
				+ "            },\r\n"
				+ "            \"location\": {\r\n"
				+ "                \"locationId\": 1,\r\n"
				+ "                \"locationName\": \"abcd, Patna, Bihar, India\"\r\n"
				+ "            },\r\n"
				+ "            \"category\": {\r\n"
				+ "                \"categoryId\": 5,\r\n"
				+ "                \"categoryName\": \"Cloud\",\r\n"
				+ "                \"subcategory\": {\r\n"
				+ "                    \"subcategoryId\": 20,\r\n"
				+ "                    \"subcategoryName\": \"Cloud\"\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            \"type\": {\r\n"
				+ "                \"typeId\": 8,\r\n"
				+ "                \"typeName\": \"IaaS\",\r\n"
				+ "                \"subtype\": {\r\n"
				+ "                    \"subtypeId\": 53,\r\n"
				+ "                    \"subtypeName\": \"Any Version IaaS\"\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            \"tags\": [],\r\n"
				+ "            \"is_internal\": true\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}")
		.when()
		.post(Routes.post153_url);
		
		return response;
	}
	
	

	
	public static Response Createdelete_asset(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"assetId\": 3\r\n"
				+ "}")
		.when()
		.post(Routes.post154_url);
		
		return response;
	}
	public static Response Createget_entity_function_process(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{}")
		.when()
		.post(Routes.post155_url);
		
		return response;
	}
	
	public static Response Createupdate_vulnerability_master(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post156_url);
		
		return response;
	}
	
	public static Response Createmaster_vulnerability_grid(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post157_url);
		
		return response;
	}
	
	public static Response Createget_asset_summary(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{}")
		.when()
		.post(Routes.post158_url);
		
		return response;
	}
	
	public static Response Createadd_update_rgu_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"data\": [\r\n"
				+ "        {\r\n"
				+ "            \"id\": null,\r\n"
				+ "            \"revenue\": \"0\",\r\n"
				+ "            \"revenue_unit\": \"$\",\r\n"
				+ "            \"rgu_name\": \"samta\",\r\n"
				+ "            \"rgu_color\": \"#335ec9\",\r\n"
				+ "            \"functions_processes\": []\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}")
		.when()
		.post(Routes.post159_url);
		
		return response;
	}
	
	public static Response Createdelete_rgu_data(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"id\": 1\r\n"
				+ "}")
		.when()
		.post(Routes.post160_url);
		
		return response;
	}
	
	public static Response Createadd_predefined_type(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post161_url);
		
		return response;
	}
	
	public static Response Createadd_package(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post162_url);
		
		return response;
	}

	public static Response Createsecurity_pulse_record_delete(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post163_url);
		
		return response;
	}
	
	public static Response Createadd_update_tmf_factor(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"id\": null,\r\n"
				+ "    \"category\": {\r\n"
				+ "        \"categoryId\": 6,\r\n"
				+ "        \"categoryName\": \"Application\",\r\n"
				+ "        \"subcategory\": {\r\n"
				+ "            \"subcategoryId\": 22,\r\n"
				+ "            \"subcategoryName\": \"Cloud\"\r\n"
				+ "        }\r\n"
				+ "    },\r\n"
				+ "    \"type\": {\r\n"
				+ "        \"typeId\": 21,\r\n"
				+ "        \"typeName\": \"Admin\",\r\n"
				+ "        \"subtype\": {\r\n"
				+ "            \"subtypeId\": 44,\r\n"
				+ "            \"subtypeName\": \"Any Admin OS\"\r\n"
				+ "        }\r\n"
				+ "    },\r\n"
				+ "    \"tmfFactor\": []\r\n"
				+ "}")
		.when()
		.post(Routes.post164_url);
		
		return response;
	}
	
	public static Response Createadvisory_pdf(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post165_url);
		
		return response;
	}
	
	public static Response Createupdate_customer(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post166_url);
		
		return response;
	}
	public static Response Createchange_customer_package(String url)
	{
		String Access_Token = LoginAPI.Createlogin();
        Response response = given()
		.header("Authorization", "Bearer " + Access_Token)
	    .contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
		//.body("")
		.when()
		.post(Routes.post167_url);
		
		return response;
	}
	}
	


