package edu.uw.info360.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 2, max = 15)
	private String firstName;
	@Size(min = 2, max = 15)
	private String lastName;
	@Column(updatable = false)
	private Date createdAt;
	
	public User() {}
	
	public User(String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
}
