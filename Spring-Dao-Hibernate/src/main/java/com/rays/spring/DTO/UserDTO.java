package com.rays.spring.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

// Class ko database entity banata hai
@Entity

// Class ko st_user table se map karta hai
@Table(name = "st_user")
public class UserDTO {

	// Field ko primary key banata hai
	@Id

	// ID automatically generate karta hai
	@GeneratedValue(generator = "raysPk")

	// ID generate karne ki strategy define karta hai
	@GenericGenerator(name = "raysPk", strategy = "native")

	// Field ko ID column se map karta hai
	@Column(name = "ID", nullable = false, unique = true)
	private int id;

	// Field ko FIRST_NAME column se map karta hai
	@Column(name = "FIRST_NAME", length = 50)
	private String firstName;

	// Field ko LAST_NAME column se map karta hai
	@Column(name = "LAST_NAME", length = 50)
	private String lastName;

	// Field ko LOGIN column se map karta hai
	@Column(name = "LOGIN", length = 50)
	private String login;

	// Field ko PASSWORD column se map karta hai
	@Column(name = "PASSWORD", length = 50)
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}