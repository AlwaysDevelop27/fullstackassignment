package com.bitswilp.langLearn.api.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name ="roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

	
	/*
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * 
	 * 
	 * public Role(String name) { super(); this.name = name; }
	 * 
	 * public Role() {
	 * 
	 * }
	 */	 
    
    

}