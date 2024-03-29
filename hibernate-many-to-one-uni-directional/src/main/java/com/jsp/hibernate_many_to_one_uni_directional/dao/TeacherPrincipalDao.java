package com.jsp.hibernate_many_to_one_uni_directional.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_many_to_one_uni_directional.dto.Principal;
import com.jsp.hibernate_many_to_one_uni_directional.dto.Teacher;

public class TeacherPrincipalDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernate-many-to-one-uni");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=  entityManager.getTransaction();

	/*
	 * save teacherPrincipal Dao
	 */
	public Teacher saveTeacherPrincipalDao(Teacher teacher) {
		
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		return teacher;
	}
	
	/*
	 * get Principal By PrincipalId
	 */
	public Principal getPrincipalByPrincipalIdDao(int principalId) {
		return entityManager.find(Principal.class, principalId);
		
	}
	
	/*
	 * save teacher with existing principal Dao
	 */
	public Teacher saveTeacherWithExistingPrincipalDao(Teacher teacher, int principalId) {
		Principal principal= getPrincipalByPrincipalIdDao(principalId);
		if(principal!=null) {
			teacher.setPrincipal(principal);
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		System.out.println("daomethod end from if block");
		return teacher;
		}
		System.out.println("daomethod end from outside if block");
		return null;
	}
}
