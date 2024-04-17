package com.technical_test.crud.interfaces;

import com.technical_test.crud.models.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


//STEP 2: CREATE INTERFACE TO CRUD REPOSITORY

@Repository
public interface ICustomer extends CrudRepository<Customer, Long> {

}
