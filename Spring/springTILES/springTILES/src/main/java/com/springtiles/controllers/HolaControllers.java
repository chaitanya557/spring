package com.springtiles.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springtiles.model.Contact;
import com.springtiles.model.Hola;

@Controller
public class HolaControllers {
	  @RequestMapping("/hello")  
	    public String helloWorld(Model m) {  
	        String message = "Hello World, Spring MVC";  
	        m.addAttribute("message", message);  
	        return "hello";   
	    }  
	@RequestMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("contact", new Contact());
		return "contact";
	}
	 @RequestMapping(value = "/addContact", method = RequestMethod.POST)  
	 public String addContact(@ModelAttribute("contact") Hola hola) {  
	    //write the code here to add contact  
	     return "redirect:home";  
	} 
	 @RequestMapping(value = "/addContact", method = RequestMethod.POST)  
	    public String addContact(@ModelAttribute("contact") Contact contact, BindingResult result) {  
	        //write the code here to add contact  
	        return "redirect:contact.html";  
	    }  
	      
	    @RequestMapping("/contact")  
	    public String showContacts(Model m) {  
	        m.addAttribute("command", new Contact());  
	        return "contact";  
	    }  
}
