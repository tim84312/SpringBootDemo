package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Created by Tim on 2019/5/12
 */
@RestController
public class HelloController {
  @GetMapping("")
  public String hello(){
    return "hello";
  }
}
