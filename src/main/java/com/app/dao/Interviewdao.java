package com.app.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojo.Candidate;
import com.app.pojo.Interviewdetail;

@Repository
public class Interviewdao {
	@Autowired
	private SessionFactory session;
	@Autowired
	HttpSession sess;

	public Candidate searchCandidate(String email) {
		Candidate cand = new Candidate();
		System.out.println("in interviewdao search");
		String hql = "select c from Candidate c where c.email =:email";
		cand = (Candidate) session.getCurrentSession().createQuery(hql).setParameter("email", email).uniqueResult();
		sess.setAttribute("notfound", "*Note: Email-id is case-sensitive");
		if (cand != null) {
			System.out.println(cand);
			cand.getInterviewdetails().size();
		}
		return cand;
	}

	public Interviewdetail interviewdetailscompany(Interviewdetail interviewdetail) {
		session.getCurrentSession().save(interviewdetail);
		System.out.println("saved");
		return interviewdetail;
	}

	public List<Interviewdetail> getRounds(long candidateId) {
		Session sess = session.getCurrentSession();
		String hql = "select i from interviewdetails i where ";
		return (List<Interviewdetail>) session.getCurrentSession().createQuery(hql)
				.setParameter("candidateId", candidateId).list();
	}
}
