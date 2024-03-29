package com.jsp.hibernate_many_to_one_uni_directional.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="teachers")
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
	@Id
	private int teacherId;
	private String teacherName;
	private String teacherEmail;
	private long teacherMobileNo;
	private int teacherExperience;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="principalid")
	Principal principal;
	public Teacher(int teacherId,String teacherName,String teacherEmail,long teacherMobileNo,int teacherExperience)
	{
		this.teacherId= teacherId;
		this.teacherName=teacherName;
		this.teacherEmail=teacherEmail;
		this.teacherMobileNo=teacherMobileNo;
		this.teacherExperience = teacherExperience;
		
	}

}
