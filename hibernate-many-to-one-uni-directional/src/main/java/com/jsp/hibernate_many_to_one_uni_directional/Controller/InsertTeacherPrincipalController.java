package com.jsp.hibernate_many_to_one_uni_directional.Controller;

import com.jsp.hibernate_many_to_one_uni_directional.dto.Principal;
import com.jsp.hibernate_many_to_one_uni_directional.dto.Teacher;
import com.jsp.hibernate_many_to_one_uni_directional.service.TeacherPrincipalService;

public class InsertTeacherPrincipalController {

	public static void main(String[] args) {
		TeacherPrincipalService teacherPrincipalService=new TeacherPrincipalService();
		
		Teacher teacher = new Teacher(19, "raju", "raju@gmail.com", 54984318, 5);
		Principal principal = new Principal(19, "rjendra", "reaje@gmail.com", 646484846, 626565, 10);
		teacherPrincipalService.saveTeacherPrincipalService(teacher, principal);
	}
	
	
}
