package api.endpoints;
import java.net.URI;




public class Routes2 {
	
	



		public static String base2_url="https://exotel.uat.netrum-tech.com/api/v1";
		

		
	    //login module
		public static String post1_url=base2_url+"/login/";
		
		//password 
		public static String post2_url=base2_url+"/user_change_password/";
		
		//Reset Password
		public static String post3_url=base2_url+"/admin/reset_mail/";
		
		//update Password
		public static String post4_url=base2_url+"/update_password/";
	  
	    //add_security_pulse_record
		public static String post5_url=base2_url+"/add_security_pulse_record/";
		
		//predefined_function
		public static String post6_url=base2_url+"/entity_predefined_function/";
		
		//entity_creation
		public static String post7_url=base2_url+"/entity_creation/";
		
		//entity_creation_update
		//public static String post8_url=base_url+"/entity_creation_update/";
		
		//entity_function_process
		public static String post8_url=base2_url+"/entity_function_process/";
		
		
		
		//get_entity_assets
		//public static String post9_url=base2_url+"/get_entity_assets/";


		//get_entity_assets
		public static String post9_url=base2_url+"/get_entity_assets/";

		//asset_risk
		public static String post10_url=base2_url+"/asset_risk/";
		
		//process_risk
		public static String post11_url=base2_url+"/process_risk/";
		
		//function_risk
		public static String post12_url=base2_url+"/function_risk/";

		 //geo_risk
		public static String post13_url=base2_url+"/get_all_data/";
		
		//get_all_dashboard_risk_data
		public static String post14_url=base2_url+"/get_all_data/";
		
		//AllAssets_avg_risk_details
		public static String post15_url=base2_url+"/avg_risk_details/";
	 
		//uploaded_data_status
		public static String post16_url=base2_url+"/uploaded_data_status/";
	   
		//fetch_risk_journey
		public static String post17_url=base2_url+"/fetch_risk_journey/";
		
		//update_risk_journey
		public static String post18_url=base2_url+"/update_risk_journey/";
	 
	  //reset_mfa_status
		public static String post19_url=base2_url+"/reset_mfa_status/";


		
		//source
		public static String post20_url=base2_url+"/source/";
	  
		//wrapper
		public static String post21_url=base2_url+"/wrapper/";
		
		//User_Data
	  public static String post22_url=base2_url+"/admin/users/";
	  
	  //tenant_list
	  public static String post23_url=base2_url+"/admin/tenant_list/";
		
		//Create_tenant
	  public static String post24_url=base2_url+"/admin/add_tenant/";
		
		//Send_Mail
	  public static String post25_url=base2_url+"/forget_password/";

	  
	   //user_enable_disable
	  public static String post26_url=base2_url+"/user_enable_disable/";
	  
	  //mfa_reset_Admin
	  public static String post27_url=base2_url+"/admin/mfa_reset/";
	  
	  //packages_list
	  public static String post28_url=base2_url+"/admin/packages/";
	  
	  //predefined_category_type
	  public static String post29_url=base2_url+"/get_predefined_category/";
	  
	 
	  
	  //get_tags
	  public static String post30_url=base2_url+"/get_tags/";
	  
	  //add_tags
	 // public static String post38_url=base_url+"/add_tags/";
	  
	  //tenant_matrix
	  public static String post31_url=base2_url+"/admin/tenant_data_status/";
	  
	  //user_matrix
	  public static String post32_url=base2_url+"/admin/user_matrix/";
	  
	  //security_pulse_Data
	  public static String post33_url=base2_url+"/security_pulse_details_data/";
	  
	  //security_pulse_grid_data
	  public static String post34_url=base2_url+"/security_pulse_grid_data/";
	  
	  //Add_predefined_data
	  public static String post35_url=base2_url+"/get_predefined_data/";
	 
	  //master_function_process
	  public static String post36_url=base2_url+"/master_function/";
	  
	   //master_function_update
	  public static String post37_url=base2_url+"/add_master_function/";
	  
	  //master_function_delect
	  public static String post38_url=base2_url+"/delete_master_function/";  
	  
	  //master_process_update
	  public static String post39_url=base2_url+"/add_master_process/";  
	  
	  //master_process_delect
	 // public static String post40_url=base_url+"/delete_master_process/";  
	    
	   //get_predefined_data
	  public static String post40_url=base2_url+"/get_predefined_data/";  
	   
	    
	  //add_new_predefined_function
	  public static String post41_url=base2_url+"/create_predefined_function/"; 
	    
