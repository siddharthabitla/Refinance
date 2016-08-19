package com.slokam.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SSN")
public class SSNPojo {
	private int id;
	private int loanno;
	private String branch;
	private String mortgage;
	private boolean status;
	private int reqAmount;
	private int paidamount;
	private int emiAmount;
	private int sanctionedAmount;
	private Date startDate;
	private Date endDate;
	private String penalty;
	private UserPojo user;
	
	@OneToOne(mappedBy="ssn", cascade=CascadeType.ALL)
	public UserPojo getUser() {
		return user;
	}
	public void setUser(UserPojo user) {
		this.user = user;
	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLoanno() {
		return loanno;
	}
	public void setLoanno(int loanno) {
		this.loanno = loanno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getMortgage() {
		return mortgage;
	}
	public void setMortgage(String mortgage) {
		this.mortgage = mortgage;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getReqAmount() {
		return reqAmount;
	}
	public void setReqAmount(int reqAmount) {
		this.reqAmount = reqAmount;
	}
	public int getPaidamount() {
		return paidamount;
	}
	public void setPaidamount(int paidamount) {
		this.paidamount = paidamount;
	}
	public int getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(int emiAmount) {
		this.emiAmount = emiAmount;
	}
	public int getSanctionedAmount() {
		return sanctionedAmount;
	}
	public void setSanctionedAmount(int sanctionedAmount) {
		this.sanctionedAmount = sanctionedAmount;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getPenalty() {
		return penalty;
	}
	public void setPenalty(String penalty) {
		this.penalty = penalty;
	}
	
	
}
