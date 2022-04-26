package com.comp438.assignments.Repositories;

import com.comp438.assignments.utils.models.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {

    Customer findById(long id);
    Customer findByEmail(String email);

    @Query(value = "SELECT c.* FROM customer as c", nativeQuery = true)
    List<Customer> findAllCustomers();


}
