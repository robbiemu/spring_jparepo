package com.cooksys.spring_jparepo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sample")
public class Sample extends BaseModel {
	String samplestring;

	public String getSamplestring() {
		return samplestring;
	}

	public void setSamplestring(String samplestring) {
		this.samplestring = samplestring;
	}
	
	
}
