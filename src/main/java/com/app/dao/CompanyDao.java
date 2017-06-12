package com.app.dao;

import javax.servlet.http.HttpSession;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojo.Candidate;
import com.app.pojo.Company;

@Repository
public class CompanyDao {

	@Autowired
	private SessionFactory session;
	@Autowired
	HttpSession sess;
	public void register(Company c) {
		
		session.getCurrentSession().save(c);
		
	}

	public Company getcompany(String email, String password) {
		Company comp = null;
		String hql = "select c from Company c where c.email =:email and c.password=:password";
		
		comp =  (Company) session.getCurrentSession().createQuery(hql).setParameter("email", email)
					.setParameter("password", password).uniqueResult();
			//b --persistent
		System.out.println(comp);
		return comp;
	
	}

	
}
