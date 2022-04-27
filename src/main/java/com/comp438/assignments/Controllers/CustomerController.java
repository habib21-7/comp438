package com.comp438.assignments.Controllers;

import com.comp438.assignments.Services.CustomerService;
import com.comp438.assignments.utils.DTOs.CustomerDTO;
import com.comp438.assignments.utils.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    public List<Customer> getAllCustomers()  {
        return customerService.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable long id)  {
        return customerService.getCustomerById(id);
    }

    @PostMapping("/customer")
    public ResponseEntity<?> RegisterCustomer(@RequestBody CustomerDTO customer) throws Exception {
        Customer newCustomer = new Customer();
        newCustomer.setEmail(customer.getEmail());
        newCustomer.setAddress(customer.getAddress());
        newCustomer.setName(customer.getName());
        newCustomer.setPhone(customer.getPhone());
        return customerService.addCustomer(newCustomer);
    }

}
