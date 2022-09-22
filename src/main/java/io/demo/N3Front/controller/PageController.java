package io.demo.N3Front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
  @GetMapping("/")
  public String main() {
    return "home";
  }

  @GetMapping("/login")
  public String Login() {
    return "login";
  }
}
