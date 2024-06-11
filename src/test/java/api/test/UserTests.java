package api.test;


import java.io.IOException;

	import java.io.IOException;

import org.testng.Assert;
	import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
	import com.github.javafaker.Faker;

	//import api.endpoints.TestSuiteSetup;
	import api.endpoints.UserEndPoints;
	import api.payload.User;
	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import AccessToken.ConfigReader;
	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import utils.ExtentReportManager;
	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;

	import static io.restassured.RestAssured.given;
	@Test
	public class UserTests  {

		private ExtentReports extent;
	    private ExtentTest test;
	    
		Faker faker;
		  User userpayload;

	    @BeforeClass
	    public void setUp() {
	        extent = ExtentReportManager.getInstance();
	    }

	    @AfterClass
	    public void tearDown() {
	        extent.flush();
	    }
		
		

		  
		{
			faker=new Faker();
			userpayload=new User();
			userpayload.setEmail(faker.internet().safeEmailAddress());
			userpayload.setFirst_name(faker.name().firstName());
			userpayload.setLast_name(faker.name().lastName());
		    userpayload.setIs_admin(faker.name().toString());
			userpayload.setRole_id(faker.idNumber().hashCode());
			userpayload.setRole(faker.name().toString());;
			userpayload.setPhone_number(faker.phoneNumber().cellPhone());
			userpayload.setTheme_preference(faker.name().toString());
			userpayload.setLanguage(faker.name().toString());
		
		}
		
	   
		//@Test(priority=1)
		//public void testlogin()
		//{
			//Response response=UserEndPoints.Createlogin();
	  		//response.then().log().all();
	  		//response.then().log().body().statusCode(200);
	  	  // Assert.assertEquals(response.getStatusCode(),200);
	  	   //response.prettyPrint("access_token");
	  	  // response.print();
			
		//}
		
		
 @Test(dataProvider = "empdateprovider")
    public void testuserchangepassword(String url) {
        test = extent.createTest("testPostpassword");
        Response response = UserEndPoints.Createuserchangepassword(url);
        test.log(Status.INFO, "Request URL: " + url);
        test.log(Status.INFO, "Response: " + response.prettyPrint());
        Assert.assertEquals(response.getStatusCode(), 200);
    }

//    @Test(dataProvider = "empdateprovider")
//   public void testresetpassword(String url) {
//       test = extent.createTest("testresetpassword");
//        Response response = UserEndPoints.Createresetpassword(url);
//       test.log(Status.INFO, "Request URL: " + url);
//   test.log(Status.INFO, "Response: " + response.prettyPrint());
//        Assert.assertEquals(response.getStatusCode(), 200);
//    }

   
      @Test(dataProvider="empdateprovider")
		public void testUpdatePassword(String url) {
        test = extent.createTest("testUpdatePassword");
			Response response=UserEndPoints.CreateUpdatepassword(url); 
		    response.then().log().all(); 
		    Assert.assertEquals(response.getStatusCode(), 200); 
		}
      
          
		@Test(dataProvider="empdateprovider")
		public void testadd_security_pulserecord(String url) {
			test = extent.createTest("testadd_security_pulserecord");
			Response response=UserEndPoints.Createaddsecuritypulserecord(url); 
		    response.then().log().all(); 
		    Assert.assertEquals(response.getStatusCode(), 200); 
		}

	   @Test(dataProvider="empdateprovider")
	     void testpredefinedfunction(String url)
		{
		   test = extent.createTest("testpredefinedfunction");
			Response response=UserEndPoints.Createpredefinedfunction(url);
			response.then().log().all();
			Assert.assertEquals(response.getStatusCode(),200);
		}

		@Test(dataProvider="empdateprovider")
		  void testentity_creation(String url)
		{
			test = extent.createTest("testentity_creation");
			Response response=UserEndPoints.Createentity_creation(url);
			response.then().log().all();
			Assert.assertEquals(response.getStatusCode(),200);
		}

		@Test(dataProvider="empdateprovider")
		 void testentity_function_process(String url)
		{
			test = extent.createTest("testentity_function_process");
			Response response=UserEndPoints.Createentity_function_process(url);
			response.then().log().all();
			Assert.assertEquals(response.getStatusCode(),200);
		}
		@Test(dataProvider="empdateprovider")
			 void testget_entity_assets(String url)
			{
			test = extent.createTest("testget_entity_assets");
				Response response=UserEndPoints.Createget_entity_assets(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			    //Assert.assertEquals(response.jsonPath().getString("response"), "You don't have permission.");
			   // Assert.assertEquals(response.jsonPath().getString("message"), "error");

			}
	
	     @Test(dataProvider="empdateprovider")
			public void testasset_risk(String url)
			{
				test = extent.createTest("testasset_risk");
				Response response=UserEndPoints.Createasset_risk(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testprocess_risk(String url)
			{
				test = extent.createTest("testprocess_risk");
				Response response=UserEndPoints.Createprocess_risk(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
		
		     
			@Test(dataProvider="empdateprovider")
			public void testfunction_risk(String url)
			{
				test = extent.createTest("testfunction_risk");
				Response response=UserEndPoints.Createfunction_risk(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testgeo_risk1(String url)
			{
				test = extent.createTest("testgeo_risk1");
				Response response=UserEndPoints.Creategeo_risk(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testget_all_dashboard_risk_data(String url)
			{
				test = extent.createTest("testget_all_dashboard_risk_data");
				Response response=UserEndPoints.Createget_all_dashboard_risk_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testAllAssets_avg_risk_details(String url)
			{
				test = extent.createTest("testAllAssets_avg_risk_details");
				Response response=UserEndPoints.CreateAllAssets_avg_risk_details(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testuploaded_data_status(String url)
			{
				test = extent.createTest("testuploaded_data_status");
				Response response=UserEndPoints.Createuploaded_data_status(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
		      @Test(dataProvider="empdateprovider")
		     public void testfetch_risk_journey(String url)
			{
		    	  test = extent.createTest("testfetch_risk_journey");
				Response response=UserEndPoints.Createfetch_risk_journey(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testupdate_risk_journey(String url)
			{
				test = extent.createTest("testupdate_risk_journey");
				Response response=UserEndPoints.Createupdate_risk_journey(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testreset_mfa_status(String url)
			{
				test = extent.createTest("testreset_mfa_status");
				Response response=UserEndPoints.Createreset_mfa_status(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			
			@Test(dataProvider="empdateprovider")
			public void testsource(String url)
			{
				test = extent.createTest("testsource");
				Response response=UserEndPoints.Createsource(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testwrapper(String url)
			{
				test = extent.createTest("testwrapper");
				Response response=UserEndPoints.Createwrapper(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			 @Test(dataProvider="empdateprovider")
			 public void testUser_Data(String url)
			{
				 test = extent.createTest("testUser_Data");
				Response response=UserEndPoints.CreateUser_Data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}

		    @Test(dataProvider="empdateprovider")
		  public void testtenant_list(String url)
			{
		    	test = extent.createTest("testtenant_list");
				Response response=UserEndPoints.Createtenant_list(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}

			@Test(dataProvider="empdateprovider")
			public void testCreate_tenant(String url)
			{
				test = extent.createTest("testCreate_tenant");
				Response response=UserEndPoints.CreateUser_Data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testSend_Mail(String url)
			{
				test = extent.createTest("testSend_Mail");
				Response response=UserEndPoints.CreateSend_Mail(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			
			@Test(dataProvider="empdateprovider")
			public void testuser_enable_disable(String url)
			{
				test = extent.createTest("testuser_enable_disable");
				Response response=UserEndPoints.Createuser_enable_disable(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testmfa_reset_Admin(String url)
			{
				test = extent.createTest("testmfa_reset_Admin");
				Response response=UserEndPoints.Createmfa_reset_Admin(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testpackages_list(String url)
			{
				test = extent.createTest("testpackages_list");
				Response response=UserEndPoints.Createpackages_list(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),403);
			}
			@Test(dataProvider="empdateprovider")
			public void testpredefined_category_type(String url)
			{
				test = extent.createTest("testpredefined_category_type");
				Response response=UserEndPoints.Createpredefined_category_type(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testget_tags(String url)
			{
				test = extent.createTest("testget_tags");
				Response response=UserEndPoints.Createget_tags(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			
			
			@Test(dataProvider="empdateprovider")
			public void testtenant_matrix(String url)
			{
				test = extent.createTest("testtenant_matrix");
				Response response=UserEndPoints.Createtenant_matrix(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
//			
			@Test(dataProvider="empdateprovider")
			public void testuser_matrix(String url)
			{
				test = extent.createTest("testuser_matrix");
				Response response=UserEndPoints.Createuser_matrix(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testsecurity_pulse_Data(String url)
			{
				test = extent.createTest("testsecurity_pulse_Data");
				Response response=UserEndPoints.Createsecurity_pulse_Data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testsecurity_pulse_grid_data(String url)
			{
				test = extent.createTest("testsecurity_pulse_grid_data");
				Response response=UserEndPoints.Createsecurity_pulse_grid_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testAdd_predefined_data(String url)
			{
				test = extent.createTest("testAdd_predefined_data");
				Response response=UserEndPoints.CreateAdd_predefined_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testmaster_function_process(String url)
			{
				test = extent.createTest("testmaster_function_process");
				Response response=UserEndPoints.Createmaster_function_process(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testmaster_function_update(String url)
			{
				test = extent.createTest("testmaster_function_update");
				Response response=UserEndPoints.Createmaster_function_update(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testmaster_function_delect(String url)
			{
				test = extent.createTest("testmaster_function_delect");
				Response response=UserEndPoints.Createmaster_function_delect(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testmaster_process_update(String url)
			{
				test = extent.createTest("testmaster_process_update");
				Response response=UserEndPoints.Createmaster_process_update(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			
			
			@Test(dataProvider="empdateprovider")
			public void testget_predefined_data(String url)
			{
				test = extent.createTest("testget_predefined_data");
				Response response=UserEndPoints.Createget_predefined_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			
			
			@Test(dataProvider="empdateprovider")
			public void testadd_new_predefined_function(String url)
			{
				test = extent.createTest("testadd_new_predefined_function");
				Response response=UserEndPoints.Createadd_new_predefined_function(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}

			@Test(dataProvider="empdateprovider")
			public void testfetch_new_predefined_function(String url)
			{
				test = extent.createTest("testfetch_new_predefined_function");
				Response response=UserEndPoints.Createfetch_new_predefined_function(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testcreate_predefined_process(String url)
			{
				test = extent.createTest("testcreate_predefined_process");
				Response response=UserEndPoints.Createcreate_predefined_process(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			
			
			@Test(dataProvider="empdateprovider")
			public void testepoch_time_convert(String url)
			{
				test = extent.createTest("testepoch_time_convert");
				Response response=UserEndPoints.Createepoch_time_convert(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),201);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testcsv_template_download(String url)
			{
				test = extent.createTest("testcsv_template_download");
				Response response=UserEndPoints.Createcsv_template_download(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testAdd_source_data_siem(String url)
			{
				test = extent.createTest("testAdd_source_data_siem");
				Response response=UserEndPoints.CreateAdd_source_data_siem(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testuser_enable_and_disable(String url)
			{
				test = extent.createTest("testuser_enable_and_disable");
				Response response=UserEndPoints.Createuser_enable_and_disable(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			

			@Test(dataProvider="empdateprovider")
			public void testget_entity_with_location(String url)
			{
				test = extent.createTest("testget_entity_with_location");
				Response response=UserEndPoints.Createget_entity_with_location(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testget_schema_language(String url)
			{
				test = extent.createTest("testget_schema_language");
				Response response=UserEndPoints.Createget_schema_language(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testlayout_update(String url)
			{
				test = extent.createTest("testlayout_update");
				Response response=UserEndPoints.Createlayout_update(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testlayout_fetch(String url)
			{
				test = extent.createTest("testlayout_fetch");
				Response response=UserEndPoints.Createlayout_fetch(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testget_rgu(String url)
			{
				test = extent.createTest("testget_rgu");
				Response response=UserEndPoints.Createget_rgu(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testasset_risk_change(String url)
			{
				test = extent.createTest("testasset_risk_change");
				Response response=UserEndPoints.Createasset_risk_change(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testtotal_investment_chart(String url)
			{
				test = extent.createTest("testtotal_investment_chart");
				Response response=UserEndPoints.Createtotal_investment_chart(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testget_location_data(String url)
			{
				test = extent.createTest("testget_location_data");
				Response response=UserEndPoints.Createget_location_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testget_asset_type_summary(String url)
			{
				test = extent.createTest("testget_asset_type_summary");
				Response response=UserEndPoints.Createget_asset_type_summary(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testseceon_services_list(String url)
			{
				test = extent.createTest("testseceon_services_list");
				Response response=UserEndPoints.Createseceon_services_list(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			
			@Test(dataProvider="empdateprovider")
			public void testupdate_risk_journey1(String url)
			{
				test = extent.createTest("testupdate_risk_journey1");
				Response response=UserEndPoints.Createupdate_risk_journey1(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testadd_security_pulse_record(String url)
			{
				test = extent.createTest("testadd_security_pulse_record");
				Response response=UserEndPoints.Createadd_security_pulse_record(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testentity_assets(String url)
			{
				test = extent.createTest("testentity_assets");
				Response response=UserEndPoints.Createentity_assets(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testgeo_risk(String url)
			{
				test = extent.createTest("testgeo_risk");
				Response response=UserEndPoints.Creategeo_risk(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testmfa_status_reset(String url)
			{
				test = extent.createTest("testmfa_status_reset");
				Response response=UserEndPoints.Createmfa_status_reset(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			
			@Test(dataProvider="empdateprovider")
			public void testwrapper1(String url)
			{
				test = extent.createTest("testwrapper1");
				Response response=UserEndPoints.Createwrapper1(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testSend_mail1(String url)
			{
				test = extent.createTest("testSend_mail1");
				Response response=UserEndPoints.CreateSend_mail1(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testuser_matrix1(String url)
			{
				test = extent.createTest("testuser_matrix1");
				Response response=UserEndPoints.Createuser_matrix1(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testsecurity_pulse_data1(String url)
			{
				test = extent.createTest("testsecurity_pulse_data1");
				Response response=UserEndPoints.Createsecurity_pulse_data1(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			
			@Test(dataProvider="empdateprovider")
			public void testget_asset_type_summary1(String url)
			{
				test = extent.createTest("testget_asset_type_summary1");
				Response response=UserEndPoints.Createget_asset_type_summary1(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testAdmin_reset_password(String url)
			{
				test = extent.createTest("testAdmin_reset_password");
				Response response=UserEndPoints.CreateAdmin_reset_password(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testUpdate_User_language(String url)
			{
				test = extent.createTest("testUpdate_User_language");
				Response response=UserEndPoints.CreateUpdate_User_language(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testoei_page_data_new(String url)
			{
				test = extent.createTest("testoei_page_data_new");
				Response response=UserEndPoints.Createoei_page_data_new(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testget_advisory_data(String url)
			{
				test = extent.createTest("testget_advisory_data");
				Response response=UserEndPoints.Createget_advisory_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testadd_source_data_siem(String url)
			{
				test = extent.createTest("testadd_source_data_siem");
				Response response=UserEndPoints.Createadd_source_data_siem(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testupdate_asset_type_summary(String url)
			{
				test = extent.createTest("testupdate_asset_type_summary");
				Response response=UserEndPoints.Createupdate_asset_type_summary(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testvulnerabilities_grid_view(String url)
			{
				test = extent.createTest("testvulnerabilities_grid_view");
				Response response=UserEndPoints.Createvulnerabilities_grid_view(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testvulnerabilities_master_grid_view(String url)
			{
				test = extent.createTest("testvulnerabilities_master_grid_view");
				Response response=UserEndPoints.Createvulnerabilities_master_grid_view(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testchange_tenant_package(String url)
			{
				test = extent.createTest("testchange_tenant_package");
				Response response=UserEndPoints.Createchange_tenant_package(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),403);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testchange_customer_data(String url)
			{
				test = extent.createTest("testchange_customer_data");
				Response response=UserEndPoints.Createchange_customer_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),403);
			}
			@Test(dataProvider="empdateprovider")
			public void testtenant_list1(String url)
			{
				test = extent.createTest("testtenant_list1");
				Response response=UserEndPoints.Createtenant_list1(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			//@Test(dataProvider="empdateprovider")
			//public void testpackages_list1(String url)
			{
				//Response response=UserEndPoints.Createpackages_list1(url);
				//response.then().log().all();
				//Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testadd_security_pulse_data(String url)
			{
				test = extent.createTest("testadd_security_pulse_data");
				Response response=UserEndPoints.Createadd_security_pulse_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testadd_security_pulse_data2(String url)
			{
				test = extent.createTest("testadd_security_pulse_data2");
				Response response=UserEndPoints.Createadd_security_pulse_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testpreference_input(String url)
			{
				test = extent.createTest("testpreference_input");
				Response response=UserEndPoints.Createpreference_input(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testpreference_fetch(String url)
			{
				test = extent.createTest("testpreference_fetch");
				Response response=UserEndPoints.Createpreference_fetch(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testtheme_preference_update(String url)
			{
				test = extent.createTest("testtheme_preference_update");
				Response response=UserEndPoints.Createtheme_preference_update(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testupdate_language(String url)
			{
				test = extent.createTest("testupdate_language");
				Response response=UserEndPoints.Createupdate_language(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testlayout(String url)
			{
				test = extent.createTest("testlayout");
				Response response=UserEndPoints.Createlayout(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testupdate_layout(String url)
			{
				test = extent.createTest("testupdate_layout");
				Response response=UserEndPoints.Createupdate_layout(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testreset_layout(String url)
			{
				test = extent.createTest("testreset_layout");
				Response response=UserEndPoints.Createreset_layout(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testreset_layout_admin(String url)
			{
				test = extent.createTest("testreset_layout_admin");
				Response response=UserEndPoints.Createreset_layout_admin(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),403);
			}
			@Test(dataProvider="empdateprovider")
			public void testfetch_risk_pages(String url)
			{
				test = extent.createTest("testfetch_risk_pages");
				Response response=UserEndPoints.Createfetch_risk_pages(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
		}
			@Test(dataProvider="empdateprovider")
			public void testfetch_risk_questions(String url)
			{
				test = extent.createTest("testfetch_risk_questions");
				Response response=UserEndPoints.Createfetch_risk_questions(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testadd_update_risk_question(String url)
			{
				test = extent.createTest("testadd_update_risk_question");
				Response response=UserEndPoints.Createadd_update_risk_question(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testdelete_risk_question(String url)
			{
				test = extent.createTest("testdelete_risk_question");
				Response response=UserEndPoints.Createdelete_risk_question(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testfaq(String url)
			{
				test = extent.createTest("testfaq");
				Response response=UserEndPoints.Createfaq(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testview_email_data(String url)
			{
				test = extent.createTest("testview_email_data");
				Response response=UserEndPoints.Createview_email_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testcreate_update_email_data(String url)
			{
				test = extent.createTest("testcreate_update_email_data");
				Response response=UserEndPoints.Createcreate_update_email_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testdelete_email_data(String url)
			{
				test = extent.createTest("testdelete_email_data");
				Response response=UserEndPoints.Createdelete_email_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testreactive_email_data(String url)
			{
				test = extent.createTest("testreactive_email_data");
				Response response=UserEndPoints.Createreactive_email_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testrcontact_us(String url)
			{
				test = extent.createTest("testrcontact_us");
				Response response=UserEndPoints.Createcontact_us(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testadd_source(String url)
			{
				test = extent.createTest("testadd_source");
				Response response=UserEndPoints.Createadd_source(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testtenant_lang(String url)
			{
				test = extent.createTest("testtenant_lang");
				Response response=UserEndPoints.Createtenant_lang(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testentity_predefined_function(String url)
			{
				test = extent.createTest("testentity_predefined_function");
				Response response=UserEndPoints.Createentity_predefined_function(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testget_predefined_category(String url)
			{
				test = extent.createTest("testget_predefined_category");
				Response response=UserEndPoints.Createget_predefined_category(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testget_predefined_type(String url)
			{
				test = extent.createTest("testget_predefined_type");
				Response response=UserEndPoints.Createget_predefined_type(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testcreate_predefined_function(String url)
			{
				test = extent.createTest("testcreate_predefined_function");
				Response response=UserEndPoints.Createcreate_predefined_function(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testdelete_predefined_function(String url)
			{
				test = extent.createTest("testdelete_predefined_function");
				Response response=UserEndPoints.Createdelete_predefined_function(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testtenant_data_status(String url)
			{
				test = extent.createTest("testtenant_data_status");
				Response response=UserEndPoints.Createtenant_data_status(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testfetch_predefined_data(String url)
			{
				test = extent.createTest("testfetch_predefined_data");
				Response response=UserEndPoints.Createfetch_predefined_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testadd_tenant(String url)
			{
				test = extent.createTest("testadd_tenant");
				Response response=UserEndPoints.Createadd_tenant(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),403);
			}
			@Test(dataProvider="empdateprovider")
			public void testpackages(String url)
			{
				test = extent.createTest("testpackages");
				Response response=UserEndPoints.Createpackages(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),403);
			}
			@Test(dataProvider="empdateprovider")
			public void testsecurity_pulse_details_data(String url)
			{
				test = extent.createTest("testsecurity_pulse_details_data");
				Response response=UserEndPoints.Createsecurity_pulse_details_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testfetch_predefined_category(String url)
			{
				test = extent.createTest("testfetch_predefined_category");
				Response response=UserEndPoints.Createfetch_predefined_category(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testcreate_category(String url)
			{
				test = extent.createTest("testcreate_category");
				Response response=UserEndPoints.Createcreate_category(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testcreate_subcategory(String url)
			{
				test = extent.createTest("testcreate_subcategory");
				Response response=UserEndPoints.Createcreate_subcategory(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testdelete_category(String url)
			{
				test = extent.createTest("testdelete_category");
				Response response=UserEndPoints.Createdelete_category(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testdelete_subcategory(String url)
			{
				test = extent.createTest("testdelete_subcategory");
				Response response=UserEndPoints.Createdelete_subcategory(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testfetch_predefined_type(String url)
			{
				test = extent.createTest("testfetch_predefined_type");
				Response response=UserEndPoints.Createfetch_predefined_type(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testcreate_subtype(String url)
			{
				test = extent.createTest("testcreate_subtype");
				Response response=UserEndPoints.Createcreate_subtype(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testcdelete_subtype(String url)
			{
				test = extent.createTest("testcdelete_subtype");
				Response response=UserEndPoints.Createdelete_subtype(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testcreate_tag(String url)
			{
				test = extent.createTest("testcreate_tag");
				Response response=UserEndPoints.Createcreate_tag(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testdelete_tag(String url)
			{
				test = extent.createTest("testdelete_tag");
				Response response=UserEndPoints.Createdelete_tag(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testget_tmf_data(String url)
			{
				test = extent.createTest("testget_tmf_data");
				Response response=UserEndPoints.Createget_tmf_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testdelete_tmf_factor(String url)
			{
				test = extent.createTest("testdelete_tmf_factor");
				Response response=UserEndPoints.Createdelete_tmf_factor(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testget_usecase(String url)
			{
				test = extent.createTest("testget_usecase");
				Response response=UserEndPoints.Createget_usecase(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testadd_usecase(String url)
			{
				test = extent.createTest("testadd_usecase");
				Response response=UserEndPoints.Createadd_usecase(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testdelete_usecase(String url)
			{
				test = extent.createTest("testdelete_usecase");
				Response response=UserEndPoints.Createdelete_usecase(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testadd_rule(String url)
			{
				test = extent.createTest("testadd_rule");
				Response response=UserEndPoints.Createadd_rule(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testdelete_rule(String url)
			{
				test = extent.createTest("testdelete_rule");
				Response response=UserEndPoints.Createdelete_rule(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testget_feeds(String url)
			{
				test = extent.createTest("testget_feeds");
				Response response=UserEndPoints.Createget_feeds(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testget_advisory(String url)
			{
				test = extent.createTest("testget_advisory");
				Response response=UserEndPoints.Createget_advisory(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testadd_predefined_function(String url)
			{
				test = extent.createTest("add_predefined_function");
				Response response=UserEndPoints.Createadd_predefined_function();
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}

			@Test(dataProvider="empdateprovider")
			public void testUser_Create(String url)
			{
				test = extent.createTest("User_Create");
				Response response=UserEndPoints.CreateUser_Create(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			

			@Test(dataProvider="empdateprovider")
			public void testfetchrisk_journey(String url)
			{
				test = extent.createTest("fetchrisk_journey");
				Response response=UserEndPoints.Createfetchrisk_journey(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testdeletepredefined_function(String url)
			{
				test = extent.createTest("deletepredefined_function");
				Response response=UserEndPoints.Createdeletepredefined_function(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}

			@Test(dataProvider="empdateprovider")
			public void testupdate_entity_status(String url)
			{
				test = extent.createTest("update_entity_status");
				Response response=UserEndPoints.Createupdate_entity_status(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testget_pdf(String url)
			{
				test = extent.createTest("get_pdf");
				Response response=UserEndPoints.Createget_pdf(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testget_pdf_data(String url)
			{
				test = extent.createTest("get_pdf_data");
				Response response=UserEndPoints.Createget_pdf_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testget_excel_template(String url)
			{
				test = extent.createTest("get_excel_template");
				Response response=UserEndPoints.Createget_excel_template(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testmaster_filters(String url)
			{
				test = extent.createTest("master_filters");
				Response response=UserEndPoints.Createmaster_filters(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testget_function_data(String url)
			{
				test = extent.createTest("get_function_data");
				Response response=UserEndPoints.Createget_function_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testget_process_data(String url)
			{
				test = extent.createTest("get_process_data");
				Response response=UserEndPoints.Createget_process_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testget_heat_map_data(String url)
			{
				test = extent.createTest("get_heat_map_data");
				Response response=UserEndPoints.Createget_heat_map_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testget_risk_aggregation(String url)
			{
				test = extent.createTest("get_risk_aggregation");
				Response response=UserEndPoints.Createget_risk_aggregation(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testget_risk_aggr_bar_chart_data(String url)
			{
				test = extent.createTest("get_risk_aggr_bar_chart_data");
				Response response=UserEndPoints.Createget_risk_aggr_bar_chart_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testrisk_screen_details_data(String url)
			{
				test = extent.createTest("risk_screen_details_data");
				Response response=UserEndPoints.Createrisk_screen_details_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testupdate_risk_configuration(String url)
			{
				test = extent.createTest("update_risk_configuration");
				Response response=UserEndPoints.Createupdate_risk_configuration(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testrisk_screen_details(String url)
			{
				test = extent.createTest("risk_screen_details");
				Response response=UserEndPoints.Createrisk_screen_details(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			
			@Test(dataProvider="empdateprovider")
			public void testcreate_update_entity(String url)
			{
				test = extent.createTest("create_update_entity");
				Response response=UserEndPoints.Createcreate_update_entity(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			

			@Test(dataProvider="empdateprovider")
			public void testget_entity(String url)
			{
				test = extent.createTest("get_entity");
				Response response=UserEndPoints.Createget_entity(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			

			@Test(dataProvider="empdateprovider")
			public void testadd_custom_function(String url)
			{
				test = extent.createTest("add_custom_function");
				Response response=UserEndPoints.Createadd_custom_function(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			
			@Test(dataProvider="empdateprovider")
			public void testdelete_custom_process(String url)
			{
				test = extent.createTest("delete_custom_process");
				Response response=UserEndPoints.Createdelete_custom_process(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			
			@Test(dataProvider="empdateprovider")
			public void testcreate_entity_function_proces(String url)
			{
				test = extent.createTest("create_entity_function_proces");
				Response response=UserEndPoints.create_entity_function_process(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			
			@Test(dataProvider="empdateprovider")
			public void testcreate_entity_assets(String url)
			{
				test = extent.createTest("create_entity_assets");
				Response response=UserEndPoints.create_entity_assets(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testCreatedelete_asset(String url)
			{
				test = extent.createTest("delete_asset");
				Response response=UserEndPoints.Createdelete_asset(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testget_entity_function_process(String url)
			{
				test = extent.createTest("get_entity_function_process");
				Response response=UserEndPoints.Createget_entity_function_process(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}

			@Test(dataProvider="empdateprovider")
			public void testupdate_vulnerability_master(String url)
			{
				test = extent.createTest("update_vulnerability_master");
				Response response=UserEndPoints.Createupdate_vulnerability_master(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}

			@Test(dataProvider="empdateprovider")
			public void testmaster_vulnerability_grid(String url)
			{
				test = extent.createTest("master_vulnerability_grid");
				Response response=UserEndPoints.Createmaster_vulnerability_grid(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testget_asset_summary(String url)
			{
				test = extent.createTest("get_asset_summary");
				Response response=UserEndPoints.Createget_asset_summary(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testadd_update_rgu_data(String url)
			{
				test = extent.createTest("add_update_rgu_data");
				Response response=UserEndPoints.Createadd_update_rgu_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testdelete_rgu_data(String url)
			{
				test = extent.createTest("delete_rgu_data");
				Response response=UserEndPoints.Createdelete_rgu_data(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
//			@Test(dataProvider="empdateprovider")
//			public void testadd_predefined_type(String url)
//			{
//				test = extent.createTest("add_predefined_type");
//				Response response=UserEndPoints.Createadd_predefined_type(url);
//				response.then().log().all();
//				Assert.assertEquals(response.getStatusCode(),403);
//			}
			
			@Test(dataProvider="empdateprovider")
			public void testadd_package(String url)
			{
				test = extent.createTest("add_package");
				Response response=UserEndPoints.Createadd_package(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),403);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testsecurity_pulse_record_delete(String url)
			{
				test = extent.createTest("security_pulse_record_delete");
				Response response=UserEndPoints.Createsecurity_pulse_record_delete(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testadd_update_tmf_factor(String url)
			{
				test = extent.createTest("add_update_tmf_factor");
				Response response=UserEndPoints.Createadd_update_tmf_factor(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			@Test(dataProvider="empdateprovider")
			public void testadvisory_pdf(String url)
			{
				test = extent.createTest("advisory_pdf");
				Response response=UserEndPoints.Createadvisory_pdf(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testupdate_customer(String url)
			{
				test = extent.createTest("update_customer");
				Response response=UserEndPoints.Createupdate_customer(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),403);
			}
			
			@Test(dataProvider="empdateprovider")
			public void testchange_customer_package(String url)
			{
				test = extent.createTest("change_customer_package");
				Response response=UserEndPoints.Createchange_customer_package(url);
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),403);
			}
			
			
			
			
			
			
			

		
	@DataProvider(name="empdateprovider")
	 String[][] getEmpData()
	 {
		 String empdata[][]={{"https://exotel.uat.netrum-tech.com/api/v1"},{"https://outsourcingbpo.uat.netrum-tech.com/api/v1"},{"https://etek.uat.netrum-tech.com/api/v1"},{"https://eteklab.uat.netrum-tech.com/api/v1"},{"https://riopaila.uat.netrum-tech.com/api/v1"},{"https://rockman.uat.netrum-tech.com/api/v1"},{"https://netrum.uat.netrum-tech.com/api/v1"},{"https://bancounion.uat.netrum-tech.com/api/v1"},{"https://coasmedas.uat.netrum-tech.com/api/v1"},{"https://gecelca.uat.netrum-tech.com/api/n1"},{"https://segurosbolivar.uat.netrum-tech.com/api/v1"},{"https://fanalca.uat.netrum-tech.com/api/v1"},{"https://finesa.uat.netrum-tech.com/api/v1"},{"https://coltefinanciera.uat.netrum-tech.com/api/v1"},{"https://bnpparibas.uat.netrum-tech.com/api/v1"},{"https://gentera.uat.netrum-tech.com/api/v1"},{"https://tessolve.uat.netrum-tech.com/api/v1"},{"https://minicivil.uat.netrum-tech.com/api/v1"}};
			 return(empdata);
		 }
		
		

	
		
		
//		@DataProvider(name = "empdateprovider")
//		String[] getEmpData() throws IOException {
//		    String path = System.getProperty("user.dir") + "/src/test/java/api/test/UrlExel.xlsx";
//		    try {
//		        int rowCount = XLUtils.getRowCount(path, "Sheet1");
//		        String[] urls = new String[rowCount];
//		        for (int i = 1; i <= rowCount; i++) {
//		            urls[i - 1] = XLUtils.getCellData(path, "Sheet1", i, 0);
//		        }
//		        return urls;
//		    } catch (IOException e) {
//		        e.printStackTrace();
//		        throw new IOException("Error reading data from Excel file: " + e.getMessage());
//		    }
//		}




   

		}

			
			
			
			
		
	
	
		
	    