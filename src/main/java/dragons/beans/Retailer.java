package dragons.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Retailer {

	public String retailName;
	public String street;
	public String city;
	public String state;
	public String phone;
	public String email;
	
	
	/**
	 * 
	 */
	public Retailer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param retailName
	 */
	public Retailer(String retailName) {
		super();
		this.retailName = retailName;
	}
	
	/**
	 * @param retailName
	 * @param street
	 * @param city
	 * @param state
	 * @param phone
	 */
	public Retailer(String retailName, String street, String city, String state, String phone) {
		super();
		this.retailName = retailName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.phone = phone;
	}

	/**
	 * @param retailName
	 * @param street
	 * @param city
	 * @param state
	 * @param phone
	 * @param email
	 */
	public Retailer(String retailName, String street, String city, String state, String phone, String email) {
		super();
		this.retailName = retailName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.phone = phone;
		this.email = email;
	}

	public String getRetailName() {
		return retailName;
	}

	public void setRetailName(String retailName) {
		this.retailName = retailName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Retailer [retailName=" + retailName + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", phone=" + phone + ", email=" + email + "]";
	}

}
