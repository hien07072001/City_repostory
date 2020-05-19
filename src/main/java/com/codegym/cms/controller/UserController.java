package com.codegym.cms.controller;

import com.codegym.cms.model.Customer;
import com.codegym.cms.service.Customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class UserController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/user")
    public ModelAndView user(Principal principal) {
        // Get authenticated user name from Principal
        System.out.println(principal.getName());
        Iterable<Customer> customers = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/admin")
    public String admin() {
        // Get authenticated user name from SecurityContext
        SecurityContext context = SecurityContextHolder.getContext();
        System.out.println(context);
        return "/customer/admin";
    }
    @GetMapping("/articles")
    public String getArticlesPage () {
        return "articler";

    }
    @GetMapping("/accessDenied")
    public String getAccessDeniedPage() {
        return "accessDenied";
    }
    @GetMapping("/admin/monitor")
    public String getAdminMonitorPage() {
        return "admin";
    }
}

