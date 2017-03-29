package com.github.jifwei.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
@RestController
public class EnvResource {
	@Autowired
	private Environment environment;	
	@RequestMapping(value = "/get-env", method = RequestMethod.GET)
	public String getEnv(@RequestParam String env) {
	    return "Env" + " " + environment.getProperty(env);
	}
	
}