	   //fetch_new_predefined_function
	   public static String post42_url=base2_url+"/fetch_predefined_function/";
	    
	    //create_predefined_process
	    public static String post43_url=base2_url+"/create_predefined_process/";
	    
	   
	    //admin_source_data_added
	   // public static String post44_url=base_url+"/add_source/";
	    
	   //epoch_time_convert
	    public static String post44_url=base2_url+"/epochtime_convert/";
	    
	    //csv_template_download
	    public static String post45_url=base2_url+"/get_excel_template/";
	  
	    //Add_source_data_siem
	    public static String post46_url=base2_url+"/source/";
	    
	    //user_enable_and_disable
	    public static String post47_url=base2_url+"/user_enable_disable/";
	    
	  
	   
	    
	    //get_entity_with_location
	    public static String post48_url=base2_url+"/get_entity/";
	   
	    //get_schema_language
	    public static String post49_url=base2_url+"/tenant_lang/";
	   
	    //layout_update
	    public static String post50_url=base2_url+"/update_layout/";
	   
	    //layout_fetch
	    public static String post51_url=base2_url+"/layout/";
	   
	    //get_rgu
	    public static String post52_url=base2_url+"/get_rgu_data/";
	     
	    //asset_risk_change
	    public static String post53_url=base2_url+"/asset_risk_update/";
	     
	   //total_investment_chart
	    public static String post54_url=base2_url+"/get_total_investment_chart/";
	     
	   //get_location_data
	    public static String post55_url=base2_url+"/get_risk_location_data/";
	     
	   //get_asset_type_summary
	    public static String post56_url=base2_url+"/get_asset_type_summary/"; 
	    
	   //seceon_services_list
	    public static String post57_url=base2_url+"/seceon_services/";
	     
	   //risk_aggr_chart
	  // public static String post58_url=base_url+"/get_risk_aggregation/";
	     
	//Part--- 2
		
	   //add_security_pulse_record
	   public static String post58_url=base2_url+"/add_security_pulse_record/";
	  
	   //entity_assets
	   public static String post59_url=base2_url+"/get_entity_assets/";
	  
	   //upload_assets_file
	   public static String post60_url=base2_url+"/upload_assets/";
	   
	   //geo_risk
	   public static String post61_url=base2_url+"/geo_risk/";
	  
	  //mfa_status_reset
	   public static String post62_url=base2_url+"/reset_mfa_status/";
	  
	  //wrapper
	  public static String post63_url=base2_url+"/wrapper/";
	   
	  //Send_mail
	  public static String post64_url=base2_url+"/forget_password/";
	  
	  //user_matrix
	  public static String post65_url=base2_url+"/admin/user_matrix/";
	  
	  //security_pulse_data1
	  public static String post66_url=base2_url+"/security_pulse_details_data/";
	  
	  //get_asset_type_summary
	  public static String post67_url=base2_url+"/get_asset_type_summary/";
	   
	 //Part-- 3
	  
	   //Admin_reset_password
	   public static String post68_url=base2_url+"/admin/reset_mail/";
	  
	  //Update_User_language
	   public static String post69_url=base2_url+"/update_language/";
	  
	  //oei_page_data_new
	   public static String post70_url=base2_url+"/oei_page_data/";
	  
	  //get_advisory_data
	   public static String post71_url=base2_url+"/get_advisory/";
	  
	  //add_source_data_siem
	   public static String post72_url=base2_url+"/source/";

	   //update_asset_type_summary
	   public static String post73_url=base2_url+"/update_asset_type_summary/";
	  
	  //vulnerabilities_grid_view
	   public static String post74_url=base2_url+"/vulnerabilities_grid/";
	  
	  //vulnerabilities_master_grid_view
	  public static String post75_url=base2_url+"/master_vulnerability_grid/";
	  
	  //change_tenant_package
	  public static String post76_url=base2_url+"/admin/change_customer_package/";
	  
	  //change_customer_data
	  public static String post77_url=base2_url+"/admin/update_customer/";
	  
	  //tenant_list
	  public static String post78_url=base2_url+"/admin/tenant_list/";
	  
	  //packages_list
	  public static String post79_url=base2_url+"/admin/packages/";
	  
	  //add_security_pulse_data
	  public static String post80_url=base2_url+"/add_security_pulse_record/";
	  
	  //update_risk_journey1
	  public static String put81_url=base2_url+"/update_risk_journey/";
	  
