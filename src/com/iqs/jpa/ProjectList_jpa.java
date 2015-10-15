package com.iqs.jpa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.iqs.pojo.ProjectList;

public class ProjectList_jpa {
	public static void main(String[] args){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("IQSProject");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		ProjectList project = new ProjectList();
		project.setProject_id(1);
		project.setProject_name("NINDS");
		
		em.persist(project);
		em.getTransaction().commit();
	}
}

