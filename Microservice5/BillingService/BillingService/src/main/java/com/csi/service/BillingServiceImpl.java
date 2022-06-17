package com.csi.service;

import com.csi.dao.BillingDaoImpl;
import com.csi.model.Billing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BillingServiceImpl {
    @Autowired
    BillingDaoImpl billingDaoImpl;
    public Billing saveData(Billing billing){
        return billingDaoImpl.saveData(billing);
    }

    public Optional<Billing> getDataById(long billingId){
        return billingDaoImpl.getDataById(billingId);
    }
}