	//preference_input
	  public static String post82_url=base2_url+"/preference_input/";
	  
	//preference_fetch
	  public static String post83_url=base2_url+"/preference_fetch/";

	  //theme_preference_update
	  public static String post84_url=base2_url+"/theme_preference_update/";
	  
	  //update_language
	  public static String post85_url=base2_url+"/update_language/";
	  
	//layout
	  public static String post86_url=base2_url+"/layout/";
	 
	//update_layout
	  public static String post87_url=base2_url+"/update_layout/";
	  
	//reset_layout
	  public static String post88_url=base2_url+"/reset_layout/";
	  
	//reset_layout_admin
	  public static String post89_url=base2_url+"/reset_layout_admin/";
	  
	  //sita
	//fetch_risk_pages
	  public static String post90_url=base2_url+"/fetch_risk_pages/";
	  
	//fetch_risk_questions
	  public static String post91_url=base2_url+"/fetch_risk_questions/";
	  
	//add_update_risk_question
	  public static String post92_url=base2_url+"/add_update_risk_question/"; 
	  
	//delete_risk_question
	  public static String post93_url=base2_url+"/delete_risk_question/"; 
	 
	//faq
	  public static String post94_url=base2_url+"/faq/"; 

	//view_email_data
	  public static String post95_url=base2_url+"/view_email_data/";  
	 
	//create_update_email_data
	  public static String post96_url=base2_url+"/create_update_email_data/";  
	  
	//delete_email_data
	  public static String post97_url=base2_url+"/delete_email_data/"; 
	 
	//reactive_email_data
	  public static String post98_url=base2_url+"/reactive_email_data/"; 
	 
	   //public
	//contact_us
	  public static String post99_url=base2_url+"/contact_us/"; 
	   
	 
	//add_source
	  public static String post100_url=base2_url+"/add_source/"; 

	   //tenant_lang
	  public static String post101_url=base2_url+"/tenant_lang/";   
	  
	 //entity_predefined_function
	  public static String post102_url=base2_url+"/entity_predefined_function/"; 
	  
	//get_predefined_category
	  public static String post103_url=base2_url+"/get_predefined_category/"; 
	  
	//get_predefined_type
	  public static String post104_url=base2_url+"/get_predefined_type/"; 
	  
	//create_predefined_function
	  public static String post105_url=base2_url+"/create_predefined_function/"; 
	  
	//delete_predefined_function
	  public static String post106_url=base2_url+"/delete_predefined_function/"; 
	  
	//tenant_data_status
	  public static String post107_url=base2_url+"/admin/tenant_data_status/";  
	  
	//fetch_predefined_data
	  public static String post108_url=base2_url+"/fetch_predefined_data/";  
	 
	//add_tenant
	  public static String post109_url=base2_url+"/admin/add_tenant/"; 
	  
	//packages
	  public static String post110_url=base2_url+"/admin/packages/"; 
	  
	  
	//security_pulse_details_data
	  public static String post111_url=base2_url+"/security_pulse_details_data/"; 
	  
	  
	//fetch_predefined_category
	  public static String post112_url=base2_url+"/fetch_predefined_category/"; 
	  

	//create_category
	  public static String post113_url=base2_url+"/create_category/"; 
	  
	//create_subcategory
	  public static String post114_url=base2_url+"/create_subcategory/"; 
	  
	//delete_category
	  public static String post115_url=base2_url+"/delete_category/"; 
	  
	//delete_subcategory
	  public static String post116_url=base2_url+"/delete_subcategory/"; 
	//fetch_predefined_type
	  public static String post117_url=base2_url+"/fetch_predefined_type/"; 
	  
	//create_subtype
	  public static String post118_url=base2_url+"/create_subtype/"; 
	  
	//delete_subtype
	  public static String post119_url=base2_url+"/delete_subtype/"; 
	  
	//create_tag
	  public static String post120_url=base2_url+"/create_tag/"; 
	  
	//delete_tag
	  public static String post121_url=base2_url+"/delete_tag/"; 
	  
	//get_tmf_data
	  public static String post122_url=base2_url+"/get_tmf_data/"; 
	  
	//delete_tmf_factor
	  public static String post123_url=base2_url+"/delete_tmf_factor/"; 
	  
	  
	//get_usecase
	  public static String post124_url=base2_url+"/get_usecase/"; 
	  
	//add_usecase
	  public static String post125_url=base2_url+"/add_usecase/"; 
	  
