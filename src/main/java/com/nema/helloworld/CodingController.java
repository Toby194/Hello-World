package com.nema.helloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class CodingController {
	@RequestMapping("")
	public String index(){
	      return "The dojo is awesome!";
	    }
	

	@RequestMapping("/{track}")
	public String success(@PathVariable("track") String track) {
		if (track.equals("burbank-dojo")) {
			track = "Burbank Dojo is located in Southern California";
		} else if (track.equals("san-jose")) {
			track= "SJ dojo is the headquearters";
			
		}
		
			return track ;
		}



}

