package com.cooksys.spring_jparepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cooksys.spring_jparepo.model.Sample;
/**
 * This is a sample JpaRepository. If you need to access rows by columns, or have simpler 
 * where clauses, you can add them here like the commented examples. You can even use 
 * tab-completion to explore the parameters you can put after findBy :)
 */
public interface SampleRepository extends JpaRepository<Sample, Long> {
	//List<Sample> findBySamplestring(String samplestring);
}
