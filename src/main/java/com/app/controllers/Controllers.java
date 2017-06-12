package com.app.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tiles.request.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojo.Candidate;
import com.app.pojo.Company;
import com.app.pojo.Interviewdetail;
import com.app.services.Service;
//import com.mysql.fabric.Response;

@Controller
public class Controllers {
	@Autowired
	private Service services;


	public Controllers() {
		System.out.println("in contrl...");
	}

	public Service getServices() {
		return services;
	}

	public void setServices(Service services) {
		this.services = services;
	}
	

	

	@RequestMapping(value = "/CompanySignup", method = RequestMethod.GET)
	public String signup(Model map) {
		System.out.println("in get....");
		map.addAttribute("company", new Company());
		return "CompanySignup";
	}

	@RequestMapping(value = "/CompanySignup", method = RequestMethod.POST)

	public String CompanySignupup(Company comp,HttpSession session) {
		System.out.println("in post:" + comp);
		session.setAttribute("company", comp);
		services.registerCompany(comp);
		return "regsuccess";
	}

	@RequestMapping(value = "/CandidateSignup", method = RequestMethod.GET)
	public String signupCandidate(Model map1) {
		System.out.println("in get....");
		map1.addAttribute("CandidateSignup", new Candidate());
		return "CandidateSignup";
	}

	@RequestMapping(value = "/CandidateSignup", method = RequestMethod.POST)

	public String Candidatelogin(Candidate candidate,HttpSession session) {
		System.out.println("in post:" + candidate);
		session.setAttribute("candidate", candidate);
		services.registerCandidate(candidate);
		return "regsuccess";
	}

	@RequestMapping(value = "/CandidateLogin", method = RequestMethod.GET)
	public String candiadatelogin(Model map2, Candidate can) {
		System.out.println("in get....");
		map2.addAttribute("CandidateLogin", new Candidate());
		return "CandidateLogin";
	}

	@RequestMapping(value = "/CandidateLogin", method = RequestMethod.POST)

	public String CandidateLogin(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpSession session, Candidate can) {
		Candidate cand = null;
		cand = services.loginCandidate(email, password);
		if (cand != null) {
			String email1 = cand.getEmail();
			System.out.println(email1);
			session.setAttribute("candidate", cand);
			// return "Issue";
			System.out.println("in post:" + email);
			services.loginCandidate(email, password);
			System.out.println(cand.getInterviewdetails()+"uuuuuuuuuuuuuuuuuuuuu" );
			session.setAttribute("interviewdetailscompany",cand.getInterviewdetails());
			return "CandidateHome";
		}
		session.setAttribute("canLoginFail", "Invalid Candidate Pls try again");
		return "CandidateLogin";
	}

	@RequestMapping(value = "/CompanyLogin", method = RequestMethod.GET)
	public String companylogin(Model map3, Company com) {
		System.out.println("in get....");
		map3.addAttribute("CompanyLogin", new Company());
		return "CompanyLogin";
	}

	@RequestMapping(value = "/CompanyLogin", method = RequestMethod.POST)

	public String CompanyLogin(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpSession session, Company com) {
		Company comp = null;
		comp = services.loginCompany(email, password);
		if (comp != null) {
			String email2 = comp.getEmail();
			System.out.println(email2);
			session.setAttribute("company", comp);
			// return "Issue";
			System.out.println("in post:" + email);
			services.loginCompany(email2, password);
			return "CompanyHome";
		}
		session.setAttribute("compLoginFail", "Invalid Company credentials! Pls try again");
		return "CompanyLogin";
	}

	// CandidateSearch
	@RequestMapping(value = "/SearchCandidate", method = RequestMethod.GET)
	public String searchcandidate(Model map4) {
		System.out.println("in get....");
		map4.addAttribute("SearchCandidate", new Candidate());
		return "SearchCandidate";
	}

	@RequestMapping(value = "/SearchCandidate", method = RequestMethod.POST)

	public String searchcandidate(@RequestParam("email") String email, HttpSession session, HttpServletRequest req ,HttpServletResponse res) throws IOException {
		Candidate cand1 = new Candidate();
		System.out.println("in search" + req.getParameter("email"));
		// cand1.setEmail(req.getParameter("email"));
		cand1 = services.searchcandidate(req.getParameter("email"));
		System.out.println("in search" + req.getParameter("email"));
		if (cand1 != null) {
			String email3 = cand1.getEmail();
			System.out.println(email3);
			session.setAttribute("candidatesearch",cand1 );
			// return "Issue";
			System.out.println("in post:" + email3);
			System.out.println("in search");
			services.searchcandidate(email3);
			System.out.println(cand1.getInterviewdetails()+"uuuuuuuuuuuuuuuuuuuuu" );
			session.setAttribute("interviewdetailscompany",cand1.getInterviewdetails());
			return "interviewdetailscompany";
		}
		
		return "CompanyHome";
		
	}

	@RequestMapping(value = "/interviewdetailscompany", method = RequestMethod.GET)
	public String interviewdetailscompany(Model map4) {
		System.out.println("in get....");
		map4.addAttribute("interviewdetailscompany", new Candidate());
		return "interviewdetailscompany";
	}

	@RequestMapping(value = "/interviewdetailscompany", method = RequestMethod.POST)
	


	public String interviewdetailscompany(@RequestParam("technicalSkills") String technicalSkills,
			@RequestParam("managerialSkill") String managerialSkill, @RequestParam("bodyLanguage") String bodyLanguage,
			@RequestParam("experience") String experience, @RequestParam("comments") String comments,@RequestParam("result") String result,
			HttpSession session, HttpServletRequest req) {
		Interviewdetail interview = null;
		System.out.println("in interviewdetailscompany" + req.getParameter("technicalSkills"));
		System.out.println("in interviewdetailscompany" + req.getParameter("managerialSkill"));
		System.out.println("in interviewdetailscompany" + req.getParameter("bodyLanguage"));
		String techSkills=req.getParameter("technicalSkills");
		String managSkill=req.getParameter("managerialSkill");
		String bodyLang=req.getParameter("bodyLanguage");
		String exper=req.getParameter("experience");
		String cmnt=req.getParameter("comments");
		String result1=req.getParameter("result");
		interview = new Interviewdetail(techSkills,managSkill,bodyLang,exper,cmnt,result1);
		System.out.println(interview.getBodyLanguage());
		{
			session.setAttribute("interviewdetailscompany", interview);
			session.setAttribute("NoInterviewAttended", "You have not attended any interview till now");
			Company comp = (Company) req.getSession().getAttribute("company");
			Candidate cand= (Candidate) req.getSession().getAttribute("candidatesearch");
			services.interviewdetailscompany(interview,comp,cand);
			return "submitsuccess";
		}
	}
	 @RequestMapping("/logout")
     public String logout(HttpSession session ) {
        session.invalidate();
        System.out.println("session invalidate");
        return "redirect:/logout.jsp";
     }

}
