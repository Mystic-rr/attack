package com.xxe.attack.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReciveDataController {

    Log logger = LogFactory.getLog(ReciveDataController.class);

    @GetMapping("/attack/{param}")
    public String attack(@PathVariable String param) {
        logger.info("recive data ------->" + param);
        return "success";
    }
   
}
