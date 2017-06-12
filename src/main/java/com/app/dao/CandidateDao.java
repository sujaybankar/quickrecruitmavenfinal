package com.app.dao;

import java.sql.ResultSet;

import javax.management.Query;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojo.Candidate;

@Repository
public class CandidateDao {
	@Autowired
	private SessionFactory session;
	@Autowired
	HttpSession sess;

	public void registerCandidate(Candidate ca) {
		session.getCurrentSession().save(ca);
	}

	public Candidate getcandidate(String email, String password) {

		Candidate cand = null;
		String hql = "select c from Candidate c where c.email =:email and c.password=:password";

		cand = (Candidate) session.getCurrentSession().createQuery(hql).setParameter("email", email)
				.setParameter("password", password).uniqueResult();
		// b --persistent
		if (cand != null) {
			cand.getInterviewdetails().size();

			System.out.println(cand);

		}
		sess.setAttribute("loginfailed", "Please enter valid email & password");

		return cand;

	}

}
