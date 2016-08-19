package com.slokam.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.slokam.Entity.MailingAddrPojo;
import com.slokam.Entity.PhysicalAddressPojo;
import com.slokam.Entity.SSNPojo;
import com.slokam.Entity.UserPojo;

public class TestClient {

	public static void main(String[] args) {
		Configuration config = new AnnotationConfiguration().configure("hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		UserPojo user = new UserPojo();
		user.setFirstName("Salman");
		user.setLastName("Khan");
		user.setAge("52");
		user.setGender("Male");
		user.setMobile(876789);

		MailingAddrPojo maddr1 = new MailingAddrPojo();
		maddr1.setEmailId("sallu@gmail.com");
		maddr1.setSkypeId("sallu.bhai");
		maddr1.setUser(user);
		
		MailingAddrPojo maddr2 = new MailingAddrPojo();
		maddr2.setEmailId("salman.khan@gmail.com");
		maddr2.setSkypeId("salman");
		maddr2.setUser(user);
		
		List<MailingAddrPojo> mlist = new ArrayList<MailingAddrPojo>();
		mlist.add(maddr1);
		mlist.add(maddr2);
		
		PhysicalAddressPojo paddr1 = new PhysicalAddressPojo();
		paddr1.setArea("Mumbai");
		paddr1.setCity("Maharastra");
		paddr1.setDivision("Navi Mumbai");
		paddr1.setDoorNO("8005");
		paddr1.setZipcode(506172);
		paddr1.setUser(user);
		
		PhysicalAddressPojo paddr2 = new PhysicalAddressPojo();
		paddr2.setArea("Goa");
		paddr2.setCity("Goa Teritory");
		paddr2.setDivision("Goa Division");
		paddr2.setDoorNO("1210");
		paddr2.setZipcode(569124);
		paddr2.setUser(user);
		
		List<PhysicalAddressPojo> plist = new ArrayList<PhysicalAddressPojo>();
		plist.add(paddr1);
		plist.add(paddr2);
		
		SSNPojo ssn = new SSNPojo();
		ssn.setLoanno(1023);
		ssn.setBranch("Mumbai");
		ssn.setEmiAmount(250);
		ssn.setEndDate(new Date());
		ssn.setMortgage("Audi");
		ssn.setPaidamount(750);
		ssn.setPenalty("150");
		ssn.setReqAmount(5000);
		ssn.setSanctionedAmount(4000);
		ssn.setStartDate(new Date());
		ssn.setStatus(true);
		ssn.setUser(user);
		
		user.setSsn(ssn);
		user.setmAddr(mlist);
		user.setpAddr(plist);
		
		session.save(user);

		session.getTransaction().commit();
		session.close();
		sf.close();
	}  // main()
	
}  // TestClient