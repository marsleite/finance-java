package com.example.finance.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PingController {
  @RequestMapping(value="/ping", method = RequestMethod.GET)
  public HttpEntity<String> ping() {
    return new ResponseEntity<>("pong", HttpStatus.OK);
  }
}