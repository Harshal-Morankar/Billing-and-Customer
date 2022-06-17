package com.csi.service;

import com.csi.dao.CustomerDaoImpl;
import com.csi.model.Customer;
import com.csi.vo.RestTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl {
    @Autowired
    CustomerDaoImpl customerDaoImpl;
    public Customer saveData(Customer customer){
        return customerDaoImpl.saveData(customer);
    }

    public RestTemplateVo getDataById(long customerId){
        return customerDaoImpl.getDataById(customerId);
    }
    }

