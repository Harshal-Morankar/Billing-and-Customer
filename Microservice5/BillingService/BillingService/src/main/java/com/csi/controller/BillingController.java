package com.csi.controller;

import com.csi.model.Billing;
import com.csi.service.BillingServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/billings")

@Slf4j
public class BillingController {

    @Autowired
    BillingServiceImpl billingServiceImpl;

    @PostMapping("/")
    public ResponseEntity<Billing> saveData(@RequestBody Billing billing){

        log.info("##########TRYING TO SAVE DATA for Billing Invoice: "+billing.getBillingInvoiceNumber());
        return ResponseEntity.ok(billingServiceImpl.saveData(billing));
    }

    @GetMapping("/{billingId}")
    public Optional<Billing> getDataById(@PathVariable long billingId){
        return billingServiceImpl.getDataById(billingId);
    }
}
