package com.app.pojo;

import java.io.Serializable;
import javax.persistence.*;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;


/**
 * The persistent class for the interviewdetails database table.
 * 
 */
@Entity
@Table(name="interviewdetails")
@NamedQuery(name="Interviewdetail.findAll", query="SELECT i FROM Interviewdetail i")
public class Interviewdetail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@SequenceGenerator(name="INTERVIEWDETAILS_ROUNDID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.AUTO, generator="INTERVIEWDETAILS_ROUNDID_GENERATOR")
	private long roundId;

	private String bodyLanguage;

	private String comments;

	private String experience;
	private String result;

	private String managerialSkill;
	
	private String technicalSkills;
	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	//bi-directional many-to-one association to Candidate
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="CandidateId")
	private Candidate candidate;

	//bi-directional many-to-one association to Company
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="CompanyId")
	private Company company;

	public Interviewdetail() {
	}
	

	


	

	public Interviewdetail(String technicalSkills, String managerialSkill, String bodyLanguage, String experience,
			String comments, String result) {
		super();
		this.bodyLanguage = bodyLanguage;
		this.comments = comments;
		this.experience = experience;
		this.result = result;
		this.managerialSkill = managerialSkill;
		this.technicalSkills = technicalSkills;
	}


	public long getRoundId() {
		return this.roundId;
	}

	public void setRoundId(long roundId) {
		this.roundId = roundId;
	}

	public String getBodyLanguage() {
		return this.bodyLanguage;
	}

	public void setBodyLanguage(String bodyLanguage) {
		this.bodyLanguage = bodyLanguage;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getExperience() {
		return this.experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getManagerialSkill() {
		return this.managerialSkill;
	}

	public void setManagerialSkill(String managerialSkill) {
		this.managerialSkill = managerialSkill;
	}

	public String getTechnicalSkills() {
		return this.technicalSkills;
	}

	public void setTechnicalSkills(String technicalSkills) {
		this.technicalSkills = technicalSkills;
	}

	public Candidate getCandidate() {
		return this.candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Interviewdetail [roundId=" + roundId + ", bodyLanguage=" + bodyLanguage + ", comments=" + comments
				+ ", experience=" + experience + ", managerialSkill=" + managerialSkill + ", technicalSkills="
				+ technicalSkills + ", candidate=" + candidate + ", company=" + company + "]";
	}
	

}