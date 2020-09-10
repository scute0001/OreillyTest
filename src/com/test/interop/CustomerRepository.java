package com.test.interop;

import com.test.java.CustomerJava;

import java.util.List;

public interface CustomerRepository {
    CustomerJava getById(int id);
    List<CustomerJava> getAll();
}
