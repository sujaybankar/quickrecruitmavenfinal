package com.app.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the company database table.
 * 
 */
@Entity
@NamedQuery(name="Company.findAll", query="SELECT c FROM Company c")
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COMPANY_COMPANYID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.AUTO, generator="COMPANY_COMPANYID_GENERATOR")
	private long companyId;

	private String companyName;

	private String confirmPassword;

	private String email;

	private BigDecimal helpLineNumber;

	private String password;

	//bi-directional many-to-one association to Interviewdetail
	@OneToMany(mappedBy="company")
	private List<Interviewdetail> interviewdetails;

	public Company() {
	}

	
	
	public Company(long companyId) {
		super();
		this.companyId = companyId;
	}



	public Company(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	public long getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public BigDecimal getHelpLineNumber() {
		return this.helpLineNumber;
	}

	public void setHelpLineNumber(BigDecimal helpLineNumber) {
		this.helpLineNumber = helpLineNumber;
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
		interviewdetail.setCompany(this);

		return interviewdetail;
	}

	public Interviewdetail removeInterviewdetail(Interviewdetail interviewdetail) {
		getInterviewdetails().remove(interviewdetail);
		interviewdetail.setCompany(null);

		return interviewdetail;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", confirmPassword="
				+ confirmPassword + ", email=" + email + ", helpLineNumber=" + helpLineNumber + ", password=" + password;
	}
	
	

}