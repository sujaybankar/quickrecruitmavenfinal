package com.app.services;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.CandidateDao;
import com.app.dao.CompanyDao;
import com.app.dao.Interviewdao;
import com.app.pojo.Candidate;
import com.app.pojo.Company;
import com.app.pojo.Interviewdetail;


@org.springframework.stereotype.Service
@Transactional
public class Service {
	@Autowired
	private CompanyDao Companydao;
	@Autowired
	private CandidateDao Candidatedao;
	@Autowired
	private Interviewdao interviewdao;

	public void registerCompany(Company comp) {
		Companydao.register(comp);
	}

	public void registerCandidate(Candidate candidate) {
		Candidatedao.registerCandidate(candidate);
	}

	public Candidate loginCandidate(String email, String password) {
		Candidate c = Candidatedao.getcandidate(email, password);
		return c;

	}
	public Company loginCompany(String email, String password) {
		Company comp = Companydao.getcompany(email, password);
		return comp ;

	}

	public Candidate searchcandidate(String email) {
		Candidate cand = interviewdao.searchCandidate(email);
		return cand;
	}
	public List<Interviewdetail> getRounds(long id) {
	
		
		return interviewdao.getRounds(id);
	}


	public void interviewdetailscompany(Interviewdetail interview,Company comp,Candidate cand) {
		interview.setCompany(comp);
		interview.setCandidate(cand);
		Interviewdetail interview1 =interviewdao.interviewdetailscompany(interview);
	}

}
