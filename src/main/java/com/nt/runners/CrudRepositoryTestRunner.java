package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorService;
@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IDoctorService docserv;
	
	@Override
	public void run(String... args) throws Exception {
		Doctor doctor=new Doctor();
		doctor.setDname("Raju");
		doctor.setSpl("neurosurgeon");
		doctor.setSal(930000.0);
		
		String msg=docserv.registerDoctor(doctor);
		System.out.println(msg);

	}

}
