package com.jsp.hibernate_many_to_one_uni_directional.service;

import com.jsp.hibernate_many_to_one_uni_directional.dao.TeacherPrincipalDao;
import com.jsp.hibernate_many_to_one_uni_directional.dto.Principal;
import com.jsp.hibernate_many_to_one_uni_directional.dto.Teacher;

public class TeacherPrincipalService {

	TeacherPrincipalDao teacherPrincipalDao = new TeacherPrincipalDao();
	/*
	 * save teacherPrincipal Servoce
	 */
	public Teacher saveTeacherPrincipalService(Teacher teacher, Principal principal) {
		teacher.setPrincipal(principal);
		return teacherPrincipalDao.saveTeacherPrincipalDao(teacher);
	}
	
	/*
	 * save teacher with existing principal Service
	 */
	public Teacher saveTeacherWithExistingPrincipalService(Teacher teacher, int principalId) {
		System.out.println("service method");
		return teacherPrincipalDao.saveTeacherWithExistingPrincipalDao(teacher, principalId);
	}
		
}
