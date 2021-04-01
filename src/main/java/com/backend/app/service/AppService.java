package com.backend.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author https://github.com/ma3s1r0
 *
 */
@Service
@Slf4j
public class AppService {

  public String sayHello() {
    log.error("hello world?");
    return "Hello World 2!";
  }

}
