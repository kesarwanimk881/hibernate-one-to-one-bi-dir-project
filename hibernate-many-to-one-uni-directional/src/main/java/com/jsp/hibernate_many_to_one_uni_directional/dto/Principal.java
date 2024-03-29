package com.jsp.hibernate_many_to_one_uni_directional.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Table(name="principal")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Principal {
	@Id
	private int principalId;
	private String principalName;
	private String principalEmail;
	private long principalMobileNo;
	private double principalSalary;
	private int principalExperience;
}
