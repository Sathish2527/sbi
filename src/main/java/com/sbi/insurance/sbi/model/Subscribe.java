package com.sbi.insurance.sbi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
@Entity
@Table(name="subscribe")
public class Subscribe {
	@Id
	@GeneratedValue
	private int subscriberID;
	private String Accnumber;
	private String Name;
	private int Age;
	private String Date_of_Birth;
	private String Mobilenumber;
	private String emailID;
	 
	
}
