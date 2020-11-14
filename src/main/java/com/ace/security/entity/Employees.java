package com.ace.security.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class Employees {
	@Id
	@Column(name="username")
	private String username;
	
	
	@Column(name="password")
	private String password ;
	
	
	@Column(name="enabled")
	private Integer enabled;

}
