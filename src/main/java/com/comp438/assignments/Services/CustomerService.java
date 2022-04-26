package com.comp438.assignments.Services;

import com.comp438.assignments.Repositories.CustomerRepository;
import com.comp438.assignments.utils.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    public ResponseEntity<?> addCustomer(Customer customer) {
        Customer newCustomer = customerRepository.findByEmail((customer.getEmail()));
        if (newCustomer == null) {
            if (customerRepository.save(customer) != null) {
                return new ResponseEntity<>(HttpStatus.CREATED);
            }else {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
}
