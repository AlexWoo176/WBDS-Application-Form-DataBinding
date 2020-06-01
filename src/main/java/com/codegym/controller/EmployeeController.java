package com.codegym.controller;

import com.codegym.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/")
public class EmployeeController {
//    @RequestMapping(value = "showform", method = RequestMethod.GET)
    @GetMapping("/")
    public String showForm(ModelMap model) {
        model.addAttribute("employee", new Employee());
        return "create";
    }

//    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    @PostMapping("/addEmployee")
    public String submit(@ModelAttribute("emlpoyee") Employee employee, BindingResult result, ModelMap model) {
        model.addAttribute("name", employee.getName());
        model.addAttribute("contactNumber", employee.getContactNumber());
        model.addAttribute("id", employee.getId());
        return "info";
    }
}
