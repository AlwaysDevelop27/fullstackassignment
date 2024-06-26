package com.bitswilp.langLearn.api.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")
@Data //To get Access to Getters and Setters
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;
    

	/*
	 * public UserEntity() {
	 * 
	 * }
	 * 
	 * 
	 * public UserEntity(String username, String password, List<Role> roles) {
	 * super(); this.username = username; this.password = password; this.roles =
	 * roles; }
	 * 
	 * 
	 * public String getUsername() { return username; }
	 * 
	 * 
	 * public void setUsername(String username) { this.username = username; }
	 * 
	 * 
	 * public String getPassword() { return password; }
	 * 
	 * 
	 * public void setPassword(String password) { this.password = password; }
	 * 
	 * 
	 * public List<Role> getRoles() { return roles; }
	 * 
	 * 
	 * public void setRoles(List<Role> roles) { this.roles = roles; }
	 */

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name="user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<Role> roles = new ArrayList<>();
}
