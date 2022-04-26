package com.comp438.assignments.Services;

import com.comp438.assignments.Repositories.CustomerRepository;
import com.comp438.assignments.utils.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){
        return customerRepository.findAllCustomers();
    }
    public Customer  getCustomerById(long id){
        return customerRepository.findById(id);
    }
}