	//delete_usecase
	  public static String post126_url=base2_url+"/delete_usecase/"; 
	  
	//add_rule
	  public static String post127_url=base2_url+"/add_rule/";
	  

	//delete_rule
	  public static String post128_url=base2_url+"/delete_rule/";
	  
	//get_feeds
	  public static String post129_url=base2_url+"/get_feeds/";
	  
	//get_advisory
	  public static String post130_url=base2_url+"/get_advisory/";
	  
	//add_predefined_function
	  public static String post131_url=base2_url+"/add_predefined_function/";
	  
	//User_Create
	  public static String post132_url=base2_url+"/user/create/";
	  
		//fetch_risk_journey
	  public static String post133_url=base2_url+"/fetch_risk_journey/";
	  
	//delete_predefined_function
	  public static String post134_url=base2_url+"/delete_predefined_function/";
	  
	//update_entity_status
	  public static String post135_url=base2_url+"/update_entity_status/";
	 
	//get_pdf
	  public static String post136_url=base2_url+"/get_pdf/";
	  
	  //get_pdf_data
	 public static String post137_url=base2_url+"/get_pdf_data/";
		  
	//get_excel_template
	 public static String post138_url=base2_url+"/get_excel_template/";
		  
	//master_filters
    public static String post139_url=base2_url+"/master_filters/"; 
		  	  
	//get_function_data
	  public static String post140_url=base2_url+"/get_function_data/"; 
			
	  //get_process_data
	  public static String post141_url=base2_url+"/get_process_data/";   
			  
	//get_heat_map_data
	  public static String post142_url=base2_url+"/get_heat_map_data/"; 
			  
	//get_risk_aggregation
	  public static String post143_url=base2_url+"/get_risk_aggregation/"; 
			  
	//get_risk_aggr_bar_chart_data
	  public static String post144_url=base2_url+"/get_risk_aggr_bar_chart_data/"; 
			  
		//risk_screen_details_data
	  public static String post145_url=base2_url+"/risk_screen_details_data/";
			
	//update_risk_configuration
	  public static String post146_url=base2_url+"/update_risk_configuration/";   
		  
	//risk_screen_details
	  public static String post147_url=base2_url+"/risk_screen_details/"; 
		  	
	//create_update_entity
	  public static String post148_url=base2_url+"/create_update_entity/"; 
				
	//get_entity
	  public static String post149_url=base2_url+"/get_entity/"; 
		  
	//add_custom_function
	  public static String post150_url=base2_url+"/add_custom_function/"; 
				  			  
	//delete_custom_process
	  public static String post151_url=base2_url+"/delete_custom_process/"; 
				  
	//create_entity_function_process
	  public static String post152_url=base2_url+"/create_entity_function_process/"; 
		  
		//create_entity_assets
	  public static String post153_url=base2_url+"/create_entity_assets/"; 
  
	//delete_asset
	  public static String post154_url=base2_url+"/delete_asset/"; 
  		  
	//get_entity_function_process
	  public static String post155_url=base2_url+"/get_entity_function_process/";
		    
	  //update_vulnerability_master
	   public static String post156_url=base2_url+"/update_vulnerability_master/";  	  
		  
	   //master_vulnerability_grid
	   public static String post157_url=base2_url+"/master_vulnerability_grid/"; 	  
		
	   //get_asset_summary
	   public static String post158_url=base2_url+"/get_asset_summary/";   
		  
	   //add_update_rgu_data
	   public static String post159_url=base2_url+"/add_update_rgu_data/";  	  
		  
	   //delete_rgu_data
	   public static String post160_url=base2_url+"/delete_rgu_data/";  
		
	 //add_predefined_type
	   public static String post161_url=base2_url+"/add_predefined_type/";   
		  
		  
	   //add_package
	     public static String post162_url=base2_url+"/admin/add_package/";    
		 
		  
	   //security_pulse_record_delete
	   public static String post163_url=base2_url+"/security_pulse_record_delete/";
		  
	 //add_update_tmf_factor
	   public static String post164_url=base2_url+"/add_update_tmf_factor/";  
		  
	 //advisory_pdf
	   public static String post165_url=base2_url+"/advisory_pdf/"; 	  
		  

	 //update_customer
	 public static String post166_url=base2_url+"/admin/update_customer/";  
		  
	//change_customer_package
	 public static String post167_url=base2_url+"/admin/change_customer_package/";     
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	
	}

		

		  
		    


