package com.cd.mvc.controller;

import javax.servlet.ServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cd.mvc.bean.Product;

@Controller
public class DemoController
{
    @Autowired
    private Product product;
    
    @RequestMapping(value = "index/{id}", method = RequestMethod.POST,params="age=14")
    public String index(@PathVariable int id,ServletRequest request,Model model)
    {
        String age = (String)request.getParameter("age");
        System.out.println(age);
        this.product.sayHello();
        model.addAttribute("title","hello hangzhou");
        return "index";
    }
}
