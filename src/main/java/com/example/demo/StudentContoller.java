package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentContoller 
  {
  @GetMapping("/index")
  public String sendForm(Model model) {
      model.addAttribute("student", new Student());
      return "index";
  }

  @PostMapping("/reg_success")
  public String processForm(@ModelAttribute Student student, BindingResult result, Model model)
  {
      model.addAttribute("student", student);
      return "reg_success";
  }

}