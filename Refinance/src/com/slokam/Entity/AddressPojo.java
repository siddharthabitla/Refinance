package com.slokam.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class AddressPojo {
	private int id;
	private PhysicalAddressPojo phyAdd;
	private MailingAddrPojo mailAdd;
	private UserPojo user;
	
	@OneToOne(mappedBy="addr")
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
	@OneToMany(mappedBy="addr")
	public PhysicalAddressPojo getPhyAdd() {
		return phyAdd;
	}
	public void setPhyAdd(PhysicalAddressPojo phyAdd) {
		this.phyAdd = phyAdd;
	}
	@OneToMany(mappedBy="addr")
	public MailingAddrPojo getMailAdd() {
		return mailAdd;
	}
	public void setMailAdd(MailingAddrPojo mailAdd) {
		this.mailAdd = mailAdd;
	}
	
	

}
