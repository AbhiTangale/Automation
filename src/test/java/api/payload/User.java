package api.payload;

public class User {

	String email;
    String first_name;
    String last_name;
    String is_admin;
    int role_id;
    String role;
    String phone_number;
    String theme_preference;
    String language;
	@Override
	public String toString() {
		return "User [email=" + email + ", first_name=" + first_name + ", last_name=" + last_name + ", is_admin="
				+ is_admin + ", role_id=" + role_id + ", role=" + role + ", phone_number=" + phone_number
				+ ", theme_preference=" + theme_preference + ", language=" + language + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getIs_admin() {
		return is_admin;
	}
	public void setIs_admin(String is_admin) {
		this.is_admin = is_admin;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getTheme_preference() {
		return theme_preference;
	}
	public void setTheme_preference(String theme_preference) {
		this.theme_preference = theme_preference;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
    
    
}





