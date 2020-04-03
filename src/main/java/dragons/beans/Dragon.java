package dragons.beans;
import dragons.beans.Retailer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Dragon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String gender;
	private String color;
	private String morph;
	@Autowired
	public Retailer retailer;
	
	/**
	 * 
	 */
	public Dragon() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public Dragon(String name) {
		super();
		this.name = name;
	}

	/**
	 * @param name
	 * @param gender
	 * @param phone
	 */
	public Dragon(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	/**
	 * @param id
	 * @param name
	 * @param gender
	 * @param phone
	 */
	public Dragon(long id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	/**
	 * @param name
	 * @param gender
	 * @param color
	 * @param morph
	 */
	public Dragon(String name, String gender, String color, String morph) {
		super();
		this.name = name;
		this.gender = gender;
		this.color = color;
		this.morph = morph;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMorph() {
		return morph;
	}

	public void setMorph(String morph) {
		this.morph = morph;
	}

	public Retailer getRetailer() {
		return retailer;
	}

	public void setRetailer(Retailer retailer) {
		this.retailer = retailer;
	}

	@Override
	public String toString() {
		return "Dragon [id=" + id + ", name=" + name + ", gender=" + gender + ", color=" + color + ", morph=" + morph
				+ ", retailer=" + retailer + "]";
	}
	
}
