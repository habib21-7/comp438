package com.comp438.assignments.Controllers;

import com.comp438.assignments.Services.CustomerService;
import com.comp438.assignments.utils.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    public List<Customer> getCategories()  {
        return customerService.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable long id)  {
        return customerService.getCustomerById(id);
    }

}
