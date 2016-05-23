package com.hello.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
    @RequestMapping("/hello")
    public ResponseEntity<?> user(@RequestParam(value = "name", required = true) String name) {
    	String greet;
    	try
        {
    		greet = "Hello " + name  ;
        } catch (Exception ex) {
        	return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<String>(greet, HttpStatus.OK);
    }
}