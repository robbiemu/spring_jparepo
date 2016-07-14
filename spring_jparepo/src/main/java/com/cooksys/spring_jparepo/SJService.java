package com.cooksys.spring_jparepo;

import org.springframework.stereotype.Service;

/**
 * By using a service intermediary you can do fancy things like format results, or
 * translate raw repository queries into intermediate "view" objects. For example,
 * Michael's example used a GetAllUserReponse object that was a custom, partial "view" of
 * users. It also provided a method of translating users to GetAllUserResponse objects.
 * The general pattern though, is to use the service layer (Service and related classes) to 
 * handle that kind of work. You could do a simple retrieve on List<User> and then translate
 * it here to List<UserView>, where UserView is just a POJO containing the fields you want.
 * 
 * Another common use of a service is to wrap dynamic data in static contexts, (kinda like 
 * to format error codes to fully fleshed out web pages).
 */
@Service
public class SJService {

/*	@Autowired
 	SampleRepository sampleRepository; */

	public String root() {
		return "Spring_JPArepo up and running";
	}

/*	// read:many
	public List<Sample> readSamples() {
		return sampleRepository.findAll();
	} */
	
/*	// read:one
	public Sample readSample(long pk) {
		return sampleRepository.findOne(pk);
	} */

/*	// create:one
	public Sample creareSample(Sample sample) {
		// error check, or optionally assign set intermediate values, then
		return sampleRepository.save(sample);
	} */

/*	// update:one
	public Sample putSample(long pk, Sample sample) {
		Sample indb = sampleRepository.findOne(pk);

		// for each property, error check and assign:
		if(sample.getSamplestring() != null) {
			indb.setSamplestring( sample.getSamplestring() );
		}
		
		sampleRepository.save(indb);
		
		return indb;
	} */

/*	// delete:one
	public Sample deleteSample(long pk) {
		Sample indb = sampleRepository.findOne(pk);
		sampleRepository.remove(indb);
		return indb;
	} */

	
}
