package com.project.questapp.entities;

import javax.persistence.Entity;

import javax.persistence.Table;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Table(name="user")
@Data

public class User {
	@Id 
	Long id;
	String userName;
	String password;
	
	

}
