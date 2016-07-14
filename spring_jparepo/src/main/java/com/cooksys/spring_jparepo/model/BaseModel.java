package com.cooksys.spring_jparepo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * this is a class you can extend when making models. this way you don't have to pollute
 * your models with common, repeated columns like the primary key. other columns you could
 * configure are cretaed_on and last_updated , etc. You probably dont care about that for
 * the rest of the training but in the real world it is nice to have little snippets like
 * this to help keep your code clean and short.
 *
 */
@MappedSuperclass
public class BaseModel {

	@Id
	@GeneratedValue
	@Column(columnDefinition = "INT UNSIGNED", unique=true, nullable=false)
	long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}
