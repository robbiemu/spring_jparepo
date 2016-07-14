package com.cooksys.spring_jparepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * The controller handles the routes for the web application. below is a sample route for
 * each RESTful operation, configured to use a service to reach the data.
 *
 */
@RestController
//@CrossOrigin(methods = {RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PATCH, RequestMethod.PUT})
public class SJController {
	@Autowired
	SJService sjservice;
	
	@RequestMapping
	public @ResponseBody String get() {
		return sjservice.root();
	}
	
/*	// read:many
	@RequestMapping("sample")
	public List<Sample> getSamples() {
		return sjservice.readSamples();
	} */
	
/*	// read:one
	@RequestMapping("sample/{pk}")
	public Sample getSample(@PathVariable("pk") long primary_key) {
		return sjservice.readSample(primary_key);
	} */

/*	// create:one
	@RequestMapping(value="sample", method=RequestMethod.POST)
	public Sample postSample(@RequestBody Sample sample) {
		return sjservice.createSample(sample);
	} */

/*	// update:one
	@RequestMapping(value="sample/{pk}", method=RequestMethod.PUT)
	public Sample putSample(@PathVariable long pk, @RequestBody Sample sample) {
		return sjservice.updateSample(pk, sample);
	} */

/*	// delete:one
	@RequestMapping(value="sample/{pk}", method=RequestMethod.DELETE)
	public Sample deleteSample(@PathVariable long pk) {
		return sjservice.deleteSample(pk);
	} */
	
}
