package com.cms.entites;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(unique = true)
	private String email;

	private String name;

	private String phoneNo;

	private String password;

	private Boolean isActive;

	private Boolean isDeleted;

	private Date createdOn;

	private Date updatedOn;

//	@OneToMany(fetch = FetchType.EAGER)
//	@JoinColumn(name = "user_id", referencedColumnName = "id")
//	@JoinTable(name = "user_role", joinColumns = {
//			@JoinColumn(name = "user_id", referencedColumnName = "id") }, inverseJoinColumns = {
//					@JoinColumn(name = "role_id", referencedColumnName = "id") })
//	@Fetch(FetchMode.SUBSELECT)
//	private List<Role> roles;

}
