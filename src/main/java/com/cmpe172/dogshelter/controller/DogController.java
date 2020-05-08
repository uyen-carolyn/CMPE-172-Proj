package com.cmpe172.dogshelter.controller;
import com.cmpe172.dogshelter.model.Dog;
import com.cmpe172.dogshelter.service.DogService;

import antlr.collections.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class DogController {
    @Autowired
    private DogService dogService;
    
    //redirect:/dog
    @RequestMapping(value= "/dog",method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("dogs", dogService.findAll());
        return "home";
    }
    
    //add new dog
    @RequestMapping(value= "/dog/add",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.CREATED)
    public String add(Model model) {
        model.addAttribute("dog", new Dog());
        return "register";
    }	
    
    //delete a dog by ID
    @RequestMapping(value= "/dog/delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
        dogService.delete(id);
        return "redirect:/dog";
    }

    //save dog
    @RequestMapping(value= "/dog/save",method = RequestMethod.POST)
    public String save(@Valid Dog dog, RedirectAttributes redirect) {
        dogService.save(dog);
        return "redirect:/dog";
    }
    
    // search for dog by breed
    @RequestMapping(value= "/dog/search",method = RequestMethod.GET)
    public String search(@RequestParam("breed") String breed, Model model) {
        model.addAttribute("dogs", dogService.findByBreed(breed));
        return "home";
    }
    
    //modify
    @RequestMapping(value= "/dog/edit/{id}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String edit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("dog", dogService.findOne(id));
        return "register";
    }



}
