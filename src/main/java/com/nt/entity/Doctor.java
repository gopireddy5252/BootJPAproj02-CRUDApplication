package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Doctor {
	@Id
	@SequenceGenerator(name="gen1", sequenceName ="d-seq", initialValue =100, allocationSize =1)
	@GeneratedValue(generator="gen1",strategy = GenerationType.SEQUENCE)
	private Integer Did;
	private String dname;
	private String spl;
	private Double sal;

}
