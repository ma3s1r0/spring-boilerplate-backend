package com.backend.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.backend.app.service.AppService;

/**
 * @author https://github.com/ma3s1r0
 *
 */
@RestController("/api")
public class AppController {

  @Autowired
  private AppService appService;

  @GetMapping
  public String sayHello() {
    return appService.sayHello();
  }

}
