package com.app.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the candidate database table.
 * 
 */
@Entity
@NamedQuery(name = "Candidate.findAll", query = "SELECT c FROM Candidate c")
public class Candidate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "CANDIDATE_CANDIDATEID_GENERATOR")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CANDIDATE_CANDIDATEID_GENERATOR")
	private long candidateId;

	private String confirmPassword;

	private String email;

	private String firstName;

	private String lastName;

	private BigDecimal mobile;

	private String password;

	// bi-directional many-to-one association to Interviewdetail
	@OneToMany(mappedBy = "candidate")
	private List<Interviewdetail> interviewdetails;

	public Candidate() {
	}

	
	public Candidate(long candidateId) {
		super();
		this.candidateId = candidateId;
	}


	public Candidate(String email) {
		super();
		this.email = email;
	}

	public Candidate(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public long getCandidateId() {
		return this.candidateId;
	}

	public void setCandidateId(long candidateId) {
		this.candidateId = candidateId;
	}

	public String getConfirmPassword() {
		return this.confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BigDecimal getMobile() {
		return this.mobile;
	}

	public void setMobile(BigDecimal mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Interviewdetail> getInterviewdetails() {
		return this.interviewdetails;
	}

	public void setInterviewdetails(List<Interviewdetail> interviewdetails) {
		this.interviewdetails = interviewdetails;
	}

	public Interviewdetail addInterviewdetail(Interviewdetail interviewdetail) {
		getInterviewdetails().add(interviewdetail);
		interviewdetail.setCandidate(this);

		return interviewdetail;
	}

	public Interviewdetail removeInterviewdetail(Interviewdetail interviewdetail) {
		getInterviewdetails().remove(interviewdetail);
		interviewdetail.setCandidate(null);

		return interviewdetail;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", confirmPassword=" + confirmPassword + ", email=" + email
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", mobile=" + mobile + ", password="
				+ password ;
	}

}