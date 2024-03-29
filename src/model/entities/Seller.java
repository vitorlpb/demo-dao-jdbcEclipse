package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String email;
	private Date birthdate;
	private Integer baseSalary;
	
	private Departments departments;
	
	public Seller() {
	}

	public Seller(Integer id, String name, String email, Date birthdate, Integer baseSalary, Departments departments) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthdate = birthdate;
		this.baseSalary = baseSalary;
		this.departments = departments;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Integer getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Integer baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departments getDepartments() {
		return departments;
	}

	public void setDepartments(Departments departments) {
		this.departments = departments;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birthdate=" + birthdate + ", baseSalary="
				+ baseSalary + ", departments=" + departments + "]";
	}
	
	
}
