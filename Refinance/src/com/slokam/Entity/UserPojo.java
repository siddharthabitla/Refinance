package com.slokam.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class UserPojo {
	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	private String age;
	private SSNPojo ssn;
	private int mobile;
	private List<MailingAddrPojo> mAddr;
	private List<PhysicalAddressPojo> pAddr;

	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	public List<MailingAddrPojo> getmAddr() {
		return mAddr;
	}
	public void setmAddr(List<MailingAddrPojo> mAddr) {
		this.mAddr = mAddr;
	}
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	public List<PhysicalAddressPojo> getpAddr() {
		return pAddr;
	}
	public void setpAddr(List<PhysicalAddressPojo> pAddr) {
		this.pAddr = pAddr;
	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ssnid")
	public SSNPojo getSsn() {
		return ssn;
	}
	public void setSsn(SSNPojo ssn) {
		this.ssn = ssn;
	}
	
	
}
