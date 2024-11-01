package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;
@Service("doctorservice")
public class IDoctorServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorRepository docrepo;
	@Override
	public String registerDoctor(Doctor doctor) {
		Doctor doctor1=docrepo.save(doctor);
		return doctor1.getDid()==null?"doctor is not registor":"registor successfully";
	}

}
