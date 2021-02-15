package com.credApp.credApp.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "UserCred")
public class UserCred implements Serializable {
//	private static final String serialVersionUID = 123456789;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Integer id;
	
	@Column(name = "Card_Number")
	private String cardNumber;

	
	@Column(name = "Customer_Name")
	private String customerName;

	@Column(name = "CVV")
	private int cvv;

	@Column(name = "email")
	private String email;
	
	/*
	 * @Column(name ="date") private Date date;
	 */
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*
	 * public Date getDate() { return date; }
	 */

	/*
	 * public void setDate(Date date) { this.date = date; }
	 */

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserCred [id=" + id + ", cardNumber=" + cardNumber + ", customerName=" + customerName + ", cvv=" + cvv
				+ ", email=" + email + /* ", date=" + date + */"]";
	}

	

}