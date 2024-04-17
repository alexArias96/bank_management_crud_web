package com.technical_test.crud.service;

import com.technical_test.crud.interfaceService.ICustomerService;
import com.technical_test.crud.interfaces.ICustomer;
import com.technical_test.crud.models.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    //Step 4: We need the interface ICustomer

    @Autowired
    private ICustomer icustomer;

    @Override
    public List<Customer> list() {
        return (List<Customer>) icustomer.findAll();
    }


    //Video 3: update, Step 3: update customer
    @Override
    public Optional<Customer> listById(Long id) {
        return icustomer.findById(id);
    }

    @Override
    public int save(Customer customer) {
        int result = 0;
        Customer customerData = icustomer.save(customer);
        if (customerData != null){
            result = 1;
        }
        return result;
    }

    @Override
    public void delete(Long id) {
        icustomer.deleteById(id);
    }

}
