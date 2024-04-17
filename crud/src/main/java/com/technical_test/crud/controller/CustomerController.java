package com.technical_test.crud.controller;

import com.technical_test.crud.interfaceService.ICustomerService;
import com.technical_test.crud.models.entities.Customer;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class CustomerController {

    @Autowired
    private ICustomerService service;

    @GetMapping("/list")
    public String list(Model model) {
        List<Customer> customers = service.list();
        model.addAttribute("customers", customers);

        return "index";
    }

    //    Video 2: Add Step 2: Create method to add new customer
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("customer", new Customer());
        return "form";
    }

    //    Video 2: Add Step 3: Create method to save new customer
    @PostMapping("/save")
    public String save(@Valid Customer customer, Model model){
        service.save(customer);
        return "redirect:/list";
    }

    //Video 3: update, Step 3: Create controller method to update customer
    @GetMapping("/update/{id}")
    public String update(@PathVariable long id, Model model){
        Optional<Customer> customer = service.listById(id);
        model.addAttribute("customer", customer);
        return "form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        service.delete(id);
        return "redirect:/list";
    }
}
