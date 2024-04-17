package com.technical_test.crud.interfaceService;

import com.technical_test.crud.models.entities.Customer;
import org.hibernate.usertype.CompositeUserType;

import java.util.List;
import java.util.Optional;


//STEP 3: CREATE METHODS OF INTERFACE SERVICE
public interface ICustomerService {

    public List<Customer> list();

    public Optional<Customer>listById(Long id);

    public int save(Customer customer);

    public void delete(Long id);
}
