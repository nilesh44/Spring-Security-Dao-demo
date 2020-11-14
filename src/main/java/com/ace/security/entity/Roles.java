package com.ace.security.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Roles")
public class Roles {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="username")
	private String username;
	
	@Column(name="role")
	private String role;

}
