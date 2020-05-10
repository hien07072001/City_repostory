package com.codegym.cms.service.Customer;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CustomerService {
    Iterable<Customer> findAll();

    Iterable<Customer> findAllByProvince(Province province);

    Optional<Customer> findById(Long id);

    void save(Customer customer);

    void remove(Long id);


}