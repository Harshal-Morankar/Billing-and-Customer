package com.csi.controller;

import com.csi.model.Customer;
import com.csi.service.CustomerServiceImpl;
import com.csi.vo.RestTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @PostMapping("/")
    public ResponseEntity<Customer> saveData(@RequestBody Customer customer){

        Customer customer1= customerServiceImpl.saveData(customer);
        return new ResponseEntity<>(customer1, HttpStatus.CREATED);
    }

    @GetMapping("/{customerId}")
    public RestTemplateVo getDataById(@PathVariable long customerId){
        return customerServiceImpl.getDataById(customerId);
    }

}
